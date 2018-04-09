
package javaapplication1;

/**
 *
 * @author sloaizac
 */
public class Punto1_5{

        private Nodo first;
        private int size;

        public Punto1_5() {
            size = 0;
            first = null;
        }
        
        private Nodo getNode(int index) throws IndexOutOfBoundsException {
            if (index >= 0 && index < size) {
                Nodo temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        
        public int get(int index) {
            Nodo temp = null;
            try {
                temp = getNode(index);
            } catch (IndexOutOfBoundsException e) {
                e.printStackTrace();
                System.exit(0);
            }

            return temp.data;
        }

// Retorna el tamaño actual de la lista
        public int size() {
            return size;
        }

// Inserta un dato en la posición index
        public void insert(int data, int index) {
            Nodo nuevo = new Nodo(data);
            Nodo anterior = getNode(index);
            Nodo temp = anterior.next;
            anterior.next = nuevo;
            nuevo.next = temp;
            size++;
        }

// Borra el dato en la posición index
        public void remove(int index, Nodo temp) {
            Nodo previo = temp;
            int sum = 1;
            while (sum < index - 1) {
                previo = previo.next;
                sum++;
            }
            Nodo current = previo.next;
            previo.next = current;
            current.next = null;
            size--;
        }

// Verifica si está un dato en la lista
        public boolean contains(int data, Nodo comp) {

            for (int i = 0; i < size; i++) {
                if (comp.equals(data)) {
                    return true;
                }
            }

            return false;

        }

    }

