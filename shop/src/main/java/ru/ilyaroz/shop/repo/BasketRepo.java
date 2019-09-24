package ru.ilyaroz.shop.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import ru.ilyaroz.shop.domain.Basket;

import java.util.List;


public interface BasketRepo extends JpaRepository<Basket,Long> {

  //  @Query("select idBasket, idClient, idProduct from Basket where idClient = :idClient")
    List<Basket> findByIdClient(Long idClient);
}
