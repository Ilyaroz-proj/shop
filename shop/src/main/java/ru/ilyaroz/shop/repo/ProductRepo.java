package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyaroz.shop.domain.Products;

public interface ProductRepo extends JpaRepository<Products,Long> {
}
