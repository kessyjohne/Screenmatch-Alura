package filme.alura.curso.definicoes;
import filme.alura.curso.modelos.Titulo;

public class CalculadoraDeTempo {

    // Metodos criados com intenção de saber quantos minutos vou gastar para assistir alguma serie ou filme a depender da quantidade de eps / horas.

    private int tempoTotal;

    public void inclui(Titulo titulo) {                // Quando essa classe for atribuida em uma instacia, esse metodo ira guardar o tempo em minutos.
        tempoTotal += titulo.getDuracaoEmMinutos();
    }

    public int getTempoTotal() {                       // agora este metodo ira retorna o tempo total atribuido no metodo acima.
        return tempoTotal;
    }


}
