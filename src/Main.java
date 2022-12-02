import java.util.Scanner;

class MetricConverter
{
    public static void main(String[] args)
    {
       String trash = "";
       double meters = 7;
       double miles;
       double feet;
       double inches;


       miles = meters / 1609.34;
       feet = meters * 3.28;
       inches = meters * 39.37;

       Scanner in = new Scanner(System.in);

       System.out.println("measurement in meters");
       if (in.hasNextDouble())
       {
           meters = in.nextDouble();
           in.nextLine();
       }
       else
       {

           System.out.println("must enter a valid number");
       }
       System.out.println("Measurement in meters: ");
       System.out.println("Measurement in miles: " + miles);
       System.out.println("Measurement in feet: " + feet);
       System.out.println("Measurement in inches: " + inches);
    }
}