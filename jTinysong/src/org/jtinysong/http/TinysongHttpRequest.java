package org.jtinysong.http;

import org.jtinysong.TinysongException;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.net.MalformedURLException;
import java.net.URL;

public class TinysongHttpRequest {

	public static String sendRequest(String urlString) throws TinysongException {
		StringBuffer buffer = new StringBuffer();

		try {
			URL url = new URL(urlString);
			BufferedReader in = new BufferedReader(new InputStreamReader(
					url.openStream()));
			String str;

			while ((str = in.readLine()) != null) {
				buffer.append(str);
			}

			in.close();
		} catch (MalformedURLException e) {
			throw new TinysongException(e.getMessage());
		} catch (IOException e) {
			throw new TinysongException(e.getMessage());
		}

		return buffer.toString();
	}
}
