import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o número da conta: ");
        int number = sc.nextInt();
        sc.nextLine();

        System.out.println("Digite a Agência: ");
        String ag = sc.nextLine();

        System.out.println("Digite seu nome: ");
        String name = sc.nextLine();

        System.out.println("Digite o saldo: ");
        double balance = sc.nextDouble();

        System.out.print("Olá, " + name + ", obrigado por criar uma conta em nosso banco, sua agência é " + ag + ", conta: " + number + " e seu saldo de R$ " + balance + " já está disponível para saque.");

        sc.close();
    }
}
