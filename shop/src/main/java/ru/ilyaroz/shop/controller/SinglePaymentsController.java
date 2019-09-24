package ru.ilyaroz.shop.controller;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.ilyaroz.shop.domain.SinglePayments;
import ru.ilyaroz.shop.repo.SinglePaymentRepo;

import java.util.List;

@RestController
@RequestMapping("single_payment")
public class SinglePaymentsController {
    private final SinglePaymentRepo singlePaymentRepo;

    @Autowired
    public SinglePaymentsController(SinglePaymentRepo singlePaymentRepo) {
        this.singlePaymentRepo = singlePaymentRepo;
    }

   /* @GetMapping
    public List<SinglePayments> list(){
        return singlePaymentRepo.findAll();
    }*/

    //Получение информации о разовом платеже
    @GetMapping("{idSinglePayment}")
    public SinglePayments getOne(@PathVariable("idSinglePayment") SinglePayments singlePayment){
        return singlePayment;
    }

    //Получение информации о всех разовых платежа клиента
    @GetMapping("/client/{idClient}")
    public List<SinglePayments> list(@PathVariable("idClient") Long idClient){
        return singlePaymentRepo.findByIdClient(idClient);
    }

    //Создание разового платежа
    @PostMapping
    public SinglePayments create(@RequestBody SinglePayments singlePayment){
        return singlePaymentRepo.save(singlePayment);
    }

    //Удаление разового платежа
    @PutMapping("{idSinglePayment}")
    public SinglePayments update(
            @PathVariable("idSinglePayment") SinglePayments singlePaymentFromDb,
            @RequestBody SinglePayments singlePayment
    ){
        BeanUtils.copyProperties(singlePayment, singlePaymentFromDb, "idSinglePayment");

        return singlePaymentRepo.save(singlePaymentFromDb);
    }

    //Удаление разового платежа
    @DeleteMapping("{idSinglePayment}")
    public void delete(@PathVariable("idSinglePayment") SinglePayments singlePayment){
        singlePaymentRepo.delete(singlePayment);
    }
}
