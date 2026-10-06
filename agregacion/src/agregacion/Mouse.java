package agregacion;

/**
 */
public class Mouse implements Accesorio {

    private String marca;
    private int dpi; // sensibilidad del sensor

    public Mouse(String marca, int dpi) {
        this.marca = marca;
        this.dpi = dpi;
    }

    @Override
    public void conectar() {
        System.out.println("  Mouse " + marca + " conectado (" + dpi + " DPI)");
    }

    @Override
    public String getNombre() {
        return "Mouse " + marca;
    }
}