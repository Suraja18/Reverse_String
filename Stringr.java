//Defining the remote interface
import java.rmi.*;
public interface Stringr extends Remote {
    public String ReverseString (String ch) throws RemoteException;
}

