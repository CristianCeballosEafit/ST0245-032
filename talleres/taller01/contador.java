package taller1;

public class contador {

    String id;
    static int contador;
    static int incrementos;

    public contador(String id) {
        this.id = id;
        contador = 0;
        incrementos = 0;
    }
    static contador contar = new contador("Crisbastian");

    void Incremetar() {
        contador = contador + 1;
        Incrementos();

    }

    static int Incrementos() {

        incrementos = incrementos + 1;
        return incrementos;
    }

    public static int getContador() {
        return contador;
    }

    public static int getIncrementos() {
        return incrementos;
    }

    @Override
    public String toString() {
        return "Contador{" + "id= " + id + " " + contador + '}';
    }

    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            contar.Incremetar();
            System.out.println(contar.toString());
        }
    }

}
