import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ProductoProvider provider = new ProductoProvider();
        Scanner sc = new Scanner(System.in);

        int opcion;

        do {
            System.out.println("\n==== MENU ====");
            System.out.println("1. Agregar producto");
            System.out.println("2. Mostrar productos");
            System.out.println("3. Actualizar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Salir");

            opcion = sc.nextInt();

            switch (opcion) {

                case 1:
                    sc.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = sc.nextLine();

                    System.out.print("Precio: ");
                    double precio = sc.nextDouble();

                    provider.insert(nombre, precio);
                    break;

                case 2:
                    provider.query();
                    break;

                case 3:
                    System.out.print("ID: ");
                    int id = sc.nextInt();

                    System.out.print("Nuevo precio: ");
                    double nuevo = sc.nextDouble();

                    provider.update(id, nuevo);
                    break;

                case 4:
                    System.out.print("ID: ");
                    int deleteId = sc.nextInt();

                    provider.delete(deleteId);
                    break;
            }

        } while (opcion != 5);
    }
}
