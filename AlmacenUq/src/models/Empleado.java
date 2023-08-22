package models;

import java.util.ArrayList;
import java.util.List;

class Empleado extends Persona {
    private List<Persona> clientesRegistrados;
    private List<Producto> productosRegistrados;

    public Empleado(String nombre, String apellido, String identificacion, String direccion, String telefono, String tipoPersona) {
        super(nombre, apellido, identificacion, direccion, telefono);
        this.clientesRegistrados = new ArrayList<>();
        this.productosRegistrados = new ArrayList<>();
    }

    public void registrarCliente(Persona cliente) {
        clientesRegistrados.add(cliente);
        System.out.println("Cliente registrado: " + cliente.getNombre());
    }

    public void registrarProducto(Producto producto) {
        productosRegistrados.add(producto);
        System.out.println("Producto registrado: " + producto.getNombre());
    }

    public void eliminarProducto(Producto producto) {
        productosRegistrados.remove(producto);
        System.out.println("Producto eliminado: " + producto.getNombre());
    }
}
