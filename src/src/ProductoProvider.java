import java.util.*;

public class ProductoProvider {

    private List<Producto> baseDatos = new ArrayList<>();
    private int autoIncrement = 1;

    public void insert(String nombre, double precio) {
        Producto p = new Producto(autoIncrement++, nombre, precio);
        baseDatos.add(p);
        System.out.println("✔ Insertado: " + nombre);
    }

    public void query() {
        System.out.println("\n📋 LISTA DE PRODUCTOS:");
        for (Producto p : baseDatos) {
            System.out.println(p.id + " | " + p.nombre + " | $" + p.precio);
        }
    }

    public void update(int id, double nuevoPrecio) {
        for (Producto p : baseDatos) {
            if (p.id == id) {
                p.precio = nuevoPrecio;
                System.out.println("✏️ Actualizado ID " + id);
                return;
            }
        }
        System.out.println("❌ Producto no encontrado");
    }

    public void delete(int id) {
        Iterator<Producto> iterator = baseDatos.iterator();
        while (iterator.hasNext()) {
            Producto p = iterator.next();
            if (p.id == id) {
                iterator.remove();
                System.out.println("🗑 Eliminado ID " + id);
                return;
            }
        }
        System.out.println("❌ Producto no encontrado");
    }
}
