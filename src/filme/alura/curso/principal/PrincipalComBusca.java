package filme.alura.curso.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import filme.alura.curso.modelos.Titulo;
import filme.alura.curso.modelos.TituloOMDb;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class PrincipalComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Digite o Titulo para busca: ");
        var buscaCliente = leitura.nextLine();

        String endereco = "https://www.omdbapi.com/?apikey=7feed6ed&t=" + buscaCliente;

        HttpClient client = HttpClient.newHttpClient();

        HttpRequest request = HttpRequest.newBuilder()
                .uri(URI.create(endereco))
                .build();

        HttpResponse<String> response = client
                .send(request, HttpResponse.BodyHandlers.ofString());

        String json = response.body();
        System.out.println(json);

        Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
        //Titulo meuTitulo = gson.fromJson(json, Titulo.class);
        TituloOMDb meuTituloOMDb = gson.fromJson(json, TituloOMDb.class);

        System.out.println(meuTituloOMDb);

        Titulo meuTitulo = new Titulo(meuTituloOMDb);

        System.out.println("titulo ja convertido");

        System.out.println(meuTitulo);

    }
}


