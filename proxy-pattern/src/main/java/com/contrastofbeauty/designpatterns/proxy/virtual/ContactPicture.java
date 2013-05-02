package com.contrastofbeauty.designpatterns.proxy.virtual;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 22/03/13
 */
public class ContactPicture implements Picture {
    private String name;
    private String format;
    private byte[] image;

    public ContactPicture(String n, String f, byte[] i) {
        name = n;
        format = f;
        image = i;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public String getFormat() {
        return format;
    }

    @Override
    public byte[] getImage() {
        return image;
    }
}
