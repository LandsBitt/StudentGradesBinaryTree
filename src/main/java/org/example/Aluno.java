package org.example;

public class Aluno {
    private int id;
    private String nome;
    private double nota[];


    public Aluno(int id, String nome, double[] nota) {
        this.id = id;
        this.nome = nome;
        this.nota = nota;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome_aluno) {
        this.nome = nome_aluno;
    }

    public double[] getNota() {
        return nota;
    }

    public void setNota(double[] nota) {
        this.nota = nota;
    }
}
    
