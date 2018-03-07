package taller7;

import java.lang.IndexOutOfBoundsException; // Usar esto cuando se salga el índice

public class Taller7 {

    public static void main(String[] args) {
    }
// Una lista simplemente enlazada

    public class LinkedListMauricio {

        private Node first;
        private int size;

        public LinkedListMauricio() {
            size = 0;
            first = null;
        }

        /**
         * Returns the node at the specified position in this list.
         *
         * @param index - index of the node to return
         * @return the node at the specified position in this list
         * @throws IndexOutOfBoundsException
         */
        private Node getNode(int index) throws IndexOutOfBoundsException {
            if (index >= 0 && index < size) {
                Node temp = first;
                for (int i = 0; i < index; i++) {
                    temp = temp.next;
                }
                return temp;
            } else {
                throw new IndexOutOfBoundsException();
            }
        }

        /**
         * Returns the element at the specified position in this list.
         *
         * @param index - index of the element to return
         * @return the element at the specified position in this list
         */
        public int get(int index) {
            Node temp = null;
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
            return this.size;
            // int size = 0;
            // Node temp = first;
            //  while (temp.next != null) {
            //      size++;
            //     temp = temp.next;
            //  }   
            //  return size;
        }

// Inserta un dato en la posición index
        public void insert(int data, int index) {
            Node nuevo = new Node(data);
            Node anterior = getNode(index);
            Node sigtemp = anterior.next;
            anterior.next = nuevo;
            nuevo.next = sigtemp;
            size++;
        }

// Borra el dato en la posición index
        public void remove(int index, Node temp) {
            Node previo = temp;
            int sum = 1;
            while (sum < index - 1) {
                previo = previo.next;
                sum++;
            }
            Node current = previo.next;
            previo.next = current;
            current.next = null;
            size--;
        }

// Verifica si está un dato en la lista
        public boolean contains(int data, Node comp) {

            for (int i = 0; i < size; i++) {
                if (comp.equals(data)) {
                    return true;
                }
            }

            return false;

        }

    }

}
