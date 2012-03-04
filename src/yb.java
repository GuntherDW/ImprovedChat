import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class yb extends vl {

    protected String a = "";
    private int b = 0;
    // private static final String c = xj.a;
    private static Pattern prefixPattern = Pattern.compile("~\\(.*?[^\\\\]\\)");
    public int cursorPosition;

    public void c() {
        Keyboard.enableRepeatEvents(true);
    }

    public void e() {
        Keyboard.enableRepeatEvents(false);
    }

    public void a() {
        ++this.b;
    }

    protected void a(char var1, int var2) {
        boolean ctrlPressed = Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
        if(Keyboard.isKeyDown(203) && this.cursorPosition > 0) {
            --this.cursorPosition;

            while(ctrlPressed && this.cursorPosition > 0 && Character.isLetterOrDigit(this.a.charAt(this.cursorPosition - 1))) {
                --this.cursorPosition;
            }
        } else if(Keyboard.isKeyDown(205) && this.cursorPosition < this.a.length()) {
            ++this.cursorPosition;

            while(ctrlPressed && this.cursorPosition < this.a.length() && Character.isLetterOrDigit(this.a.charAt(this.cursorPosition - 1))) {
                ++this.cursorPosition;
            }
        } else if(Keyboard.isKeyDown(211) && this.cursorPosition < this.a.length()) {
            this.a = this.a.substring(0, this.cursorPosition) + this.a.substring(this.cursorPosition + 1);
        } else if(Keyboard.isKeyDown(201) && ImprovedChat.currentTab().chatScroll <= ImprovedChat.currentTab().e.size() - 10) {
            ++ImprovedChat.currentTab().chatScroll;
        } else if(Keyboard.isKeyDown(209) && ImprovedChat.currentTab().chatScroll > 0) {
            --ImprovedChat.currentTab().chatScroll;
        } else if(Keyboard.isKeyDown(199)) {
            this.cursorPosition = 0;
        } else if(Keyboard.isKeyDown(207)) {
            this.cursorPosition = this.a.length();
        } else if(Keyboard.isKeyDown(200) && ImprovedChat.commandScroll < ImprovedChat.pastCommands.size()) {
            ++ImprovedChat.commandScroll;
            this.a = ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll);
            this.cursorPosition = this.a.length();
        } else if(Keyboard.isKeyDown(208) && ImprovedChat.commandScroll > 0) {
            --ImprovedChat.commandScroll;
            if(ImprovedChat.commandScroll == 0) {
                this.a = "";
            } else {
                this.a = ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll);
            }

            this.cursorPosition = this.a.length();
        } else if(ctrlPressed && Keyboard.isKeyDown(15)) {
            if(Keyboard.isKeyDown(42)) {
                ImprovedChat.Current.previousTab();
            } else {
                ImprovedChat.Current.nextTab();
            }
        }

        if(var1 == 22) {
            String str = ImprovedChat.paste();
            int j = 300 - this.a.length();
            if(j > str.length()) {
                j = str.length();
            }

            if(j > 0) {
                this.a = this.a.substring(0, this.cursorPosition) + str.substring(0, j) + this.a.substring(this.cursorPosition);
                this.cursorPosition += j;
            }

            this.checkcursor();
        } else if(var1 == 3) {
            ImprovedChat.copy(this.a);
        } else if(var2 == 1) {
            this.p.a((vl)null);
            ImprovedChat.currentTab().chatScroll = 0;
        } else if(var2 != 28 && var2 != 156) {
            if(var2 == 14 && this.a.length() > 0 && this.cursorPosition > 0) {
                this.a = this.a.substring(0, this.cursorPosition - 1) + this.a.substring(this.cursorPosition);
                --this.cursorPosition;
            }

            if(ImprovedChat.getAllowedCharacters().indexOf(var1) >= 0 && this.a.length() < 300 && (!this.a.startsWith("/") || this.a.length() < 100)) {
                this.a = this.a.substring(0, this.cursorPosition) + var1 + this.a.substring(this.cursorPosition);
                ++this.cursorPosition;
            }

        } else {
            ImprovedChat.pastCommands.add(this.a);
            ImprovedChat.commandScroll = 0;
            ImprovedChat.process(this.a);
            this.p.a((vl)null);
            ImprovedChat.currentTab().chatScroll = 0;
        }
    }

    public void a(int var1, int var2, float var3) {
        this.checkcursor();
        String line = this.a.substring(0, this.cursorPosition) + (this.b / 6 % 2 == 0?"|":":") + this.a.substring(this.cursorPosition);
        String cm = null;
        if(ImprovedChat.Current.ChatMode!=null) { cm = ImprovedChat.Current.ChatMode; }
        int len = line.length();
        if(cm!=null) { cm = cm + " "; } else { cm = ""; }
        byte pos = 100;
        Matcher m = prefixPattern.matcher(line);
        int var14;
        if(m.find()) {
            var14 = pos + 3;
        } else {
            var14 = pos - ImprovedChat.currentTab().prefix.length();
        }

        if(var14 > this.cursorPosition) {
            ++var14;
        }

        if(len > var14) {
            line = line.substring(0, var14) + "§4" + line.substring(var14);
        }

        List<String> vl = ImprovedChat.processDisplay(line);
        int size = vl.size();
        int bg = ((ImprovedChat.bgOpacity & 255) << 24) + ImprovedChat.bgColor;
        this.a(2, this.r - 4 - size * 12, this.q - 2, this.r - 2, bg);
        Iterator<String> var12 = vl.iterator();

        while(var12.hasNext()) {
            String wheel = var12.next();
            this.b(this.u, cm + wheel, 4, this.r - 12 * size--, 14737632);
        }

        int var13 = Mouse.getDWheel();
        Tab var10000;
        if(var13 > 0) {
            if(ImprovedChat.currentTab().chatScroll <= ImprovedChat.currentTab().e.size() - 11) {
                var10000 = ImprovedChat.currentTab();
                var10000.chatScroll += 2;
            }
        } else if(var13 < 0) {
            var10000 = ImprovedChat.currentTab();
            var10000.chatScroll -= 2;
            if(ImprovedChat.currentTab().chatScroll < 0) {
                ImprovedChat.currentTab().chatScroll = 0;
            }
        }

        super.a(var1, var2, var3);
    }

    protected void a(int var1, int var2, int var3) {
        if(var3 == 0) {
            if(this.p.w.a != null) {
                if(this.a.length() > 0 && !this.a.endsWith(" ")) {
                    this.a = this.a + " ";
                }

                this.a = this.a + this.p.w.a;
                byte var4 = 100;
                if(this.a.length() > var4) {
                    this.a = this.a.substring(0, var4);
                }
            } else {
                super.a(var1, var2, var3);
            }
        }

    }


    private void checkcursor() {
        if(this.cursorPosition > this.a.length()) {
            this.cursorPosition = this.a.length();
        }

        if(this.cursorPosition < 0) {
            this.cursorPosition = 0;
        }

    }
}