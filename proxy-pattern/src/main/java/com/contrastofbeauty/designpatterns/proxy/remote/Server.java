package com.contrastofbeauty.designpatterns.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class Server {

    public static void main(final String[] args) {
        try {
            ContactService contactService = new ContactServiceImpl();
            Naming.rebind("/contactService", contactService);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
