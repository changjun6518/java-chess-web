package web.service.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import web.domain.piece.Piece;
import web.domain.piece.Team;
import web.domain.position.Position;

import java.util.Map;

@Data
@NoArgsConstructor
public class BoardResponse {

    private Long boardId;
    private Team turn;
    private BoardMap boardMap;

    public BoardResponse(Long boardId, Team turn, Map<Position, Piece> boardMap) {
        this.boardId = boardId;
        this.turn = turn;
        this.boardMap = new BoardMap(boardMap);
    }

    public Long getBoardId() {
        return boardId;
    }

    public Team getTurn() {
        return turn;
    }

    public BoardMap getBoardMap() {
        return boardMap;
    }
}
