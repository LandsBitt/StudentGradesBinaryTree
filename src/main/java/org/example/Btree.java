package org.example;

public class Btree {
    private Bnode raiz;

    public Btree() {
        raiz = null;
    }

    public void add(Aluno x) {
        if (raiz != null) {
            raiz.add(x);
        } else {
            raiz = new Bnode(x);
        }

    }
    public void show() {
        if (raiz != null) {
            raiz.show();
        }
        else{
            System.out.println("Sem dados inseridos.");
        }

    }
    public void show_id(int id){
        if (raiz != null) {
            raiz.show_id(id);
        }
        else{
            System.out.println("Sem dados inseridos.");
        }
    }
    public void atualizar(int id, double[] nota_nova){
        if (raiz != null) {
            raiz.atualizar(id, nota_nova);
        }
        else{
            System.out.println("Sem dados inseridos.");
        }
    }

}





