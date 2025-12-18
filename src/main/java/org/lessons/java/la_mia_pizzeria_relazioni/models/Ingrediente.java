package org.lessons.java.la_mia_pizzeria_relazioni.models;



import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Lob;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;



@Entity
@Table (name = "ingrediente")
public class Ingrediente {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column (nullable = false)
    @NotBlank(message = "Inserisci un nome per il tuo ingrediente")
    private String nomeIngrediente;

    @Lob
    @Column
    private String descrizioneIngrediente;

    // relazione ManyToMany 
    @ManyToMany(mappedBy = "ingredienti")
    private List<Pizza> pizze;
    

    // getters & setters

    public Integer getId() {
        return this.id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNomeIngrediente() {
        return this.nomeIngrediente;
    }

    public void setNomeIngrediente(String nomeIngrediente) {
        this.nomeIngrediente = nomeIngrediente;
    }

    public String getDescrizioneIngrediente() {
        return this.descrizioneIngrediente;
    }

    public void setDescrizioneIngrediente(String descrizioneIngrediente) {
        this.descrizioneIngrediente = descrizioneIngrediente;
    }

}
