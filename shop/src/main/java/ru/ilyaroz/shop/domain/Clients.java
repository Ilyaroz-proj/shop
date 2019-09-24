package ru.ilyaroz.shop.domain;

import lombok.EqualsAndHashCode;
import lombok.ToString;

import javax.persistence.*;

@Entity
@Table
@ToString(of = {"idClient","firstname","name"})
@EqualsAndHashCode(of = {"idClient"})
public class Clients {

    /*
    Информация о клиенте: Фамилия, Имя
     */
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "clients_seq")
    private Long idClient;
    private String firstname;
    private String name;

    public Long getIdClient(){
        return idClient;
    }

    public void setIdClient(Long idClient) {
        this.idClient = idClient;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
