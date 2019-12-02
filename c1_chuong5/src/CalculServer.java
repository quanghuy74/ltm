

import java.rmi.Naming;

public class CalculServer {
    public static void main(String[] args){
        try{
            // tạo ra các đối tượng cho phép gọi từ xa
            RMICalculimpl calculService = new RMICalculimpl();
            String res = "rmi://localhost/RMICalcul";

            // đăng ký cho một đối tượng từ xa
            Naming.rebind(res, calculService);
        } catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}