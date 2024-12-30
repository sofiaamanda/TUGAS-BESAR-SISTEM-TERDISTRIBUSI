package ServerRMI;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author apple
 */
public class Services extends UnicastRemoteObject implements OperationRMI {

    protected Services() throws RemoteException {
        super();
    }

    private static final long serialVersionUID = 1L;

    @Override
    public float calculateInterest(float principal, float rate, int time) throws RemoteException {
        return (principal * rate * time) / 100; // Simple interest formula
    }
}
