package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.ilyaroz.shop.domain.SinglePayments;

import java.util.List;

public interface SinglePaymentRepo extends JpaRepository<SinglePayments,Long> {
    List<SinglePayments> findByIdClient(Long idClient);
}
