import java.util.ArrayList;

public class WebCrawlerModul {

	public static ArrayList<String> getLinks(String url) {
		ArrayList<String> lines = new ArrayList<>();
		for (String line : WebCrawler.getListCode(url)) {
			if (line.contains("<a href=")) {
				String l = line;
				l = l.substring(line.indexOf("<a href"));
				l = l.substring(0, l.indexOf("/a>") + 3);
				lines.add(l);
			}
		}
		return lines;
	}

	public static ArrayList<String> getForm(String url) {
		ArrayList<String> lines = new ArrayList<>();
		for (String line : WebCrawler.getListCode(url)) {
			if (line.contains("<form")) {
				String l = line;
				l = l.substring(line.indexOf("<form"));
				l = l.substring(0, l.indexOf("/form>") + 6);
				lines.add(l);
			}
		}
		return lines;
	}

	public static ArrayList<String> scripts(String url) {
		ArrayList<String> lines = new ArrayList<>();
		for (String line : WebCrawler.getListCode(url)) {
			if (line.contains("<script")) {
				String l = line;
				l = l.substring(line.indexOf("<script"));
				l = l.substring(0, l.indexOf("/script>") + 8);
				lines.add(l);
			}
		}
		return lines;
	}

	public static ArrayList<String> input(String url) {
		ArrayList<String> lines = new ArrayList<>();
		for (String line : WebCrawler.getListCode(url)) {
			if (line.contains("<input")) {
				String l = line;
				l = l.substring(line.indexOf("<input"));
				l = l.substring(0, l.indexOf(">") + 1);
				lines.add(l);
			}

		}
		return lines;
	}

	public static ArrayList<String> image(String url) {
		ArrayList<String> lines = new ArrayList<>();
		for (String line : WebCrawler.getListCode(url)) {
			if (line.contains("<img")) {
				String l = line;
				l = l.substring(line.indexOf("<img"));
				l = l.substring(0, l.indexOf(">") + 1);
				lines.add(l);
			}

		}
		return lines;
	}

	public static ArrayList<String> Iframe(String url) {
		ArrayList<String> lines = new ArrayList<>();
		for (String line : WebCrawler.getListCode(url)) {
			if (line.contains("<iframe")) {
				String l = line;
				l = l.substring(line.indexOf("<iframe"));
				l = l.substring(0, l.indexOf(">") + 1);
				lines.add(l);
			}

		}
		return lines;
	}

	
	public static void PrintResults(ArrayList<String> list) {
		for (String l : list) {
			System.out.println(l);
		}
	}
}
