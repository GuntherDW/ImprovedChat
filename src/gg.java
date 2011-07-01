
public class gg extends da {

    private nb a;
    private int i = 0;


    public gg(nb var1) {
        this.a = var1;
        ImprovedChat.setWorld();
    }

    protected void a(char var1, int var2) {}

    public void b() {
        this.e.clear();
    }

    public void a() {
        ++this.i;
        if(this.i % 20 == 0) {
            this.a.b(new lz());
        }

        if(this.a != null) {
            this.a.a();
        }

    }

    protected void a(ke var1) {}

    public void a(int var1, int var2, float var3) {
        this.b(0);
        nh var4 = nh.a();
        this.a(this.g, var4.a("multiplayer.downloadingTerrain"), this.c / 2, this.d / 2 - 50, 16777215);
        super.a(var1, var2, var3);
    }
}