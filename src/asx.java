import net.minecraft.client.Minecraft;

public class asx extends apm {

    private asu a;
    private boolean b = false;


    public asx(Minecraft var1, atj var2) {
        this.e = var1;
        ati var3 = ati.a(var2.b);
        var1.a((atc)null);
        var1.a(var2);
        this.a(var3.a(), var3.b());
    }

    public asx(Minecraft var1, String var2, int var3) {
        this.e = var1;
        var1.a((atc)null);
        this.a(var2, var3);
    }

    private void a(String var1, int var2) {
        System.out.println("Connecting to " + var1 + ", " + var2);
        System.out.println("[ImprovedChat] Loading settings for " + var1 + ":" + var2);
        ImprovedChat.setCurrent(var1 + "_" + var2);
        (new asy(this, var1, var2)).start();
    }

    @Override
    public void c() {
        if(this.a != null) {
            this.a.d();
        }

    }

    @Override
    protected void a(char var1, int var2) {}

    @Override
    public void w_() {
        ak var1 = ak.a();
        this.h.clear();
        this.h.add(new aog(0, this.f / 2 - 100, this.g / 4 + 120 + 12, var1.b("gui.cancel")));
    }

    @Override
    protected void a(aog var1) {
        if(var1.f == 0) {
            this.b = true;
            if(this.a != null) {
                this.a.e();
            }

            this.e.a((apm)(new ayr()));
        }

    }

    @Override
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

    static asu a(asx var0, asu var1) {
        return var0.a = var1;
    }

    static Minecraft a(asx var0) {
        return var0.e;
    }

    static boolean b(asx var0) {
        return var0.b;
    }

    static Minecraft c(asx var0) {
        return var0.e;
    }

    static asu d(asx var0) {
        return var0.a;
    }

    static Minecraft e(asx var0) {
        return var0.e;
    }

    static Minecraft f(asx var0) {
        return var0.e;
    }

    static Minecraft g(asx var0) {
        return var0.e;
    }
}