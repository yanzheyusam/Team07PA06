package kmeans;

public class Sample {
    private int x;
    private int y;
    public Sample(int x,int y){
        this.x=x;
        this.y=y;
    }
    public double distance(Sample other){
        return Math.sqrt(Math.pow(x-other.x,2)+Math.pow(y-other.y,2));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
