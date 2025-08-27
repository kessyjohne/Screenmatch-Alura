package filme.alura.curso.modelos;

import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo>{

    // Caracteristicas basicas de um Titulo (Filme ou Serie)

    @SerializedName("Title")
    private String nome;
    @SerializedName("Year")
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    //construtor para definir as caracteristicas do filme da api na criação do objeto.
    public Titulo(TituloOMDb meuTituloOMDb) {
        this.nome = meuTituloOMDb.title();
        this.anoDeLancamento = Integer.valueOf(meuTituloOMDb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOMDb.runtime().substring(0,3));
    }

    // Metodo para exibir a ficha tecnica do Titulo
    public void exibeFichaTecnica() {
        System.out.println("Nome do titulo: " +nome);
        System.out.println("Ano de lancamento: " +anoDeLancamento);
        System.out.println("Duracao em minutos: " +duracaoEmMinutos);
        System.out.println("Incluido no plano: " +incluidoNoPlano);
    }

    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }

    // Metodo que retorna a media das avaliaçoes feitas ao Titulo
    public double pegaMedia() {
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoDeLancamento() {
        return this.anoDeLancamento;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public boolean getIncluidoNoPlano() {
        return this.incluidoNoPlano;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return this.duracaoEmMinutos;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes() {
        return this.totalDeAvaliacoes;
    }


    // Metodo de comparação entre os Titulos do catalogo (Para ordenar na lista)
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }

    @Override
    public String toString() {
        return "Nome: " + nome + ", " + "Ano de lançamento: " + anoDeLancamento + ", " + "Duração em minutos: " + duracaoEmMinutos;
    }
}
