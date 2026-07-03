import java.util.Scanner;

public class IMC {
    public void calcularIMC(Scanner entrada) {
           double peso, altura, imc;

        System.out.println("---------------------------");
        System.out.println("Digite a sua altura: ");
        altura  = entrada.nextDouble();
        System.out.println("Digite o seu peso: ");
        peso = entrada.nextDouble();

        imc =  peso/(altura * altura);

        System.out.println("---------------------------");
    	System.out.printf("O seu IMC é: %.2f%%\n", imc);

        if (imc < 18.5) {
    System.out.println(" Abaixo do peso");
} else if (imc < 25) {
    System.out.println("Peso normal");
} else if (imc < 30) {
    System.out.println("Sobrepeso");
} else if (imc < 35) {
    System.out.println("Obesidade 1° grau");
} else if (imc < 40) {
    System.out.println("Obesidade 2° grau");
} else {
    System.out.println("Obesidade 3° grau");
}
        }
    }
