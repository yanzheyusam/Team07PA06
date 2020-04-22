package kmeans;

import java.util.ArrayList;

public class Cluster {
    private ArrayList<Sample> cluster;
    private Sample center;
    public Cluster(){
        cluster=new ArrayList<>();
    }
    public void generateCenter(ArrayList<Sample> clu){
        int n=(int)(Math.random()*clu.size());
        center=clu.remove(n);
    }
    public void addSample(int x,int y){
        cluster.add(new Sample(x,y));
    }
    public void addSample(Sample x){
        cluster.add(x);
    }
    public ArrayList<Sample> getCluster(){
        return cluster;
    }

    public Sample getCenter() {
        return center;
    }

    public void getNewCenter(){
        int sumx=0;
        int sumy=0;
        for (Sample sample:cluster){
            sumx+=sample.getX();
            sumy+=sample.getY();
        }
        if (cluster.size()==0){

        }else {
            center=new Sample(sumx/cluster.size(),sumy/cluster.size());
        }

        cluster=new ArrayList<>();
    }

}
