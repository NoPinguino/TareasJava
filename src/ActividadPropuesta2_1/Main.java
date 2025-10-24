package ActividadPropuesta2_1;

public class Main {
    static void main(String[] args) {
        Thread hiloMain = Thread.currentThread();

        System.out.println("Nombre del hilo: " + hiloMain.getName());
        System.out.println("Prioridad del hilo: " + hiloMain.getPriority());
        System.out.println("Estado del hilo: " + hiloMain.getState());
        System.out.println("Id del hilo: " + hiloMain.getId());
    }
}