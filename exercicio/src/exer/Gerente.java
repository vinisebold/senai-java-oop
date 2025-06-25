package exer;

public class Gerente extends Funcionario {

    private double bonusGerencial;

    public Gerente(String nome,
                   int idade,
                   String email,
                   int departamento,
                   double salario,
                   String cargo,
                   double bonusGerencial) {

        super(nome, idade, email, departamento, salario, cargo);
        this.bonusGerencial = bonusGerencial;
    }
}
