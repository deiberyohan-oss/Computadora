package agregacion;

/**
 */
public interface Accesorio {

    // Todo accesorio debe poder "conectarse" a la computadora
    void conectar();

    // Y también debe poder decir qué es (para mostrarlo en pantalla)
    String getNombre();
}