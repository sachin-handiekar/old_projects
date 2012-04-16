package org.jcyclehire.http;

import org.jcyclehire.CycleHireException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;

public class CycleHireHttpRequest {
    private static String apiUrl =
        "http://www.tfl.gov.uk/tfl/syndication/feeds/cycle-hire/livecyclehireupdates.xml";

    public static String sendRequest()
            throws CycleHireException {
        StringBuffer buffer = new StringBuffer();

        try {
            URL url = new URL(apiUrl);
            BufferedReader in =
                new BufferedReader(new InputStreamReader(url.openStream()));
            String str;

            while ((str = in.readLine()) != null) {
                buffer.append(str);
            }

            in.close();
        } catch (MalformedURLException e) {
            throw new CycleHireException(e.getMessage());
        } catch (IOException e) {
            throw new CycleHireException(e.getMessage());
        }

        return buffer.toString();
    }
}
