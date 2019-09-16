import java.util.Scanner;
public class Taxx 
{
    public static void main(String[] args) 
    {
        Scanner a = new Scanner(System.in);
          String EmployeeName;
       float netpay,netpay1,netpay2,netpay3,netpay4,netpay5,gross;
       final float federal= 0.15f, StateTax = 0.035f, SecurityTax = 0.0575f, Medicare = 0.0275f, Pension = 0.05f, Health = 75.00f;
       System.out.println("Enter employee name : ");
       EmployeeName=a.nextLine();
       System.out.println("Enter gross amount");
       gross=a.nextFloat();
       
       netpay1 = gross * federal;
       netpay2 = gross * StateTax;
       netpay3 = gross * SecurityTax;
       netpay4 = gross * Medicare;
       netpay5 = gross * Pension;
       netpay = gross - netpay1 - netpay2 - netpay3 - netpay4 - netpay5 - Health;
       System.out.println(EmployeeName);
       System.out.printf("Gross amount : %.2f", gross);
       System.out.printf("\nFederal tax : %.2f", netpay1);
       System.out.printf("\nStateTax : %.2f", netpay2);
       System.out.printf("\nSocial security tax : %.2f", netpay3);
       System.out.printf("\nMedicare/Medicaid tax : %.2f", netpay4);
       System.out.printf("\nPension plan : %.2f", netpay5);
       System.out.printf("\nHealth Insurance : %.2f", Health);
       System.out.printf("\nNetpay : %.2f", netpay);    
        
        //Running sums
        Scanner b=new Scanner(System.in);
        int n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,r1,r2,r3,r4,r5,r6,r7,r8,r9,r10;
        System.out.println("enter 10 number:");
        n1= b.nextInt();
        n2= b.nextInt();
        n3= b.nextInt();
        n4= b.nextInt();
        n5= b.nextInt();
        n6= b.nextInt();
        n7= b.nextInt();
        n8= b.nextInt();
        n9= b.nextInt();
        n10= b.nextInt();
        
        //computation
        r1=n1+n2;
        r2=r1+n3;
        r3=r2+n4;
        r4=r3+n5;
        r5=r4+n6;
        r6=r5+n7;
        r7=r6+n8;
        r8=r7+n9;
        r9=r8+n10;
        System.out.println(n1 + "," + r1 + "," + r2+","+r3+","+r3+","+r4+","+r5+","+r6+","+r7+","+r8+","+r9);
        
        
        
        
    }    
}
