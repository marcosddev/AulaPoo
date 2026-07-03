import java.util.Scanner;

public class AreaQuadrado {
    public void calcularAreaQuadrado(Scanner entrada){
        double lado, area;

        System.out.println("Digite o lado do quadrado: ");
        lado = entrada.nextDouble();

        area = lado * lado;

        System.out.printf("A área do quadrado é: %.2f\n", area);
    }
}
