package agregacion;

/**
 */
public class Computadora {

    private String modelo;
    private boolean encendida;
    private Accesorio[] accesorios; // solo se guarda la referencia, no se crean aquí

    public Computadora(String modelo, Accesorio[] accesorios) {
        this.modelo = modelo;
        this.accesorios = accesorios;
        this.encendida = false;
    }

    public void encender() {
        encendida = true;
        System.out.println(" Encendiendo la computadora " + modelo);
        for (Accesorio a : accesorios) {
            a.conectar();
        }
    }

    public void apagar() {
        encendida = false;
        // aquí NO se destruye ningún accesorio, solo se deja de usarlos.
        // Eso es agregación: apagar/desconectar el todo no afecta a las partes.
        System.out.println(" Apagando " + modelo + " (los accesorios siguen intactos)");
    }

    public void mostrarEstado() {
        String estado = encendida ? "encendida" : "apagada";
        System.out.println(
                "Computadora " + modelo + " está " + estado + " y tiene " + accesorios.length + " accesorio(s):");
        for (Accesorio a : accesorios) {
            System.out.println("   - " + a.getNombre());
        }
    }
}