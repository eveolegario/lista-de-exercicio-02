package lista02.exercicio3;

import java.util.Scanner;
public class ConversorDeMedidas {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Inserir metros: ");
        double metros = input.nextDouble();
        input.close();
        double centimetros = metros * 100;
        System.out.println(metros + " metro(s) equivale(m) a " + centimetros + " centímetros ");
    }
}
