import java.util.HashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Gerador {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.print("Informe a quantidade de números desejada: ");
        int quantidade = scanner.nextInt();

        // Verifica se a quantidade é válida (de 1 a 10, por exemplo)
        if (quantidade < 1 || quantidade > 18 ) {
            System.out.println("Quantidade inválida! Deve ser entre 1 e 18.");
            return;
        }

        Set<Integer> numeros = new HashSet<>();

        // Gera números aleatórios únicos
        while (numeros.size() < quantidade) {
            int numero = random.nextInt(60) + 1;  // Gera um número entre 1 e 60
            numeros.add(numero);
        }

        // Exibe os números gerados
        System.out.println("Números gerados: " + numeros);
    }
}

