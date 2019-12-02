import java.rmi.Naming;
import java.rmi.Remote;

public class client {
    public static void main(String[] args){
        try{
//            định vị đối tượng xa qua tên đã được đăng ký
            String res1 = "rmi://localhost/mt1";
            String res2 = "rmi://localhost/mt2";

//            tải Stub của đối tượng xa từ dịch vụ tên mà đối tượng xa đã đăng ký
            Remote remoteService1 = Naming.lookup (res1);
            Remote remoteService2 = Naming.lookup (res2);

//            Cài đặt đối tượng Stub và trả về tham khảo đối tượng xa
            itf1 calculService = (itf1)remoteService1;
            itf2 shapeService = (itf2)remoteService2;

//        thực thi lời gọi phương thức xa
            System.out.println(calculService.addition(3,5));
            System.out.println(shapeService.chuViHinhChuNhat(5,3));
        } catch(Exception e){
            System.err.println("Error" + e.getMessage());
        }
    }
}
