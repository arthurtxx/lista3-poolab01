public class Equacao {

/*Uma equa ̧c ̃ao de segundo gau possui o seguinte formato:
ax2 + bx + c
Vamos criar um programa em java para resolver uma equa ̧c ̃ao de segundo grau.
1. Crie uma classe chamada Equacao.
2. Esta classe deve possuir os seguintes atributos: a, b, c, x1, x2 e delta.
3. E os m ́etodos: calculaDelta, calculaX1, calculaX2.*/

    private double a;
    private double b;
    private double c;
    private double x1;
    private double x2;
    private double delta;

    public double calculaDelta(double valorA, double valorB, double valorC) {
        a = valorA;
        b = valorB;
        c = valorC;
        delta = (b * b) - (4 * a * c);
        return delta;
    }

    public double calculaX1() {
        x1 = (-b + Math.sqrt(delta)) / (2 * a);
        return x1;
    }

    public double calculaX2() {
        x2 = (-b - Math.sqrt(delta)) / (2 * a);
        return x2;
    }
}