import java.util.Scanner;
public class Exer1 
{

    public static void main(String[] args) 
    {
        //exercise 1
        System.out.println("    *********      ***        *         *       ");
        System.out.println("    *       *    *     *     ***       * *      ");
        System.out.println("    *       *   *       *   *****     *   *     ");
        System.out.println("    *       *   *       *     *      *     *    ");
        System.out.println("    *       *   *       *     *     *       *   ");
        System.out.println("    *       *   *       *     *      *     *    ");
        System.out.println("    *       *   *       *     *       *   *     ");
        System.out.println("    *       *    *     *      *        * *      ");
        System.out.println("    *********      ***        *         *        ");
        
        //exercise 2
        Scanner input = new Scanner(System.in);
        float price, pizza, toppings, price2, price3;
        final float tax = 0.05f, pizzaprice=12.00f, toppingsprice=1.50f;
        System.out.print("Enter the number of pizza: ");
        pizza=input.nextFloat();
        System.out.print("Enter the total number of toppings: ");
        toppings=input.nextFloat();
        
        price = pizza * pizzaprice + toppings * toppingsprice;
        price2=price* tax;
        price3=price+price2;
        
        System.out.printf("Reciept: Number of pizzas: %.0f",pizza);
        System.out.println("");
        System.out.printf("\nNumber of toppings: %.0f",toppings);
        System.out.println("");
        System.out.println("Cost (including tax): "+price3);
        
        
    }
    
}
