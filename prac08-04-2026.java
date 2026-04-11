import java.util.Scanner;

class lohith {
  public static void main(String[] args) {
	  //student s1 = new student();
	  //s1.result();
	  //student s2 = new student("Lohii","456789","Computer applications");
	  //s2.result();

	  Banksystem b1 = new Banksystem("ABC123",123123.00);
	  //b1.display();
	  b1.deposit();
	  //b1.withdraw();


  }

  }

  class student {
	  String name;
	  String rollno;
	  String branch;

	  student() {
		  name = "Lohith";
		  rollno= "123";
		  branch = "MCA";

		  }

	  student(String n,String r,String b) {
		  name = n;
		  rollno = r;
		  branch = b;

		  }

	  void result() {
		  System.out.println("Student name : " + name + " Roll no : "+  rollno + " Branch :  " + branch);
		  }
}

class Banksystem {
	Scanner sc = new Scanner(System.in);

	String accno;
	double balance;

	Banksystem(String a,double b) {
		accno = a;
		balance = b;

		}

	void deposit() {
		System.out.println("Enter how much amount you want to deposit : ");
		float dep = sc.nextFloat();
		balance = balance + dep;
		System.out.println("Deposited Successfull");
		System.out.println("Do you want to display the balance : y/n" );
		String s = sc.next();
		if ( s.equals("y")) {
			System.out.println("Current balalnce is : " + balance);
			}
		}

	void withdraw() {
		System.out.println("Enter the amount you want to withdraw : ");
		float wit = sc.nextFloat();
		balance = balance - wit;
		System.out.println("Withdraw successfull");
		System.out.println("Do you want to display the balance : y/n" );
		String s = sc.next();
		if ( s.equals("y")) {
			System.out.println("Current balalnce is : " + balance);
			}
		}

	void display() {
		System.out.println("Accno : "+accno + " balance : " + balance);
		}
	}



