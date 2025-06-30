package exer;

public class Main {
    public static void main(String[] args) {
        Candidato candidato1 = new Candidato("Edinaldo", 43, "edinaldo_pereira@hotmail.com", 11, "curriculo_edinaldo.pdf");
        Candidato candidato2 = new Candidato("Gabriela", 19, "gabriela_sebold@yahoo.com", 4, "GabrielaSebold.pdf");

        Funcionario funcionario1 = new Funcionario("Daniel", 21, "daniel_gamer02@orkut.com", "DevOps", 3900, "Gestão de Projetos");

        Gerente gerente1 = new Gerente("Vinicius", 19, "vinicius_sebold@gmail.com", "TI", 8000, "Tech Lead", 2);

        candidato1.enviarCurriculo();
        candidato2.enviarCurriculo();
        candidato1.apresentar();
        candidato2.apresentar();
        gerente1.apresentar();
        gerente1.delegarTarefa("Revisar commits");
    }
}
