package agregacion;

/**

 */
public class Teclado implements Accesorio {

    private String marca;
    private boolean mecanico; // true = teclado mecánico, false = de membrana

    public Teclado(String marca, boolean mecanico) {
        this.marca = marca;
        this.mecanico = mecanico;
    }

    @Override
    public void conectar() {
        String tipo = mecanico ? "mecánico" : "de membrana";
        System.out.println(" Teclado " + marca + " (" + tipo + ") conectado");
    }

    @Override
    public String getNombre() {
        return "Teclado " + marca;
    }
}