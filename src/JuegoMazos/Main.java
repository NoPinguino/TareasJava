package JuegoMazos;
import java.util.LinkedList;
import java.util.Queue;

//Hecho por Wassim:

public class Main {

    public static void inicializarMazo(Queue<Integer> mazo, int[] cartas) {
        for (int carta : cartas) {
            mazo.add(carta);
        }
    }

    public static void jugar(Queue<Integer> j1,Queue<Integer> j2) {

        boolean flag = true;
        if(j1.size()!=j2.size()) {
            flag=false;
            System.out.println("Lo mazo no esta equlibrados");
        }else {

            System.out.println("Mazo inicial del Jugador 1:"+j1);
            System.out.println("Mazo inicial del Jugador 2:"+j2);

            while (!j1.isEmpty() && !j2.isEmpty() && flag) {

                System.out.println("Jugador 1 juega: "+ j1.peek());
                System.out.println("Jugador 2 juega: "+ j2.peek());

                if (j1.peek()<j2.peek()) {
                    System.out.println("Jugador 2 gana la ronda ");
                    Integer valor2= j2.peek();
                    Integer valor= j1.peek();
                    j2.add(valor2);
                    j2.add(valor);
                    j1.poll();
                    j2.poll();

                }else if ((j1.peek()>j2.peek()))  {
                    System.out.println("Jugador 1 gana la ronda ");
                    Integer valor= j2.peek();
                    Integer valor2= j1.peek();
                    j1.add(valor2);
                    j1.add(valor);
                    j2.poll();
                    j1.poll();

                }else {

                    System.out.println("Jugador 1 y 2 empatan la ronda ");

                    j1.poll();
                    j2.poll();
                }

                System.out.println("Estado actual del mazo Jugador 1:"+j1);
                System.out.println("Estado actual del mazo Jugador 2:"+j2);
                System.out.println("==============================================================================");
            }

            if(j1.isEmpty()) {
                System.out.println("Jugador 2 gana");
            }else if (j2.isEmpty()) {
                System.out.println("Jugador 1 gana");
            } else {
                System.out.println("Los jugadores empatan");
            }
        }
    }

    public static void main(String[] args) {
        Queue<Integer> mazoJugador1 = new LinkedList<>();
        Queue<Integer> mazoJugador2 = new LinkedList<>();
        inicializarMazo(mazoJugador1, new int[]{2, 4, 6, 8, 10});
        inicializarMazo(mazoJugador2, new int[]{1, 3, 5, 7, 9});

        jugar(mazoJugador1, mazoJugador2);
    }
}