import java.util.Scanner;

public class Exercicio23 {
    public static void main(String[] args) {

        Scanner sc = new Scanner (System.in);
        System.out.println("Digite salário anual: ");
        Double salario = sc.nextDouble();

        Double valorTaxa;

        Double tax1 = 0.0970;
        Double tax2 = 0.3735;
        Double tax3 = 0.4950;

        if (salario <= 34172){
            valorTaxa = salario * tax1;
            System.out.println("Taxa: R$ " + valorTaxa);
        }
        else if (salario >= 34713 && salario <= 68507){
            valorTaxa = salario * tax2;
            System.out.println("Taxa: R$ " + valorTaxa);
        } else {
            valorTaxa = salario * tax3;
            System.out.println("Taxa: R$ " + valorTaxa);
        }

        Double salarioFinal = salario - valorTaxa;
        System.out.println("Salario final líquido: R$ " + salarioFinal);

        sc.close();


    }


}
