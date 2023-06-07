//Server Program
import java.rmi.*;
import java.net.*;

public class AddServer {
    public static void main(String[] args){
        try{
            StringImpl obj = new StringImpl();
            Naming.rebind("rmi:///Stringr",obj);
        } catch (MalformedURLException | RemoteException e) {
            e.printStackTrace();
        }
    }
}
