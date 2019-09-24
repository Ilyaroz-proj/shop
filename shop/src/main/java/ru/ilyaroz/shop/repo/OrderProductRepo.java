package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyaroz.shop.domain.OrderProducts;

import java.util.List;

public interface OrderProductRepo extends JpaRepository<OrderProducts,Long> {
    List<OrderProducts> findByIdOrder(Long idOrder);
}
