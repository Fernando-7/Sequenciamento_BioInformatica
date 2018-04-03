/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.rmi;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 *
 * @author Junior
 */
public class Cliente_RMI {
    public static void main(String[] args) throws NotBoundException, MalformedURLException, RemoteException {
       InterfaceServidor_RMI objeto =(InterfaceServidor_RMI) Naming.lookup("rmi://localhost:5099/eae");
        System.out.println("Resposta do servidor: "+objeto.reverseString("Hello Word"));
    }
}
