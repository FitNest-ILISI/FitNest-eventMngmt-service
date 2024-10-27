package ilisi.fitnest.fitnest_eventmanagement.Repository;

import ilisi.fitnest.fitnest_eventmanagement.Entity.SportCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SportCategoryRepository extends JpaRepository<SportCategory,Long> {
}
