package cadastro_cliente;

import java.util.Scanner;

public class Classe1 {
    public static void main(String[] args) {

        // Inicializa Scanner
        Scanner sc = new Scanner(System.in);

        // Input
        Cliente cli = new Cliente();
        cli.email = "joao@gmail.com";
        cli.idade = 16;
        cli.nome = "João Da Silva";

        // Output
        cli.imprimirInformacoes();
        cli.testarIdade(cli.idade);

        if (cli.atualizarEmail(sc.nextLine())) {
            System.out.println("Email atualizado com sucesso");
            cli.imprimirInformacoes();
        }


        // Fecha Scanner
        sc.close();
    }
}
