package com.bolkunets.kate.catland.model;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
public class Cat {
    @Id
    @Column(name = "cat_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cat_name")
    private String name;
    @Column(name = "cat_description")
    private String behaviorFeaturesDescription;
    @Column(name = "cat_bd", nullable = false)
    private LocalDate birthDay;

    @Column(name = "cat_price")
    private String price;


    @Column(name = "cat_breed")
    @Enumerated(EnumType.STRING)
    private Breed breed;


    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cat_owner")
    private Person owner;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_cat_ad")
    private Ad ad;
    @OneToMany(mappedBy = "cat", fetch = FetchType.LAZY)
    private List<Bargain> bargains;

    public List<Bargain> getBargains() {
        return bargains;
    }

    public void setBargains(List<Bargain> bargains) {
        this.bargains = bargains;
    }

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

    public String getBehaviorFeaturesDescription() {
        return behaviorFeaturesDescription;
    }

    public void setBehaviorFeaturesDescription(String behaviorFeaturesDescription) {
        this.behaviorFeaturesDescription = behaviorFeaturesDescription;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }


    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public Person getOwner() {
        return owner;
    }

    public void setOwner(Person owner) {
        this.owner = owner;
    }

    public Ad getAd() {
        return ad;
    }

    public void setAd(Ad ad) {
        this.ad = ad;
    }
}
