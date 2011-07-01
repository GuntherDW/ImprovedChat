import net.minecraft.client.Minecraft;
import org.lwjgl.input.Keyboard;

public class tk extends dc {

    public nb bN;
    private int bO = 0;
    private boolean bP = false;
    private double bQ;
    private double bR;
    private double bS;
    private double bT;
    private float bU;
    private float bV;
    private boolean bW = false;
    private boolean bX = false;
    private int bY = 0;


    public tk(Minecraft var1, fd var2, gr var3, nb var4) {
        super(var1, var2, var3, 0);
        this.bN = var4;
    }

    public void a(int i, boolean flag)
    {
        super.a(i, flag);
        if(this.b.l()) {
            if(!flag) {
                ImprovedChat.keyPressed(i);
            } else if((Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157)) && Keyboard.isKeyDown(15)) {
                if(Keyboard.isKeyDown(42)) {
                    ImprovedChat.Current.previosTab();
                } else {
                    ImprovedChat.Current.nextTab();
                }
            }
        }
    }

    public boolean a(sn var1, int var2) {
        return false;
    }

    public void c(int var1) {}

    public void w_() {
        if(this.aI.i(in.b(this.aM), 64, in.b(this.aO))) {
            super.w_();
            this.am();
        }
    }

    public void am() {
        if(this.bO++ == 20) {
            this.an();
            this.bO = 0;
        }

        boolean var1 = this.t();
        if(var1 != this.bX) {
            if(var1) {
                this.bN.b(new ts(this, 1));
            } else {
                this.bN.b(new ts(this, 2));
            }

            this.bX = var1;
        }

        double var2 = this.aM - this.bQ;
        double var4 = this.aW.b - this.bR;
        double var6 = this.aN - this.bS;
        double var8 = this.aO - this.bT;
        double var10 = (double)(this.aS - this.bU);
        double var12 = (double)(this.aT - this.bV);
        boolean var14 = var4 != 0.0D || var6 != 0.0D || var2 != 0.0D || var8 != 0.0D;
        boolean var15 = var10 != 0.0D || var12 != 0.0D;
        if(this.aH != null) {
            if(var15) {
                this.bN.b(new af(this.aP, -999.0D, -999.0D, this.aR, this.aX));
            } else {
                this.bN.b(new ev(this.aP, -999.0D, -999.0D, this.aR, this.aS, this.aT, this.aX));
            }

            var14 = false;
        } else if(var14 && var15) {
            this.bN.b(new ev(this.aM, this.aW.b, this.aN, this.aO, this.aS, this.aT, this.aX));
            this.bY = 0;
        } else if(var14) {
            this.bN.b(new af(this.aM, this.aW.b, this.aN, this.aO, this.aX));
            this.bY = 0;
        } else if(var15) {
            this.bN.b(new vh(this.aS, this.aT, this.aX));
            this.bY = 0;
        } else {
            this.bN.b(new ig(this.aX));
            if(this.bW == this.aX && this.bY <= 200) {
                ++this.bY;
            } else {
                this.bY = 0;
            }
        }

        this.bW = this.aX;
        if(var14) {
            this.bQ = this.aM;
            this.bR = this.aW.b;
            this.bS = this.aN;
            this.bT = this.aO;
        }

        if(var15) {
            this.bU = this.aS;
            this.bV = this.aT;
        }

    }

    public void D() {
        this.bN.b(new jv(4, 0, 0, 0, 0));
    }

    private void an() {}

    protected void a(hl var1) {}

    public void a(String var1) {
        this.bN.b(new pe(var1));
    }

    public void J() {
        super.J();
        this.bN.b(new nm(this, 1));
    }

    public void p_() {
        this.an();
        this.bN.b(new ox((byte)this.m));
    }

    protected void b(int var1) {
        this.Y -= var1;
    }

    public void r() {
        this.bN.b(new mn(this.e.f));
        this.c.b((iz)null);
        super.r();
    }

    public void d_(int var1) {
        if(this.bP) {
            super.d_(var1);
        } else {
            this.Y = var1;
            this.bP = true;
        }

    }

    public void a(vr var1, int var2) {
        if(var1 != null) {
            if(var1.g) {
                super.a(var1, var2);
            }

        }
    }

    public void b(vr var1, int var2) {
        if(var1 != null) {
            if(!var1.g) {
                super.a(var1, var2);
            }

        }
    }
}
