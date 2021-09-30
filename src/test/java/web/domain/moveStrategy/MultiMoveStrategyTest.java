package web.domain.moveStrategy;

import web.domain.board.Board;
import web.domain.board.BoardFactory;
import web.domain.direction.Direction;
import web.domain.position.Position;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MultiMoveStrategyTest {

    @DisplayName("board boundary test")
    @Test
    void isValidBoundary() {

        Board board = BoardFactory.createTestBoard();
        MultiMoveStrategy multiMoveStrategy = new MultiMoveStrategy(Direction.getBishopDirections());

        Position from = Position.of(4, 4);

        multiMoveStrategy.possiblePositions(from, board);

    }
}