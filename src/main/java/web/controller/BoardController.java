package web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import web.service.BoardService;
import web.service.dto.BoardResponse;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class BoardController {
    private static final String SUCCESS_MESSAGE = "success";
    private final BoardService boardService;

    public BoardController(BoardService boardService) {
        this.boardService = boardService;
    }

    @GetMapping(value = "/create")
    public ResponseEntity<BoardResponse> boardPage() throws JsonProcessingException {
        return new ResponseEntity<>(boardService.createBoard(), HttpStatus.OK);
    }

    @GetMapping("/start/{id}")
    public ResponseEntity<BoardResponse> getBoard(@PathVariable Long id) {
        BoardResponse boardResponse = boardService.findBoard(id);
        return new ResponseEntity<>(boardResponse, HttpStatus.OK);
    }

    @GetMapping("/boards")
    public ResponseEntity<List<Long>> getBoards() {
        List<Long> boardIds = boardService.getBoards();
        return new ResponseEntity<>(boardIds, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteBoard(@PathVariable Long id) {
        boardService.deleteBoard(id);
        return new ResponseEntity<>(SUCCESS_MESSAGE, HttpStatus.OK);
    }

}
