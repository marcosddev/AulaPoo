import java.util.Scanner;
import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int opcao = -1;

        do {
        System.out.println("---------MENU-----------");
        System.out.println("1 - AREA DO QUADRADO");
        System.out.println("2 - AREA DO CIRCULO");
        System.out.println("3 - AREA DO TRIANGULO");
        System.out.println("4 - AREA DO RETANGULO");
        System.out.println("5 - AREA DO LOSANGO");
        System.out.println("6 - AREA DO TRAPÉZIO");
        System.out.println("7 - IMC");
        System.out.println("8 - ESCOLHA TIME");
        System.out.println("0 - SAIR");
        System.out.println("-----------------------");
        System.out.println("Escolha uma opcao: ");
        opcao = entrada.nextInt();


        switch (opcao){  //ESCOLHA(OPCAO)
            case 1:      //CASO 1:
                //nomeClasse apelido = new nomeClasse();
                AreaQuadrado areaq = new AreaQuadrado();
                areaq.calcularAreaQuadrado(entrada);
                break; //PARA O FLUXO DO PROGRAMA, PARA DE EXECUTAR O SWITCH

            case 2:
                //nomeClasse apelido = new nomeClasse();
                AreaCirculo areac = new AreaCirculo();
                areac.calcularAreaCirculo(entrada);
                break;

            case 3:
                //nomeClasse apelido = new nomeClasse();
                AreaTriangulo areat = new AreaTriangulo();
                areat.calcularAreaTriangulo(entrada);
                break;

            case 4:
                //nomeClasse apelido = new nomeClasse();
                AreaRetangulo arear = new AreaRetangulo();
                arear.calcularAreaRetangulo(entrada);
                break;

            case 5:
                //nomeClasse apelido = new nomeClasse();
                AreaLosango areal = new AreaLosango();
                areal.calcularAreaLosango(entrada);
                break;

            case 6:
                //nomeClasse apelido = new nomeClasse();
                AreaTrapezio areatz = new AreaTrapezio();
                areatz.calcularAreaTrapezio(entrada);
                break;

            case 7:
                //nomeClasse apelido = new nomeClasse();
                IMC imc = new IMC();
                imc.calcularIMC(entrada);
                break;

            case 8:
                //nomeClasse apelido = new nomeClasse();
                EscolhaTime EscolhaTime = new EscolhaTime();
                EscolhaTime.escolherTime(entrada);
                break;



            case 0:
                System.out.println("Encerrando o programa");
                break;

              default:
                System.out.println("Opcao invalida");
        }

        if (opcao != 0) {
            System.out.println("\nPressione ENTER para continuar...");
            entrada.nextLine(); // Consome a quebra de linha anterior
            entrada.nextLine(); // Espera o Enter do usuário
        }

        } while (opcao != 0);

        // Fechando o Scanner para liberar a memória (resolve o aviso do VS Code)
        entrada.close();
    }
}
