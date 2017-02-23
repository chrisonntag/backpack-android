package com.chrisonntag.backpack.authentication;

import java.io.IOException;
import java.io.OutputStream;
import java.net.URL;
import java.net.URLConnection;
import java.net.URLEncoder;
import java.util.Date;

public class NextcloudToken {

    URL mTokenUrl;
    String token;
    Date expires;

    public NextcloudToken(String username, String password, URL tokenUrl) throws IOException {
        this.mTokenUrl = tokenUrl;
        requestToken(username, password, tokenUrl);
    }

    private void requestToken(String username, String password, URL tokenUrl) throws IOException {
        URLConnection connection = tokenUrl.openConnection();
        connection.setDoOutput(true); //sets method to POST

        // Encode according to application/x-www-form-urlencoded specification
        String content =
            "user=" + URLEncoder.encode(username, "US-ASCII") +
            "&password=" + URLEncoder.encode(password, "US-ASCII") +
            "&name=" + URLEncoder.encode("BackpackAndroid", "US-ASCII");
        connection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded");

       // TODO request JSON from nextcloud
        this.token = "ABC";
    }

    public String toString() {
        return this.token;
    }

    public Date expires() {
        return this.expires;
    }

}
