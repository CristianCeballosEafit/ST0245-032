import java.util.*;
import java.io.*;
public class Main{

    public static void main(String[]args){

        long TInicio, TFin, tiempo;
        int size = 1000000;
        int [] a = new int [size];
        for(int i = 0; i < size; i++){
            a[i] = (int) (Math.random()*500);
        }

          TInicio = System.currentTimeMillis();
          ArraysumR(a, size-1);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

          TInicio = System.currentTimeMillis();
          ArraymaxR(a, size-1);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

          TInicio = System.currentTimeMillis();
          FibonacciR(50);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

          TInicio = System.currentTimeMillis();
          Arraysum(a);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

          TInicio = System.currentTimeMillis();
          Arraymax(a);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

          TInicio = System.currentTimeMillis();
          InsertionSort(a);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

          TInicio = System.currentTimeMillis();
          sort(a);
          TFin = System.currentTimeMillis();
          tiempo = TFin - TInicio;
          System.out.println("Tiempo de ejecución en milisegundos: " + tiempo);

    }
    
    public static int ArraysumR(int[] a, int n) {
        if (n == 0) return a[n];
        else{
            return a[n] + ArraysumR(a, n-1);
        }
    }

    public static int ArraymaxR(int[] a, int n) {
        if(n > 0) return Math.max(a[n], ArraymaxR(a, n-1));
        else{
        return a[0];        }
    }

    public static int FibonacciR(int n){
	if(n <= 1) return n;
        else{
	    return FibonacciR(n-1) + FibonacciR(n-2);
        }
    }

    public static int Arraysum(int[] a){
	int sum = 0;
        for(int i = 0; i < a.length;i++){
            sum += a[i];
        }
        return sum;
    }

    public static int Arraymax(int[] a){
        int max = a[0];
        for(int i = 0; i < a.length;i++){
            if(a[i] > max) max = a[i];
        }
        return max;
    }

    public static void InsertionSort(int[] a){
        for(int i = 0; i < a.length; i++){
            for(int j = i; j < a.length; j++){
                int temp;
                if(a[j] < a[i]){
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
       }
    } //Lo siguiente fue sacado de: http://www.solveet.com/exercises/Algoritmo-de-ordenacion-merge-sort/158/solution-1123
  public static int[] sort(int []n){
    int i = 1;
    for(i = 1; i < n.length;i*=2){
      for(int j = 0;j < n.length; j += i){
        int p = i >> 1;
        merge(n,j,j+p-1,j+p,j+p+p-1);
      }
    }
    merge(n,0,i/2 - 1,i/2,n.length);
    return n;
  }

  public static void merge(int [] n,int a,int b,int c,int d){
    d = Math.min(d,n.length-1);
    int mer [] = new int[d-a + 1];
    int idx = 0;
    int or = a;
    while( idx < mer.length)
      if((a>b ?false: (c>d? true : n[a] <= n[c])))
        mer[idx++] = n[a++];
      else
        mer[idx++] = n[c++];

    for(int i = 0; i < mer.length; i++)
      n[or + i] = mer[i];
  }



}




