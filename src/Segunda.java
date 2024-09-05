import java.util.Scanner;

public class Segunda {
    
    //2) Dado a sequência de Fibonacci, onde se inicia por 0 e 1 e o próximo valor sempre será a soma dos 2 valores anteriores 
    //(exemplo: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34...), escreva um programa na linguagem que desejar onde, informado um número, ele calcule a sequência de Fibonacci 
    //e retorne uma mensagem avisando se o número informado pertence ou não a sequência

    public static void main(String[] args) {
        
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Informe um número: ");
            int numero = scanner.nextInt();

            if (sequenciaFibonacci(numero)) {
                System.out.println(numero + " pertence à sequência de Fibonacci.");
            } else {
                System.out.println(numero + " não pertence à sequência de Fibonacci.");
            }
        }
    }

    public static boolean sequenciaFibonacci(int numero) {
        int a = 0;
        int b = 1;

        while (b <= numero) {
            if (b == numero) {
                return true;
            }
            int proximo = a + b;
            a = b;
            b = proximo;
        }

        return false;
    }
}
