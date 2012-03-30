import java.awt.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class aiy extends oo {

    private static tw d = new tw();
    private List e = new ArrayList();
    private List f = new ArrayList();
    private Random h = new Random();
    private Minecraft i;
    public String a = null;
    public int j = 0; // ImprovedChat : private -> public
    private String k = "";
    private int l = 0;
    private boolean m = false;
    private int n = 0;
    private boolean o = false;
    public float b;
    float c = 1.0F;


    public aiy(Minecraft var1) {
        this.i = var1;
        ImprovedChat.init(var1);
    }

    public void a(float var1, boolean var2, int var3, int var4) {
        agd var5 = new agd(this.i.A, this.i.d, this.i.e);
        int var6 = var5.a();
        int var7 = var5.b();
        nl var8 = this.i.q;
        this.i.u.b();
        GL11.glEnable(3042);
        if(Minecraft.s()) {
            this.a(this.i.h.a(var1), var6, var7);
        } else {
            GL11.glBlendFunc(770, 771);
        }

        aan var9 = this.i.h.ap.f(3);
        if(this.i.A.E == 0 && var9 != null && var9.c == pb.ba.bO) {
            this.b(var6, var7);
        }

        float var10;
        if(!this.i.h.a(aad.k)) {
            var10 = this.i.h.aS + (this.i.h.aR - this.i.h.aS) * var1;
            if(var10 > 0.0F) {
                this.b(var10, var6, var7);
            }
        }

        int var12;
        int var13;
        int var16;
        int var19;
        int var18;
        int var20;
        if(!this.i.c.e()) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.i.p.b("/gui/gui.png"));
            aak var33 = this.i.h.ap;
            this.g = -90.0F;
            this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
            this.b(var6 / 2 - 91 - 1 + var33.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, this.i.p.b("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            boolean var11 = this.i.h.Y / 3 % 2 == 1;
            if(this.i.h.Y < 10) {
                var11 = false;
            }

            var12 = this.i.h.bb();
            var13 = this.i.h.by;
            this.h.setSeed((long)(this.j * 312871));
            boolean var14 = false;
            ne var15 = this.i.h.aF();
            var16 = var15.a();
            int var17 = var15.b();
            this.f();
            if(this.i.c.d()) {
                var18 = var6 / 2 - 91;
                var19 = var6 / 2 + 91;
                var20 = this.i.h.aE();
                int var23;
                int var22;
                if(var20 > 0) {
                    short var21 = 182;
                    var22 = (int)(this.i.h.aW * (float)(var21 + 1));
                    var23 = var7 - 32 + 3;
                    this.b(var18, var23, 0, 64, var21, 5);
                    if(var22 > 0) {
                        this.b(var18, var23, 0, 69, var22, 5);
                    }
                }

                int var50 = var7 - 39;
                var22 = var50 - 10;
                var23 = this.i.h.au();
                int var24 = -1;
                if(this.i.h.a(aad.l)) {
                    var24 = this.j % 25;
                }

                int var25;
                int var26;
                int var29;
                for(var25 = 0; var25 < 10; ++var25) {
                    if(var23 > 0) {
                        var26 = var18 + var25 * 8;
                        if(var25 * 2 + 1 < var23) {
                            this.b(var26, var22, 34, 9, 9, 9);
                        }

                        if(var25 * 2 + 1 == var23) {
                            this.b(var26, var22, 25, 9, 9, 9);
                        }

                        if(var25 * 2 + 1 > var23) {
                            this.b(var26, var22, 16, 9, 9, 9);
                        }
                    }

                    var26 = 16;
                    if(this.i.h.a(aad.u)) {
                        var26 += 36;
                    }

                    byte var27 = 0;
                    if(var11) {
                        var27 = 1;
                    }

                    int var28 = var18 + var25 * 8;
                    var29 = var50;
                    if(var12 <= 4) {
                        var29 = var50 + this.h.nextInt(2);
                    }

                    if(var25 == var24) {
                        var29 -= 2;
                    }

                    byte var30 = 0;
                    if(this.i.f.B().s()) {
                        var30 = 5;
                    }

                    this.b(var28, var29, 16 + var27 * 9, 9 * var30, 9, 9);
                    if(var11) {
                        if(var25 * 2 + 1 < var13) {
                            this.b(var28, var29, var26 + 54, 9 * var30, 9, 9);
                        }

                        if(var25 * 2 + 1 == var13) {
                            this.b(var28, var29, var26 + 63, 9 * var30, 9, 9);
                        }
                    }

                    if(var25 * 2 + 1 < var12) {
                        this.b(var28, var29, var26 + 36, 9 * var30, 9, 9);
                    }

                    if(var25 * 2 + 1 == var12) {
                        this.b(var28, var29, var26 + 45, 9 * var30, 9, 9);
                    }
                }

                int var54;
                for(var25 = 0; var25 < 10; ++var25) {
                    var26 = var50;
                    var54 = 16;
                    byte var55 = 0;
                    if(this.i.h.a(aad.s)) {
                        var54 += 36;
                        var55 = 13;
                    }

                    if(this.i.h.aF().d() <= 0.0F && this.j % (var16 * 3 + 1) == 0) {
                        var26 = var50 + (this.h.nextInt(3) - 1);
                    }

                    if(var14) {
                        var55 = 1;
                    }

                    var29 = var19 - var25 * 8 - 9;
                    this.b(var29, var26, 16 + var55 * 9, 27, 9, 9);
                    if(var14) {
                        if(var25 * 2 + 1 < var17) {
                            this.b(var29, var26, var54 + 54, 27, 9, 9);
                        }

                        if(var25 * 2 + 1 == var17) {
                            this.b(var29, var26, var54 + 63, 27, 9, 9);
                        }
                    }

                    if(var25 * 2 + 1 < var16) {
                        this.b(var29, var26, var54 + 36, 27, 9, 9);
                    }

                    if(var25 * 2 + 1 == var16) {
                        this.b(var29, var26, var54 + 45, 27, 9, 9);
                    }
                }

                if(this.i.h.a(acn.g)) {
                    var25 = (int)Math.ceil((double)(this.i.h.Y() - 2) * 10.0D / 300.0D);
                    var26 = (int)Math.ceil((double)this.i.h.Y() * 10.0D / 300.0D) - var25;

                    for(var54 = 0; var54 < var25 + var26; ++var54) {
                        if(var54 < var25) {
                            this.b(var19 - var54 * 8 - 9, var22, 16, 18, 9, 9);
                        } else {
                            this.b(var19 - var54 * 8 - 9, var22, 25, 18, 9, 9);
                        }
                    }
                }
            }

            GL11.glDisable(3042);
            GL11.glEnable('\u803a');
            tf.c();

            for(var18 = 0; var18 < 9; ++var18) {
                var19 = var6 / 2 - 90 + var18 * 20 + 2;
                var20 = var7 - 16 - 3;
                this.a(var18, var19, var20, var1);
            }

            tf.a();
            GL11.glDisable('\u803a');
        }

        int var34;
        if(this.i.h.aB() > 0) {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            var34 = this.i.h.aB();
            float var37 = (float)var34 / 100.0F;
            if(var37 > 1.0F) {
                var37 = 1.0F - (float)(var34 - 100) / 10.0F;
            }

            var12 = (int)(220.0F * var37) << 24 | 1052704;
            a(0, 0, var6, var7, var12);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }

        int var39;
        int var42;
        if(this.i.c.f() && this.i.h.aU > 0) {
            boolean var31 = false;
            var39 = var31?16777215:8453920;
            String var36 = "" + this.i.h.aU;
            var13 = (var6 - var8.a(var36)) / 2;
            var42 = var7 - 31 - 4;
            var8.b(var36, var13 + 1, var42, 0);
            var8.b(var36, var13 - 1, var42, 0);
            var8.b(var36, var13, var42 + 1, 0);
            var8.b(var36, var13, var42 - 1, 0);
            var8.b(var36, var13, var42, var39);
        }

        if(this.i.A.F) {
            GL11.glPushMatrix();
            if(Minecraft.J > 0L) {
                GL11.glTranslatef(0.0F, 32.0F, 0.0F);
            }

            var8.a("Minecraft 1.2.4 (" + this.i.M + ")", 2, 2, 16777215);
            var8.a(this.i.m(), 2, 12, 16777215);
            var8.a(this.i.n(), 2, 22, 16777215);
            var8.a(this.i.p(), 2, 32, 16777215);
            var8.a(this.i.o(), 2, 42, 16777215);
            long var32 = Runtime.getRuntime().maxMemory();
            long var40 = Runtime.getRuntime().totalMemory();
            long var44 = Runtime.getRuntime().freeMemory();
            long var45 = var40 - var44;
            String var47 = "Used memory: " + var45 * 100L / var32 + "% (" + var45 / 1024L / 1024L + "MB) of " + var32 / 1024L / 1024L + "MB";
            this.b(var8, var47, var6 - var8.a(var47) - 2, 2, 14737632);
            var47 = "Allocated memory: " + var40 * 100L / var32 + "% (" + var40 / 1024L / 1024L + "MB)";
            this.b(var8, var47, var6 - var8.a(var47) - 2, 12, 14737632);
            this.b(var8, "x: " + this.i.h.o, 2, 64, 14737632);
            this.b(var8, "y: " + this.i.h.p, 2, 72, 14737632);
            this.b(var8, "z: " + this.i.h.q, 2, 80, 14737632);
            this.b(var8, "f: " + (gk.c((double)(this.i.h.u * 4.0F / 360.0F) + 0.5D) & 3), 2, 88, 14737632);
            var34 = gk.c(this.i.h.o);
            var39 = gk.c(this.i.h.p);
            var12 = gk.c(this.i.h.q);
            if(this.i.f != null && this.i.f.j(var34, var39, var12)) {
                ack var38 = this.i.f.c(var34, var12);
                this.b(var8, "lc: " + (var38.h() + 15) + " b: " + var38.a(var34 & 15, var12 & 15, this.i.f.i()).y + " bl: " + var38.a(wl.b, var34 & 15, var39, var12 & 15) + " sl: " + var38.a(wl.a, var34 & 15, var39, var12 & 15) + " rl: " + var38.c(var34 & 15, var39, var12 & 15, 0), 2, 96, 14737632);
            }

            if(!this.i.f.F) {
                this.b(var8, "Seed: " + this.i.f.v(), 2, 112, 14737632);
            }

            GL11.glPopMatrix();
        }

        if(this.l > 0) {
            var10 = (float)this.l - var1;
            var39 = (int)(var10 * 256.0F / 20.0F);
            if(var39 > 255) {
                var39 = 255;
            }

            if(var39 > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                var12 = 16777215;
                if(this.m) {
                    var12 = Color.HSBtoRGB(var10 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                var8.b(this.k, -var8.a(this.k) / 2, -4, var12 + (var39 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);
        this.a(var8);
        GL11.glPopMatrix();
        if(this.i.h instanceof ahv && this.i.A.y.e) {
            adl var35 = ((ahv)this.i.h).cl;
            List var43 = var35.c;
            var12 = var35.d;
            var13 = var12;

            for(var42 = 1; var13 > 20; var13 = (var12 + var42 - 1) / var42) {
                ++var42;
            }

            int var41 = 300 / var42;
            if(var41 > 150) {
                var41 = 150;
            }

            var16 = (var6 - var42 * var41) / 2;
            byte var46 = 10;
            a(var16 - 1, var46 - 1, var16 + var41 * var42, var46 + 9 * var13, Integer.MIN_VALUE);

            for(var18 = 0; var18 < var12; ++var18) {
                var19 = var16 + var18 % var42 * var41;
                var20 = var46 + var18 / var42 * 9;
                a(var19, var20, var19 + var41 - 1, var20 + 8, 553648127);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if(var18 < var43.size()) {
                    ah var51 = (ah)var43.get(var18);
                    var8.a(var51.a, var19, var20, 16777215);
                    this.i.p.b(this.i.p.b("/gui/icons.png"));
                    boolean var48 = false;
                    boolean var52 = false;
                    byte var49 = 0;
                    var52 = false;
                    byte var53;
                    if(var51.b < 0) {
                        var53 = 5;
                    } else if(var51.b < 150) {
                        var53 = 0;
                    } else if(var51.b < 300) {
                        var53 = 1;
                    } else if(var51.b < 600) {
                        var53 = 2;
                    } else if(var51.b < 1000) {
                        var53 = 3;
                    } else {
                        var53 = 4;
                    }

                    this.g += 100.0F;
                    this.b(var19 + var41 - 12, var20, 0 + var49 * 10, 176 + var53 * 8, 10, 8);
                    this.g -= 100.0F;
                }
            }
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private List<nt> getImprovedLines() {
        return ImprovedChat.getCurrentServer().currentTab().e;
    }

    private void a(nl var1) {
        byte var2 = ImprovedChat.ChatLinesSmall; /* ChatLinesSmall */
        boolean var3 = false;
        int var4 = 0;
        // int var5 = this.e.size();

        int var5 = getImprovedLines().size();

        if(var5 > 0) {
            if(this.e()) {
                var2 = ImprovedChat.ChatLinesBig; /* ChatLinesBig */
                var3 = true;
            }

            int var6;
            int var10;

            // TODO : ImprovedChat.handle_draw(this, var8, var11, var35);

            /* for(var6 = 0; var6 + this.n < this.e.size() && var6 < var2; ++var6) {
                if(((nt)this.e.get(var6)).b < 200 || var3) {
                    nt var7 = (nt)this.e.get(var6 + this.n);
                    double var8 = (double)var7.b / 200.0D;
                    var8 = 1.0D - var8;
                    var8 *= 10.0D;
                    if(var8 < 0.0D) {
                        var8 = 0.0D;
                    }

                    if(var8 > 1.0D) {
                        var8 = 1.0D;
                    }

                    var8 *= var8;
                    var10 = (int)(255.0D * var8);
                    if(var3) {
                        var10 = 255;
                    }

                    ++var4;
                    if(var10 > 2) {
                        byte var11 = 3;
                        int var12 = -var6 * 9;
                        String var13 = var7.a;
                        a(var11, var12 - 1, var11 + 320 + 4, var12 + 8, var10 / 2 << 24);
                        GL11.glEnable(GL11.GL_BLEND);
                        var1.a(var13, var11, var12, 16777215 + (var10 << 24));
                    }
                }
            } */



            var4 = ImprovedChat.handle_draw(this, var1, var3, var2);
            // GL11.glPopMatrix();

            // TODO: See previous TODO

            if(var3) {
                GL11.glTranslatef(0.0F, (float)var1.b, 0.0F);
                var6 = var5 * var1.b + var5;
                int var14 = var4 * var1.b + var4;
                int var16 = this.n * var14 / var5;
                int var9 = var14 * var14 / var6;
                if(var6 != var14) {
                    var10 = var16 > 0?170:96;
                    int var15 = this.o?13382451:3355562;
                    a(0, -var16, 2, -var16 - var9, var15 + (var10 << 24));
                    a(2, -var16, 1, -var16 - var9, 13421772 + (var10 << 24));
                }
            }

        }
    }

    private void f() {
        if(or.c != null) {
            oq var1 = or.c;
            or.c = null;
            nl var2 = this.i.q;
            agd var3 = new agd(this.i.A, this.i.d, this.i.e);
            int var4 = var3.a();
            short var5 = 182;
            int var6 = var4 / 2 - var5 / 2;
            int var7 = (int)((float)var1.x() / (float)var1.d() * (float)(var5 + 1));
            byte var8 = 12;
            this.b(var6, var8, 0, 74, var5, 5);
            this.b(var6, var8, 0, 74, var5, 5);
            if(var7 > 0) {
                this.b(var6, var8, 0, 79, var7, 5);
            }

            String var9 = "Boss health";
            var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 16711935);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.i.p.b("/gui/icons.png"));
        }
    }

    private void b(int var1, int var2) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, this.i.p.b("%blur%/misc/pumpkinblur.png"));
        adz var3 = adz.a;
        var3.b();
        var3.a(0.0D, (double)var2, -90.0D, 0.0D, 1.0D);
        var3.a((double)var1, (double)var2, -90.0D, 1.0D, 1.0D);
        var3.a((double)var1, 0.0D, -90.0D, 1.0D, 0.0D);
        var3.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        var3.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(float var1, int var2, int var3) {
        var1 = 1.0F - var1;
        if(var1 < 0.0F) {
            var1 = 0.0F;
        }

        if(var1 > 1.0F) {
            var1 = 1.0F;
        }

        this.c = (float)((double)this.c + (double)(var1 - this.c) * 0.01D);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(this.c, this.c, this.c, 1.0F);
        GL11.glBindTexture(3553, this.i.p.b("%blur%/misc/vignette.png"));
        adz var4 = adz.a;
        var4.b();
        var4.a(0.0D, (double)var3, -90.0D, 0.0D, 1.0D);
        var4.a((double)var2, (double)var3, -90.0D, 1.0D, 1.0D);
        var4.a((double)var2, 0.0D, -90.0D, 1.0D, 0.0D);
        var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        var4.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(770, 771);
    }

    private void b(float var1, int var2, int var3) {
        if(var1 < 1.0F) {
            var1 *= var1;
            var1 *= var1;
            var1 = var1 * 0.8F + 0.2F;
        }

        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
        GL11.glBindTexture(3553, this.i.p.b("/terrain.png"));
        float var4 = (float)(pb.be.bN % 16) / 16.0F;
        float var5 = (float)(pb.be.bN / 16) / 16.0F;
        float var6 = (float)(pb.be.bN % 16 + 1) / 16.0F;
        float var7 = (float)(pb.be.bN / 16 + 1) / 16.0F;
        adz var8 = adz.a;
        var8.b();
        var8.a(0.0D, (double)var3, -90.0D, (double)var4, (double)var7);
        var8.a((double)var2, (double)var3, -90.0D, (double)var6, (double)var7);
        var8.a((double)var2, 0.0D, -90.0D, (double)var6, (double)var5);
        var8.a(0.0D, 0.0D, -90.0D, (double)var4, (double)var5);
        var8.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(int var1, int var2, int var3, float var4) {
        aan var5 = this.i.h.ap.a[var1];
        if(var5 != null) {
            float var6 = (float)var5.b - var4;
            if(var6 > 0.0F) {
                GL11.glPushMatrix();
                float var7 = 1.0F + var6 / 5.0F;
                GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
                GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
                GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
            }

            d.a(this.i.q, this.i.p, var5, var2, var3);
            if(var6 > 0.0F) {
                GL11.glPopMatrix();
            }

            d.b(this.i.q, this.i.p, var5, var2, var3);
        }
    }

    public void a() {
        if(this.l > 0) {
            --this.l;
        }

        ++this.j;

        for(int var1 = 0; var1 < getImprovedLines().size(); ++var1) {
            ++(getImprovedLines().get(var1)).b;
        }

        // TODO : ImprovedChat.tick();
        ImprovedChat.tick();

    }

    public void b() {
        this.e.clear();
        this.f.clear();
    }

    /* public void receiveLine(String var1) {
        boolean var2 = this.e();
        boolean var3 = true;


        Iterator var4 = this.i.q.c(var1, 320).iterator();

        while(var4.hasNext()) {
            String var5 = (String)var4.next();
            if(var2 && this.n > 0) {
                this.o = true;
                this.a(1);
            }

            if(!var3) {
                var5 = " " + var5;
            }

            var3 = false;
            this.e.add(0, new nt(var5));
        }

        while(this.e.size() > 100) {
            this.e.remove(this.e.size() - 1);
        }
    } */

    public void a(String var1) {
        /*
        boolean var2 = this.e();
        boolean var3 = true;
        Iterator var4 = this.i.q.c(var1, 320).iterator();

        while(var4.hasNext()) {
            String var5 = (String)var4.next();
            if(var2 && this.n > 0) {
                this.o = true;
                this.a(1);
            }

            if(!var3) {
                var5 = " " + var5;
            }

            var3 = false;
            this.e.add(0, new nt(var5));
        }

        while(this.e.size() > 100) {
            this.e.remove(this.e.size() - 1);
        }
        */

        // TODO : ImprovedChat.receiveLine(var1);
        ImprovedChat.receiveLine(var1);
    }

    public List c() {
        return this.f;
    }

    public void d() {
        this.n = 0;
        this.o = false;
    }

    public void a(int var1) {
        this.n += var1;
        int var2 = getImprovedLines().size();
        if(this.n > var2 - 20) {
            this.n = var2 - 20;
        }

        if(this.n <= 0) {
            this.n = 0;
            this.o = false;
        }

        ImprovedChat.getCurrentServer().currentTab().chatScroll = this.n;
    }

    public dx a(int var1, int var2) {
        if(!this.e()) {
            return null;
        } else {
            agd var3 = new agd(this.i.A, this.i.d, this.i.e);
            var2 = var2 / var3.c - 40;
            var1 = var1 / var3.c - 3;
            if(var1 >= 0 && var2 >= 0) {
                int var4 = Math.min(20, this.e.size());
                if(var1 <= 320 && var2 < this.i.q.b * var4 + var4) {
                    int var5 = var2 / (this.i.q.b + 1) + this.n;
                    return new dx(this.i.q, (nt)this.e.get(var5), var1, var2 - (var5 - this.n) * this.i.q.b + var5);
                } else {
                    return null;
                }
            } else {
                return null;
            }
        }
    }

    public void b(String var1) {
        this.k = "Now playing: " + var1;
        this.l = 60;
        this.m = true;
    }

    public boolean e() {
        return this.i.s instanceof yf;
    }

    public void c(String var1) {
        adn var2 = adn.a();
        String var3 = var2.b(var1);
        this.a(var3);
    }

}