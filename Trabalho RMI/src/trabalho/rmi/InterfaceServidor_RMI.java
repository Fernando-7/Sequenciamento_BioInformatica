/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabalho.rmi;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Junior
 */
public interface InterfaceServidor_RMI extends Remote{
    /*throws RemoteException para evitar possíveis erros na execução do servidor, ou seja é uma excessão*/
    public String reverseString(String value)throws RemoteException;
}
