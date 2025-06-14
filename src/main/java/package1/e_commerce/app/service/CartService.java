package package1.e_commerce.app.service;

import org.springframework.stereotype.Service;
import package1.e_commerce.app.model.Cart;
import package1.e_commerce.app.repository.CartRepository;

import java.util.List;
import java.util.Optional;

@Service
public class CartService {

    private final CartRepository cartRepository;

    public CartService(CartRepository cartRepository) {
        this.cartRepository = cartRepository;
    }

    public List<Cart> getAllCarts() {
        return cartRepository.findAll();
    }

    public Optional<Cart> getCartById(Long id) {
        return cartRepository.findById(id);
    }

    public Cart createCart(Cart cart) {
        return cartRepository.save(cart);
    }

    public Optional<Cart> updateCart(Long id, Cart updatedCart) {
        return cartRepository.findById(id).map(existingCart -> {
            existingCart.setImage(updatedCart.getImage());
            existingCart.setImageName(updatedCart.getImageName());
            existingCart.setRating(updatedCart.getRating());
            existingCart.setTitle(updatedCart.getTitle());
            existingCart.setDescription(updatedCart.getDescription());  // <-- changed
            existingCart.setRate(updatedCart.getRate());
            existingCart.setMRP(updatedCart.getMRP());
            existingCart.setOffer(updatedCart.getOffer());
            return cartRepository.save(existingCart);
        });
    }

    public boolean deleteCart(Long id) {
        if (cartRepository.existsById(id)) {
            cartRepository.deleteById(id);
            return true;
        }
        return false;
    }
}
