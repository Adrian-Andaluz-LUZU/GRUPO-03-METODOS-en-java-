class Producto {
    int stock;
    double precioUnitario;

    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}

public class Main {
    public static void main(String[] args) {

        // a. Instanciar un objeto de la clase Producto llamado p
        Producto p = new Producto();

        // b. Asignar los valores
        p.stock = 10;
        p.precioUnitario = 25.5;

        // c. Llamar al método y guardar el resultado
        double totalInventario = p.calcularValorTotal();

        // Imprimir el resultado
        System.out.println("Total del inventario: " + totalInventario);
    }
}
