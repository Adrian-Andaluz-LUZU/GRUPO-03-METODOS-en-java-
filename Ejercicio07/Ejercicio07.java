class Producto {
    String nombre;
    int stock;
    double precioUnitario;

    public double calcularValorTotal() {
        return stock * precioUnitario;
    }
}

public class Ejercicio7 {
    public static void main(String[] args) {
        Producto p = new Producto();

        p.nombre = "Laptop";
        p.stock = 10;
        p.precioUnitario = 25.5;

        double totalInventario = p.calcularValorTotal();

        System.out.println("Producto: " + p.nombre);
        System.out.println("Stock: " + p.stock);
        System.out.println("Precio unitario: " + p.precioUnitario);
        System.out.println("Valor total del inventario: " + totalInventario);
    }
}
