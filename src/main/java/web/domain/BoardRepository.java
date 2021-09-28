package web.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import web.domain.board.Board;

public interface BoardRepository extends JpaRepository<Board, Long> {
}
