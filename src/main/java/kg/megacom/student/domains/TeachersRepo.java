package kg.megacom.student.domains;

import kg.megacom.student.models.Teachers;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeachersRepo extends JpaRepository<Teachers, Long> {
}
