package lista02.exercicio7;

import java.util.Scanner;

public class Holerite {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Quanto você recebe por hora?: ");
        double valorHora = input.nextDouble();
        System.out.println("Quantas horas você trabalhou?: ");
        double horaTrabalhada = input.nextDouble();
        input.close();
        double salarioBruto = valorHora * horaTrabalhada;
        double inss = salarioBruto * 0.08;
        double salarioBrutoSemInss = salarioBruto - inss;
        double sindicato = salarioBruto * 0.05;
        double impostoDeRenda = salarioBrutoSemInss * 0.11;
        double salarioBrutoComImpostoDeRenda = salarioBruto - impostoDeRenda;
        double salarioLiquido = salarioBruto - inss - sindicato - impostoDeRenda;
        System.out.printf("Seu salário com desconto do Imposto de Renda será: R$%.2f\n ", salarioBrutoComImpostoDeRenda);
        System.out.printf("Você pagará ao INSS: R$%.2f\n ", inss);
        System.out.printf("Você pagará ao sindicato: R$%.2f\n ", sindicato);
        System.out.printf("Seu salário liquido será: R$%.2f\n ", salarioLiquido);
    }
}
