package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idProduct","name","price"})
@EqualsAndHashCode(of = {"idProduct"})
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "products_seq")
    private Long idProduct;
    private String name;
    private float price;

    public Long getIdProduct(){
        return idProduct;
    }

    public void setIdProduct(Long idProduct){
        this.idProduct = idProduct;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public float getPrice(){
        return price;
    }

    public void setPrice(float price){
        this.price = price;
    }
}
