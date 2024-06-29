import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Por favor, digite o número da Agência: ");
        String agencyNumber = keyboard.nextLine();
        System.out.print("Por favor, digite o número da Conta: ");
        int accountNumber = keyboard.nextInt();
        keyboard.nextLine();
        System.out.print("Por favor, digite o seu nome: ");
        String accountholder = keyboard.nextLine();
        System.out.print("Por favor, digite o saldo da conta: ");
        double balance = keyboard.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", accountholder, agencyNumber, accountNumber, balance);

        keyboard.close();
    }
}
