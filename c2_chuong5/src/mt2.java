import java.io.Serializable;
import java.rmi.RemoteException;

public class mt2 implements itf2, Serializable {
    @Override
    public double chuViHinhChuNhat(int a, int b) throws RemoteException {
        return (a+b)*2;
    }

    @Override
    public double dienTichHinhChuNhat(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public double chuViHinhTron(int r) throws RemoteException {
        return 2*3.14*r;
    }

    @Override
    public double dienTichHinhTron(int r) throws RemoteException {
        return 3.14*r*r;
    }
}
