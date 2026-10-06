package agregacion;

/**
 * Otro accesorio más. Un Monitor incluso es el ejemplo más fácil de
 * imaginar como agregación: casi todo el mundo ha usado el mismo monitor
 * con computadoras distintas a lo largo del tiempo.
 */
public class Monitor implements Accesorio {

    private String marca;
    private int pulgadas;

    public Monitor(String marca, int pulgadas) {
        this.marca = marca;
        this.pulgadas = pulgadas;
    }

    @Override
    public void conectar() {
        System.out.println(" Monitor " + marca + " de " + pulgadas + "\" conectado");
    }

    @Override
    public String getNombre() {
        return "Monitor " + marca;
    }
}