import net.minecraft.client.Minecraft;

public class asy extends apn {

    private asv a;
    private boolean b = false;


    public asy(Minecraft var1, atk var2) {
        this.e = var1;
        atj var3 = atj.a(var2.b);
        var1.a((atd)null);
        var1.a(var2);
        this.a(var3.a(), var3.b());
    }

    public asy(Minecraft var1, String var2, int var3) {
        this.e = var1;
        var1.a((atd)null);
        this.a(var2, var3);
    }

    private void a(String var1, int var2) {
        System.out.println("Connecting to " + var1 + ", " + var2);
        System.out.println("[ImprovedChat] Loading settings for " + var1 + ":" + var2);
        ImprovedChat.setCurrent(var1 + "_" + var2);
        (new asz(this, var1, var2)).start();
    }

    public void c() {
        if(this.a != null) {
            this.a.d();
        }

    }

    protected void a(char var1, int var2) {}

    public void w_() {
        ak var1 = ak.a();
        this.h.clear();
        this.h.add(new aoh(0, this.f / 2 - 100, this.g / 4 + 120 + 12, var1.b("gui.cancel")));
    }

    protected void a(aoh var1) {
        if(var1.f == 0) {
            this.b = true;
            if(this.a != null) {
                this.a.e();
            }

            this.e.a((apn)(new ays()));
        }

    }

    public void a(int var1, int var2, float var3) {
        this.v_();
        ak var4 = ak.a();
        if(this.a == null) {
            this.a(this.k, var4.b("connect.connecting"), this.f / 2, this.g / 2 - 50, 16777215);
            this.a(this.k, "", this.f / 2, this.g / 2 - 10, 16777215);
        } else {
            this.a(this.k, var4.b("connect.authorizing"), this.f / 2, this.g / 2 - 50, 16777215);
            this.a(this.k, this.a.a, this.f / 2, this.g / 2 - 10, 16777215);
        }

        super.a(var1, var2, var3);
    }

    static asv a(asy var0, asv var1) {
        return var0.a = var1;
    }

    static Minecraft a(asy var0) {
        return var0.e;
    }

    static boolean b(asy var0) {
        return var0.b;
    }

    static Minecraft c(asy var0) {
        return var0.e;
    }

    static asv d(asy var0) {
        return var0.a;
    }

    static Minecraft e(asy var0) {
        return var0.e;
    }

    static Minecraft f(asy var0) {
        return var0.e;
    }

    static Minecraft g(asy var0) {
        return var0.e;
    }
}