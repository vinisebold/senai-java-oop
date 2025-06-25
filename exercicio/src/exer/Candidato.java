package exer;

public class Candidato extends Individuo {

    private int experienciaAnos;
    private String curriculo;

    // Construtor
    public Candidato(String nome,
                     int idade,
                     String email,
                     int experienciaAnos,
                     String curriculo) {

        super(nome, idade, email);
        this.experienciaAnos = experienciaAnos;
        this.curriculo = curriculo;
    }

    public void enviarCurriculo() {
        System.out.println("Currículo Enviado!");
    }

    @Override
    public void apresentar() {
        super.apresentar();
        System.out.println("Anos de experiência: " + experienciaAnos);
        System.out.println("Currículo: " + curriculo);
    }

}
