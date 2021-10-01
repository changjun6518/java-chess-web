package web.service.dto;

import lombok.Data;
import web.domain.piece.Piece;
import web.domain.piece.Team;
import web.domain.position.Position;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Data
public class BoardMap {
    private Map<String, String> squares = new HashMap<>();

    public Map<String, String> getSquares() {
        return squares;
    }

    public BoardMap(Map<Position, Piece> squares) {
        for (Position position : squares.keySet()) {
            String squarePosition = position.parseString();
            Piece piece = squares.get(position);
            if (piece.isBlackPawn() || piece.isWhitePawn()) {
                String squarePiece = piece.getPieceType().name();
                this.squares.put(squarePosition, squarePiece);
                continue;
            }
            String squarePiece = piece.getPieceType().name();
            Team team = piece.getTeam();
            this.squares.put(team + "_" + squarePosition, squarePiece);

        }
    }
}
