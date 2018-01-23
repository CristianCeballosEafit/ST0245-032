package taller1;

public class Punto2D {

    public static void main(String[] args) {
    }
    private float x;
    private float y;

    public Punto2D(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public float distancia(Punto2D otroPunto) {
        return (float) Math.sqrt(Math.pow(x - otroPunto.getX(), 2)
                * Math.pow(y - otroPunto.getY(), 2));
    }

    public float radio() {
        return (float) Math.sqrt((x * x) + (y * y));

    }

    public double angulo() {
        return (float) Math.atan(y / x);
        //return (float) Math.atan2(x, y);
    }

}
