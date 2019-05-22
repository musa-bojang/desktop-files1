import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
public class ReplacementAlgorithm {
	
	int fifo[]=new int[3];
    int n;
	int Hit=0;
	int Fault=0;
	int j=0;
	boolean check;
	Scanner scan = new Scanner(System.in);
	public ReplacementAlgorithm() {
		
	}
	public void display() {
		
	}
	

	public void printVariable() {
		System.out.println("Enter the number of inputs :");
		 this.n = scan.nextInt();
		int inp[]=new int[n];
		System.out.println("Enter the inputs:");
		for(int i=0;i<n;i++)
		inp[i]=scan.nextInt();
		System.out.println("—————");
		for(int i=0;i<3;i++)
			this.fifo[i]=-1;
			
			for(int i=0;i<this.n;i++)
			{
			this.check=false;

			for(int k=0;k<3;k++)
			if(this.fifo[k]==inp[i])
			{
			check=true;
			Hit=Hit+1;
			}
			if(check==false)
			{
			fifo[j]=inp[i];
			j++;
			if(j>=3)
			j=0;
			Fault=Fault+1;
			}
			}
			// Remove the first 3 initial page faults
			Fault = Fault -3;
			System.out.println("HIT:"+ Hit +" FAULT;"+Fault);
			}
		
	public void practiceForLoop() {
		for(int x=0; x<10; x++) {
			for(int y=0; y<10; y++) {
				System.out.println("("+ x +"," + y + ")");
			}
		}
		
	}
	public void evenIndex() {
		
		int kak = scan.nextInt();
		String answer = "";
		String answer1 = "";
		for(int j =0 ; j<kak; j++) {
			String input = scan.nextLine();
			char[] c = input.toCharArray();
			for(int i= 0; i< input.length()-1; i+=2) 
				answer = answer + c[i];
			
			for(int i= 1; i< input.length(); i+=2) 
				answer1 = answer1 + c[i];
			
			
			System.out.println(answer + " " + answer1);
	}
	
	
		
	}
	public static void main(String args[]) throws IOException
	{

		ReplacementAlgorithm replace = new ReplacementAlgorithm();
		replace.evenIndex();


}
}

