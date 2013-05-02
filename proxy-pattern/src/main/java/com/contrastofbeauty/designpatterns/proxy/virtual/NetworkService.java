package com.contrastofbeauty.designpatterns.proxy.virtual;

import java.net.URL;

/**
 * Created with IntelliJ IDEA.
 * User: eugenio
 * Date: 22/03/13
 */
public interface NetworkService {
    byte[] getImage(URL url);
}
