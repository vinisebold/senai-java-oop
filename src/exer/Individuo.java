package exer;

public class Individuo {

    private String nome;
    private int idade;
    private String email;

    // Construtor
    public Individuo(String nome, int idade, String email) {

        this.nome = nome;
        this.idade = idade;
        this.email = email;
    }

    // Getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getEmail() {
        return email;
    }

    // Setters
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    // Função
    public void apresentar() {
        System.out.println("------------------------");
        System.out.println("Nome: " + nome + ", Idade: " + idade + ", Email: " + email);
    }

}
