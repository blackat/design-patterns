package com.contrastofbeauty.designpatterns.proxy.remote;

import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class Client {

    public static void main(final String[] args) {
        new Client().start();
    }

    public void start() {
        try {
            ContactService contactService = (ContactService) Naming.lookup("rmi://127.0.0.1/contactService");
            System.out.println("number of contacts in the address book is: " + contactService.getContactSize());
            for (String contact : contactService.listAll()) {
                System.out.println(contact);
            }
        } catch (NotBoundException e) {
            e.printStackTrace();
        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (RemoteException e) {
            e.printStackTrace();
        }
    }
}
