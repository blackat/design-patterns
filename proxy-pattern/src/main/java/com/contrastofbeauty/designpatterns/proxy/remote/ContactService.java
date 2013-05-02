package com.contrastofbeauty.designpatterns.proxy.remote;

import java.rmi.Remote;
import java.rmi.RemoteException;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public interface ContactService extends Remote {
    List<String> listAll() throws RemoteException;

    int getContactSize() throws RemoteException;
}
