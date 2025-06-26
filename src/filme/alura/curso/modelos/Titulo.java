package filme.alura.curso.modelos;

public abstract class Titulo implements Comparable<Titulo>{

    // Caracteristicas basicas de um Titulo (Filme ou Serie)
    private String nome;
    private int anoDeLancamento;
    private int duracaoEmMinutos;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;

    public Titulo(int anoDeLancamento, String nome) {
        this.anoDeLancamento = anoDeLancamento;
        this.nome = nome;
    }

    // Metodo para exibir a ficha tecnica do Titulo
    public void exibeFichaTecnica() {
        System.out.println("Nome do titulo: " +nome);
        System.out.println("Ano de lancamento: " +anoDeLancamento);
        System.out.println("Duracao em minutos: " +duracaoEmMinutos);
        System.out.println("Incluido no plano: " +incluidoNoPlano);
    }

    // Metodo onde é feito a soma do total de avaliaçoes feitas em um titulo
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
}
