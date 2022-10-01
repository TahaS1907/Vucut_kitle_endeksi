import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
     Scanner scanner =new Scanner(System.in);
     double kilo,boy,endeks;
     System.out.println("Lütfen kilonuzu giriniz:");
     kilo= scanner.nextDouble();
     System.out.println("Lütfen boyunuzu(metre cinsinden)giriniz:");
     boy= scanner.nextDouble();
     endeks=kilo/(boy*boy);
     System.out.println("Vücut kitle endeksiniz:"+endeks);
    }
}