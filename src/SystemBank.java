import java.util.Scanner;

public class SystemBank {
    public static void main(String[] args) {

        String nome;
        String tipoDaConta = "";
        String linha = "***************************************************";
        String vazia = "";
        double saldoIncial = 0;
        int opcaoDesejada = 0;
        int tentativas = 0;


        Scanner entrada = new Scanner(System.in);

        while (!tipoDaConta.equals("corrente") && !tipoDaConta.equals("poupança")) {

            System.out.println("Qual o tipo da conta? Digite Corrente ou Poupança (Limite de 5 tentativas)");
            tipoDaConta = entrada.nextLine().toLowerCase();
            tentativas++;

            if (tentativas == 5) {
                System.out.println("Operação cancelada automáticamente por exceder limite de tentativas");
                return;
            }

            if (tipoDaConta.equals("corrente")) {
                System.out.println("Sua conta foi definida como " + tipoDaConta);
            } else if (tipoDaConta.equals("poupança")) {
                System.out.println("Sua conta foi definida como " + tipoDaConta);
            } else {
                System.out.println("Tipo da conta inválida, Digite Corrente ou Poupança");
            }

            System.out.println("Foram usadas " + tentativas + " tentativas!");
            System.out.println(vazia);

        }

        System.out.println("Digite seu nome completo");
        nome = entrada.nextLine();
        System.out.println("Digite seu Saldo");
        saldoIncial = entrada.nextDouble();

        System.out.println(vazia);
        System.out.println(linha);

        System.out.println("Dados cadastrados pelo cliente:");
        System.out.println(vazia);

        System.out.println("Nome:                  " + nome);
        System.out.println("Tipo da conta:         " + tipoDaConta);
        System.out.printf("Saldo:                 " + "R$ " + "%.2f%n",saldoIncial);
        System.out.println(linha);

        System.out.println(vazia);
        System.out.println(vazia);
        System.out.println("Digite o número da opção desejada:");
        System.out.println(vazia);

        System.out.println("1 - Consultar saldo");
        System.out.println("2 - Receber um valor");
        System.out.println("3 - Transferir um valor");
        System.out.println("4 - Sair");
        opcaoDesejada = entrada.nextInt();

        if(opcaoDesejada == 1) {
            System.out.printf("Seu saldo é " + "R$ " + "%.2f%n",saldoIncial);
        } else if (opcaoDesejada == 2) {
            double valorAReceber = 0;
            System.out.println("Digite o valor que deseja receber: ");
            valorAReceber = entrada.nextDouble();
            System.out.printf("Seu saldo atual é de " + "R$ " + "%.2f%n",valorAReceber + saldoIncial);
        } else if (opcaoDesejada == 3) {
            double valorATransferir = 0;
            System.out.println("Digite o valor que deseja transferir: ");
            valorATransferir = entrada.nextDouble();
            while (valorATransferir > saldoIncial) {
                System.out.println("Não foi possível realizar sua transação, o valor excede seu saldo limite, digite novamente");
                valorATransferir = entrada.nextDouble();
            }
            if (valorATransferir <= saldoIncial) {
                System.out.printf("Seu saldo atual é de " + "R$ " + "%.2f%n", saldoIncial - valorATransferir);
            }
        } else if (opcaoDesejada == 4) {
            System.out.println("Operação cancelada!");
        } else {
            System.out.println("A opção " + opcaoDesejada + " não existe, por favor, tente novamente");
        }

    }
}


