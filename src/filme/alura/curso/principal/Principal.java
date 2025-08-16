package filme.alura.curso.principal;

import filme.alura.curso.Definições.CalculadoraDeTempo;
import filme.alura.curso.Definições.FiltroRecomendacao;
import filme.alura.curso.modelos.Episodio;
import filme.alura.curso.modelos.Filme;
import filme.alura.curso.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        // Classe que Recomendara um titulo a depender de suas avaliações/visualizaçoes
        FiltroRecomendacao filtro = new FiltroRecomendacao();

        // Settando as caracteristicas do Filme 1
        Filme filmeFavorito = new Filme("The Matrix", 1999);
        filmeFavorito.setAnoDeLancamento(1999);
        filmeFavorito.setDuracaoEmMinutos(135);
        filmeFavorito.setIncluidoNoPlano(true);
        filmeFavorito.avalia(10);
        filmeFavorito.avalia(9);
        filmeFavorito.avalia(10);
        filtro.filtra(filmeFavorito);
        filmeFavorito.exibeFichaTecnica();

        System.out.println("\n");

        // Settando as caracteristicas do Filme 2
        Filme filme = new Filme("John Wick", 2014);
        filme.setAnoDeLancamento(2014);
        filme.setDuracaoEmMinutos(101);
        filme.setIncluidoNoPlano(true);
        filme.avalia(5);
        filme.avalia(10);
        filme.avalia(9);
        filtro.filtra(filme);
        filme.exibeFichaTecnica();

        System.out.println("\n");

        // Settando as caracteristicas da Serie
        Serie serie = new Serie(2017, "La casa de papel");
        serie.setIncluidoNoPlano(true);
        serie.setAtiva(true);
        serie.setTemporadas(5);
        serie.setEpisodiosPorTemporada(10);
        serie.setMinutosPorEpisodio(45);
        serie.avalia(1);
        serie.avalia(6);
        serie.avalia(5);
        filtro.filtra(serie);
        serie.exibeFichaTecnica();

        System.out.println("\n");

        // Fazendo o Calculo de quanto tempo levar para assitir os Filmes e Series definidos.
        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filmeFavorito);
        calculadora.inclui(filme);
        calculadora.inclui(serie);
        System.out.println("Tempo total: " + calculadora.getTempoTotal());

        // Settando as caracteristicas do Episodio (Teste)
        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(serie);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);
        System.out.println("\n");

        // Começando a trabalhar com ARRAYS.
        Filme filmeDoKessy = new Filme("Shrek", 2003);
        filmeDoKessy.setAnoDeLancamento(2003);
        filmeDoKessy.setDuracaoEmMinutos(120);
        filmeDoKessy.avalia(10);

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoKessy);
        listaDeFilmes.add(filme);
        listaDeFilmes.add(filmeFavorito);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("\n" + listaDeFilmes);
        System.out.println("to string " + listaDeFilmes.get(0).toString());
    }
}
