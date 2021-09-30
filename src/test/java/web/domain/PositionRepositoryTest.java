package web.domain;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.web.WebAppConfiguration;
import web.domain.board.Board;
import web.domain.board.BoardFactory;
import web.domain.piece.Piece;
import web.domain.piece.PieceType;
import web.domain.piece.Team;
import web.domain.position.Position;

import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

@SpringBootTest
@Rollback(value = false)
class PositionRepositoryTest {

    @Autowired
    PositionRepository positionRepository;
    @Autowired
    PieceRepository pieceRepository;
    @Autowired
    BoardRepository boardRepository;


//    @Test
//    void save() {
//        positionRepository.save(new Position(1, 1));
//        positionRepository.save(new Position(1, 2));
//        positionRepository.save(new Position(1, 3));
//        positionRepository.save(new Position(1, 4));
//    }

    //    포지션 다만들고
    // 피스 다만들고
//    @Test
//    void positionSave() {
//        for (int i = 1; i <=8 ; i++) {
//            for (int j = 1; j <= 8; j++) {
//                positionRepository.save(new Position(i, j));
//            }
//        }
//    }

//    @Test
//    void pieceSave() {
//        pieceRepository.save(Piece.of(PieceType.ROOK, Team.WHITE, 'r'));
//        pieceRepository.save(Piece.of(PieceType.KNIGHT, Team.WHITE, 'n'));
//        pieceRepository.save(Piece.of(PieceType.BISHOP, Team.WHITE, 'b'));
//        pieceRepository.save(Piece.of(PieceType.QUEEN, Team.WHITE, 'q'));
//        pieceRepository.save(Piece.of(PieceType.KING, Team.WHITE, 'k'));
//        pieceRepository.save(Piece.of(PieceType.BISHOP, Team.WHITE, 'b'));
//        pieceRepository.save(Piece.of(PieceType.KNIGHT, Team.WHITE, 'n'));
//        pieceRepository.save(Piece.of(PieceType.ROOK, Team.WHITE, 'r'));
//        for (int j = 1; j <= 8; j++) {
//            pieceRepository.save(Piece.of(PieceType.WHITE_PAWN, Team.WHITE, 'p'));
//        }
//        for (int j = 1; j <= 8; j++) {
//            pieceRepository.save(Piece.of(PieceType.BLACK_PAWN, Team.BLACK, 'P'));
//        }
//
//        pieceRepository.save(Piece.of(PieceType.ROOK, Team.BLACK, 'R'));
//        pieceRepository.save(Piece.of(PieceType.KNIGHT, Team.BLACK, 'N'));
//        pieceRepository.save(Piece.of(PieceType.BISHOP, Team.BLACK, 'B'));
//        pieceRepository.save(Piece.of(PieceType.QUEEN, Team.BLACK, 'Q'));
//        pieceRepository.save(Piece.of(PieceType.KING, Team.BLACK, 'K'));
//        pieceRepository.save(Piece.of(PieceType.BISHOP, Team.BLACK, 'B'));
//        pieceRepository.save(Piece.of(PieceType.KNIGHT, Team.BLACK, 'N'));
//        pieceRepository.save(Piece.of(PieceType.ROOK, Team.BLACK, 'R'));
//
//        for (int i = 1; i <=8 ; i++) {
//            for (int j = 1; j <= 8; j++) {
//                pieceRepository.save(Piece.of(PieceType.NONE, Team.NONE, '.'));
//            }
//        }
//    }

//    @Test
//    void otherTest() {
//        HashMap<Position, Piece> board = BoardFactory.createBoard();
//        Board temp = new Board(board);
//
//        boardRepository.save(temp);
//    }
}