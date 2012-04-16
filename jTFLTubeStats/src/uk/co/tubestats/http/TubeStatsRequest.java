package uk.co.tubestats.http;

import uk.co.tubestats.TubeStatsException;
import uk.co.tubestats.config.Constants;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Class description
 *
 *
 * @version        Enter version here..., 11/05/20
 * @author         Enter your name here...    
 */
public class TubeStatsRequest {

    /**
     * Method description
     *
     *
     * @param requestString
     *
     * @return
     *
     * @throws TubeStatsException
     */
    public static String sendRequest(String requestString)
            throws TubeStatsException {
        StringBuffer buffer = new StringBuffer();

        try {
            String apiUrl = Constants.BASE_API_URL + requestString;
            URL url = new URL(apiUrl);
            BufferedReader in =
                new BufferedReader(new InputStreamReader(url.openStream(),
                    "utf-8"));
            String str;

            while ((str = in.readLine()) != null) {
                buffer.append(str);
            }

            in.close();
        } catch (MalformedURLException e) {
            throw new TubeStatsException(e.getMessage());
        } catch (IOException e) {
            throw new TubeStatsException(e.getMessage());
        }

        return buffer.toString();
    }
}
