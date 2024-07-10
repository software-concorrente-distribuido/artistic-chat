import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;

public class MaioridadeServer {
    public static void main(String[] args) {
        try {
            LocateRegistry.createRegistry(1099);
            MaioridadeService service = new MaioridadeServiceImpl();
            Naming.rebind("rmi://localhost:1099/MaioridadeService", service);
            System.out.println("Servidor RMI está pronto.");
        } catch (RemoteException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
