package proyecto;
public class Frontera{
    
    double xMin, xMax, yMin, yMax;
    
    Frontera(double xMin, double yMin, double xMax, double yMax){
	this.xMin = xMin;
	this.xMax = xMax;
	this.yMin = yMin;
	this.yMax = yMax;
    }

    public boolean inRange(double x, double y){
	return(x >= this.xMin && x <= this.xMax
	       && y >= this.yMin && y <= this.yMax);
    }
}