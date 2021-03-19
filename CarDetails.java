
package carDetails;

import java.util.Scanner;

public class CarDetails
{
    public static void main(String[] args) 
    {
        carDetails car = new carDetails();
        
        Scanner num = new Scanner (System.in);
        
        System.out.print("Car Name: ");
        String cname= num.nextLine();
        car.getcname(cname);
        
        System.out.print("Car Brand: ");
        String cbrand = num.nextLine();
        car.getcbrand(cbrand);
        
        System.out.print("Price: ");
        String price= num.nextLine();
        car.getprice(price);
        
        System.out.print("Car Type: ");
        String ctype= num.nextLine();
        car.getctype(ctype);

	System.out.print("Car Color");
        String ccolor= num.nextLine();
        car.getcolor(ccolor);
        
    }
}
