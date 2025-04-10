package org.example;

public class Bnode {
    private Aluno aln;
    private Bnode esq,dir;

    public Bnode(Aluno x) {
        this.aln = x;
        esq=dir=null;
    }

    public void add (Aluno x){
        if(x.getId() < aln.getId()) {
            if (esq != null) {
                esq.add(x);
            } else {
                esq = new Bnode(x);
            }
        }
        else{
            if (dir != null) {
                dir.add(x);
            } else {
                dir = new Bnode(x);
            }
        }
    }
    public void show() {
        if (esq != null) {
            esq.show();
        }
        double[] notas = aln.getNota();
        System.out.print("ID: " + aln.getId() + " - Nome: " + aln.getNome() + " - Notas: ");

        for (double nota : notas) {
            System.out.print(nota + ", ");
        }

        System.out.println();

        if (dir != null) {
            dir.show();
        }
    }
    public void show_id(int id){

        if(esq!=null){
            esq.show_id(id);
        }
        if(aln.getId() == id){
            double[] notas = aln.getNota();
            System.out.print("ID: " + aln.getId() + " - Nome: " + aln.getNome() + " - Notas: ");
            for (double nota : notas) {
                System.out.print(nota + ", ");
            }
        }

        if(dir!=null){
            dir.show_id(id);
        }

    }

    public void atualizar (int id, double[] nota_nova){
        if (esq != null) {
            esq.atualizar(id, nota_nova);
        }else {
            if(aln.getId() == id){
                aln = new Aluno(aln.getId(), aln.getNome(), nota_nova);
                System.out.println("Notas atualizadas do aluno ID: " + aln.getId() + " com Sucesso!");


            }
        }


        if (dir != null) {
            dir.atualizar(id, nota_nova);
        } else{
            if(aln.getId() == id){
                if(aln.getId() == id){
                    aln = new Aluno(aln.getId(), aln.getNome(), nota_nova);
                    System.out.println("Notas atualizadas do aluno ID: " + aln.getId() + " com Sucesso!");


                }


            }
        }

    }



}


