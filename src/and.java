import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class and {


    private final int a;
    private final String b;
    private final int c;

    private static Map<String, BufferedWriter> out = new HashMap<String, BufferedWriter>();
    private static SimpleDateFormat prefix = null;
    private static SimpleDateFormat sufix = null;
    private static String tabName = null;

    public and(int var1, String var2, int var3) {
        this.b = var2;
        this.a = var1;
        this.c = var3;
        this.writeLog();
    }

    public and(String line) {
        this.b = line;
        this.a = 0;
        this.c = 0;

        this.tabName = ImprovedChat./* getCurrentServer().currentTab()*/currentTab().name;
        this.writeLog();
    }

    public and(String line, String tabName) {
        this.b = line;
        this.a = 0;
        this.c = 0;

        this.tabName = tabName;
        this.writeLog();
    }

    public String a() {
        return this.b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.c;
    }

    private void writeLog() {
        try {
            String line = ImprovedChat.stripColors(this.b);
            // line = line.replaceAll("\u00a7[0123456789abcdefABCDEF]", "");
            BufferedWriter e = this.getOut();
            Date now = Calendar.getInstance().getTime();
            e.write(prefix.format(now) + line + sufix.format(now));
            e.flush();
        } catch (Exception var4) {
            System.err.println("Error: " + var4.getMessage());
            var4.printStackTrace();
        }
    }

    private BufferedWriter getOut() {

        String serverName = ImprovedChat.getCurrentServer().name;

        if(out != null && out.containsKey(serverName)) {
            return out.get(serverName);
        } else {

            File modDir = new File(Minecraft.a("minecraft"), "mods" + File.separator + "wd1966");
            File config = new File(modDir, "ChatLogger.conf");
            String lineFormat = "EEE, d MMM yyyy HH:mm:ss \'-\' $line\'\n\'";
            BufferedWriter bwrit = null;
            File log = null;
            if(!modDir.exists()) {
                modDir.mkdirs();
            }

            try {
                if(modDir.exists()) {
                    if(config.exists()) {
                        BufferedReader e = new BufferedReader(new FileReader(config));

                        String line;
                        while((line = e.readLine()) != null) {
                            if(!line.startsWith("#")) {
                                String[] split = line.split("=", 2);
                                if(split.length == 2) {
                                    if(split[0].equalsIgnoreCase("format")) {
                                        lineFormat = this.unescape(split[1]);
                                    }

                                    if(split[0].equalsIgnoreCase("destination")) {
                                        String dest_log_string = split[1];
                                        dest_log_string = dest_log_string.replaceAll("%server%", serverName)/*.replaceAll("%tab%", ImprovedChat.currentTab().name)*/;
                                        log = new File(dest_log_string);
                                    }
                                }
                            }
                        }

                        e.close();
                    } else {
                        // log = new File(modDir, "chat"+(tabName!=null?"-%server%")+".log");
                        log = new File(modDir, "chat-%server%.log");
                        PrintWriter e1 = new PrintWriter(config);
                        e1.println("#Config file for chat logger");
                        e1.println("format=" + this.escape(lineFormat));
                        e1.println("destination=" + log.getAbsolutePath());
                        log = new File(log.getAbsolutePath().replaceAll("%server", serverName));
                        e1.close();
                    }

                    int e2 = lineFormat.indexOf("$line");
                    if(e2 < 0) {
                        e2 = 0;
                    }

                    bwrit = new BufferedWriter(new FileWriter(log, true));
                    prefix = new SimpleDateFormat(lineFormat.substring(0, e2));
                    sufix = new SimpleDateFormat(lineFormat.substring(e2 + 5));
                } else {
                    bwrit = new BufferedWriter(new FileWriter("chatlog.txt", true));
                    prefix = new SimpleDateFormat("");
                    sufix = new SimpleDateFormat("");
                }
            } catch (IOException var8) {
                var8.printStackTrace();
            }

            if(bwrit!=null)
                out.put(ImprovedChat.getCurrentServer().name, bwrit);

            return bwrit;
        }
    }

    private String escape(String line) {
        StringBuffer o = new StringBuffer();

        for(int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if(ch == 10) {
                o.append("\\n");
            } else if(ch == 13) {
                o.append("\\r");
            } else if(ch == 12) {
                o.append("\\f");
            } else {
                o.append(ch);
            }
        }

        return o.toString();
    }

    private String unescape(String line) {
        StringBuffer o = new StringBuffer();

        for(int i = 0; i < line.length(); ++i) {
            char ch = line.charAt(i);
            if(ch == 92 && i + 1 < line.length()) {
                ++i;
                ch = line.charAt(i);
                if(ch == 110) {
                    o.append("\n");
                } else if(ch == 114) {
                    o.append("\r");
                // } else if(ch == 102) {
                } else if(ch == 102) {
                    o.append("\f");
                } else {
                    o.append("\\" + ch);
                }
            } else {
                o.append(ch);
            }
        }

        return o.toString();
    }
}