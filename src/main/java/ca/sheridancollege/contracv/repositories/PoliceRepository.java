package ca.sheridancollege.contracv.repositories;

import ca.sheridancollege.contracv.domain.Police;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PoliceRepository extends JpaRepository<Police, Long> {
}
