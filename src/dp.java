
public class dp extends qr {

    private wt a;
    private int b = 0;


    public dp(wt var1) {
        this.a = var1;
        ImprovedChat.setWorld();
    }

    protected void a(char var1, int var2) {}

    public void a() {
        this.o.clear();
    }

    public void p_() {
        ++this.b;
        if(this.b % 20 == 0) {
            this.a.c(new wh());
        }

        if(this.a != null) {
            this.a.b();
        }

    }

    protected void a(vj var1) {}

    public void a(int var1, int var2, float var3) {
        this.e(0);
        wv var4 = wv.a();
        this.a(this.q, var4.a("multiplayer.downloadingTerrain"), this.m / 2, this.n / 2 - 50, 16777215);
        super.a(var1, var2, var3);
    }
}