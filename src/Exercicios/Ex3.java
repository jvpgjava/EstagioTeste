package Exercicios;

public class Ex3 {
    public static void main(String[] args) {
        int INDICE = 12;
        int SOMA = 0;
        int K = 1;

        while (K < INDICE) {
            K = K + 1; // K vai de 1 até 11
            SOMA = SOMA + K; // Adiciona K a SOMA
        }

        System.out.println(SOMA); // Imprime o resultado da SOMA
    }
}

//O valor será 77

