
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.Scanner;

public class CalculClient {
    public static void main(String[] args){
        try{
            String res = "rmi://localhost/RMICalcul";

            Remote remoteService = Naming.lookup (res);

            RMICalcul calculService = (RMICalcul)remoteService;

//            Scanner sc = new Scanner(System.in);
//            System.out.println("nhap phep tinh:");
//            String s = sc.next();

//            System.out.println(calculService.resuft(s));
            System.out.println(calculService.addition(3,5));
            System.out.println(calculService.subtraction(5,3));
        } catch(Exception e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
