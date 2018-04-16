/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodatos1;

/**
 *
 * @author 
 * Sacado de:
 * AbhijeetMajumdar(2015) QuadTree (Version1),https://gist.github.com/AbhijeetMajumdar/c7b4f10df1b87f974ef4
 */
public class Boundry {
    	public int getxMin() {
		return xMin;
	}

	public int getyMin() {
		return yMin;
	}

	public int getxMax() {
		return xMax;
	}

	public int getyMax() {
		return yMax;
	}

	public Boundry(int xMin, int yMin, int xMax, int yMax) {
		super();
		/*
		 *  Storing two diagonal points 
		 */
		this.xMin = xMin;
		this.yMin = yMin;
		this.xMax = xMax;
		this.yMax = yMax;
	}

	public boolean inRange(int x, int y) {
		return (x >= this.getxMin() && x <= this.getxMax()
				&& y >= this.getyMin() && y <= this.getyMax());
	}

	int xMin, yMin, xMax, yMax;
    
}
