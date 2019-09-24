package ru.ilyaroz.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilyaroz.shop.domain.Payments;
import ru.ilyaroz.shop.repo.PaymentRepo;

import java.util.List;

@RestController
@RequestMapping("payments")
public class PaymentsController {

    private final PaymentRepo paymentRepo;

    @Autowired
    public PaymentsController(PaymentRepo paymentRepo) {
        this.paymentRepo = paymentRepo;
    }

   /* @GetMapping
    public List<Payments> list(){
        return paymentRepo.findAll();
    }*/

    //Информация о платеже
    @GetMapping("{idPayment}")
    public Payments getOne(@PathVariable("idPayment") Payments payment){
        return payment;
    }

    //Получение платежей клиента
    @GetMapping("/client/{idClient}")
    public List<Payments> list(@PathVariable("idClient") Long idClient){
        return paymentRepo.findByIdClient(idClient);
    }

    //Создание платежа
    @PostMapping
    public Payments create(@RequestBody Payments payment){
        return paymentRepo.save(payment);
    }
}
