import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class yf extends vp {

    public String b = ""; // ImprovedChat
    private int c = -1;
    private boolean d = false;
    private String e = "";
    private String f = "";
    private int h = 0;
    private List i = new ArrayList();
    private URI j = null;
    protected agu a;
    private String k = "";

    private static Pattern prefixPattern = Pattern.compile("~\\(.*?[^\\\\]\\)");
    public int cursorPosition;

    public yf() {}

    public yf(String var1) {
        this.k = var1;
    }

    public void c() {
        Keyboard.enableRepeatEvents(true);
        this.c = this.p.w.c().size();
        this.a = new agu(this.u, 4, this.r - 12, this.q - 4, 12);
        this.a.f(100);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.k);
        this.a.c(false);
    }

    public void e() {
        Keyboard.enableRepeatEvents(false);
        this.p.w.d();
    }

    public void a() {
        this.a.a();
    }

    protected void a(char var1, int var2) {
        if(var2 == 15) {
            this.d();
        } else {
            this.d = false;
        }

        if(var2 == 1) {
            this.p.a((vp)null);
        } else if(var2 == 28) {
            String var3 = this.a.b().trim();
            if(var3.length() > 0 && !this.p.c(var3)) {
                // this.p.h.a(var3);
                ImprovedChat.process(var3);
            }

            this.p.a((vp)null);
        } else if(var2 == 200) {
            this.a(-1);
        } else if(var2 == 208) {
            this.a(1);
        } else if(var2 == 201) {
            this.p.w.a(1);
        } else if(var2 == 209) {
            this.p.w.a(-1);
        } else {
            this.a.a(var1, var2);
        }
        /*
        TODO : a whole lot
         */

        /* boolean ctrlPressed = Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
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
        */
    }

    public void f() {
        super.f();
        int var1 = Mouse.getEventDWheel();
        if(var1 != 0) {
            if(var1 > 1) {
                var1 = 1;
            }

            if(var1 < -1) {
                var1 = -1;
            }

            /* if(!m()) { // m == mousewheel
                var1 *= 7;
            } */

            this.p.w.a(var1);
        }

    }

    protected void a(int var1, int var2, int var3) {
        if(var3 == 0) {
            dx var4 = this.p.w.a(Mouse.getX(), Mouse.getY());
            if(var4 != null) {
                URI var5 = var4.b();
                if(var5 != null) {
                    this.j = var5;
                    this.p.a((vp)(new be(this, this, var4.a(), 0, var4)));
                    return;
                }
            }
        }

        this.a.a(var1, var2, var3);
        super.a(var1, var2, var3);
    }

    public void a(boolean var1, int var2) {
        if(var2 == 0) {
            if(var1) {
                try {
                    Class var3 = Class.forName("java.awt.Desktop");
                    Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
                    var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{this.j});
                } catch (Throwable var5) {
                    var5.printStackTrace();
                }
            }

            this.j = null;
            this.p.a((vp)this);
        }

    }

    public void d() {
        Iterator var2;
        ah var3;
        if(this.d) {
            this.a.a(-1);
            if(this.h >= this.i.size()) {
                this.h = 0;
            }
        } else {
            int var1 = this.a.c(-1);
            if(this.a.h() - var1 < 1) {
                return;
            }

            this.i.clear();
            this.e = this.a.b().substring(var1);
            this.f = this.e.toLowerCase();
            var2 = ((ahv)this.p.h).cl.c.iterator();

            while(var2.hasNext()) {
                var3 = (ah)var2.next();
                if(var3.a(this.f)) {
                    this.i.add(var3);
                }
            }

            if(this.i.size() == 0) {
                return;
            }

            this.d = true;
            this.h = 0;
            this.a.b(var1 - this.a.h());
        }

        if(this.i.size() > 1) {
            StringBuilder var4 = new StringBuilder();

            for(var2 = this.i.iterator(); var2.hasNext(); var4.append(var3.a)) {
                var3 = (ah)var2.next();
                if(var4.length() > 0) {
                    var4.append(", ");
                }
            }

            this.p.w.a(var4.toString());
        }

        this.a.b(((ah)this.i.get(this.h++)).a);
    }

    public void a(int var1) {
        int var2 = this.c + var1;
        int var3 = this.p.w.c().size();
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > var3) {
            var2 = var3;
        }

        if(var2 != this.c) {
            if(var2 == var3) {
                this.c = var3;
                this.a.a(this.b);
            } else {
                if(this.c == var3) {
                    this.b = this.a.b();
                }

                this.a.a((String)this.p.w.c().get(var2));
                this.c = var2;
            }
        }
    }

    public void a(int var1, int var2, float var3) {

        // this.a.f();

        String cm = null;
        if(ImprovedChat.Current.ChatMode!=null) { cm = ImprovedChat.Current.ChatMode; }
        if(cm!=null) { cm = cm + " "; } else { cm = ""; }
        int bg = ((ImprovedChat.bgOpacity & 255) << 24) + ImprovedChat.bgColor;

        // a(2, this.r - 14,     this.q - 2, this.r - 2, Integer.MIN_VALUE);
        this.a(2, this.r - 14 /* * 12 */, this.q - 2, this.r - 2, bg);
        // this.b(this.u, cm + wheel, 4, this.r - 12 * size--, 14737632);
        //   this.b(this.u, cm, 4, this.r - 12 * 1, 14737632);

        this.a.f();

        super.a(var1, var2, var3);

        /*
        * TODO: A whole lot
        */

        /*
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
        */
    }

    private void checkcursor() {
        if(this.cursorPosition > this.b.length()) {
            this.cursorPosition = this.b.length();
        }

        if(this.cursorPosition < 0) {
            this.cursorPosition = 0;
        }

    }
}