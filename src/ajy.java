import net.minecraft.client.Minecraft;

public class ajy extends vp {

    private adl a;
    private boolean b = false;


    public ajy(Minecraft var1, String var2, int var3) {
        System.out.println("Connecting to " + var2 + ", " + var3);
        System.out.println("[ImprovedChat] Loading settings for "+var2+":"+var3);
        ImprovedChat.setCurrent(var2+"_"+var3);
        var1.a((xd)null);
        (new ala(this, var1, var2, var3)).start();
    }

    @Override
    public void a() {
        if(this.a != null) {
            this.a.b();
        }

    }

    @Override
    protected void a(char var1, int var2) {}

    @Override
    public void c() {
        adn var1 = adn.a();
        this.s.clear();
        this.s.add(new abp(0, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.b("gui.cancel")));
    }

    @Override
    protected void a(abp var1) {
        if(var1.f == 0) {
            this.b = true;
            if(this.a != null) {
                this.a.c();
            }

            this.p.a((vp)(new xt()));
        }

    }

    @Override
    public void a(int var1, int var2, float var3) {
        this.k();
        adn var4 = adn.a();
        if(this.a == null) {
            this.a(this.u, var4.b("connect.connecting"), this.q / 2, this.r / 2 - 50, 16777215);
            this.a(this.u, "", this.q / 2, this.r / 2 - 10, 16777215);
        } else {
            this.a(this.u, var4.b("connect.authorizing"), this.q / 2, this.r / 2 - 50, 16777215);
            this.a(this.u, this.a.a, this.q / 2, this.r / 2 - 10, 16777215);
        }

        super.a(var1, var2, var3);
    }

    public static adl a(ajy var0, adl var1) {
        return var0.a = var1;
    }

    public static boolean a(ajy var0) {
        return var0.b;
    }

    public static adl b(ajy var0) {
        return var0.a;
    }
}