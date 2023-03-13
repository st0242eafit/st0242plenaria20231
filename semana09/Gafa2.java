public class Gafa2 {
    String nombre;
    double precio;
    public Gafa2(String n, double p) {
        this.nombre = n;
        this.precio = p;
    }

    public String toString() {
        return "("+this.nombre+","+this.precio+")";
    }
}