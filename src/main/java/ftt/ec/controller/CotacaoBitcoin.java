package ftt.ec.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

public class CotacaoBitcoin {

	public String getBitcoin() {
		URL url;
		String output = "";

		try {

			url = new URL("https://www.mercadobitcoin.net/api/BTC/ticker/");

			HttpURLConnection con = (HttpURLConnection) url.openConnection();

			con.setConnectTimeout(5000);
			con.setReadTimeout(5000);

			con.setRequestMethod("GET");

			System.out.println(con.getResponseMessage());

			BufferedReader in = new BufferedReader(new InputStreamReader(url.openStream()));

			StringBuffer sb = new StringBuffer();

			while ((output = in.readLine()) != null) {
				sb.append(output);
			}

		
		output = sb.toString();
		
		con.disconnect();

		}catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return output;
	}
}
