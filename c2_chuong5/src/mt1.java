import java.io.Serializable;
import java.rmi.RemoteException;

public class mt1 implements itf1, Serializable {
    public int addition(int var1, int var2) throws RemoteException {
        return var1 + var2;
    }

    public int subtraction(int var1, int var2) throws RemoteException {
        return var1 - var2;
    }

    public int multiplication(int var1, int var2) throws RemoteException {
        return var1 * var2;
    }

    public int division(int var1, int var2) throws RemoteException {
        return var1 / var2;
    }

    public int module(int var1, int var2) throws RemoteException {
        return var1 % var2;
    }
}
