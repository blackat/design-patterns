package com.contrastofbeauty.designpatterns.proxy.virtual;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 22/03/13
 */
public class PictureProxy implements Picture {

    private ContactPicture contactPicture;
    private boolean isRetrieving;
    private NetworkService networkService;

    public PictureProxy(NetworkService ns) {
        networkService = ns;
    }

    @Override
    public String getName() {
        if (contactPicture == null) {
            retrieveImage();
        } else {
            contactPicture.getName();
        }
        return null;
    }

    @Override
    public String getFormat() {
        if (contactPicture == null) {
            retrieveImage();
        } else {
            contactPicture.getFormat();
        }
        return null;
    }

    @Override
    public byte[] getImage() {
        if (contactPicture == null) {
            retrieveImage();
        } else {
            contactPicture.getImage();
        }
        return null;
    }

    private void retrieveImage() {
        if (!isRetrieving) {
            isRetrieving = true;
            Thread thread = new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        contactPicture = new ContactPicture("john picture", "png", networkService.getImage(new URL("http://imagerepo.com")));
                        System.out.println("picture retrieved");
                    } catch (MalformedURLException e) {
                        e.printStackTrace();
                    }
                }
            });
            thread.start();
        }
    }
}
