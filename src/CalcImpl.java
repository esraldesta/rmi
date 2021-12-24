import java.rmi.*;
import java.rmi.server.*;


public class CalcImpl extends UnicastRemoteObject implements CalcInter{
    protected CalcImpl() throws RemoteException {
        super();
    }

    @Override
    public int add(int a, int b) throws RemoteException {
        return a + b;
    }

}