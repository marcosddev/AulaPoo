import java.util.Scanner;

public class EscolhaTime {

    public void escolherTime(Scanner entrada) {
      System.out.println("---------MENU-----------");
      System.out.println("1 - FLAMENGO");
      System.out.println("2 - BOTAFOGO");
      System.out.println("3 - FLUMINENSE");
      System.out.println("4 - VASCO");
      System.out.println("5 - MADUREIRA");
      System.out.println("6 - BANGU");
      System.out.println("7 - PORTUGUESA");
      System.out.println("8 - VOLTA REDONDA");
      System.out.println("9 - AMERICA");
      System.out.println("0 - SAIR");
      System.out.println("-----------------------");
      System.out.println("Escolha uma opcao: ");

       int opcao = entrada.nextInt();

      switch (opcao) {
        case 1 -> System.out.println("Você escolheu FLAMENGO");
        case 2 -> System.out.println("VOCÊ ESCOLHEU BOTAFOGO");
        case 3 -> System.out.println("VOCÊ ESCOLHEU FLUMINENSE");
        case 4 -> System.out.println("VOCÊ ESCOLHEU VASCO");
        case 5 -> System.out.println("VOCÊ ESCOLHEU MADUREIRA");
        case 6 -> System.out.println("VOCÊ ESCOLHEU BANGU");
        case 7 -> System.out.println("VOCÊ ESCOLHEU PORTUGUESA");
        case 8 -> System.out.println("VOCÊ ESCOLHEU VOLTA REDONDA");
        case 9 -> System.out.println("VOCÊ ESCOLHEU AMERICA");
        case 0 -> System.out.println("VOLTANDO AO MENU PRINCIPAL");
        default -> System.out.println("OPÇÃO INVÁLIDA");

      }

    }
}
