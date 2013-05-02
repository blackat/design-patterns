package com.contrastofbeauty.designpatterns.proxy.virtual;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 22/03/13
 */
public class NetworkServiceImpl implements NetworkService {
    @Override
    public byte[] getImage(URL url) {
        String imageString = "this is an image" + url;
        return imageString.getBytes();
    }
}
