public class Calculadora {

    public double calcularPromedio(double n1, double n2, double n3) {
        return (n1 + n2 + n3) / 3;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        double nota1 = 8.5;
        double nota2 = 9.0;
        double nota3 = 7.5;

        double promedio = calc.calcularPromedio(nota1, nota2, nota3);

        System.out.println("Promedio: " + promedio);
    }
}
