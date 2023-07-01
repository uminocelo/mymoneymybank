import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Qual o nome do titular?");
        String nomeTitular = scan.nextLine();

        System.out.println("Qual o tipo conta?");
        String tipoConta = scan.nextLine();

        System.out.println("Qual o saldo inicial?");
        double saldo = scan.nextDouble();


        System.out.println("----------------------");
        System.out.println("Nome do titular da conta: " + nomeTitular);
        System.out.println("Tipo de conta: " + tipoConta);
        System.out.println("Saldo: " + saldo);
        System.out.println("----------------------");

        int command = 1;
        String menu = """
                -- MENU --
                
                1 - Consultar Saldo
                2 - Transferir saldo
                3 - Receber valor
                4 - Sair
                
                """;


        while (command != 4) {
            System.out.println(menu);
            command = scan.nextInt();

            if (command == 1) {
                System.out.println("O saldo atualizado é " + saldo);
            } else if (command == 2) {
                System.out.println("Qual valor deseja transferir ?");
                double valor = scan.nextDouble();
                if (valor > saldo){
                    System.out.println("Transação cancelada! Não ha saldo suficiente");
                } else {
                    saldo -= valor;
                    System.out.println("Transação realizada com sucesso!");
                }
            } else if (command == 3) {
                System.out.println("Qual o valor recebido ?");
                double valor = scan.nextDouble();
                saldo += valor;

                System.out.println("Transação realizada com sucesso!");
                System.out.println("Seleciona a opção 1 para consultar o saldo!");
            } else if (command != 4) {
                System.out.println("Opcao invalida!");
            }
        }
    }
}