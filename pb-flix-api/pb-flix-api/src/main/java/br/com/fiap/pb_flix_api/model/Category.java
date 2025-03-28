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
    private String category;
    private String comedia;
    private String drama;
    private String suspense;
    private String terror;
    private String fixaoCientifica;
   

    public Long getId() {
        return id;
    }

    public String getCategory() {
        return category;
    }
    
    public String getComedia() {
        return comedia;
    }

    public String getDrama() {
        return drama;
    }

    public String getSuspense() {
        return suspense;
    }

    public String getTerror() {
        return terror;
    }

    public String getFixaoCientifica() {
        return fixaoCientifica;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        String var10000 = String.valueOf(this.id);
        return var10000 + " - " + this.comedia + " - " + this.drama + " - " + this.suspense + " - " + this.terror;
     }

}


