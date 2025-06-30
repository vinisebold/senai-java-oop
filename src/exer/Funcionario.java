package exer;

public class Funcionario extends Individuo {

    private String cargo;
    private double salario;
    private String departamento;

    public Funcionario(String nome,
                       int idade,
                       String email,
                       String departamento,
                       double salario,
                       String cargo) {

        super(nome, idade, email);
        this.departamento = departamento;
        this.salario = salario;
        this.cargo = cargo;
    }

    public double calcularBonus(double pBonus) {
        return salario * pBonus;
    }

    public double getSalario() {
        return salario;
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Departamento: " + departamento + ", Cargo: " + cargo + ", Salário: " + salario);
        System.out.println("Bônus calculado: R$ " + calcularBonus(0.2));
    }
}
