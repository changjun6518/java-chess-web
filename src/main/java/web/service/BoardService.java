package web.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import web.domain.BoardRepository;
import web.domain.PositionRepository;
import web.domain.board.Board;
import web.domain.board.BoardFactory;
import web.domain.piece.Piece;
import web.domain.position.Position;
import web.service.dto.BoardResponse;

import java.util.HashMap;
import java.util.Map;

@Service
public class BoardService {

    private final BoardRepository boardRepository;
    private final PositionRepository positionRepository;

    public BoardService(BoardRepository boardRepository, PositionRepository positionRepository) {
        this.boardRepository = boardRepository;
        this.positionRepository = positionRepository;
    }

    public BoardResponse createBoard() throws JsonProcessingException {
        HashMap<Position, Piece> board = new BoardFactory(positionRepository).createBoard();
        Board initBoard = new Board(board);

        Board savedBoard = boardRepository.save(initBoard);
        Map<Position, Piece> mapBoard = savedBoard.getBoard();

        return new BoardResponse(savedBoard.getId(), savedBoard.getTurn(), mapBoard);
    }
}
