import java.io.Serializable;
import java.rmi.RemoteException;


public class RMICalculimpl implements RMICalcul, Serializable {
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

    public int resuft(String s) throws RemoteException {
        int[] var1 = new int[2];
        int var3 =1;
        int i = 0;
        int j = 0;
        var1[0] = 0;
        var1[1] = 0;
        char c = 0;
        String st = "";
        s.replaceAll("\\s+", "");

        while(true) {
            while(i < s.length()) {
                if (s.charAt(i) > '0' && s.charAt(i) < '9') {
                    st = st + s.charAt(i);
                    ++i;
                } else {
                    var1[j] = Integer.parseInt(st);
                    c = s.charAt(i);
                    ++j;
                    ++j;
                    st = "";
                }
            }

            var1[j] = Integer.parseInt(st);
            switch(j) {
                case '%':
                    var3 = this.module(var1[0], var1[1]);
                default:
                    break;
                case '*':
                    var3 = this.multiplication(var1[0], var1[1]);
                    break;
                case '+':
                    var3 = this.addition(var1[0], var1[1]);
                    break;
                case '-':
                    var3 = this.subtraction(var1[0], var1[1]);
                    break;
                case '/':
                    var3 = this.division(var1[0], var1[1]);
            }

            return var3;
        }
    }
}
