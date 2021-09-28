package web.domain;

import org.springframework.data.jpa.repository.JpaRepository;
import web.domain.position.Position;

public interface PositionRepository extends JpaRepository<Position, Long> {
}
