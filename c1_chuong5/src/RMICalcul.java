import java.rmi.Remote;
import java.rmi.RemoteException;

public interface RMICalcul extends Remote {
    public int addition(int var1, int var2) throws RemoteException;
    public int subtraction(int var1, int var2) throws RemoteException;
    public int multiplication(int var1, int var2) throws RemoteException;
    public int division(int var1, int var2) throws RemoteException;
    public int module(int var1, int var2) throws RemoteException;
    public int resuft(String s) throws RemoteException;
}