package com.contrastofbeauty.designpatterns.proxy.remote;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.util.ArrayList;
import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class ContactServiceImpl extends UnicastRemoteObject implements ContactService {

    protected ContactServiceImpl() throws RemoteException {
    }

    @Override
    public List<String> listAll() {
        List<String> contacts = new ArrayList<String>();
        contacts.add("Fermi");
        contacts.add("Majorana");
        return contacts;
    }

    @Override
    public int getContactSize() {
        return 18;
    }
}
