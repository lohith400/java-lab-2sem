import java.util.Scanner;
import java.util.Random;

public class ecom {
    public static void main(String[] args) {
        ABC comp1 = new ABC();
        ABC2 comp2 = new ABC2();

        shipping_provider x;

        x = comp1;
        System.out.println("Total cost for shipping : " + x.calculatecost());
        System.out.println("Track id " + x.get_tracknumber());

        x = comp2;
        System.out.println("Total cost for shipping : " + x.calculatecost());
        System.out.println("Track id " + x.get_tracknumber());

        
    }
    
}


interface shipping_provider {
    double calculatecost();
    int get_tracknumber();

}

class ABC implements shipping_provider {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    public double calculatecost() {
        System.out.print("Enter the total distance : ");
        double distance = scanner.nextDouble();
        double Baserate = 30;

        double total_cost = Baserate*distance;
        return total_cost;


    }

    public int get_tracknumber() {
        int randomId = rand.nextInt(10000); 
        
        // Generate a random double (0.0 to 1.0) for cost simulation
        //double randomMultiplier = rand.nextDouble();

        return randomId;

    }



}

class ABC2 implements shipping_provider {
    Scanner scanner = new Scanner(System.in);
    Random rand = new Random();
    public double calculatecost() {
        System.out.print("Enter the total distance : ");
        double distance = scanner.nextDouble();
        double Baserate = 40;

        double total_cost = Baserate*distance;
        return total_cost;


    }

    public int get_tracknumber() {
        int randomId = rand.nextInt(10000); 
        
        // Generate a random double (0.0 to 1.0) for cost simulation
        //double randomMultiplier = rand.nextDouble();

        return randomId;

    }



}






