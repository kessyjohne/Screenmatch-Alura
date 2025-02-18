package TREINOS;

public class Musica {
    String titulo;
    String artista;
    int anoLancamento;
    int totalDeAvaliacoes;
    double SomaDasAvaliacoes;

    void exibeFichaTecnica() {
        System.out.println("Nome da musica: " + titulo);
        System.out.println("Nome da artista: " + artista);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avaliar(double nota) {           // criou um parametro double onde quando for chamado no teste o usuario vai digitar a avaliação no paramatro que ira automaticamente somar tanto na quantia de avaliações que teve quanto na somade avaliaçoes
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }
}
