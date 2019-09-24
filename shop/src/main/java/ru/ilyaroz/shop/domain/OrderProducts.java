package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idOrderProduct","idOrder","idProduct","count"})
@EqualsAndHashCode(of = {"idOrderProduct"})
public class OrderProducts {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator = "order_products_seq")
    private Long idOrderProduct;
    private Long idOrder;
    private Long idProduct;
    private int count;

    public Long getIdOrderProduct(){
        return idOrderProduct;
    }
    public void setIdOrderProduct(Long idOrderProduct){
        this.idOrderProduct = idOrderProduct;
    }

    public Long getIdOrder(){
        return idOrder;
    }
    public void setIdOrder(Long idOrder){
        this.idOrder = idOrder;
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
