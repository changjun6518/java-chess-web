package web.domain.moveStrategy;

import web.domain.board.Board;
import web.domain.direction.Direction;
import web.domain.piece.Piece;
import web.domain.position.Position;

import java.util.ArrayList;
import java.util.List;

public class SingleMoveStrategy implements MoveStrategy {

    private final List<Direction> directions;

    public SingleMoveStrategy(List<Direction> directions) {
        this.directions = directions;
    }

    @Override
    public List<Position> possiblePositions(Position from, Board board) {
        ArrayList<Position> path = new ArrayList<>();

        Piece fromPiece = board.findPieceByPosition(from);

        for (Direction direction : directions) {
            Position nextPosition = from.updatePosition(direction);
            Piece nextPiece = board.findPieceByPosition(nextPosition);

            if (board.isValidPosition(nextPosition)) {
                if (fromPiece.isOtherTeam(nextPiece)) {
                    continue;
                }
                path.add(nextPosition);
            }
        }
        return path;
    }
}
