package ru.ilyaroz.shop.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilyaroz.shop.domain.OrderProducts;
import ru.ilyaroz.shop.repo.OrderProductRepo;

import java.util.List;

@RestController
@RequestMapping("order_product")
public class OrderProductController {
    private final OrderProductRepo orderProductRepo;

    @Autowired
    public OrderProductController(OrderProductRepo orderProductRepo) {
        this.orderProductRepo = orderProductRepo;
    }

   /* @GetMapping
    public List<OrderProducts> list(){
        return orderProductRepo.findAll();
    }*/

   //Получение информации о позиции заказа (метод имеет сомнительное применение)
    @GetMapping("{idOrderProduct}")
    public OrderProducts getOne(@PathVariable("idOrderProduct") OrderProducts orderProduct){
        return orderProduct;
    }

   //Получение списка продуктов заказа
    @GetMapping("{/order/{idOrder}")
    public List<OrderProducts> list(@PathVariable("idOrder") Long idOrder){
        return orderProductRepo.findByIdOrder(idOrder);
    }

    //Наполнение заказа продуктами
    @PostMapping
    public OrderProducts create(@RequestBody OrderProducts orderProduct){
        return orderProductRepo.save(orderProduct);
    }

    //Позиции заказа не изменяются и не удаляются
   /* @PutMapping("{idOrderProduct}")
    public OrderProducts update(
            @PathVariable("idOrderProduct") OrderProducts orderProductFromDb,
            @RequestBody OrderProducts orderProduct
    ){
        BeanUtils.copyProperties(orderProduct, orderProductFromDb, "idOrderProduct");

        return orderProductRepo.save(orderProductFromDb);
    }

    @DeleteMapping("{idOrderProduct}")
    public void delete(@PathVariable("idOrderProduct") OrderProducts orderProduct){
        orderProductRepo.delete(orderProduct);
    }*/
}
