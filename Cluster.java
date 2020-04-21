import java.util.ArrayList;
import java.util.Random;

public class Cluster{
  private ArrayList<Sample> s;
  public Sample cluster_point;
  public int id;

  public Cluster(int id){
    this.id = id;
    this.s = new ArrayList<Sample>();
    this.cluster_point = null;
  }

  public ArrayList<Sample> getSample(){
    return this.s;
  }

  public void addSample(Sample point){
    this.s.add(point);
  }

  public void setSample(ArrayList<Sample> point){
    this.s = point;
  }

  public int getId(){
    return this.id;
  }

  public void clear(){
    this.s.clear();
  }

  public Sample getClusterPoint(){
    return this.cluster_point;
  }

  public void setClusterPoint(Sample point){
    this.cluster_point = point;
  }
}
