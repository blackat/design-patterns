package com.contrastofbeauty.designpatterns.proxy.virtual;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public class Contact {

    private Picture picture;

    public Contact(Picture p) {
        picture = p;
    }

    @Override
    public String toString() {
        if (picture.getName() == null) {
            return "picture is going to be retrieved...";
        } else {
            return picture.getFormat() + " " + picture.getName() + " " + new String(picture.getImage());
        }
    }
}
