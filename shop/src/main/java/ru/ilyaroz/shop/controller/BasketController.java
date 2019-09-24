package ru.ilyaroz.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilyaroz.shop.domain.Basket;
import ru.ilyaroz.shop.repo.BasketRepo;

import java.util.List;

@RestController
@RequestMapping("basket")
public class BasketController {
    private final BasketRepo basketRepo;

    @Autowired
    public BasketController(BasketRepo basketRepo) {
        this.basketRepo = basketRepo;
    }

   /* @GetMapping
    public List<Basket> list(){
        return basketRepo.findAll();
    }*/

    //Информация о позиции в корзине
    @GetMapping("{idBasket}")
    public Basket getOne(@PathVariable("idBasket") Basket basket){
        return basket;
    }

    //Выборка всех товаров в корзине клиента
    @GetMapping("client/{idClient}")
    public List<Basket> list(@PathVariable("idClient") Long client){
        return basketRepo.findByIdClient(client);
    }

    //Добавление товара в корзину клиента
    @PostMapping
    public Basket create(@RequestBody Basket basket){
        return basketRepo.save(basket);
    }

    //Изменение позиции товара в корзине (по сути изменение количества товара)
    @PutMapping("{idBasket}")
    public Basket update(
            @PathVariable("idBasket") Basket basketFromDb,
            @RequestBody Basket basket
    ){
        BeanUtils.copyProperties(basket, basketFromDb, "idBasket");

        return basketRepo.save(basketFromDb);
    }

    //Удаление позиции из корзины
    @DeleteMapping("{idBasket}")
    public void delete(@PathVariable("idBasket") Basket basket){
        basketRepo.delete(basket);
    }
}
