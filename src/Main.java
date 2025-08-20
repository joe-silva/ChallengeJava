import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        RateRequest ratesRequest = new RateRequest();
        Codes codes = new Codes();
        System.out.println("**********************************************");

        while(true) {
            System.out.println("Seja bem-vindo/a ao Conversor de Moedas.");

            // Menu:
            System.out.println("\nEscolha uma opcao valida: ");
            System.out.println("1) Dolar =>> Peso argentino");
            System.out.println("2) Peso argentino =>> Dolar");
            System.out.println("3) Dolar =>> Real brasileiro");
            System.out.println("4) Real brasileiro =>> Dolar");
            System.out.println("5) Dolar =>> Peso colombiano");
            System.out.println("6) Peso colombiano =>> Dolar");
            System.out.println("7) Sair");

            int escolha = scanner.nextInt();
            switch (escolha) {
                case 1:
                    codes.setBase_code("USD");
                    codes.setTarget_code("ARS");
                    break;
                case 2:
                    codes.setBase_code("ARS");
                    codes.setTarget_code("USD");
                    break;
                case 3:
                    codes.setBase_code("USD");
                    codes.setTarget_code("BRL");
                    break;
                case 4:
                    codes.setBase_code("BRL");
                    codes.setTarget_code("USD");
                    break;
                case 5:
                    codes.setBase_code("USD");
                    codes.setTarget_code("COP");
                    break;
                case 6:
                    codes.setBase_code("COP");
                    codes.setTarget_code("USD");
                    break;
                case 7:
                    System.out.println("Obrigado por usar conversor de moedas. Ate logo!");
                    return;
                default:
                    System.out.println("Escolha uma opcao valida.");
                    System.out.println("******************************");
continue;
            }
            System.out.println("Digite o valor que deseja converter: ");
            codes.setAmount(scanner.nextDouble());


            try {
                Rates novaCotacao = ratesRequest.baixaRate(codes.getBase_code(), codes.getTarget_code(), codes.getAmount());
                System.out.println("Valor " + codes.getAmount() + " [" + codes.getBase_code() + "] corresponde ao valor final de " +
                        "=>>> " + novaCotacao + " [" + codes.getTarget_code() + "] ");


            } catch (Exception e) {
                System.out.println("Encontrei uma excessao. Nao sei qual, mas continue tentando que vai dar certo!");

            }
        }
        //System.out.println("Programa finalizado");
    }

}

