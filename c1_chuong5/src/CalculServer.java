

import java.rmi.Naming;

public class CalculServer {
    public static void main(String[] args){
        try{
            // Load the service
            RMICalculimpl calculService = new RMICalculimpl();
            String res = "rmi://localhost/RMICalcul";

            // Register with service
            Naming.rebind(res, calculService);
        } catch(Exception e){
            System.err.println("Error: " + e.getMessage());
        }
    }
}