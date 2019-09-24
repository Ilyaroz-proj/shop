package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idClientOrder","idClient","idOrder"})
@EqualsAndHashCode(of = {"idClientOrder"})
public class ClientOrders {
    @Id
    @GeneratedValue(strategy =  GenerationType.SEQUENCE,generator = "client_orders_seq")
    private Long idClientOrder;
    private Long idClient;
    private Long idOrder;

    public Long getIdClientOrder(){
        return idClientOrder;
    }
    public void setIdClientOrder(Long idClientOrder){
        this.idClientOrder = idClientOrder;
    }

    public Long getIdClient(){
        return idClient;
    }
    public void setIdClient(Long idClient){
        this.idClient = idClient;
    }

    public Long getIdOrder(){
        return idOrder;
    }
    public void setIdOrder(Long idOrder){
        this.idOrder = idOrder;
    }

}
