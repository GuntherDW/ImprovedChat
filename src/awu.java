import net.minecraft.client.Minecraft;

public class awu extends asw {

    private awr a;
    private boolean b = false;


    public awu(Minecraft var1, axg var2) {
        this.e = var1;
        axf var3 = axf.a(var2.b);
        var1.a((awz) null);
        var1.a(var2);
        this.a(var3.a(), var3.b());
    }

    public awu(Minecraft var1, String var2, int var3) {
        this.e = var1;
        var1.a((awz) null);
        this.a(var2, var3);
    }

    private void a(String var1, int var2) {
        System.out.println("Connecting to " + var1 + ", " + var2);
        System.out.println("[ImprovedChat] Loading settings for " + var1 + ":" + var2);
        ImprovedChat.setCurrent(var1 + "_" + var2);
        (new awv(this, var1, var2)).start();
    }

    public void c() {
        if (this.a != null) {
            this.a.d();
        }

    }

    protected void a(char var1, int var2) {
    }

    public void A_() {
        be var1 = be.a();
        this.h.clear();
        this.h.add(new arl(0, this.f / 2 - 100, this.g / 4 + 120 + 12, var1.b("gui.cancel")));
    }

    protected void a(arl var1) {
        if (var1.f == 0) {
            this.b = true;
            if (this.a != null) {
                this.a.e();
            }

            this.e.a((asw) (new bcz()));
        }

    }

    public void a(int var1, int var2, float var3) {
        this.z_();
        be var4 = be.a();
        if (this.a == null) {
            this.a(this.k, var4.b("connect.connecting"), this.f / 2, this.g / 2 - 50, 16777215);
            this.a(this.k, "", this.f / 2, this.g / 2 - 10, 16777215);
        } else {
            this.a(this.k, var4.b("connect.authorizing"), this.f / 2, this.g / 2 - 50, 16777215);
            this.a(this.k, this.a.a, this.f / 2, this.g / 2 - 10, 16777215);
        }

        super.a(var1, var2, var3);
    }

    static awr a(awu var0, awr var1) {
        return var0.a = var1;
    }

    static Minecraft a(awu var0) {
        return var0.e;
    }

    static boolean b(awu var0) {
        return var0.b;
    }

    static Minecraft c(awu var0) {
        return var0.e;
    }

    static awr d(awu var0) {
        return var0.a;
    }

    static Minecraft e(awu var0) {
        return var0.e;
    }

    static Minecraft f(awu var0) {
        return var0.e;
    }

    static Minecraft g(awu var0) {
        return var0.e;
    }
}
