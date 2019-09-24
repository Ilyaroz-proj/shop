package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyaroz.shop.domain.ClientOrders;

import java.util.List;

public interface ClientOrderRepo extends JpaRepository<ClientOrders,Long> {
    List<ClientOrders> findByIdClient(Long idClient);
}
