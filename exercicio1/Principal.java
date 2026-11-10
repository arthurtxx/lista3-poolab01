import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = leitor.nextDouble();

        System.out.print("Digite o valor de b: ");
        double b = leitor.nextDouble();

        System.out.print("Digite o valor de c: ");
        double c = leitor.nextDouble();

        // Cria o objeto da classe Equacao
        Equacao eq = new Equacao();

        // Calcula o delta
        double delta = eq.calculaDelta(a, b, c);
        System.out.println("Delta = " + delta);

        // Verifica quantas raízes existem
        if (delta < 0) {
            System.out.println("Não existem raízes reais.");
        } else if (delta == 0) {
            System.out.println("Existe apenas 1 raiz.");
            System.out.println("x1 = " + eq.calculaX1());
        } else {
            System.out.println("Existem 2 raízes.");
            System.out.println("x1 = " + eq.calculaX1());
            System.out.println("x2 = " + eq.calculaX2());
        }

        leitor.close();
    }
}