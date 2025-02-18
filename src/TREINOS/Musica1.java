package TREINOS;

public class Musica1 {
    public static void main(String[] args) {
        Musica musica1 = new Musica();
        musica1.titulo = "Era uma vez";
        musica1.artista = "Costa gold";
        musica1.anoLancamento = 1996;
        musica1.avaliar(10);
        musica1.avaliar(3.4);
        musica1.avaliar(5.2);

        System.out.println("A média do filme é: " + musica1.pegaMedia());

    }
}
