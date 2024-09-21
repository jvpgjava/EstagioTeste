package Exercicios;

import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe uma string: ");
        String input = scanner.nextLine();

        int count = contarLetraA(input);
        if (count > 0) {
            System.out.println("A letra 'a' (maiúscula ou minúscula) aparece " + count + " vez(es) na string.");
        } else {
            System.out.println("A letra 'a' não aparece na string.");
        }
    }

    public static int contarLetraA(String str) {
        int count = 0;
        for (char c : str.toCharArray()) {
            if (c == 'a' || c == 'A') {
                count++;
            }
        }
        return count;
    }
}

