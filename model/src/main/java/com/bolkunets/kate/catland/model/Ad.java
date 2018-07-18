package com.bolkunets.kate.catland.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Ad {
    @Id
    @Column(name = "ad_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "ad_description")
    private String description;

    @ManyToOne(optional = false, cascade = CascadeType.ALL)
    @JoinColumn(name = "fk_ad_owner")
    private Person adOwner;

    @OneToMany(mappedBy = "ad", fetch = FetchType.LAZY)
    private List<Photo> photos;

    @OneToMany(mappedBy = "ad", fetch = FetchType.LAZY)
    private List<Cat> cats;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Photo> getPhotos() {
        return photos;
    }

    public void setPhotos(List<Photo> photos) {
        this.photos = photos;
    }

    public Person getAdOwner() {
        return adOwner;
    }

    public void setAdOwner(Person adOwner) {
        this.adOwner = adOwner;
    }

    public List<Cat> getCats() {
        return cats;
    }

    public void setCats(List<Cat> cats) {
        this.cats = cats;
    }
}
