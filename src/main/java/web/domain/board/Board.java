package web.domain.board;

import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.Cascade;
import org.springframework.transaction.annotation.Transactional;
import web.domain.piece.Piece;
import web.domain.piece.PieceType;
import web.domain.piece.Team;
import web.domain.position.Position;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.Map;

@Entity
@NoArgsConstructor
@Getter
@Setter
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "board_id")
    private Long id;

    private boolean finished = false;

    private Team turn = Team.WHITE;

    @OneToMany(cascade = CascadeType.ALL)
    @MapKeyJoinColumn(name = "position_id")
    private Map<Position, Piece> board;

    public Board(Map<Position, Piece> board) {
        this.board = board;
    }

    public Long getId() {
        return id;
    }

    public Team getTurn() {
        return turn;
    }

    public Map<Position, Piece> getBoard() {
        return board;
    }
    public Piece findPieceByPosition(Position position) {
        return board.get(position);
    }

    private Piece findPieceByPosition(String position) {
        Position po = Position.of(position);
        return board.get(po);
    }

    public boolean isValidPosition(Position nextPosition) {
        int x = nextPosition.getFile();
        int y = nextPosition.getRank();

        return x >= 1 && x <= 8 && y >= 1 && y <= 8;
    }

    public void updateSquareBy(Position position, Piece piece) {
        board.put(position, piece);
    }


    public void move(String from, String to) {
        Piece fromPiece = findPieceByPosition(from);
        Piece toPiece = findPieceByPosition(to);

        if (fromPiece.isOtherTeam(turn)) {
            throw new IllegalArgumentException("지금 턴이 아닙니다.");
        }

        if (fromPiece.movable(Position.of(from), this, to)) {
            toPiece.setPieceType(fromPiece.getPieceType());
            toPiece.setMark(fromPiece.getMark());
            toPiece.setTeam(fromPiece.getTeam());
//                updateSquareBy(Position.of(from), Piece.of(PieceType.NONE, Team.NONE, '.'));

            fromPiece.setPieceType(PieceType.NONE);
            fromPiece.setMark('.');
            fromPiece.setTeam(Team.NONE);
//                updateSquareBy(Position.of(to), fromPiece);

            turn = changTurn(toPiece);
            if (toPiece.isKing()) {
                finished = true;
            }
        }
    }

    public Character getPieceMarkBy(Position position) {
        return findPieceByPosition(position).getMark();
    }

    public boolean isFinished() {
        return finished;
    }

    public Team changTurn(Piece piece) {
        if (piece.isWhite()) {
            return Team.BLACK;
        }
        return Team.WHITE;
    }

    public void finishGame() {
        finished = true;
    }

//    public void initBoard() {
//        this.board = BoardFactory.createBoard();
//    }
}
