package web.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import web.domain.piece.Piece;

public interface PieceRepository extends JpaRepository<Piece, Long> {
}
