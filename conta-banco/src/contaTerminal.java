import java.util.Locale;
import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);

        String nomeCliente = "MARIO ANDRADE ", agencia = " ";
        int numeroDaConta = 1021;
        double saldo = 237.45;

        System.out.println("Por favor, digite o número da agência");
        agencia = sc.nextLine();

        System.out.println("Digite seu nome: ");
        nomeCliente = sc.nextLine();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nossso banco, sua agência é " + agencia + ", conta " + numeroDaConta + " e seu saldo R$" + saldo + " já está disponível para saque" );



    }
}
