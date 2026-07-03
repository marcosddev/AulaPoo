import java.util.Scanner;

public class AreaCirculo {
    public void calcularAreaCirculo(Scanner entrada){
        double raio, area;

        //ESCREVAL("Digite o raio do circulo: ")
        System.out.println("Digite o raio do circulo: ");
        raio = entrada.nextDouble();
        //LEIA(RAIO)

        area = Math.PI * raio * raio;
    	System.out.printf("A área do círculo é: %.2f\n", area);
    }
}
