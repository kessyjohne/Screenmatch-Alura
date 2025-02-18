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

    void avaliar(double nota) {
        SomaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    double pegaMedia() {
        return SomaDasAvaliacoes / totalDeAvaliacoes;
    }
}
