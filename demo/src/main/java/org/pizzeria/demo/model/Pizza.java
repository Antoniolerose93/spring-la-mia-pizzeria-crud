package org.pizzeria.demo.model;

// import java.net.URL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

@Entity
@Table(name = "pizze")

public class Pizza {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@NotNull(message = "NOME cannot be null")
@Column(name="nome", nullable=false, unique=true)
private String nome;

@NotNull
@NotBlank(message ="descrizione obbligatoria")
private String descrizione;

@NotNull
@Min(value=1)
private int prezzo;

public Integer getId() {
        return id;
    }

public String getNome() {
    return nome;
}

public void setNome(String nome) {
    this.nome = nome;
}

public String getDescrizione() {
    return descrizione;
}

public void setDescrizione(String descrizione) {
    this.descrizione = descrizione;
}

public int getPrezzo() {
    return prezzo;
}

public void setPrezzo(int prezzo) {
    this.prezzo = prezzo;
}



}
