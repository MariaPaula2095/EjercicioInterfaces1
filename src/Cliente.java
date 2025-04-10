import java.util.ArrayList;
import java.util.List;

public class Cliente implements Vendible {
    private String nombreCliente;
    private String correo;
    private List<Producto>vendido;

    public Cliente(String nombreCliente, String correo) {
        this.nombreCliente = nombreCliente;
        this.correo = correo;
        this.vendido = new ArrayList<>();
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<Producto> getVendido() {
        return vendido;
    }

    public void setVendido(List<Producto> vendido) {
        this.vendido = vendido;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombreCliente='" + nombreCliente + '\'' +
                ", correo='" + correo + '\'' +
                ", vendido=" + vendido +
                '}';
    }
    public void comprarProducto(Producto producto, int cantidad){
        if (producto.getCantidadS() >= cantidad){
            if (producto instanceof Vendible) {

                double total = precioVenta(cantidad);

                System.out.println(nombreCliente + " ha comprado " + cantidad + " unidades de "
                        + producto.getNombre() + total);
                vendido.add(producto);
            }
        }
    }
    public void mostrarCompra(){

    }
    public void mostrarDetalles(){

    }
    @Override
    public double precioVenta(int cantidad) {

        return 0;
    }
}
