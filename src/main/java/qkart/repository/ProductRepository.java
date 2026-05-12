package qkart.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import qkart.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
