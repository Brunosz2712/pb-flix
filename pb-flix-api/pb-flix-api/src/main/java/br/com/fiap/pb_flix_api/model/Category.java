package br.com.fiap.pb_flix_api.model;

import java.util.Date;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Category {
    @Id
    @GeneratedValue(
        strategy = GenerationType.IDENTITY
    )
    private Long id;
    private String film;
    private String gender;
    private Date releaseDate;
    private  String sinopse;

    
    public Long getId() {
        return id;
    }

    public String getFilm() {
        return film;
    }

    public String getGender() {
        return gender;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public String getSinopse() {
        return sinopse;
    }

    
    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        String var10000 = String.valueOf(this.id);
        return var10000 + " - " + this.film + " - " + this.gender + " - " + this.releaseDate + " - " + this.sinopse;
     }

}


