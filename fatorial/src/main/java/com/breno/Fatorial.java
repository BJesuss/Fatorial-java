package fatorial.src.main.java.com.breno;
public class Fatorial { 

    public static long calcularFatorial(int numero) {
        long fatorial = 1;
        for (int i = 1; i <= numero; i++) {
            fatorial *= i;
        }
        return fatorial;
    }

    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Digite um número inteiro positivo: ");
        int numero = scanner.nextInt();

        if (numero < 0) {
            System.out.println("Número inválido. Insira um número positivo.");
        } else {
            System.out.println("Fatorial de " + numero + " é: " + calcularFatorial(numero));
        }

        scanner.close();
    }
}