package web.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import web.domain.BoardRepository;
import web.service.BoardService;

@Controller
public class ChessController {

    @GetMapping(value = "/", produces = MediaType.TEXT_HTML_VALUE)
    public String indexPage() {
        return "index";
    }


    @GetMapping("board")
    public String boardPage() {
        return "board";
    }
}
