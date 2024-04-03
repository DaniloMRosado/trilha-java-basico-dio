import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in); 

        int agencia;
        String conta, cliente;
        float saldo;

        System.out.println("Olá, digite seu nome!");
        cliente = input.nextLine();
        System.out.println("Insira o número da Agência!");
        agencia = input.nextInt();
        input.nextLine();
        System.out.println("Agora insira o número da conta!");
        conta = input.nextLine();
        System.out.println("Por favor, digite seu saldo!");
        saldo = input.nextFloat();
        System.out.println("Olá "+cliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+conta+" e seu saldo "+saldo+" já está disponível para saque.");
        input.close();
    }
}
