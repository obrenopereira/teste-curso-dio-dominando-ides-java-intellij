package br.com.view;

import br.com.view.model.gato;

public class PrimeiroPrograma {

    public static void main(String[] args) {

        gato Gato = new gato();

        System.out.println(Gato);
       /* int a = 5;
        int b = 3;
        System.out.println("Hello world!");*/



        livro livro1 = new livro(nome: "O problema dos 3 corpos", numPaginas: 300)

        System.out.println(livro1);
    }

}

class livro{
    private String nome;
    private Integer numPaginas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }
}
