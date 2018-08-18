import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

import javax.net.ssl.HttpsURLConnection;

public class WebCrawler {

	// HTTP
	
	public static Object[] Crawl(String url) {
		try {
			URL u = new URL(url);
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			InputStreamReader r = new InputStreamReader(in);
			ArrayList<Character> list = new ArrayList();
			while (r.ready()) {
				list.add((char) r.read());
			}
			return list.toArray();
		} catch (Exception e) {

		}
		return null;
	}

	public static InputStream getInputStream(String url) {
		URL u;
		try {
			u = new URL(url);
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			return in;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	public static String[] getStringArray(String url) {
		URL u;
		try {
			u = new URL(url);
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			ArrayList<String> list = new ArrayList<>();
			Scanner src = new Scanner(in);
			while (src.hasNextLine()) {
				list.add(src.nextLine());
			}
			return (String[]) list.toArray();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	public static ArrayList<String> getListCode(String url) {
		URL u;
		try {
			u = new URL(url);
			HttpURLConnection con = (HttpURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			ArrayList<String> list = new ArrayList<>();
			Scanner src = new Scanner(in);
			while (src.hasNextLine()) {
				list.add(src.nextLine());
			}
			return list;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}
	
	
	//  HTTPS
	
	
	public static Object[] SSLCrawl(String url) {
		try {
			URL u = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			
			InputStreamReader r = new InputStreamReader(in);
			ArrayList<Character> list = new ArrayList();
			while (r.ready()) {
				list.add((char) r.read());
			}
			return list.toArray();
		} catch (Exception e) {

		}
		return null;
	}

	public static InputStream SSLgetInputStream(String url) {
		URL u;
		try {
			u = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			return in;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	public static String[] SSLgetStringArray(String url) {
		URL u = null;
		try {
			u = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			ArrayList<String> list = new ArrayList<>();
			Scanner src = new Scanner(in);
			while (src.hasNextLine()) {
				list.add(src.nextLine());
			}
			return (String[]) list.toArray();
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}

	public static ArrayList<String> SSLgetListCode(String url) {
		URL u;
		try {
			u = new URL(url);
			HttpsURLConnection con = (HttpsURLConnection) u.openConnection();
			con.setRequestProperty("user-agent", "Java-Bot");
			InputStream in = con.getInputStream();
			ArrayList<String> list = new ArrayList<>();
			Scanner src = new Scanner(in);
			while (src.hasNextLine()) {
				list.add(src.nextLine());
			}
			return list;
		} catch (IOException e) {
			
			e.printStackTrace();
		}
		return null;

	}
	
	

}
