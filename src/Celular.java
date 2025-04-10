public class Celular extends Producto{
    private String bateria;
    private String camara;

    public Celular(String nombre, String marca, double precio, int cantidadS, String bateria, String camara) {
        super(nombre, marca, precio, cantidadS);
        this.bateria = bateria;
        this.camara = camara;
    }

    public Celular(String bateria, String camara) {
        this.bateria = bateria;
        this.camara = camara;
    }

    public String getBateria() {
        return bateria;
    }

    public void setBateria(String bateria) {
        this.bateria = bateria;
    }

    public String getCamara() {
        return camara;
    }

    public void setCamara(String camara) {
        this.camara = camara;
    }

    @Override
    public String toString() {
        return "Celular{" +
                "bateria='" + bateria + '\'' +
                ", camara='" + camara + '\'' +
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
        System.out.println("La bateria del celular es: "+bateria );
        System.out.println("La resoluicon de la camara es: "+ camara );
    }
}
