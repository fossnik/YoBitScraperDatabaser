import org.jsoup.*;
import org.jsoup.helper.*;
import org.jsoup.nodes.*;
import org.jsoup.select.*;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

		Document doc = null;
		try {
			doc = Jsoup.connect("https://yobit.net/en/market/").get();
		} catch (IOException e) {
			e.printStackTrace();
		}
		String title = doc.title();
		System.out.println(title);
    }
}
