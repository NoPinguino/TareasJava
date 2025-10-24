package ActividadPropuesta2_4;
import java.util.Random;

//Esta clase permite que todos los hilos se sincronicen y cuando uno adivine el resto sepan que un hilo ha adivinado.
public class NumeroOculto {
    private int numSecreto;
    private boolean adivinado = false;

    //Se genera el número secreto en el propio constructor y lo guardamos como atributo
    public NumeroOculto() {
        numSecreto = new Random().nextInt(101); //Entre 1 y 100 ya que se excluye el 101
    }

    //Función que te dice si el número ya ha sido adivinado
    //Si no ha sido adivinado, comprueba si la propuesta es el número oculto
    //Uso synchronized para que no puedan varios hilos a la vez modificar el valor de adivinado. Así solo un hilo lo adivina.
    public synchronized int propuesta(int num) {
        //Recuesta que cuando el if es una única línea no hace falta llaves, en este caso la única línea es el valor return
        if (adivinado) return -1;

        if (num == numSecreto) {
            adivinado = true;
            return 1;
        }
        return 0;
    }
}