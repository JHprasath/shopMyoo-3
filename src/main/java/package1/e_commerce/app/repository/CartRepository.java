package package1.e_commerce.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import package1.e_commerce.app.model.Cart;
@Repository
public interface CartRepository extends JpaRepository <Cart, Long>{
}
