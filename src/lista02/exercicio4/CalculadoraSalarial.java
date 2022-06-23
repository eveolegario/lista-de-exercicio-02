package lista02.exercicio4;

import java.util.Scanner;

public class CalculadoraSalarial {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você recebe por hora?: ");
        double valorHora = input.nextDouble();
        System.out.println("Quantas horas você trabalhou?: ");
        double horaTrabalhada = input.nextDouble();
        input.close();
        double salario = valorHora * horaTrabalhada;
        System.out.printf("Você irá receber R$%.2f", salario);
    }
}
