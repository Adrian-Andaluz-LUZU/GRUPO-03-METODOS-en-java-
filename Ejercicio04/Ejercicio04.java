public class Ejercicio4 {

    public static void incrementar(int n) {
        n = n + 5;
        System.out.println("Valor dentro del método: " + n);
    }

    public static void main(String[] args) {
        int numero = 10;

        incrementar(numero);

        System.out.println("Valor en main después del método: " + numero);
    }
}
