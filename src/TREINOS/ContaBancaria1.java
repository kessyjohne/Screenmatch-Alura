package TREINOS;

public class ContaBancaria1 {
    public static void main(String[] args) {
        ContaBancaria conta1 = new ContaBancaria();

        conta1.titular = "Kessy Johne";
        conta1.setNumeroConta(2121);
        conta1.setSaldo(2500);

        System.out.println(conta1.titular);
        System.out.println(conta1.getSaldo());
        System.out.println(conta1.getNumeroConta());
    }
}
