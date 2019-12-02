import java.rmi.Naming;
import java.rmi.Remote;

public class server {
    public static void main(String[] args) {
        try {
            // tạo ra các đối tượng cho phép gọi từ xa
            mt1 calculService = new mt1();
            String res1 = "rmi://localhost/mt1";
            mt2 shapeService = new mt2();
            String res2 = "rmi://localhost/mt2";

            // đăng ký cho một đối tượng từ xa
            Naming.rebind(res1, calculService);
            Naming.rebind(res2, shapeService);
        } catch (Exception e) {
            System.err.println("Error: " + e.getMessage());
        }
    }
}
