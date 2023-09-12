package org.collect.compare;

/* collections em java é uma forma de armazenar strigs, dados, e    outras variaveis em um tipo de lista.
No exemplo a seguir usamos o comparable e o comparator pra fazer uma listagem de livros por autor, por nome e por ano.
 */

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        System.out.println("---------------------------------------");
        ArrayList<Livro> livros = new ArrayList<Livro>() {
            {
                add(new Livro("Design patterns: Elements of reusable object-oriented software", "Erich Gamma",
                        1995));

                add(new Livro("Antipatterns: Refactoring software, architectures",
                        "William H. Brown, Raphael C.", 1998));

                add(new Livro(
                        "Object-oriented design in Java",
                        "Stephen Gilbert, Bill McCarty", 1998));

                add(new Livro("Entendendo Algoritmos: Um Guia Ilustrado Para Programadores e Outros Curiosos",
                        "Aditya Y. Bhargava", 2017));

                add(new Livro("Kotlin em Ação", "Dmitry Jemerov e Svetlana Isakova", 2017));
            }
        };


        System.out.println("Ordenação natural (Título): ");
        Collections.sort(livros);
        for (Livro livro : livros) {
            System.out.println(livro.getTitulo() + " - " +
                    livro.getAutor() + " - " +
                    livro.getAno());
        }

        System.out.println("---------------------------------------");

        System.out.println("Ordenação por Ano: ");
        Collections.sort(livros, new CompararAno());
        for (Livro livro : livros) {
            System.out.println(livro.getAno() + " - " +
                    livro.getTitulo() + " - " +
                    livro.getAutor());
        }

        System.out.println("---------------------------------------");

        System.out.println("Ordenação por Autor: ");
        Collections.sort(livros, new CompararAutor());
        for (Livro livro : livros) {
            System.out.println(livro.getAutor() + " - " +
                    livro.getTitulo() + " - " +
                    livro.getAno());
        }

        System.out.println("---------------------------------------");

        System.out.println("Ordenação por Ano, Autor e Título: ");
        Collections.sort(livros, new CompararAnoAutorTitulo());
        for (Livro livro : livros) {
            System.out.println(livro.getAno() + " - " +
                    livro.getAutor() + " - " +
                    livro.getTitulo());
        }
    }
}