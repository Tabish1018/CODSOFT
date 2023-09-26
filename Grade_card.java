import java.util.*;

public class Grade_card
{
    public static void main(String args[])
    {
    	Scanner sc=new Scanner(System.in);
        System.out.print("Number of Subjects: ");
        int n=sc.nextInt();
        int marks[] = new int[n];
        int i;
        float total=0, avg;
        Scanner scanner = new Scanner(System.in);
		
        
        for(i=0; i<n; i++) { 
           System.out.print("Enter Marks of Subject"+(i+1)+":");
           marks[i] = scanner.nextInt();
           total = total + marks[i];
        }
        scanner.close();
        avg = total/n;
        float Per=((total/(n*100))*100);
        System.out.println("Percentage = "+Per);
        System.out.print("The student Grade is: ");
        if(avg>=90)
        {
            System.out.print("A");
        }
        else if(avg>=75 && avg<90)
        {
           System.out.print("B");
        } 
        else if(avg>=60 && avg<75)
        {
            System.out.print("C");
        }
        else if(avg>=45 && avg<60){
            System.out.println("D");
        }   
        else if(avg>=33 && avg<45){
            System.out.println("E");
        }
        else{
            System.out.println("FAIL");
        }
    }
}