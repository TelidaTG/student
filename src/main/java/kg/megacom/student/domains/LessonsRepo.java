package kg.megacom.student.domains;

import kg.megacom.student.models.Lessons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LessonsRepo extends JpaRepository<Lessons, Long> {
}
