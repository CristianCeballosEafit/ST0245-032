import java.util.ArrayList;
public class DiagraphAMTest
{
    //https://github.com/ilabradors
    /**
     * Default constructor for test class DigraphAMTest
     */
    public DiagraphAMTest()
    {
    }

    public void prueba()
    {
       DiagraphAM dgal = new DiagraphAM(5);
       dgal.addArc(0,1,10);
       dgal.addArc(0,2,3);
       dgal.addArc(1,2,1);
       dgal.addArc(1,3,2);
       dgal.addArc(2,1,4);
       dgal.addArc(2,3,8);
       dgal.addArc(2,4,2);
       dgal.addArc(3,4,7);
       dgal.addArc(4,3,9);
       ArrayList path = DiagraphAlgorithms.getPath(DiagraphAlgorithms.dijsktra(dgal,0),0,3);
       assertEquals(path.get(0),0);
       assertEquals(path.get(1),2);
       assertEquals(path.get(2),1);
       assertEquals(path.get(3),3);
    }

    private void assertEquals(Object get, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
