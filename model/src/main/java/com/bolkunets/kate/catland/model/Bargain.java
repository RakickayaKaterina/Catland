package com.bolkunets.kate.catland.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
public class Bargain {
    @Id
    @Column(name = "bargain_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "bargain_date", nullable = false)
    private LocalDate bargainDate;


    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bargain_cat")
    private Cat cat;
    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bargain_customer")
    private Person customer;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_bargain_seller")
    private Person seller;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getBargainDate() {
        return bargainDate;
    }

    public void setBargainDate(LocalDate bargainDate) {
        this.bargainDate = bargainDate;
    }

    public Cat getCat() {
        return cat;
    }

    public void setCat(Cat cat) {
        this.cat = cat;
    }

    public Person getCustomer() {
        return customer;
    }

    public void setCustomer(Person customer) {
        this.customer = customer;
    }

    public Person getSeller() {
        return seller;
    }

    public void setSeller(Person seller) {
        this.seller = seller;
    }
}
