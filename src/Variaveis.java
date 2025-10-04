import java.util.Scanner;

public class Variaveis {

    public static void main(String[] args){

        System.out.println("Olá! Seja Bem-vindo");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu Nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu Estado Civil: ");
        String estado_civil = scanner.nextLine();

        System.out.println("Digite seu CPF: ");
        String cpf = scanner.nextLine();

        System.out.println("Digite sua Idade: ");
        int idade = scanner.nextInt();

        System.out.println("Digite seu Peso: ");
        float peso = scanner.nextFloat();

        System.out.println("Digite sua Altura: ");
        float altura = scanner.nextFloat();

        scanner.close();

        System.out.println("Seu nome é: " + nome + ", seu Estado Civil é: " + estado_civil + ", seu CPF é: " + cpf + ", sua idade é: " + idade + " anos, seu peso é de: " + peso + " Kgs, e sua altura é: " + altura);

    }

}
