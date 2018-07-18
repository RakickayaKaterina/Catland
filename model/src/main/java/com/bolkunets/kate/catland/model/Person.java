package com.bolkunets.kate.catland.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Person {
    @Id
    @Column(name = "person_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "person_name", nullable = false)
    private String name;
    @Column(name = "phone_number", nullable = false)
    private String phoneNumber;

    @OneToMany(mappedBy = "adOwner", fetch = FetchType.LAZY)
    private List<Ad> ads;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_address")
    private Address address;

    @OneToMany(mappedBy = "owner", fetch = FetchType.LAZY)
    private List<Cat> cats;

    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Bargain> bargainsLikeCustomer;
    @OneToMany(mappedBy = "seller", fetch = FetchType.LAZY)
    private List<Bargain> bargainsLikeSeller;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }

    public List<Ad> getAds() {
        return ads;
    }

    public void setAds(List<Ad> ads) {
        this.ads = ads;
    }

    public List<Bargain> getBargainsLikeCustomer() {
        return bargainsLikeCustomer;
    }

    public void setBargainsLikeCustomer(List<Bargain> bargainsLikeCustomer) {
        this.bargainsLikeCustomer = bargainsLikeCustomer;
    }

    public List<Bargain> getBargainsLikeSeller() {
        return bargainsLikeSeller;
    }

    public void setBargainsLikeSeller(List<Bargain> bargainsLikeSeller) {
        this.bargainsLikeSeller = bargainsLikeSeller;
    }
}
