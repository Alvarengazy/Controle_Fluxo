import java.util.Scanner;

public class Contador {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Digite seu primeiro número : ");
            int primeiroNumero = scanner.nextInt();

            System.out.print("Digite seu segundo número : ");
            int segundoNumero = scanner.nextInt();

            executarContador(primeiroNumero, segundoNumero);


        } catch (ParametrosInvalidosException e) {
            System.out.println("Erro: " + e.getMessage());
        }
        scanner.close();
    }

    public static void executarContador (int primeiroNumero, int segundoNumero)
     throws ParametrosInvalidosException {

        if (primeiroNumero >= segundoNumero) {
        throw new ParametrosInvalidosException ("Erro: Seu segundo numero é menor que o primeiro");
        }

        int total = segundoNumero - primeiroNumero;

        System.out.println("A diferença entre os o Primeiro numero e o Segundo é de : " + total);
     }
    }

    /* Caso queira pode ser executado em uma forma de loop, utilizando "For" 
     
    for (int i = 1; i <= total; i++) {
            System.out.println("Imprimindo o número " + i);
            }

      * Ambos mostram a diferença, porem de jeitos diferentes.      
    */