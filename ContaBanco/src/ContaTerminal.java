import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o numero da agencia: ");
        String agencia = scanner.next();

        System.out.println("Por favor, digite o número da conta: ");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome: ");
        String nomeCliente = scanner.next();

        System.out.println("Por favor, digite o seu saldo: ");
        Double saldo = scanner.nextDouble();

       System.out.print("Olá " + nomeCliente + ", ");
       System.out.print("obrigado por criar uma conta em nosso banco, ");
       System.out.print("sua agência é " + agencia + " ");
       System.out.println("conta " + numero + " e seu saldo é de R$ " + saldo + " já está disponível para saque.");

    }
}
