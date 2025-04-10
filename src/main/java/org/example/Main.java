package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Btree a = new Btree();

        int qo = Integer.parseInt(scan.nextLine());

        for (int i = 0; i < qo; i++) {
            String linha = scan.nextLine();
            String[] partes = linha.split(" ");

            if (partes[0].equals("INSERIR")) {
                int id = Integer.parseInt(partes[1]);
                String nome = partes[2];

                double[] notas = new double[partes.length - 3];
                for (int j = 3; j < partes.length; j++) {
                    notas[j - 3] = Double.parseDouble(partes[j]);
                }

                Aluno aluno = new Aluno(id, nome, notas);
                a.add(aluno);
                System.out.println("Aluno com ID " + id + " inserido com sucesso.");

            } else if (partes[0].equals("BUSCAR")) {
                int id = Integer.parseInt(partes[1]);
                a.show_id(id);

            } else if (linha.equals("LISTAR_POR_ID")) {
                a.show();

            } else if (partes[0].equals("ATUALIZAR_NOTAS")) {
                int id = Integer.parseInt(partes[1]);

                double[] novasNotas = new double[partes.length - 2];
                for (int j = 2; j < partes.length; j++) {
                    novasNotas[j - 2] = Double.parseDouble(partes[j]);
                }

                a.atualizar(id, novasNotas);
                System.out.println("Notas do aluno com ID " + id + " atualizadas com sucesso.");
            }
        }

        scan.close();
    }
}