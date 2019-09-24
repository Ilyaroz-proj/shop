package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyaroz.shop.domain.Payments;

import java.util.List;

public interface PaymentRepo extends JpaRepository<Payments,Long> {
    List<Payments> findByIdClient(Long idClient);
}
