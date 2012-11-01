import org.lwjgl.input.Keyboard;
import org.lwjgl.opengl.GL11;

import java.util.Iterator;
import java.util.List;

public class ary extends asd {

    public final asb fontrenderer; // ImprovedChat private -> public
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private String f = "";
    private int g = 32;
    public int h; // ImprovedChat private -> public
    private boolean j = true;
    private boolean k = true;
    private boolean var_l = false;
    private boolean var_m = true;
    private int n = 0;
    public int o = 0; // ImprovedChat private -> public
    private int p = 0;
    private int q = 14737632;
    private int r = 7368816;
    private boolean s = true;


    public ary(asb var1, int var2, int var3, int var4, int var5) {
        this.fontrenderer = var1;
        this.b = var2;
        this.c = var3;
        this.d = var4;
        this.e = var5;
    }

    public void a() {
        ++this.h;
    }

    public void h(int var1) {
        this.r = var1;
    }

    public void a(String var1) {
        if (var1.length() > this.g) {
            this.f = var1.substring(0, this.g);
        } else {
            this.f = var1;
        }

        this.e();
    }

    public String b() {
        return this.f;
    }

    public void c(boolean var1) {
        this.var_m = var1;
    }

    public String c() {
        int var1 = this.o < this.p ? this.o : this.p;
        int var2 = this.o < this.p ? this.p : this.o;
        return this.f.substring(var1, var2);
    }

    public void b(String var1) {
        String var2 = "";
        String var3 = m.a(var1);
        int var4 = this.o < this.p ? this.o : this.p;
        int var5 = this.o < this.p ? this.p : this.o;
        int var6 = this.g - this.f.length() - (var4 - this.p);
        boolean var7 = false;
        if (this.f.length() > 0) {
            var2 = var2 + this.f.substring(0, var4);
        }

        int var8;
        if (var6 < var3.length()) {
            var2 = var2 + var3.substring(0, var6);
            var8 = var6;
        } else {
            var2 = var2 + var3;
            var8 = var3.length();
        }

        if (this.f.length() > 0 && var5 < this.f.length()) {
            var2 = var2 + this.f.substring(var5);
        }

        this.f = var2;
        this.d(var4 - this.p + var8);
    }

    public void a(int var1) {
        if (this.f.length() != 0) {
            if (this.p != this.o) {
                this.b("");
            } else {
                this.b(this.c(var1) - this.o);
            }
        }
    }

    public void b(int var1) {
        if (this.f.length() != 0) {
            if (this.p != this.o) {
                this.b("");
            } else {
                boolean var2 = var1 < 0;
                int var3 = var2 ? this.o + var1 : this.o;
                int var4 = var2 ? this.o : this.o + var1;
                String var5 = "";
                if (var3 >= 0) {
                    var5 = this.f.substring(0, var3);
                }

                if (var4 < this.f.length()) {
                    var5 = var5 + this.f.substring(var4);
                }

                this.f = var5;
                if (var2) {
                    this.d(var1);
                }

            }
        }
    }

    public int c(int var1) {
        return this.a(var1, this.h());
    }

    public int a(int var1, int var2) {
        return this.a(var1, this.h(), true);
    }

    public int a(int var1, int var2, boolean var3) {
        int var4 = var2;
        boolean var5 = var1 < 0;
        int var6 = Math.abs(var1);

        for (int var7 = 0; var7 < var6; ++var7) {
            if (var5) {
                while (var3 && var4 > 0 && this.f.charAt(var4 - 1) == 32) {
                    --var4;
                }

                while (var4 > 0 && this.f.charAt(var4 - 1) != 32) {
                    --var4;
                }
            } else {
                int var8 = this.f.length();
                var4 = this.f.indexOf(32, var4);
                if (var4 == -1) {
                    var4 = var8;
                } else {
                    while (var3 && var4 < var8 && this.f.charAt(var4) == 32) {
                        ++var4;
                    }
                }
            }
        }

        return var4;
    }

    public void d(int var1) {
        this.e(this.p + var1);
    }

    public void e(int var1) {
        this.o = var1;
        int var2 = this.f.length();
        if (this.o < 0) {
            this.o = 0;
        }

        if (this.o > var2) {
            this.o = var2;
        }

        this.i(this.o);
    }

    public void d() {
        this.e(0);
    }

    public void e() {
        this.e(this.f.length());
    }

    public boolean a(char var1, int var2) {
        if (this.var_m && this.var_l) {
            switch (var1) {
                case 1:
                    this.e();
                    this.i(0);
                    return true;
                case 3:
                    asw.d(this.c());
                    return true;
                case 22:
                    this.b(asw.l());
                    return true;
                case 24:
                    asw.d(this.c());
                    this.b("");
                    return true;
                default:
                    switch (var2) {
                        case Keyboard.KEY_BACK:
                            if (asw.o()) {
                                this.a(-1);
                            } else {
                                this.b(-1);
                            }

                            return true;
                        case Keyboard.KEY_HOME:
                            if (asw.p()) {
                                this.i(0);
                            } else {
                                this.d();
                            }

                            return true;
                        case Keyboard.KEY_LEFT:
                            if (asw.p()) {
                                if (asw.o()) {
                                    this.i(this.a((int) -1, this.n()));
                                } else {
                                    this.i(this.n() - 1);
                                }
                            } else if (asw.o()) {
                                this.e(this.c(-1));
                            } else {
                                this.d(-1);
                            }

                            return true;
                        case Keyboard.KEY_RIGHT:
                            if (asw.p()) {
                                if (asw.o()) {
                                    this.i(this.a((int) 1, this.n()));
                                } else {
                                    this.i(this.n() + 1);
                                }
                            } else if (asw.o()) {
                                this.e(this.c(1));
                            } else {
                                this.d(1);
                            }

                            return true;
                        case Keyboard.KEY_END:
                            if (asw.p()) {
                                this.i(this.f.length());
                            } else {
                                this.e();
                            }

                            return true;
                        case Keyboard.KEY_DELETE:
                            if (asw.o()) {
                                this.a(1);
                            } else {
                                this.b(1);
                            }

                            return true;
                        default:
                            if (m.a(var1)) {
                                this.b(Character.toString(var1));
                                return true;
                            } else {
                                return false;
                            }
                    }
            }
        } else {
            return false;
        }
    }

    public void a(int var1, int var2, int var3) {
        boolean var4 = var1 >= this.b && var1 < this.b + this.d && var2 >= this.c && var2 < this.c + this.e;
        if (this.k) {
            this.b(this.var_m && var4);
        }

        if (this.var_l && var3 == 0) {
            int var5 = var1 - this.b;
            if (this.j) {
                var5 -= 4;
            }

            String var6 = this.fontrenderer.a(this.f.substring(this.n), this.o());
            this.e(this.fontrenderer.a(var6, var5).length() + this.n);
        }

    }

    public void f() {
        if (this.q()) {

            String cm = null;
            if (ImprovedChat.getCurrentServer() != null && ImprovedChat.getCurrentServer().ChatMode != null)
                cm = ImprovedChat.getCurrentServer().ChatMode + " ";

            int len = cm != null && !this.j ? fontrenderer.a(ImprovedChat.stripColors(cm)) : 0;

            if (this.i()) {
                a(this.b - 1, this.c - 1, this.b + this.d + 1, this.c + this.e + 1, 0xffa0a0a0);
                a(this.b, this.c, this.b + this.d, this.c + this.e, 0xff000000);
            }

            int prefix = 0;
            StringBuilder sb = new StringBuilder();

            int bg = ((ImprovedChat.bgOpacity & 255) << 24) + ImprovedChat.bgColor;

            int var1 = this.var_m ? this.q : this.r;
            int var2 = this.o - this.n;
            int var3 = this.p - this.n;
            String var4 = this.f;
            boolean var5 = var2 >= 0 && var2 <= var4.length();
            boolean var6 = this.var_l && this.h / 6 % 2 == 0 && var5;
            int var7 = this.j ? this.b + 4 : this.b;
            int var8 = this.j ? this.c + (this.e - 8) / 2 : this.c;
            int var9 = var7;
            var7 += len;

            if (var3 > var4.length()) {
                var3 = var4.length();
            }

            char carot = var6 ? '|' : ':';

            String var10 = null;

            if (var4.length() > 0) {
                var10 = var5 ? var4.substring(0, var2) : var4;
                var10 = ImprovedChat.replaceColors(var10);
                sb.append(var10);
            }

            boolean var13 = this.o < this.f.length() || this.f.length() >= this.g();

            if (var4.length() > 0 && var5 && var2 < var4.length()) {
                Character lastColor = ImprovedChat.getLastColor(var10);
                String afterString = carot + var4.substring(var2);
                afterString = ImprovedChat.replaceColors(afterString);
                if (lastColor != null) sb.append("§").append(lastColor);
                sb.append(afterString);
                // this.a.a((lastColor!=null?"§"+lastColor:"")+afterString, var9, var8, var1);
            }

            String toString = sb.toString();

            int maxLineLength = ImprovedChat.getMaxChatPacketLength();
            if (toString.length() >= maxLineLength) {
                String toString_temp = toString;
                toString = toString_temp.substring(0, maxLineLength) + "§4" + toString_temp.substring(maxLineLength);
            }
            int maxLineLength_2 = (maxLineLength * 2) + 2;
            if (toString.length() >= maxLineLength_2) {
                String toString_temp = toString;
                toString = toString_temp.substring(0, maxLineLength_2) + "§e" + toString_temp.substring(maxLineLength_2);
            }

            if (!var13)
                toString += carot;


            List<String> vl = ImprovedChat.processDisplay(toString + " ");
            Iterator<String> var12 = vl.iterator();
            int size = vl.size();

            int height = this.j ? this.c + (this.e - 8) / 2 : (this.c + 12) - 4 - (size <= 0 ? 1 : size) * 12;

            if (!this.i()) this.a(this.b - 1, height, this.b + this.d - 4, (this.c + 12) - 2, bg);

            while (var12.hasNext()) {
                String wheel = var12.next();

                if (!this.j)
                    this.fontrenderer.a(cm, this.j ? this.b + 4 : this.b, (this.c + 12) - 12 * size, var1);// 14737632);
                this.fontrenderer.a(wheel, var7, this.j ? var8 + this.fontrenderer.b - 10 : (this.c + 12) - 12 * size, var1);// 14737632);

                size--;
            }

        }
    }

    private void c(int var1, int var2, int var3, int var4) {
        int var5;
        if (var1 < var3) {
            var5 = var1;
            var1 = var3;
            var3 = var5;
        }

        if (var2 < var4) {
            var5 = var2;
            var2 = var4;
            var4 = var5;
        }

        azb var6 = azb.a;
        GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_COLOR_LOGIC_OP);
        GL11.glLogicOp(GL11.GL_OR_REVERSE);
        var6.b();
        var6.a((double) var1, (double) var4, 0.0D);
        var6.a((double) var3, (double) var4, 0.0D);
        var6.a((double) var3, (double) var2, 0.0D);
        var6.a((double) var1, (double) var2, 0.0D);
        var6.a();
        GL11.glDisable(GL11.GL_COLOR_LOGIC_OP);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    public void f(int var1) {
        this.g = var1;
        if (this.f.length() > var1) {
            this.f = this.f.substring(0, var1);
        }

    }

    public int g() {
        return this.g;
    }

    public int h() {
        return this.o;
    }

    public boolean i() {
        return this.j;
    }

    public void a(boolean var1) {
        this.j = var1;
    }

    public void g(int var1) {
        this.q = var1;
    }

    public void b(boolean var1) {
        if (var1 && !this.var_l) {
            this.h = 0;
        }

        this.var_l = var1;
    }

    public boolean l() {
        return this.var_l;
    }

    public int n() {
        return this.p;
    }

    public int o() {
        return this.i() ? this.d - 8 : this.d;
    }

    public void i(int var1) {
        int var2 = this.f.length();
        if (var1 > var2) {
            var1 = var2;
        }

        if (var1 < 0) {
            var1 = 0;
        }

        this.p = var1;
        if (this.fontrenderer != null) {
            if (this.n != 0) {
                this.n = 0;
            }
        }

    }

    public void d(boolean var1) {
        this.k = var1;
    }

    public boolean q() {
        return this.s;
    }

    public void e(boolean var1) {
        this.s = var1;
    }
}