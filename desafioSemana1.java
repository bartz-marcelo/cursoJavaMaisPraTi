import java.util.Scanner;

public class desafioSemana1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println(" Por favor, informe seu peso em kg.");
        double peso = sc.nextDouble();
        System.out.println(" Por favor, informe sua altura em m.");
        double altura = sc.nextDouble();

        double imc = peso / (altura * altura);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso ideal.");
        } else if (imc >= 18.5 && imc <= 24.9) {
            System.out.println("Peso normal (faixa considerada saudável).");
        } else if (imc >= 25 && imc <= 29.9) {
            System.out.println("Sobrepeso.");
        } else if (imc >= 30 && imc <= 34.9) {
            System.out.println("Obsidade grau 1.");
        } else if (imc >= 35 && imc <= 39.9) {
            System.out.println("obesidade grau 2.");
        } else {
            System.out.println("Obsidade grau 3.");
        }
        System.out.println("Programa encerrado.");
    }
}
