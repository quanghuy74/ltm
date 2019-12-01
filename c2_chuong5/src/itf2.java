import java.rmi.Remote;
import java.rmi.RemoteException;

public interface itf2 extends Remote {
    double chuViHinhChuNhat(int a, int b) throws RemoteException;
    double dienTichHinhChuNhat(int a, int b) throws RemoteException;
    double chuViHinhTron(int r) throws RemoteException;
    double dienTichHinhTron(int r) throws RemoteException;

}
