package package1.e_commerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import package1.e_commerce.app.model.Collection;

@Repository
public interface CollectionRepository extends JpaRepository<Collection, Long> {
}
