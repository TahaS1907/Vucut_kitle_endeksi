import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
     double weight,height,ındex;
     System.out.println("Please enter your weight:");
     weight= scanner.nextDouble();
     System.out.println("Please enter your height in meters:");
     height= scanner.nextDouble();
     ındex=weight/(height*height);
     System.out.println("Your BMI:"+ındex);
    }
}