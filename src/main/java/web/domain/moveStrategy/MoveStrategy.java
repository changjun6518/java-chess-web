package web.domain.moveStrategy;

import web.domain.board.Board;
import web.domain.position.Position;

import java.util.List;

public interface MoveStrategy {
    List<Position> possiblePositions(Position from, Board board);
}

