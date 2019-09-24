package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idBasket","idClient","idProduct","count"})
@EqualsAndHashCode(of = {"idBasket"})
public class Basket {
    /* текущая корзина клиента
    в корзине клиента содержаться продукты, планируемые к покупки
     */

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "basket_seq")
    private Long idBasket;
    private Long idClient;
    private Long idProduct;
    private int count;

    public Long getIdBasket(){
        return idBasket;
    }
    public void setIdBasket(Long idBasket){
        this.idBasket = idBasket;
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
}
