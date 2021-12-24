import java.rmi.*;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        try {
            CalcInter rem = (CalcInter)Naming.lookup("rmi://127.0.0.1:2888/calculater");
            Scanner scanner = new Scanner(System.in);
            System.out.println("please inter the first number");
            int a= scanner.nextInt();
            System.out.println("please inter the second number");
            int b= scanner.nextInt();

            System.out.println(rem.add(a, b));
            scanner.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }    
}
