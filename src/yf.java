import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class yf extends vp {

    public String b = ""; // ImprovedChat
    private int c = -1;
    private boolean d = false;
    private String e = "";
    private String f = "";
    private int h = 0;
    private List<ah> i = new ArrayList<ah>();
    private URI j = null;
    protected agu a;
    private String k = "";

    private static Pattern prefixPattern = Pattern.compile("~\\(.*?[^\\\\]\\)");
    public int cursorPosition;

    public yf() {}

    public yf(String var1) {
        this.k = var1;
    }

    @Override
    public void c() {
        Keyboard.enableRepeatEvents(true);
        this.c = this.p.w.c().size();
        this.a = new agu(this.u, 4, this.r - 12, this.q - 4, 12);
        this.a.f(300);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.k);
        this.a.c(false);
    }

    @Override
    public void e() {
        Keyboard.enableRepeatEvents(false);
        this.p.w.d();
    }

    @Override
    public void a() {
        this.a.a();
    }

    @Override
    protected void a(char var1, int var2) {
        if(var2 == Keyboard.KEY_TAB) {
            this.d();
        } else {
            this.d = false;
        }

        if(var2 == Keyboard.KEY_ESCAPE) {
            this.p.a((vp)null);
            ImprovedChat.commandScroll = 0;
        } else if(var2 == Keyboard.KEY_RETURN || var2 == Keyboard.KEY_NUMPADENTER) {
            String var3 = this.a.b().trim();
            if(var3.length() > 0 && !this.p.c(var3)) {
                // this.p.h.a(var3);
                ImprovedChat.pastCommands.add(var3);
                ImprovedChat.process(var3);
                ImprovedChat.commandScroll = 0;
                ImprovedChat.currentTab().chatScroll = 0;
            }
            this.p.a((vp)null);
        } else if(var2 == Keyboard.KEY_UP && ImprovedChat.commandScroll < ImprovedChat.pastCommands.size()) {

            // this.a(-1);
            ++ImprovedChat.commandScroll;
            this.a.a(ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll));

        } else if(var2 == Keyboard.KEY_DOWN && ImprovedChat.commandScroll > 0) {
            --ImprovedChat.commandScroll;
            if(ImprovedChat.commandScroll == 0) {
                this.a.a("");
            } else {
                this.a.a(ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll));
            }
            // this.a(1);

        } else if(var2 == Keyboard.KEY_PRIOR) { // Page up
            this.p.w.a(ImprovedChat.scrollLines);
        } else if(var2 == Keyboard.KEY_NEXT) { // Page down
            this.p.w.a(-ImprovedChat.scrollLines);
        } else {
            this.a.a(var1, var2);
        }
    }

    @Override
    public void f() {
        super.f();
        int var1 = Mouse.getEventDWheel();
        if(var1 != 0) {
            if(var1 > 1) {
                var1 = ImprovedChat.scrollLines;
            }

            if(var1 < -1) {
                var1 = -ImprovedChat.scrollLines;
            }

            /* if(!m()) { // m == mousewheel
                var1 *= 7;
            } */

            this.p.w.a(var1);
        }

    }

    @Override
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

    @Override
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
                String playerName = ImprovedChat.stripColors(var3.a.toLowerCase());
                if(playerName.startsWith(this.f)) {
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

            for(var2 = this.i.iterator(); var2.hasNext(); var4.append(ImprovedChat.stripColors(var3.a))) {
                var3 = (ah)var2.next();
                if(var4.length() > 0) {
                    var4.append(", ");
                }
            }

            this.p.w.a(var4.toString());
        }

        ah playerInfo = this.i.get(this.h++);
        this.a.b(ImprovedChat.stripColors(playerInfo.a));
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

    @Override
    public void a(int var1, int var2, float var3) {

        this.a.f();
        super.a(var1, var2, var3);
    }

    private void checkcursor() {
        String chatLine = this.a.b();
        this.cursorPosition = this.a.o;

        if(this.cursorPosition > chatLine.length()) {
            this.cursorPosition = chatLine.length();
        }

        if(this.cursorPosition < 0) {
            this.cursorPosition = 0;
        }

    }
}