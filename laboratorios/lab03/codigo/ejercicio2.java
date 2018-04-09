package laboratorio3;

import java.util.LinkedList;

/**
 *
 * @author YisuCrist
 */
public class ejercicio2 {

    public static void main(String[] args) {

        //Lista enlazada tipo <caracter>Porque deber recorrer caracter x caracter
        LinkedList<Character> lista = new LinkedList<Character>();
        String cambio = "asd[fgh[jkl";

        ejercicio2(lista, cambio); // Ejecutar el proces de reorganizar

        salida(lista); //Método para imprimir el cambio.
    }

    public static void ejercicio2(LinkedList<Character> lista, String a_modificar) {

        int cont = 0;

        //Ciclo para recorrer caracter por caracter
        for (int i = 0; i < a_modificar.length(); i++) {
            if (a_modificar.charAt(i) == '[') { // Si el caracter en la posicion i es '['
                i++;
            }

            if (a_modificar.charAt(i) == ']') { // Si el caracter ']' está:
                cont = lista.size(); // Se vuelve size(); que es la últiam posición
                i++;
            }

            // Los dos ciclos pasados cuenta '[' y ']'
            // Pero si no se enceuntran estos caracteres:
            if (a_modificar.charAt(i) != '[' && a_modificar.charAt(i) != ']') {
                lista.add(cont, a_modificar.charAt(i));
            }
        }
    }

    public static void salida(LinkedList<Character> lista) {
        String modificar = ""; // String vacía que se llenará y formará nueva Palabra
        for (int i = 0; i < lista.size(); i++) {
            modificar += lista.get(i); // ir agregando cada caracter
        }
        System.out.println(modificar); //Imprime la nueva cadena

    }
}
