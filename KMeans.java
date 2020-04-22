package kmeans;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class KMeans {

    public static void main(String[] args) throws FileNotFoundException {
        //step1 initial
        Scanner in=new Scanner(System.in);
        System.out.println("please input file name");
        String filename=in.next();
        System.out.println("please input k");
        int k=in.nextInt();
        Cluster total=new Cluster();
        Scanner file=new Scanner(new File(filename));
        while(file.hasNext()){
            int x=file.nextInt();
            int y=file.nextInt();
            total.addSample(x,y);
        }
        Cluster[] allClusters=new Cluster[k];
        for (int i=0;i<k;i++){
            allClusters[i]=new Cluster();
            allClusters[i].generateCenter(total.getCluster());
        }
        for (int i=0;i<k;i++){
            total.addSample(allClusters[i].getCenter());
        }
        //step2
        for (int n=0;n<100;n++){
            for (int i=0;i<total.getCluster().size();i++){
                Sample t=total.getCluster().get(i);
                int min=0;
                double mindis=allClusters[0].getCenter().distance(t);
                for (int j=1;j<k;j++){
                    double kdis=allClusters[j].getCenter().distance(t);
                    if (kdis<mindis){
                        mindis=kdis;
                        min=j;
                    }
                }
                allClusters[min].addSample(t);
            }
            for (int i=0;i<k;i++){
                total.getNewCenter();
            }
        }

        for (int i=0;i<k;i++){
            System.out.println(allClusters[i].getCenter().getX());
            System.out.println(allClusters[i].getCenter().getY());
        }
    }
}
