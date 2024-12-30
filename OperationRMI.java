/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ServerRMI;
import java.rmi.Remote;
import java.rmi.RemoteException;
/**
 *
 * @author apple
 */
public interface OperationRMI extends Remote {
    public float calculateInterest(float principal, float rate, int time) throws RemoteException;
}
