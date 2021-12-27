import structures.Fila;

public class Main {
    public static void main(String[] args) {
        Fila fila = new Fila(4);
        fila.push(1);
        fila.push(2);
        fila.push(3);
        fila.push(4);


        System.out.println(fila.pull());
        System.out.println(fila.pull());
        System.out.println(fila.pull());
        System.out.println(fila.pull());
        System.out.println(fila.pull());



    }
}
