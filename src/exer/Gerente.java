package exer;

public class Gerente extends Funcionario {

    private double bonusGerencial;

    public Gerente(String nome,
                   int idade,
                   String email,
                   String departamento,
                   double salario,
                   String cargo,
                   double bonusGerencial) {

        super(nome, idade, email, departamento, salario, cargo);
        this.bonusGerencial = bonusGerencial;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        super.calcularBonus(bonusGerencial);
    }

    public void delegarTarefa(String tarefa) {
        System.out.println("------------------------");
        System.out.println(getNome() + " delegou: " + tarefa);
    }
}
