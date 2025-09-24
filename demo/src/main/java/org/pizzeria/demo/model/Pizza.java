package org.pizzeria.demo.model;

// import java.net.URL;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "pizze")

public class Pizza {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(nullable=false)
private String nome;

private String descrizione;

private int prezzo;

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
