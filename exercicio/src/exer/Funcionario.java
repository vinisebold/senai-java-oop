package exer;

public class Funcionario extends Individuo {

    private String cargo;
    private double salario;
    private int departamento;

    public Funcionario(String nome,
                       int idade,
                       String email,
                       int departamento,
                       double salario,
                       String cargo) {

        super(nome, idade, email);
        this.departamento = departamento;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus() {

        return salario * 1.2;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Departamento: " + departamento);
        System.out.println("Salário: " + calcularBonus());
        System.out.println("Cargo: " + cargo);
    }
}
