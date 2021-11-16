package ftt.ec.controller;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;

public class WordCloudSVG {

	public static String getImage(String text) {
		URL url;
		String output = "";
		HttpURLConnection con;

		try {

			url = new URL("https://quickchart.io/wordcloud?text=" + URLEncoder.encode(text, StandardCharsets.UTF_8.toString()));

			con = (HttpURLConnection) url.openConnection();

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

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(output);
		return output;
	}
}
