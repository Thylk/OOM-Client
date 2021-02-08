package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface IRemote extends Remote {
    //public int average(int a, int b) throws RemoteException;
    String sayHello() throws RemoteException;
}
