package ActividadPropuesta2_4;

import java.util.Random;

public class AdivinarNumero extends Thread {
    private NumeroOculto juego;
    private String nombre;

    //Constructor
    public AdivinarNumero(NumeroOculto juego, String nombre) {
        this.juego = juego;
        this.nombre = nombre;
    }

    //Método run del hilo
    public void run() {
        Random random = new Random();
        int resultado;

        //Uso do-while para hacer los intentos mientras no se haya adivinado (es decir, mientras resultado sea 0)
        do {
            //Genera un numero aleatorio
            int intento = random.nextInt(101);

            //Mandamos el intento a la función propuesta.
            //Devuelve 1 si lo adivina, 0 si no lo adivina, -1 si ya había sido adivinado.
            //Guardamos ese valor en resultado para poder imprimir el resultado de esta iteración.
            resultado = juego.propuesta(intento);

            //Imprimimos el resultado
            if (resultado == 1) {
                System.out.println(nombre + " adivinó el número (" + intento + ")!");
            } else if (resultado == 0) {
                System.out.println(nombre + " probó con " + intento);
            }
        } while (resultado == 0);
    }
}
