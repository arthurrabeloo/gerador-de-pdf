package com.geradorpdf.modelo;

public class Pessoa {
    private String nome;
    private int idade;
    private String time;

    public Pessoa(String nome, int idade, String time) {
        this.nome = nome;
        this.idade = idade;
        this.time = time;

    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getTime() {return time;}
}
