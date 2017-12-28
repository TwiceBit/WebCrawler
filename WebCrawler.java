import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.Scanner;

public class WebCrawler {

	public static Object[] Crawl(String url) {
		try {
			URL u = new URL(url);
			InputStream in = u.openStream();
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
			InputStream in = u.openStream();
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
			InputStream in = u.openStream();
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
			InputStream in = u.openStream();
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
