//implementing interface
import java.rmi.*;
import java.rmi.server.*;
import java.util.*;
public class StringImpl extends UnicastRemoteObject implements Stringr {
    public StringImpl() throws RemoteException{}
    public String ReverseString(String ch){
        int i= 0;
        String blank = "";
        for(i =ch.length()-1; i>=0; i--){
            blank = blank+ch.charAt(i);
        }

        return (blank);
    }

}
