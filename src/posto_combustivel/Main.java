package posto_combustivel;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Instanciando classe para atribuir valores ao atributos
        Abastecimento ab = new Abastecimento();


        // Entrada de dados
        System.out.println("A - Alcool\nD - Diesel\nG - Gasolina");
        System.out.print("Informe o tipo do combustível: ");
        ab.tipoCombustivel = sc.next().toUpperCase().charAt(0);

        while (ab.tipoCombustivel != 'A' && ab.tipoCombustivel != 'D' && ab.tipoCombustivel != 'G') {
            System.out.print("Tipo combustível inválido, tente novamente: ");
            ab.tipoCombustivel = sc.next().toUpperCase().charAt(0);
        }

        // Informar quantidade de litros abastecidos
        System.out.print("Informe a quantidade de litros abastecidos: ");
        ab.qtdLitros = sc.nextDouble();

        // Informe o preço d o litro de combustível que esta sendo utilizado
        System.out.print("Informe o preço p/Litro do combustível: ");
        ab.vlrPorLitro = sc.nextDouble();

        // Processamento e Output utilizando Métodos
        double vlrTotalCalculado = ab.calcularAbastecimento(ab.qtdLitros, ab.vlrPorLitro);
        ab.exibirAbastecimento(vlrTotalCalculado);

        // Fecha Scanner
        sc.close();
        System.out.println("Obrigado por utilizar nosso programa!");
    }
}
