package filme.alura.curso.modelos;

import filme.alura.curso.Definições.Classificacao;

public class Filme extends Titulo implements Classificacao {

    private String diretor;

    public Filme(String nome, int anoDeLancamento) {  // MÉTODO CONSTRUTOR QUE JA ADICIONA O NOME DO FILME NO PARAMETRO NA CRIAÇÃO DO OBJETO.
        super(anoDeLancamento, nome);
    }

    public String getDiretor() {
        return this.diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {     // interface sendo usada, criacao de metodo para Classificar um Filme de acordo com sua media de notas.
        return (int) pegaMedia() / 2;
    }


    //Metodo que esta transformando o espaço em memoria da lista em toString (TEXTO).
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + "(" + this.getAnoDeLancamento() + ")";
    }
}
