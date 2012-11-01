import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class aro extends asw {

    private String b = "";
    private int c = -1;
    private boolean d = false;
    private boolean m = false;
    private int n = 0;
    private List o = new ArrayList();
    private URI p = null;
    protected ary a;
    private String q = "";


    public aro() {
    }

    public aro(String var1) {
        this.q = var1;
    }

    public void A_() {
        Keyboard.enableRepeatEvents(true);
        this.c = this.e.v.b().b().size();
        this.a = new ary(this.k, 4, this.g - 12, this.f - 4, 12);
        this.a.f(ImprovedChat.chatLineMaxLength);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.q);
        this.a.d(false);
    }

    public void b() {
        Keyboard.enableRepeatEvents(false);
        this.e.v.b().c();
    }

    public void c() {
        this.a.a();
    }

    protected void a(char var1, int var2) {
        this.m = false;
        if (var2 == Keyboard.KEY_TAB) {
            this.y_();
        } else {
            this.d = false;
        }

        if(var2 == Keyboard.KEY_ESCAPE) {
            this.e.a((asw)null);
            ImprovedChat.commandScroll = 0;
        } else if(var2 == Keyboard.KEY_RETURN || var2 == Keyboard.KEY_NUMPADENTER) {
            String var3 = this.a.b().trim();
            if(var3.length() > 0) {
                ImprovedChat.pastCommands.add(var3);
                ImprovedChat.process(var3);
                ImprovedChat.commandScroll = 0;
                ImprovedChat.currentTab().chatScroll = 0;
            }

            this.e.a((asw)null);
        } else if(var2 == Keyboard.KEY_UP && ImprovedChat.commandScroll < ImprovedChat.pastCommands.size()) {
            ++ImprovedChat.commandScroll;
            this.a.a(ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll));
        } else if(var2 == Keyboard.KEY_DOWN && ImprovedChat.commandScroll > 0) {
            --ImprovedChat.commandScroll;
            if (ImprovedChat.commandScroll == 0) {
                this.a.a("");
            } else {
                this.a.a(ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll));
            }
        } else if(var2 == Keyboard.KEY_PRIOR) { // Page up
            this.e.v.b().b(ImprovedChat.scrollLines);
        } else if(var2 == Keyboard.KEY_NEXT) { // Page down
            this.e.v.b().b(-ImprovedChat.scrollLines);
        } else {
            this.a.a(var1, var2);
        }

    }

    public void d() {
        super.d();
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

            this.e.v.b().b(var1);
        }

    }

    protected void a(int var1, int var2, int var3) {
        if (var3 == 0 && this.e.y.p) {
            ase var4 = this.e.v.b().a(Mouse.getX(), Mouse.getY());
            if (var4 != null) {
                URI var5 = var4.g();
                if (var5 != null) {
                    if (this.e.y.q) {
                        this.p = var5;
                        this.e.a((asw) (new arp(this, this, var4.f(), 0, var4)));
                    } else {
                        this.a(var5);
                    }

                    return;
                }
            }
        }

        this.a.a(var1, var2, var3);
        super.a(var1, var2, var3);
    }

    public void a(boolean var1, int var2) {
        if (var2 == 0) {
            if (var1) {
                this.a(this.p);
            }

            this.p = null;
            this.e.a((asw) this);
        }

    }

    private void a(URI var1) {
        try {
            Class var2 = Class.forName("java.awt.Desktop");
            Object var3 = var2.getMethod("getDesktop", new Class[0]).invoke((Object) null, new Object[0]);
            var2.getMethod("browse", new Class[]{URI.class}).invoke(var3, new Object[]{var1});
        } catch (Throwable var4) {
            var4.printStackTrace();
        }

    }

    public void y_() {
        String var3;
        if (this.d) {
            this.a.b(this.a.a(-1, this.a.h(), false) - this.a.h());
            if (this.n >= this.o.size()) {
                this.n = 0;
            }
        } else {
            int var1 = this.a.a(-1, this.a.h(), false);
            this.o.clear();
            this.n = 0;
            String var2 = this.a.b().substring(var1).toLowerCase();
            var3 = this.a.b().substring(0, this.a.h());
            this.a(var3, var2);
            if (this.o.isEmpty()) {
                return;
            }

            this.d = true;
            this.a.b(var1 - this.a.h());
        }

        if (this.o.size() > 1) {
            StringBuilder var4 = new StringBuilder();

            for (Iterator var5 = this.o.iterator(); var5.hasNext(); var4.append(ImprovedChat.stripColors(var3))) {
                var3 = (String) var5.next();
                if (var4.length() > 0) {
                    var4.append(", ");
                }
            }

            this.e.v.b().a(var4.toString(), 1);
        }

        // this.a.b();
        // ah playerInfo = this.o.get(this.n++);
        String playerName = (String)this.o.get(this.n++);
        this.a.b(ImprovedChat.stripColors(playerName));
    }

    private void a(String var1, String var2) {
        if (var1.length() >= 1) {
            this.e.g.a.c(new cl(var1));
            this.m = true;
        }
    }

    public void a(int var1) {
        int var2 = this.c + var1;
        int var3 = this.e.v.b().b().size();
        if (var2 < 0) {
            var2 = 0;
        }

        if (var2 > var3) {
            var2 = var3;
        }

        if (var2 != this.c) {
            if (var2 == var3) {
                this.c = var3;
                this.a.a(this.b);
            } else {
                if (this.c == var3) {
                    this.b = this.a.b();
                }

                this.a.a((String) this.e.v.b().b().get(var2));
                this.c = var2;
            }
        }
    }

    public void a(int var1, int var2, float var3) {
        this.a.f();
        super.a(var1, var2, var3);
    }

    public void a(String[] var1) {
        if (this.m) {
            this.o.clear();
            String[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                String var5 = var2[var4];
                if (var5.length() > 0) {
                    this.o.add(var5);
                }
            }

            if (this.o.size() > 0) {
                this.d = true;
                this.y_();
            }
        }

    }

    public boolean f() {
        return false;
    }
}