package agregacion;

/**

 */
public class Parlante implements Accesorio {

    private String marca;
    private int volumen; // de 0 a 100

    public Parlante(String marca) {
        this.marca = marca;
        this.volumen = 50; // volumen inicial por defecto
    }

    @Override
    public void conectar() {
        System.out.println(" Parlante " + marca + " conectado, sonando a volumen " + volumen);
    }

    @Override
    public String getNombre() {
        return "Parlante " + marca;
    }
}