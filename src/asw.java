import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;

public class asw extends aue {

    private String b = "";
    private int c = -1;
    private boolean d = false;
    private boolean n = false;
    private int o = 0;
    private List p = new ArrayList();
    private URI q = null;
    protected atg a;
    private String r = "";


    public asw() {
    }

    public asw(String var1) {
        this.r = var1;
    }

    public void A_() {
        Keyboard.enableRepeatEvents(true);
        this.c = this.f.v.b().b().size();
        this.a = new atg(this.l, 4, this.h - 12, this.g - 4, 12);
        this.a.f(ImprovedChat.chatLineMaxLength);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.r);
        this.a.d(false);
    }

    public void b() {
        Keyboard.enableRepeatEvents(false);
        this.f.v.b().c();
    }

    public void c() {
        this.a.a();
    }

    protected void a(char var1, int var2) {
        this.n = false;
        if (var2 == Keyboard.KEY_TAB) {
            this.y_();
        } else {
            this.d = false;
        }

        if (var2 == Keyboard.KEY_ESCAPE) {
            this.f.a((aue) null);
        } else if (var2 == Keyboard.KEY_RETURN || var2 == Keyboard.KEY_NUMPADENTER) {
            String var3 = this.a.b().trim();
            if(var3.length() > 0) {
                ImprovedChat.pastCommands.add(var3);
                ImprovedChat.process(var3);
                ImprovedChat.commandScroll = 0;
                ImprovedChat.currentTab().chatScroll = 0;
            }

            this.f.a((aue)null);
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
            this.f.v.b().b(ImprovedChat.scrollLines);
        } else if(var2 == Keyboard.KEY_NEXT) { // Page down
            this.f.v.b().b(-ImprovedChat.scrollLines);
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

            this.f.v.b().b(var1);
        }

    }

    protected void a(int var1, int var2, int var3) {
        if (var3 == 0 && this.f.y.p) {
            atm var4 = this.f.v.b().a(Mouse.getX(), Mouse.getY());
            if (var4 != null) {
                URI var5 = var4.g();
                if (var5 != null) {
                    if (this.f.y.q) {
                        this.q = var5;
                        this.f.a((aue) (new asx(this, this, var4.f(), 0, var4)));
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
                this.a(this.q);
            }

            this.q = null;
            this.f.a((aue) this);
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
            if (this.o >= this.p.size()) {
                this.o = 0;
            }
        } else {
            int var1 = this.a.a(-1, this.a.h(), false);
            this.p.clear();
            this.o = 0;
            String var2 = this.a.b().substring(var1).toLowerCase();
            var3 = this.a.b().substring(0, this.a.h());
            this.a(var3, var2);
            if (this.p.isEmpty()) {
                return;
            }

            this.d = true;
            this.a.b(var1 - this.a.h());
        }

        if (this.p.size() > 1) {
            StringBuilder var4 = new StringBuilder();

            for (Iterator var5 = this.p.iterator(); var5.hasNext(); var4.append(var3)) {
                var3 = (String) var5.next();
                if (var4.length() > 0) {
                    var4.append(", ");
                }
            }

            this.f.v.b().a(var4.toString(), 1);
        }

        // this.a.b();
        // ah playerInfo = this.o.get(this.n++);
        String playerName = (String)this.p.get(this.o++);
        this.a.b(ImprovedChat.stripColors(playerName));
    }

    private void a(String var1, String var2) {
        if (var1.length() >= 1) {
            this.f.g.a.c(new cu(var1));
            this.n = true;
        }
    }

    public void a(int var1) {
        int var2 = this.c + var1;
        int var3 = this.f.v.b().b().size();
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

                this.a.a((String) this.f.v.b().b().get(var2));
                this.c = var2;
            }
        }
    }

    public void a(int var1, int var2, float var3) {
        this.a.f();
        super.a(var1, var2, var3);
    }

    public void a(String[] var1) {
        if (this.n) {
            this.p.clear();
            String[] var2 = var1;
            int var3 = var1.length;

            for (int var4 = 0; var4 < var3; ++var4) {
                String var5 = var2[var4];
                if (var5.length() > 0) {
                    this.p.add(var5);
                }
            }

            if (this.p.size() > 0) {
                this.d = true;
                this.y_();
            }
        }

    }

    public boolean f() {
        return false;
    }
}