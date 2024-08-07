import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor digite seu nome:");
        String nome = scanner.nextLine();
        System.out.println("------------------");
        System.out.println("Por favor digite o numero da agencia:");
        String agencia = scanner.nextLine();
        System.out.println("------------------");
        System.out.println("Por favor digite seu numero de telefone:");
        int numero = scanner.nextInt();
        System.out.println("------------------");
        System.out.println("Por favor digite seu saldo:");
        Double saldo = scanner.nextDouble();
        System.out.println("------------------");

        System.out.println("Olá ["+nome+"], obrigado por criar uma conta em nosso banco, sua agência é ["+agencia+"], conta ["+numero+"] e seu saldo [R$ "+saldo+"] já está disponível para saque");
    }
}
