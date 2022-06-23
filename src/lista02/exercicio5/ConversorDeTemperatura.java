package lista02.exercicio5;

import java.util.Scanner;

public class ConversorDeTemperatura {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Insira a temperatura na escala Fahrenheit: ");
        double temperatura = input.nextDouble();
        input.close();
        double conversao = (temperatura - 32) / 1.8;
        System.out.println(temperatura + " grau(s) Fahrenheit equivale(m) a " + conversao + " graus Celsius.");
    }
}
