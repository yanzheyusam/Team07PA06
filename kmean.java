import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class kmean{
  public static void main(String[] args) throws FileNotFoundException{
  Scanner input = new Scanner(System.in);
  System.out.println("File Name:");
  String name = input.nextLine();
  System.out.println("Centriod Num:");
  int num = input.nextInt();
  Scanner in = new Scanner(new File(name));
      ArrayList<integer> data= new ArrayList<integer>();
      while (in.hasNext()){
        data.add(in.next());
      }
  }
 }
