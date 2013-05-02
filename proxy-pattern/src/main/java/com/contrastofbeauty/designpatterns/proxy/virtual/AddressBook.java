package com.contrastofbeauty.designpatterns.proxy.virtual;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 22/03/13
 */
public class AddressBook {
    public static void main(String[] args) {
        new AddressBook().run();
    }

    public void run() {
        NetworkService ns = new NetworkServiceImpl();
        Contact contact = new Contact(new PictureProxy(ns));
        System.out.println(contact.toString());
    }
}
