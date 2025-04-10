public class Laptop extends Producto {
    private String procesador;
    private String memoria;

    public Laptop(String nombre, String marca, double precio, int cantidadS, String procesador, String memoria) {
        super(nombre, marca, precio, cantidadS);
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public Laptop(String procesador, String memoria) {
        this.procesador = procesador;
        this.memoria = memoria;
    }

    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getMemoria() {
        return memoria;
    }

    public void setMemoria(String memoria) {
        this.memoria = memoria;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "procesador='" + procesador + '\'' +
                ", memoria='" + memoria + '\'' +
                ", nombre='" + nombre + '\'' +
                ", marca='" + marca + '\'' +
                ", precio=" + precio +
                ", cantidadS=" + cantidadS +
                '}';
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("El nombre de la laptop es: "+ nombre);
        System.out.println("El marca de la laptop es: "+ marca);
        System.out.println("El precio de la laptop es: "+ precio);
        System.out.println("La cantidad disponible es: "+ cantidadS);
        System.out.println("El procesador de la laptop es: "+ procesador);
        System.out.println("La memoria de la laptop es: "+ memoria);

    }
}
