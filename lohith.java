import java.util.Scanner;
import java.util.*;

public class lohith {
  public static void main(String args[]) {
      Scanner sc = new Scanner(System.in);
      //System.out.println("Hello java");
      Shapes s = new Shapes();
      //s.pick_shapes();
      //s.SumAverageRunningInt();
      //s.HarmonicSum();
      //s.Fibonacci(20);
      //s.reversed();
      //s.CircleComputation();
	  student s1 = new student();
	  s1.total();



      //s.circle();
      //s.rectangle();
      //s.square();
  }

}

class Shapes {
Scanner sc = new Scanner(System.in);

void circle() {

System.out.println("Enter the radius of the circle : ");
float r = sc.nextFloat();
System.out.println("Area of the circle is : " + (3.14*r*r));
}

void rectangle() {
System.out.println("Enter the length of the rectangle : ");
float l = sc.nextFloat();
System.out.println("Enter the breadth of the rectangle : ");
float b = sc.nextFloat();
System.out.println("Area of the rectangle is :" + (l*b) );
}

void square() {
System.out.println("Enter the length of the side a : ");
float a = sc.nextFloat();
System.out.println("Area of the square is : " + (a*a));
}

void pick_shapes() {
	System.out.println("Enter for which shape you want to calculate the area");
	System.out.println("Enter c for cicle , r for rectangle and s for square");
    String shape = sc.next();

    if (shape.equals("c")) {
		circle();
	 } else if (shape.equals("r")) {
		 rectangle();
	 } else if (shape.equals("s")) {
		 square();

    }

}







/*Write a program called SumAverageRunningInt to produce the sum of 1, 2, 3, ..., to 100.
Store 1 and 100 in variables lowerbound and upperbound, so that we can change their
values easily. Also compute and display the average.
The output shall look like:
The sum of 1 to 100 is 5050
The average is 50.5*/

void SumAverageRunningInt() {
	int sum = 0;

	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the start value lowerbound : ");
	int lowerbound = sc.nextInt();
	System.out.println("Enter the end value upperbound : ");
	int upperbound = sc.nextInt();

	//System.out.println(lowerbound);

	for (int i = lowerbound; i <= upperbound; i++) {
		sum+=i;


		}
	float avg = sum/((upperbound - lowerbound)+1);
	System.out.println("The sum of " + lowerbound + " and "+upperbound + " is "+sum );
	System.out.println("The average is "+avg);



}


void HarmonicSum() {
	Scanner sc = new Scanner(System.in);
	System.out.println("give me the n value to calculate the harmonic series :");
	int n = sc.nextInt();
	double sum_f = 0;
	double sum_b = 0;
	for (int i =1; i<=n; i++) {
		sum_f = sum_f + (1.0/i);


	}

	for (int i = n; i >= 1; i--) {
			sum_b = sum_b + (1.0/i);

	}
	if (sum_f == sum_b) {
		System.out.println("harmonic sum from forward and backword is same : "+sum_f);
	} else {
		System.out.println("harmonic sum from forward and backword is not same bacause in forward sum numbers where added from large numbers to very small numbers  where very tiny numbers lost due to rounding " + (sum_f - sum_b));

		}
}


void Fibonacci(int n) {
    int sum = 2;

    
    

    List<Integer> list = new ArrayList<>();
    list.add(1);
    list.add(1,1);

    for (int i =2; i<n; i++) {
        list.add(list.get(i-1)+list.get(i-2));
        sum+=list.get(i);

    }

    System.out.println(list);
    System.out.println((double)sum/(list.size()));
}

void reversed() {
    String rev = "";
    System.out.println("Enter the number : ");
    int num = sc.nextInt();
    String nums = String.valueOf(num);
    for (int i = nums.length(); i>0; i--) {
        rev = rev  + i+ " ";

    }

    System.out.println(rev);
}

void CircleComputation() {
    System.out.println("Enter the radius of the circle : ");
    float radius = sc.nextFloat();
    
    double diameter = 2.0*radius;
    double area = Math.PI*radius*radius;
    double circumference = 2.0*Math.PI*radius;

    System.out.printf("Diameter of the circle is %.2f \n", diameter);
    System.out.printf("area of the circle is %.2f \n", area);
    System.out.printf("circumference of the circle is %.2f \n", circumference);

}




}

class student {
	Scanner sc = new Scanner(System.in);
	
	void total() {
		System.out.println("Enter for how many students you want to calculate their total marks: ");
		int total_students = sc.nextInt();
		int i = 1;
		while (i <= total_students ){
			System.out.println("Enter the name of the student  "+ i + " :");
			String name = sc.next();
			System.out.println(name);
			i++;

			}
		}

}




