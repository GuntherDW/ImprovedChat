import net.minecraft.client.Minecraft;

public class ayc extends aue {

    private axz a;
    private boolean b = false;


    public ayc(Minecraft var1, ayo var2) {
        this.f = var1;
        ayn var3 = ayn.a(var2.b);
        var1.a((ayh) null);
        var1.a(var2);
        this.a(var3.a(), var3.b());
    }

    public ayc(Minecraft var1, String var2, int var3) {
        this.f = var1;
        var1.a((ayh) null);
        this.a(var2, var3);
    }

    private void a(String var1, int var2) {
        System.out.println("Connecting to " + var1 + ", " + var2);
        System.out.println("[ImprovedChat] Loading settings for " + var1 + ":" + var2);
        ImprovedChat.setCurrent(var1 + "_" + var2);
        (new ayd(this, var1, var2)).start();
    }

    public void c() {
        if (this.a != null) {
            this.a.d();
        }

    }

    protected void a(char var1, int var2) {
    }

    public void A_() {
        bn var1 = bn.a();
        this.i.clear();
        this.i.add(new ast(0, this.g / 2 - 100, this.h / 4 + 120 + 12, var1.b("gui.cancel")));
    }

    protected void a(ast var1) {
        if (var1.f == 0) {
            this.b = true;
            if (this.a != null) {
                this.a.e();
            }

            this.f.a((aue) (new bem()));
        }

    }

    public void a(int var1, int var2, float var3) {
        this.z_();
        bn var4 = bn.a();
        if (this.a == null) {
            this.a(this.l, var4.b("connect.connecting"), this.g / 2, this.h / 2 - 50, 16777215);
            this.a(this.l, "", this.g / 2, this.h / 2 - 10, 16777215);
        } else {
            this.a(this.l, var4.b("connect.authorizing"), this.g / 2, this.h / 2 - 50, 16777215);
            this.a(this.l, this.a.a, this.g / 2, this.h / 2 - 10, 16777215);
        }

        super.a(var1, var2, var3);
    }

    static axz a(ayc var0, axz var1) {
        return var0.a = var1;
    }

    static Minecraft a(ayc var0) {
        return var0.f;
    }

    static boolean b(ayc var0) {
        return var0.b;
    }

    static Minecraft c(ayc var0) {
        return var0.f;
    }

    static axz d(ayc var0) {
        return var0.a;
    }

    static Minecraft e(ayc var0) {
        return var0.f;
    }

    static Minecraft f(ayc var0) {
        return var0.f;
    }

    static Minecraft g(ayc var0) {
        return var0.f;
    }
}
