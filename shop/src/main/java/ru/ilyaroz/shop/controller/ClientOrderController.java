package ru.ilyaroz.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilyaroz.shop.domain.ClientOrders;
import ru.ilyaroz.shop.repo.ClientOrderRepo;

import java.util.List;

@RestController
@RequestMapping("client_order")
public class ClientOrderController {
    private final ClientOrderRepo clientOrderRepo;

    @Autowired
    public ClientOrderController(ClientOrderRepo clientOrderRepo) {
        this.clientOrderRepo = clientOrderRepo;
    }

   /* @GetMapping
    public List<ClientOrders> list(){
        return clientOrderRepo.findAll();
    }*/

   /*
    @GetMapping("{idClientOrder}")
    public ClientOrders getOne(@PathVariable("idClientOrder") ClientOrders clientOrder){
        return clientOrder;
    }*/

   //Получение заказов клиента
    @GetMapping("/client/{idClient}")
    public List<ClientOrders> list(@PathVariable("idClient") Long client){
        return clientOrderRepo.findByIdClient(client);
    }

    //Создание заказа
    @PostMapping
    public ClientOrders create(@RequestBody ClientOrders clientOrder){
        return clientOrderRepo.save(clientOrder);
    }

    //Заказы не изменяются и не удаляются
    /*
    @PutMapping("{idClientOrder}")
    public ClientOrders update(
            @PathVariable("idClientOrder") ClientOrders clientOrderFromDb,
            @RequestBody ClientOrders clientOrder
    ){
        BeanUtils.copyProperties(clientOrder, clientOrderFromDb, "idClientOrder");

        return clientOrderRepo.save(clientOrderFromDb);
    }*/
    /*
    @DeleteMapping("{idClientOrder}")
    public void delete(@PathVariable("idClientOrder") ClientOrders clientOrder){
        clientOrderRepo.delete(clientOrder);
    }*/
}
