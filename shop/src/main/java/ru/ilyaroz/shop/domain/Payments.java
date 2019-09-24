package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idPayment","idClient","idProduct","count","date","state","sum"})
@EqualsAndHashCode(of = {"idProduct"})
public class Payments {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "payments_seq")
    private Long idPayment;
    private Long idClient;
    private Long idProduct;
    private int count;
    private String date;
    private byte state;
    private float sum;

    public Long getIdPayment(){
        return idPayment;
    }
    public void setIdPayment(Long idPayment){
        this.idPayment = idPayment;
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

    public byte getState() { return state; }
    public void setState (byte state){ this.state = state;}

    public float getSum() { return sum; }
    public void setSum (float sum){ this.sum = sum;}

}
