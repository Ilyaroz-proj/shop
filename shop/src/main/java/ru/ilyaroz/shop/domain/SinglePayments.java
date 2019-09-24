package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idSinglePayment","idClient","idProduct","count","date"})
@EqualsAndHashCode(of = {"idProduct"})
public class SinglePayments {

    /*
    Сущность
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "single_payments_seq")
    private Long idSinglePayment;
    private Long idClient;
    private Long idProduct;
    private int count;
    private String date;

    public Long getIdSinglePayment(){
        return idSinglePayment;
    }
    public void setIdSinglePayment(Long idSinglePayment){
        this.idSinglePayment = idSinglePayment;
    }

   public Long getIdClient(){
        return idClient;
    }
    public void setIdClient(Long idClient){
        this.idClient = idClient;
    }

    public Long getIdProduct(){
        return idProduct;
    }
    public void setIdProduct(Long idProduct){
        this.idProduct = idProduct;
    }

    public int getCount() { return count; }
    public void setCount (int count){ this.count = count;}

    public String getDate() { return date; }
    public void setDate (String date){ this.date = date;}
}
