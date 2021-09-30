package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.domain.BoardRepository;
import web.domain.PositionRepository;
import web.domain.board.Board;
import web.domain.board.BoardFactory;
import web.domain.piece.Piece;
import web.domain.position.Position;

import java.util.HashMap;

@Controller
public class TestController {

    private final BoardRepository boardRepository;
    private final PositionRepository positionRepository;

    public TestController(PositionRepository positionRepository, BoardRepository boardRepository) {
        this.positionRepository = positionRepository;
        this.boardRepository = boardRepository;
    }

    @GetMapping("/test")
    public void test() {
        HashMap<Position, Piece> board = new BoardFactory(positionRepository).createBoard();
        Board initBoard = new Board(board);

        boardRepository.save(initBoard);
    }
}
