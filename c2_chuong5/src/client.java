import java.rmi.Naming;
import java.rmi.Remote;

public class client {
    public static void main(String[] args){
        try{
            String res1 = "rmi://localhost/mt1";
            String res2 = "rmi://localhost/mt2";

            Remote remoteService1 = Naming.lookup (res1);
            Remote remoteService2 = Naming.lookup (res2);

            itf1 calculService = (itf1)remoteService1;
            itf2 shapeService = (itf2)remoteService2;

            System.out.println(calculService.addition(3,5));
            System.out.println(shapeService.chuViHinhChuNhat(5,3));
        } catch(Exception e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
