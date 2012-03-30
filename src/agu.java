import org.lwjgl.opengl.GL11;

public class agu extends oo {

    private final nl a;
    private final int b;
    private final int c;
    private final int d;
    private final int e;
    private String f = "";
    private int h = 32;
    private int i;
    private boolean j = true;
    private boolean k = true;
    private boolean l = false;
    private boolean m = true;
    private int n = 0;
    private int o = 0;
    private int p = 0;
    private int q = 14737632;
    private int r = 7368816;


    public agu(nl var1, int var2, int var3, int var4, int var5) {
        this.a = var1;
        this.b = var2;
        this.c = var3;
        this.d = var4;
        this.e = var5;
    }

    public void a() {
        ++this.i;
    }

    public void a(String var1) {
        if(var1.length() > this.h) {
            this.f = var1.substring(0, this.h);
        } else {
            this.f = var1;
        }

        this.e();
    }

    public String b() {
        return this.f;
    }

    public String c() {
        int var1 = this.o < this.p?this.o:this.p;
        int var2 = this.o < this.p?this.p:this.o;
        return this.f.substring(var1, var2);
    }

    public void b(String var1) {
        String var2 = "";
        int var3 = this.o < this.p?this.o:this.p;
        int var4 = this.o < this.p?this.p:this.o;
        int var5 = this.h - this.f.length() - (var3 - this.p);
        boolean var6 = false;
        if(this.f.length() > 0) {
            var2 = var2 + this.f.substring(0, var3);
        }

        int var7;
        if(var5 < var1.length()) {
            var2 = var2 + var1.substring(0, var5);
            var7 = var5;
        } else {
            var2 = var2 + var1;
            var7 = var1.length();
        }

        if(this.f.length() > 0 && var4 < this.f.length()) {
            var2 = var2 + this.f.substring(var4);
        }

        this.f = var2;
        this.d(var3 - this.p + var7);
    }

    public void a(int var1) {
        if(this.f.length() != 0) {
            if(this.p != this.o) {
                this.b("");
            } else {
                this.b(this.c(var1) - this.o);
            }
        }
    }

    public void b(int var1) {
        if(this.f.length() != 0) {
            if(this.p != this.o) {
                this.b("");
            } else {
                boolean var2 = var1 < 0;
                int var3 = var2?this.o + var1:this.o;
                int var4 = var2?this.o:this.o + var1;
                String var5 = "";
                if(var3 >= 0) {
                    var5 = this.f.substring(0, var3);
                }

                if(var4 < this.f.length()) {
                    var5 = var5 + this.f.substring(var4);
                }

                this.f = var5;
                if(var2) {
                    this.d(var1);
                }

            }
        }
    }

    public int c(int var1) {
        return this.a(var1, this.h());
    }

    public int a(int var1, int var2) {
        int var3 = var2;
        boolean var4 = var1 < 0;
        int var5 = Math.abs(var1);

        for(int var6 = 0; var6 < var5; ++var6) {
            if(var4) {
                while(var3 > 0 && this.f.charAt(var3 - 1) == 32) {
                    --var3;
                }

                while(var3 > 0 && this.f.charAt(var3 - 1) != 32) {
                    --var3;
                }
            } else {
                int var7 = this.f.length();
                var3 = this.f.indexOf(32, var3);
                if(var3 == -1) {
                    var3 = var7;
                } else {
                    while(var3 < var7 && this.f.charAt(var3) == 32) {
                        ++var3;
                    }
                }
            }
        }

        return var3;
    }

    public void d(int var1) {
        this.e(this.p + var1);
    }

    public void e(int var1) {
        this.o = var1;
        int var2 = this.f.length();
        if(this.o < 0) {
            this.o = 0;
        }

        if(this.o > var2) {
            this.o = var2;
        }

        this.g(this.o);
        if(this.n > var2) {
            this.n = var2;
        }

    }

    public void d() {
        this.e(0);
    }

    public void e() {
        this.e(this.f.length());
    }

    public boolean a(char var1, int var2) {
        if(this.m && this.l) {
            if(var1 == 1) {
                this.e();
                this.g(0);
                return true;
            } else if(var1 == 3) {
                vp.a(this.c());
                return true;
            } else if(var1 == 22) {
                this.b(vp.h());
                return true;
            } else if(var1 == 24) {
                vp.a(this.c());
                this.b("");
                return true;
            } else if(var2 == 203) {
                if(vp.m()) {
                    if(vp.l()) {
                        this.g(this.a((int)-1, this.k()));
                    } else {
                        this.g(this.k() - 1);
                    }
                } else if(vp.l()) {
                    this.e(this.c(-1));
                } else {
                    this.d(-1);
                }

                return true;
            } else if(var2 == 205) {
                if(vp.m()) {
                    if(vp.l()) {
                        this.g(this.a((int)1, this.k()));
                    } else {
                        this.g(this.k() + 1);
                    }
                } else if(vp.l()) {
                    this.e(this.c(1));
                } else {
                    this.d(1);
                }

                return true;
            } else if(var2 == 14) {
                if(vp.l()) {
                    this.a(-1);
                } else {
                    this.b(-1);
                }

                return true;
            } else if(var2 == 211) {
                if(vp.l()) {
                    this.a(1);
                } else {
                    this.b(1);
                }

                return true;
            } else if(var2 == 199) {
                if(vp.m()) {
                    this.g(0);
                } else {
                    this.d();
                }

                return true;
            } else if(var2 == 207) {
                if(vp.m()) {
                    this.g(this.f.length());
                } else {
                    this.e();
                }

                return true;
            } else if(xn.a(var1)) {
                this.b(Character.toString(var1));
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }
    }

    public void a(int var1, int var2, int var3) {
        boolean var4 = var1 >= this.b && var1 < this.b + this.d && var2 >= this.c && var2 < this.c + this.e;
        if(this.k) {
            this.b(this.m && var4);
        }

        if(this.l && var3 == 0) {
            int var5 = var1 - this.b;
            int var10000 = var2 - this.c;
            if(this.j) {
                var5 -= 4;
            }

            String var7 = this.a.a(this.f.substring(this.n), this.l());
            this.e(this.a.a(var7, var5).length() + this.n);
        }

    }

    public void f() {
        String cm = "";
        int len = 0;
        int prefix = 0;
        if(ImprovedChat.Current.ChatMode!=null) { cm = ImprovedChat.Current.ChatMode+" " ; }
        if(cm!=null) { len = ImprovedChat.getStringWidth_stripColor(cm); }
        len = ImprovedChat.getStringWidth_stripColor(cm);

        if(this.i()) {
            a(this.b - 1, this.c - 1, this.b + this.d + 1, this.c + this.e + 1, -6250336);
            a(this.b, this.c, this.b + this.d, this.c + this.e, -16777216);
        }

        int var1 = this.m?this.q:this.r;
        int var2 = this.o - this.n;
        int var3 = this.p - this.n;

        String var4 = this.a.a(this.f.substring(this.n), this.l());
        boolean var5 = var2 >= 0 && var2 <= var4.length();
        boolean var6 = this.l && this.i / 6 % 2 == 0 && var5;
        int var7 = this.j?this.b + 4:this.b;
        int var8 = this.j?this.c + (this.e - 8) / 2:this.c;
        int var9 = var7;

        // System.out.println("var7 : "+var7 + " var8 : "+var8+" var9 : "+var9);
        if(var3 > var4.length()) {
            var3 = var4.length();
        }

        if(cm!=null) {
            this.a.a(cm, var9, var8, var1);
            var9 += len;
        }

        if(var4.length() > 0) {
            String var10 = var5?var4.substring(0, var2):var4;
            var7+=len;
            var10 = ImprovedChat.replaceColors(var10);
            var9 = this.a.a(var10, var7, var8, var1);
        }

        boolean var13 = this.o < this.f.length() || this.f.length() >= this.g();
        int var11 = var9;
        if(!var5) {
            var11 = var2 > 0?var7 + this.d:var7;
        } else if(var13) {
            var11 = var9 - 1;
            --var9;
        }

        if(var4.length() > 0 && var5 && var2 < var4.length()) {
            this.a.a(var4.substring(var2), var9, var8, var1);
        }

        if(var6) {
            if(var13) {
                oo.a(var11, var8 - 1, var11 + 1, var8 + 1 + this.a.b, -3092272);
            } else {
                this.a.a("_", var11, var8, var1);
            }
        }

        if(var3 != var2) {
            String line = var4.substring(0, var3);
            line = ImprovedChat.stripColors(line);
            int var12 = var7 + this.a.a(line);
            this.c(var11, var8 - 1, var12 - 1, var8 + 1 + this.a.b);
        }

    }

    private void c(int var1, int var2, int var3, int var4) {
        int var5;
        if(var1 < var3) {
            var5 = var1;
            var1 = var3;
            var3 = var5;
        }

        if(var2 < var4) {
            var5 = var2;
            var2 = var4;
            var4 = var5;
        }

        adz var6 = adz.a;
        GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
        GL11.glDisable(3553);
        GL11.glEnable(3058);
        GL11.glLogicOp(5387);
        var6.b();
        var6.a((double)var1, (double)var4, 0.0D);
        var6.a((double)var3, (double)var4, 0.0D);
        var6.a((double)var3, (double)var2, 0.0D);
        var6.a((double)var1, (double)var2, 0.0D);
        var6.a();
        GL11.glDisable(3058);
        GL11.glEnable(3553);
    }

    public void f(int var1) {
        this.h = var1;
        if(this.f.length() > var1) {
            this.f = this.f.substring(0, var1);
        }

    }

    public int g() {
        return this.h;
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

    public void b(boolean var1) {
        if(var1 && !this.l) {
            this.i = 0;
        }

        this.l = var1;
    }

    public boolean j() {
        return this.l;
    }

    public int k() {
        return this.p;
    }

    public int l() {
        return this.i()?this.d - 8:this.d;
    }

    public void g(int var1) {
        int var2 = this.f.length();
        if(var1 > var2) {
            var1 = var2;
        }

        if(var1 < 0) {
            var1 = 0;
        }

        this.p = var1;
        if(this.a != null) {
            String var3 = this.a.a(this.f.substring(this.n), this.l());
            int var4 = var3.length() + this.n;
            if(var1 > var4) {
                this.n += var1 - var4;
            } else if(var1 <= this.n) {
                this.n -= this.n - var1;
            }
        }

    }

    public void c(boolean var1) {
        this.k = var1;
    }
}