import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        /**
         * Conhecer e importar a classe Scanner
         * 
         * Exibir as mensagens para nosso usuário
         * 
         * Obter pela classe scanner os valores digitados no terminal
         *  
         * Exibir a mensagem "Conta criada".
         * 
         * */
        //Criando objeto scanner para receber os dados de entrada do usuario.

        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o número da Agência ! ");
        String numeroAgencia = scanner.next();

        System.out.println("Digite o número da conta :");
        int numeroConta = scanner.nextInt();

        System.out.println("Qual o seu primeiro nome? ");
        String nomeCliente = scanner.next();

        System.out.println("Qual o seu sobrenome? ");
        String sobrenomeCliente = scanner.next();

        System.out.println("Digite o valor do depósito : ");
        double saldoCliente = scanner.nextDouble();
        
        System.out.println("\n\nOla " + nomeCliente + " " + sobrenomeCliente + ", obrigado por criar uma conta em nosso banco, sua Agência é "+ numeroAgencia + ", conta "+numeroConta+" e seu saldo R$ "+saldoCliente+" já está disponível para saque.");

    }
}
