import java.rmi.*;

public interface CalcInter extends Remote{
    public int add(int a,int b) throws RemoteException;
}
