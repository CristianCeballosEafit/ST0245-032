public class Frontera{

    int xMin, xMax, yMin, yMax;
    
    Frontera(int xMin, int yMin, int xMax, int yMax){
	this.xMin = xMin;
	this.xMax = xMax;
	this.yMin = yMin;
	this.yMax = yMax;
    }

    public int getxMin(){
	return xMin;
    }

    public int getxMax(){
	return xMax;
    }

    public int getyMin(){
	return yMin;
    }

    public int getyMax(){
	return yMax;
    }

    public boolean dentro(int x, int y){
	return(x >= this.getxMin() && x <= this.getxMax()
	       && y >= this.getyMax() && y <= this.getyMax());
    }
}
