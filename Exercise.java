import java.util.Scanner;
public class Exercise 
{
    
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
        
        long seconds, minutes, hours, rSeconds, rMinutes;
        
        System.out.println("Enter Time In Seconds: ");
        seconds=a.nextLong();
        
        minutes = seconds / 60;
//        System.out.println(" " + minutes + " " );
        hours = seconds / 3600;
//        System.out.println(" " + hours);
        rSeconds = seconds % 60;
        rMinutes = minutes - (hours *60);
        
        System.out.println("Time is " + hours +" hour " + rMinutes + " minutes " + rSeconds + " Seconds " );
        
        //exercise2
        float miles, mpg, ppg, cost;
        System.out.println("Enter the driving distance: ");
        miles = a.nextFloat();
        System.out.println("Enter miles per gallon: ");
        mpg = a.nextFloat();
        System.out.println("Enter price per gallon: ");
        ppg = a.nextFloat();
        
        cost = (miles / mpg) *ppg;
        System.out.printf("The cost of of driving is $%.2f", cost);
        System.out.println("");
    }
}
