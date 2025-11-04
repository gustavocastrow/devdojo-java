import java.util.Locale;
import java.util.Scanner;

public class Exercicio23v2 {

    private static final double LIMITE_FAIXA_1 = 34172.00;
    private static final double LIMITE_FAIXA_2 = 68507.00;

    private static final double TAXA_FAIXA_1 = 0.0970;
    private static final double TAXA_FAIXA_2 = 0.3735;
    private static final double TAXA_FAIXA_3 = 0.4950;

    public static double calcularTaxa(double salarioAnual){
        if (salarioAnual <= LIMITE_FAIXA_1){
            return salarioAnual * TAXA_FAIXA_1;
        } else if (salarioAnual <= LIMITE_FAIXA_2){
            return salarioAnual * TAXA_FAIXA_2;
        } else {
            return salarioAnual * TAXA_FAIXA_3;
        }
    }

    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in).useLocale(Locale.US)) {

            System.out.println("Digite salário anual: ");
            double salario = sc.nextDouble();

            double valorTaxa = calcularTaxa(salario);
            double salarioFinal = salario - valorTaxa;

            System.out.printf("Salário bruto: R$ %.2f\n", salario);
            System.out.printf("Valor taxa: R$ %.2f\n", valorTaxa);
            System.out.printf("Salário Líquido: R$ %.2f\n", salarioFinal);

        } catch (Exception e) {
            System.err.println("Erro ao ler o valor. Por favor, digite um número válido");
        }
    }


}
