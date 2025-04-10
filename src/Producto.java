public abstract class Producto {
    protected String nombre;
    protected String marca;
    protected double precio;
    protected int cantidadS;

    public Producto() {
    }
    public Producto(String nombre, String marca, double precio, int cantidadS) {
        this.nombre = nombre;
        this.marca = marca;
        this.precio = precio;
        this.cantidadS = cantidadS;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCantidadS() {
        return cantidadS;
    }

    public void setCantidadS(int cantidadS) {
        this.cantidadS = cantidadS;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadS=" + cantidadS +
                '}';
    }
    public abstract void mostrarDetalles();
}
