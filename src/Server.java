import java.rmi.RemoteException;
import java.rmi.registry.*;


public class Server {
    public static void main(String[] args) {
        
        try {
            CalcImpl imp = new CalcImpl();
            Registry r=LocateRegistry.createRegistry(2888);
            r.rebind("calculater", imp);
            System.out.println("server is running");
        } catch (RemoteException e) {
            e.printStackTrace();
        }

    }    
}
