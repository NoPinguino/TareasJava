package ActividadPropuesta2_4;

public class Main {
    static void main(String[] args) {
        //Creo una instancia de número oculto
        NumeroOculto numero = new NumeroOculto();

        //Creo 10 hilos AdivinarNumero
        for (int i = 1; i <= 10; i++) {
            //A todos los hilos le paso la instancia ya creada de número oculto
            //Como a todos les paso la misma instancia todos comparten el mismo número oculto
            //Inicio los hilos con start()
            new AdivinarNumero(numero, "Hilo " + i).start();
        }
    }
}