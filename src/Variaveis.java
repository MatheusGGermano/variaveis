import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);       //Criação do Scanner para coleta de dados.

        // Estrutura de repetição que executa a coleta dos dados, e retorna erro caso o tipo de dado inserido seja incorreto.
        while (true) {

            try {

                System.out.println("Olá! Seja Bem-vindo");

                System.out.println("Digite seu Nome: ");
                String nome = scanner.nextLine();

                System.out.println("Digite seu CPF: ");
                String cpf = scanner.nextLine();

                System.out.println("Digite sua Idade: ");
                int idade = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Digite seu Peso: ");
                float peso = scanner.nextFloat();
                scanner.nextLine();

                System.out.println("Digite sua Altura: ");
                float altura = scanner.nextFloat();
                scanner.nextLine();

                System.out.println("Digite seu Estado Civil: ");
                String estado_civil = scanner.nextLine();

                System.out.println("Seu nome é: " + nome + ", seu CPF é: " + cpf + ", sua idade é: " + idade + " anos, seu peso é de: " + peso + " Kgs, sua altura é: " + altura + ", e seu Estado Civil é: " + estado_civil);

                scanner.close();

                break;

            } catch (Exception e) {

                System.out.println("Tipo errado de dado inserido! Digite sim caso deseje tentar novamente.");

                scanner.nextLine();
                String saida = scanner.nextLine().toLowerCase();

                if (!saida.equals("sim")) {

                    scanner.close();
                    break;

                }
            }
        }
    }
}
