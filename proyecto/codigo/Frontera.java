/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectodatos1;

/**
 *
 * @author sloaizac
 */
public class Frontera{

    int xMin, xMax, yMin, yMax;
    
    Frontera(int xMin, int yMin, int xMax, int yMax){
	this.xMin = xMin;
	this.xMax = xMax;
	this.yMin = yMin;
	this.yMax = yMax;
    }

    public boolean inRange(int x, int y){
	return(x >= this.xMin && x <= this.xMax
	       && y >= this.yMin && y <= this.yMax);
    }
}
