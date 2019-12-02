
import java.rmi.Naming;
import java.rmi.Remote;
import java.util.Scanner;

public class CalculClient {
    public static void main(String[] args){
        try{
            //định vị đối tượng xa qua tên đã được đăng ký
            String res = "rmi://localhost/RMICalcul";

            //tải Stub của đối tượng xa từ dịch vụ tên mà đối tượng xa đã đăng ký
            Remote remoteService = Naming.lookup (res);

            //Cài đặt đối tượng Stub và trả về tham khảo đối tượng xa
            RMICalcul calculService = (RMICalcul)remoteService;

            //thực thi lời gọi phương thức xa
            System.out.println(calculService.addition(3,5));
            System.out.println(calculService.subtraction(5,3));

        } catch(Exception e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
