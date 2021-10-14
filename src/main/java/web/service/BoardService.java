package web.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.domain.BoardRepository;
import web.domain.PositionRepository;
import web.domain.board.Board;
import web.domain.board.BoardFactory;
import web.domain.piece.Piece;
import web.domain.piece.Team;
import web.domain.position.Position;
import web.service.dto.BoardResponse;

import javax.persistence.EntityManager;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

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
        return new BoardResponse(savedBoard.getId(), savedBoard.getTurn(), savedBoard.getBoard());
    }

    public List<Long> getBoards() {
        return boardRepository.findAll().stream()
                .map(Board::getId)
                .collect(Collectors.toList());
    }

    public void deleteBoard(Long id) {
        boardRepository.deleteById(id);
    }

    public BoardResponse findBoard(Long id) {
        Board board = boardRepository.findById(id).orElseThrow(() ->
                                    new IllegalArgumentException("not found board"));

        return new BoardResponse(board.getId(), board.getTurn(), board.getBoard());
    }

    @Transactional
    public void movePiece(Long boardId, String from, String to) {
        Board board = boardRepository.getById(boardId);
        board.move(from, to);

    }
}


