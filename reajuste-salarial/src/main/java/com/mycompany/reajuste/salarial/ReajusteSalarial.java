public class ReajusteSalarial {
    public static void main(String[] args) {
        // Constantes e dados fixos
        double salarioAtual = 1500.00; // Valor fixo do salário
        final double INFLACAO = 3.8;

        // Variáveis para calcular o reajuste
        double percentualReajuste = 0;

        // Determina o percentual de aumento
        if (salarioAtual <= 280.00) {
            percentualReajuste = 20.0;
        } else if (salarioAtual > 280.00 && salarioAtual <= 700.00) {
            percentualReajuste = 15.0;
        } else if (salarioAtual > 700.00 && salarioAtual < 1500.00) {
            percentualReajuste = 10.0;
        } else {
            percentualReajuste = 5.0;
        }

        // Calcula os valores do aumento e o novo salário
        double valorAumento = salarioAtual * (percentualReajuste / 100);
        double novoSalario = salarioAtual + valorAumento;

        // Calcula o valor do aumento real descontando a inflação
        double aumentoReal = valorAumento - (salarioAtual * (INFLACAO / 100));

        // Exibe os resultados
        System.out.println("\nResultados:");
        System.out.printf("1. Salário antes do reajuste: R$ %.2f%n", salarioAtual);
        System.out.printf("2. Percentual de aumento aplicado: %.1f%%%n", percentualReajuste);
        System.out.printf("3. Valor do aumento: R$ %.2f%n", valorAumento);
        System.out.printf("4. Novo salário, após o aumento: R$ %.2f%n", novoSalario);
        System.out.printf("5. Valor do aumento real, descontada a inflação: R$ %.2f%n", aumentoReal);
    }
}