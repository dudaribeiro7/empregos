package com.example.aula2;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Emprego {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long id;

    // @NonNull
    // @BatchSize(size = 4)
    private String titulo;

    public Emprego() {
    }

    // @NonNull
    // @BatchSize(size = 3)
    private String empresa;

    // @NonNull
    // @BatchSize(size = 10)
    private String descricao;

    public void setId(long id){
        this.id = id;
    }

    
    public long getId() {
        return id;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo(){
        return titulo;
    }

    public void setEmpresa(String empresa){
        this.empresa = empresa;
    }

    public String getEmpresa(){
        return empresa;
    }

    public void setDescricao(String descricao){
        this.descricao = descricao;
    }

    public String getDescricao(){
        return descricao;
    }
}
