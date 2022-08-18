package kg.megacom.student.domains;

import kg.megacom.student.models.Groups;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GroupsRepo extends JpaRepository<Groups,Long> {
}
