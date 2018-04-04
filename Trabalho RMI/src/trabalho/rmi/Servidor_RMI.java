/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Junior
 */
public class Servidor_RMI extends UnicastRemoteObject implements InterfaceServidor_RMI{

    /**
     * @throws java.rmi.RemoteException
     */
    public Servidor_RMI() throws RemoteException{
        super(); // chamando o construtor da classe unicastRemoteObject
    }
    
    
    
    public static void main(String[] args) throws RemoteException {
        Registry registro;
        registro = LocateRegistry.createRegistry(5099);
        registro.rebind("eae", new Servidor_RMI());
    }

    @Override
    public String reverseString(String value) throws RemoteException {
        StringBuffer sb = new StringBuffer(value);//Opera sobre o valor de quem a chamou, já String não. 
        sb.reverse();//Inverte a string
        String str = sb.toString();//Converte a String de Stringbuffer para String
        return str;
    }
    
}
