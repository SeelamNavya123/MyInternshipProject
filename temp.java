import java.util.Scanner;
class temp
{
    public static void main(String args[])
    {
        double f,c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Choose type of conversion: \n 1.Fohrenheit 2.Celsius");
        int ch=sc.nextInt();
        switch(ch)
        {
            case 1: 
            System.out.println("Enter fohrenheit temp: ");
            f=sc.nextDouble();
            c=(f-32)*(5/9);
            System.out.println("Celsius temp is: "+c);
            break;
            case 2:
            System.out.println("Enter celsius temp: ");
            c=sc.nextDouble();
            f=((9*c)/5)+32;
            System.out.println("Fohrenheit temp: "+f);
            break;
            default:
            System.out.println("Please choose valid choice!");

        }
    }
}