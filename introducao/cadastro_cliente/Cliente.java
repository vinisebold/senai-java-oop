package cadastro_cliente;

public class Cliente {
    String email;
    String nome;
    int idade;

    public void imprimirInformacoes() {
        System.out.println("Email: " + email);
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade);
    }

    public void testarIdade(int pIdade) {
        if (pIdade > 18) {
            System.out.println("Maior de idade!");
        } else {
            System.out.println("Menor de idade!");
        }
    }

    public boolean atualizarEmail(String pEmail) {
        email = pEmail;
        return true;
    }
}
