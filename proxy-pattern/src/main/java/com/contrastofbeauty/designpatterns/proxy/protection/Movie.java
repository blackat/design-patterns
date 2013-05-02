package com.contrastofbeauty.designpatterns.proxy.protection;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: blackcat
 * Date: 22/03/13
 */
public interface Movie {

    String getTitle();

    void setTitle(String title);

    List<String> getActors();

    void setActors(List<String> actors);

    void comment(String comment);
}
