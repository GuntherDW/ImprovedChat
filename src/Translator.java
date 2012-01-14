import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Translator {

    private static List<String> languages = new ArrayList<String>();
    private static URL url;


    static {
        languages.add("");
        languages.add("af");
        languages.add("sq");
        languages.add("am");
        languages.add("ar");
        languages.add("hy");
        languages.add("az");
        languages.add("eu");
        languages.add("be");
        languages.add("bn");
        languages.add("bh");
        languages.add("bg");
        languages.add("my");
        languages.add("ca");
        languages.add("chr");
        languages.add("zh");
        languages.add("zh-CN");
        languages.add("zh-TW");
        languages.add("hr");
        languages.add("cs");
        languages.add("da");
        languages.add("dv");
        languages.add("nl");
        languages.add("en");
        languages.add("eo");
        languages.add("et");
        languages.add("tl");
        languages.add("fi");
        languages.add("fr");
        languages.add("gl");
        languages.add("ka");
        languages.add("de");
        languages.add("el");
        languages.add("gn");
        languages.add("gu");
        languages.add("iw");
        languages.add("hi");
        languages.add("hu");
        languages.add("is");
        languages.add("id");
        languages.add("iu");
        languages.add("ga");
        languages.add("it");
        languages.add("ja");
        languages.add("kn");
        languages.add("kk");
        languages.add("km");
        languages.add("ko");
        languages.add("ku");
        languages.add("ky");
        languages.add("lo");
        languages.add("lv");
        languages.add("lt");
        languages.add("mk");
        languages.add("ms");
        languages.add("ml");
        languages.add("mt");
        languages.add("mr");
        languages.add("mn");
        languages.add("ne");
        languages.add("no");
        languages.add("or");
        languages.add("ps");
        languages.add("fa");
        languages.add("pl");
        languages.add("pt");
        languages.add("pa");
        languages.add("ro");
        languages.add("ru");
        languages.add("sa");
        languages.add("sr");
        languages.add("sd");
        languages.add("si");
        languages.add("sk");
        languages.add("sl");
        languages.add("es");
        languages.add("sw");
        languages.add("sv");
        languages.add("tg");
        languages.add("ta");
        languages.add("tl");
        languages.add("te");
        languages.add("th");
        languages.add("bo");
        languages.add("tr");
        languages.add("uk");
        languages.add("ur");
        languages.add("uz");
        languages.add("ug");
        languages.add("vi");
        languages.add("cy");
        languages.add("yi");

        try {
            url = new URL("http://ajax.googleapis.com/ajax/services/language/translate");
        } catch (MalformedURLException var1) {
            url = null;
        }

    }

    public static boolean validLanguage(String lang) {
        Iterator var2 = languages.iterator();

        while (var2.hasNext()) {
            String s = (String) var2.next();
            if (s.equals(lang)) {
                return true;
            }
        }

        return false;
    }

    private static String inputStreamToString(InputStream inputStream) {
        StringBuilder outputBuilder = new StringBuilder();

        try {
            if (inputStream != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, "UTF-8"));

                String string;
                while ((string = reader.readLine()) != null) {
                    outputBuilder.append(string).append('\n');
                }
            }
        } catch (Exception var4) {
            ;
        }

        return outputBuilder.toString();
    }

    public static String translate(String from, String to, String text) {
        if (url == null) {
            return text;
        } else {
            String result = text;

            try {
                HttpURLConnection uc = (HttpURLConnection) url.openConnection();
                uc.setRequestMethod("GET");
                uc.setDoOutput(true);
                StringBuilder par = new StringBuilder();
                par.append("v=2.0&langpair=");
                par.append(from);
                par.append("%7C");
                par.append(to);
                par.append("&q=");
                par.append(URLEncoder.encode(text, "UTF-8"));
                PrintWriter pw = new PrintWriter(uc.getOutputStream());
                pw.write(par.toString());
                pw.flush();

                try {
                    String r = inputStreamToString(uc.getInputStream());
                    if (r.contains("\"responseStatus\": 200")) {
                        int poc = r.indexOf("\"translatedText\":\"") + 18;
                        result = r.substring(poc, r.indexOf(34, poc)).replaceAll("\\\\u0026#39;", "\'");
                    }
                } finally {
                    uc.getInputStream().close();
                    if (uc.getErrorStream() != null) {
                        uc.getErrorStream().close();
                    }

                }
            } catch (Exception var13) {
                ;
            }

            return result;
        }
    }
}
