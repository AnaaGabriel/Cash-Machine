package tegra.cashmachine;

import java.util.Scanner;

public class CashMachine {

    public static void main(String[] args) throws IllegalAccessException {
        Scanner Entrada = new Scanner(System.in);
        int valorSaque;

        System.out.println("Digite o valor do saque: ");
        valorSaque = Entrada.nextInt();

        if (valorSaque > 0) {
            if ((valorSaque % 100) == 0 || (valorSaque % 50) == 0 || (valorSaque % 20) == 0 || (valorSaque % 10) == 0) {
                System.out.print("[");
                while (valorSaque > 0) {
                    if (valorSaque >= 100) {
                        System.out.print("100.00");
                        valorSaque -= 100;
                    } 
                    else if (valorSaque >= 50) {
                        System.out.print("50.00");
                        valorSaque -= 50;
                    }
                    else if (valorSaque >= 20) {
                        System.out.print("20.00");
                        valorSaque -= 20;
                    }
                    else if (valorSaque >= 10) {
                        System.out.print("10.00");
                        valorSaque -= 10;
                    }

                    if (valorSaque != 0) {
                        System.out.print(", ");
                    }

                }
                System.out.println("]");
            } 
            else {
                System.out.println("Erro de notas indisponíveis");
            }
        } 
        else {
            System.out.println("Erro de valor inválido");
        }

    }

}
