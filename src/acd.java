
public class acd extends xe {

    private abp a;
    private int b = 0;


    public acd(abp var1) {
        this.a = var1;
        ImprovedChat.setWorld();
    }

    protected void a(char var1, int var2) {}

    public void a() {
        this.o.clear();
    }

    public void s_() {
        ++this.b;
        if(this.b % 20 == 0) {
            this.a.c(new wf());
        }

        if(this.a != null) {
            this.a.b();
        }

    }

    protected void a(ct var1) {}

    public void a(int var1, int var2, float var3) {
        this.b(0);
        qp var4 = qp.a();
        this.a(this.q, var4.a("multiplayer.downloadingTerrain"), this.m / 2, this.n / 2 - 50, 16777215);
        super.a(var1, var2, var3);
    }
}