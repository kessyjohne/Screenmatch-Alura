package filme.alura.curso.principal;

import filme.alura.curso.modelos.Filme;
import filme.alura.curso.modelos.Serie;
import filme.alura.curso.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class PrincipalComListas {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O Poderoso Chefão", 1970);
        meuFilme.avalia(10);
        meuFilme.avalia(8);
        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);
        outroFilme.avalia(8);

        var filmeDoKessy = new Filme("Clube da Luta", 1999);
        filmeDoKessy.avalia(9);
        filmeDoKessy.avalia(9);
        Serie serie = new Serie(2008,"Breaking Bad");
        serie.avalia(10);
        serie.avalia(10);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoKessy);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(serie);

        // a ideia do foreach: "para cada item da minha lista de tipo titulo:" Imprima o item.
        for (Titulo item: lista){
            System.out.println("\n" + item.getNome());
            //Fiz um casting para que eu possa usar o metodo que so o Filme possui (GetClassificação)
            if (item instanceof Filme filme && filme.getClassificacao() > 2){;
                System.out.println("Classificação " + filme.getClassificacao());
            } else {
                System.out.println("Classificação " + serie.getClassificacao());
            }

        }

        ArrayList<Titulo> listaDosTitulos = new ArrayList<>();
        Collections.sort(lista);
        System.out.println("\nOrdenando por ordem alfabética: ");
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("\nOrdenando por ano de lançamento: ");
        System.out.println(lista);
    }
}
