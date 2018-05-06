
import java.util.ArrayList;

//import org.junit.After;
//import org.junit.Before;
//import org.junit.Test;
//import java.util.ArrayList;

public class DiagraphALTest
{
    public DiagraphALTest()
    {
    }

    public void prueba(DiagraphAL nuevo)
    {
       nuevo = new DiagraphAL(5, 9);
       nuevo.addArc(0,1,10);
       nuevo.addArc(0,2,3);
       nuevo.addArc(1,2,1);
       nuevo.addArc(1,3,2);
       nuevo.addArc(2,1,4);
       nuevo.addArc(2,3,8);
       nuevo.addArc(2,4,2);
       nuevo.addArc(3,4,7);
       nuevo.addArc(4,3,9);
       ArrayList path = DiagraphAlgorithms.getPath(DiagraphAlgorithms.dijsktra(nuevo,0),0,3);
       //Llamados de prueba 
       assertEquals(path.get(0),0);
       assertEquals(path.get(1),2);
       assertEquals(path.get(2),1);
       assertEquals(path.get(3),3);

    }
    //Por defecto genera este método assertEquals ya que es una prueba
    private void assertEquals(Object get, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
