import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();
        scanner.close();

        if (isFibonacci(numero)) {
            System.out.println("O número " + numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + numero + " não pertence à sequência de Fibonacci.");
        }

        System.out.print("Sequência de Fibonacci até " + numero + ": ");
        printFibonacciSequence(numero);
    }

    public static boolean isFibonacci(int n) {
        if (n < 0) {
            return false;
        }
        int a = 0;
        int b = 1;
        while (a < n) {
            int temp = a;
            a = b;
            b = temp + b;
        }
        return a == n || b == n;
    }

    public static void printFibonacciSequence(int n) {
        int a = 0;
        int b = 1;
        System.out.print(a + " " + b);
        while (b <= n) {
            int temp = a;
            a = b;
            b = temp + b;
            if (b <= n) {
                System.out.print(" " + b);
            }
        }
        System.out.println();
    }
}
