package filme.alura.curso;

public class Filme {
    private String nome;                           //Adicionando elementos na classe que possam ser alteradas.
    private int anoLancamento;
    private boolean incluidoPlano;
    private double somaAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public void setNome(String nome) {       //é um setter que vai permitir o usuario alterar o nome do filme
        this.nome = nome;
    }

    public void setIncluidoPlano(boolean incluidoPlano) {
        this.incluidoPlano = incluidoPlano;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoPlano() {
        return incluidoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    int getTotalAvaliacoes(){         // declarei um metodo que PEGA(GET) o valor de totalavalicoes (para que nao seja possivel alterar o total de avaliaçoes em situaçoes reais)
        return totalAvaliacoes;
    }

    void exibeFichaTecnica() {              // -> isso que eu criei é um metodo que exibirá a ficha tecnica do filme ao ser chamada.
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoLancamento);
    }

    void avalia(double nota) {           // esse metodo apenas adiciona as variaveis somaAvalições a quantidade em valor que teve, e a totalavaliações a quantidade que teve.
        somaAvaliacoes += nota;
        totalAvaliacoes++;
    }

    double pegarMedia() {  // esse metodo double vai retorna a media das avaliações.
        return  somaAvaliacoes / totalAvaliacoes;
    }
}
