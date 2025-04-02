package br.com.fiap.pb_flix_api.model;


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
    private String nameMovie;
    private String gender;
    private String icon;

    public String getNameMovie() {
        return nameMovie;
    }
    
    public String getGender() {
        return gender;
    }

    public String getIcon() {
        return icon;
    }
    
    public void setId(Long id) {
        this.id = id;
    }

    public String toString() {
        String var10000 = String.valueOf(this.id);
        return var10000 + " - " + this.nameMovie + " - " + this.gender + " - " + this.icon;
     }

}


