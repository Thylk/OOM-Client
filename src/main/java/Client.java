import service.IRemote;

import java.rmi.NotBoundException;
import java.rmi.Remote;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class Client {

    public static void main(String[] args) throws RemoteException, NotBoundException {

        //System.out.println("Hello World");
        String serverAddress = "localhost";
        Registry registry = LocateRegistry.getRegistry(serverAddress, 18500);
        IRemote remote = (IRemote) registry.lookup("remote");
        System.out.println("Je suis connecté à "+serverAddress);
        String say = remote.sayHello();
        System.out.println(say);
    }
}
