package TREINOS;

public class IdadePessoa1 {
    public static void main(String[] args) {
        IdadePessoa pessoa1 = new IdadePessoa();
        pessoa1.setNome("Kessy");
        pessoa1.setIdade(22);

        System.out.println(pessoa1.verificarIdade(pessoa1.getIdade()));
    }
}
