package web.domain.moveStrategy;

import web.domain.board.Board;
import web.domain.board.BoardFactory;
import web.domain.direction.Direction;
import web.domain.piece.Piece;
import web.domain.piece.PieceType;
import web.domain.piece.Team;
import web.domain.position.Position;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.*;


class PawnMoveStrategyTest {

    private Board board;

    @BeforeEach
    void setUp() {
        board = BoardFactory.createTestBoard();
        board.updateSquareBy(Position.of(2, 2), Piece.of(PieceType.WHITE_PAWN, Team.WHITE, 'p'));
    }

    @DisplayName("Pawn test")
    @ParameterizedTest
    @MethodSource("getCaseForPawnTest")
    void pawnMoveTest(Position nextPosition, Piece nextPiece, int answer, List<Position> nextPositions) {
        board.updateSquareBy(nextPosition, nextPiece);

        PawnMoveStrategy pawnMoveStrategy = new PawnMoveStrategy(Direction.getFirstWhitePawnDirections());
        List<Position> positions = pawnMoveStrategy.possiblePositions(Position.of(2, 2), board);

        for (Position position : nextPositions) {
            assertThat(positions).contains(position);
        }
        assertThat(positions.size()).isEqualTo(answer);
    }

    private static Stream<Arguments> getCaseForPawnTest() {
        return Stream.of(
            Arguments.of(Position.of(1, 3), Piece.of(PieceType.BISHOP, Team.BLACK, 'b'),
                    4, Arrays.asList(Position.of(1, 3), Position.of(2, 4))),
            Arguments.of(Position.of(2, 4), Piece.of(PieceType.BISHOP, Team.BLACK,'B'),
                    3, Arrays.asList(Position.of(1, 3), Position.of(2, 3)))
        );
    }
}