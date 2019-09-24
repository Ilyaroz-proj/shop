package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyaroz.shop.domain.Clients;

public interface ClientBasketRepo extends JpaRepository<Clients,Long> {
}
