package posto_combustivel;

public class Abastecimento {

    // Declara variáveis
    char tipoCombustivel;
    double qtdLitros;
    double vlrPorLitro;

    public void exibirAbastecimento(double vlrTotal) {
        String descCombustivel = "";

        if (tipoCombustivel == 'A') {
            descCombustivel = "Alcool";
        } else if (tipoCombustivel == 'D') {
            descCombustivel = "Diesel";
        } else {
            descCombustivel = "Gasolina";
        }

        System.out.println("\nForam abastecidos " + qtdLitros + "L de " + descCombustivel + " gerando um total de R$" + vlrTotal);
    }

    public double calcularAbastecimento(double pQtdLitros, double pVlrLitro){
        double vlrTotal = 0;
        vlrTotal = qtdLitros * vlrPorLitro;
        return vlrTotal;

    }
}
