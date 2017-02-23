package com.chrisonntag.backpack.authentication;

import android.media.session.MediaSession;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


public class NextcloudAuthenticator {

    NextcloudToken token;

    public NextcloudAuthenticator(String username, String password, String baseUrl) {
        try {
            URL tokenUrl = new URL(baseUrl + "/index.php/token/generate");
            token = new NextcloudToken(username, password, tokenUrl);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public NextcloudToken getToken(){
        return this.token;
    }

    public boolean connect() {
        return true;
    }

    public boolean loggedIn() {
        return true;
    }

}
