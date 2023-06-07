//Client Program
import java.rmi.*;
import java.net.*;
import java.io.*;
import java.util.*;

public class AddClient {
    public static void main(String[] args) throws IOException {
        String host = "localhost";
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter any String: ");
        String input = reader.readLine();
        try{
            Stringr obj = (Stringr)Naming.lookup("rmi://"+host+"/Stringr");
            System.out.println(obj.ReverseString(input));
        } catch (MalformedURLException | NotBoundException | RemoteException e) {
            e.printStackTrace();
        }

    }
}
