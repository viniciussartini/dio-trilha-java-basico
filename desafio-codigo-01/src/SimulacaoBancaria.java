import java.util.Scanner;

public class SimulacaoBancaria {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        double saldo = 0;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Por favor insira qual opção deseja: ");
            System.out.println("1. Depositar");
            System.out.println("2. Sacar");
            System.out.println("3. Consultar Saldo");
            System.out.println("0. Encerrar");
            int opcao = scanner.nextInt();
            switch (opcao) {
                case 1:
                    System.out.print("Por favor, insira a quantidade que deseja depositar: ");
                    saldo += scanner.nextDouble();
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 2:
                    System.out.print("Por favor, insira a quantidade que deseja sacar: ");
                    double saque = scanner.nextDouble();
                    if(saque > saldo) {
                        System.out.println("Saldo insuficiente");
                    } else {
                        saldo -= saque;
                        System.out.printf("Saldo atual: %.1f%n", saldo);
                    }
                    break;
                case 3:
                    System.out.printf("Saldo atual: %.1f%n", saldo);
                    break;
                case 0:
                    System.out.println("Programa encerrado.");
                    continuar = false;
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
        scanner.close();
    }
}
