package proyecto;
public class Collision {
    private Bee first;
    private Bee second;

    public Collision(Bee first, Bee second) {
        this.first = first;
        this.second = second;
    }

    
    public Bee getFirst() {
        return first;
    }

    public void setFirst(Bee first) {
        this.first = first;
    }

    public Bee getSecond() {
        return second;
    }

    public void setSecond(Bee second) {
        this.second = second;
    }
    
    
}
