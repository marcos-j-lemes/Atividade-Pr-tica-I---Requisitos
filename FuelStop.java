import java.util.Scanner;

class Venda {

    String combustivel;
    double litros;
    double precoLitro;

    public double calcularTotal() {
        return litros * precoLitro;
    }

}

public class FuelStop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Venda venda = new Venda();

        System.out.println("Tipo de combustivel:");
        venda.combustivel = sc.nextLine();

        System.out.println("Litros abastecidos:");
        venda.litros = sc.nextDouble();

        System.out.println("Preco por litro:");
        venda.precoLitro = sc.nextDouble();

        double total = venda.calcularTotal();

        System.out.println("Total da venda: R$ " + total);

        sc.close();
    }
}

