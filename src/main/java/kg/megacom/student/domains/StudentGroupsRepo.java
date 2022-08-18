package kg.megacom.student.domains;

import kg.megacom.student.models.StudentGroups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentGroupsRepo extends JpaRepository<StudentGroups, Long> {
}
