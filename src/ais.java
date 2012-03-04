import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class ais extends ok {

    private static ts d = new ts();
    private List e = new ArrayList();
    private Random f = new Random();
    private Minecraft h;
    public String a = null;
    public int i = 0; // ImprovedChat - private -> public
    private String j = "";
    private int k = 0;
    private boolean l = false;
    public float b;
    float c = 1.0F;


    public ais(Minecraft var1) {
        this.h = var1;
        ImprovedChat.init(var1);
    }

    public void a(float var1, boolean var2, int var3, int var4) {
        afy var5 = new afy(this.h.A, this.h.d, this.h.e);
        int var6 = var5.a();
        int var7 = var5.b();
        ni var8 = this.h.q;
        this.h.u.b();
        GL11.glEnable(3042);
        if(Minecraft.s()) {
            this.a(this.h.h.a(var1), var6, var7);
        } else {
            GL11.glBlendFunc(770, 771);
        }

        aai var9 = this.h.h.ap.f(3);
        if(this.h.A.E == 0 && var9 != null && var9.c == ox.ba.bO) {
            this.a(var6, var7);
        }

        float var10;
        if(!this.h.h.a(zy.k)) {
            var10 = this.h.h.aS + (this.h.h.aR - this.h.h.aS) * var1;
            if(var10 > 0.0F) {
                this.b(var10, var6, var7);
            }
        }

        boolean var11;
        int var12;
        int var13;
        int var17;
        int var16;
        int var18;
        int var20;
        int var22;
        int var51;
        if(!this.h.c.e()) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.h.p.b("/gui/gui.png"));
            aaf var33 = this.h.h.ap;
            this.g = -90.0F;
            this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
            this.b(var6 / 2 - 91 - 1 + var33.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, this.h.p.b("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            var11 = this.h.h.Y / 3 % 2 == 1;
            if(this.h.h.Y < 10) {
                var11 = false;
            }

            var12 = this.h.h.ba();
            var13 = this.h.h.by;
            this.f.setSeed((long)(this.i * 312871));
            boolean var14 = false;
            nb var15 = this.h.h.aF();
            var16 = var15.a();
            var17 = var15.b();
            this.c();
            int var19;
            if(this.h.c.d()) {
                var18 = var6 / 2 - 91;
                var19 = var6 / 2 + 91;
                var20 = this.h.h.aE();
                int var23;
                if(var20 > 0) {
                    short var21 = 182;
                    var22 = (int)(this.h.h.aW * (float)(var21 + 1));
                    var23 = var7 - 32 + 3;
                    this.b(var18, var23, 0, 64, var21, 5);
                    if(var22 > 0) {
                        this.b(var18, var23, 0, 69, var22, 5);
                    }
                }

                var51 = var7 - 39;
                var22 = var51 - 10;
                var23 = this.h.h.au();
                int var24 = -1;
                if(this.h.h.a(zy.l)) {
                    var24 = this.i % 25;
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
                    if(this.h.h.a(zy.u)) {
                        var26 += 36;
                    }

                    byte var27 = 0;
                    if(var11) {
                        var27 = 1;
                    }

                    int var28 = var18 + var25 * 8;
                    var29 = var51;
                    if(var12 <= 4) {
                        var29 = var51 + this.f.nextInt(2);
                    }

                    if(var25 == var24) {
                        var29 -= 2;
                    }

                    byte var30 = 0;
                    if(this.h.f.B().s()) {
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

                int var55;
                for(var25 = 0; var25 < 10; ++var25) {
                    var26 = var51;
                    var55 = 16;
                    byte var56 = 0;
                    if(this.h.h.a(zy.s)) {
                        var55 += 36;
                        var56 = 13;
                    }

                    if(this.h.h.aF().d() <= 0.0F && this.i % (var16 * 3 + 1) == 0) {
                        var26 = var51 + (this.f.nextInt(3) - 1);
                    }

                    if(var14) {
                        var56 = 1;
                    }

                    var29 = var19 - var25 * 8 - 9;
                    this.b(var29, var26, 16 + var56 * 9, 27, 9, 9);
                    if(var14) {
                        if(var25 * 2 + 1 < var17) {
                            this.b(var29, var26, var55 + 54, 27, 9, 9);
                        }

                        if(var25 * 2 + 1 == var17) {
                            this.b(var29, var26, var55 + 63, 27, 9, 9);
                        }
                    }

                    if(var25 * 2 + 1 < var16) {
                        this.b(var29, var26, var55 + 36, 27, 9, 9);
                    }

                    if(var25 * 2 + 1 == var16) {
                        this.b(var29, var26, var55 + 45, 27, 9, 9);
                    }
                }

                if(this.h.h.a(aci.g)) {
                    var25 = (int)Math.ceil((double)(this.h.h.Y() - 2) * 10.0D / 300.0D);
                    var26 = (int)Math.ceil((double)this.h.h.Y() * 10.0D / 300.0D) - var25;

                    for(var55 = 0; var55 < var25 + var26; ++var55) {
                        if(var55 < var25) {
                            this.b(var19 - var55 * 8 - 9, var22, 16, 18, 9, 9);
                        } else {
                            this.b(var19 - var55 * 8 - 9, var22, 25, 18, 9, 9);
                        }
                    }
                }
            }

            GL11.glDisable(3042);
            GL11.glEnable('\u803a');
            tb.c();

            for(var18 = 0; var18 < 9; ++var18) {
                var19 = var6 / 2 - 90 + var18 * 20 + 2;
                var20 = var7 - 16 - 3;
                this.a(var18, var19, var20, var1);
            }

            tb.a();
            GL11.glDisable('\u803a');
        }

        int var34;
        if(this.h.h.aB() > 0) {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            var34 = this.h.h.aB();
            float var37 = (float)var34 / 100.0F;
            if(var37 > 1.0F) {
                var37 = 1.0F - (float)(var34 - 100) / 10.0F;
            }

            var12 = (int)(220.0F * var37) << 24 | 1052704;
            this.a(0, 0, var6, var7, var12);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }

        int var40;
        int var44;
        if(this.h.c.f() && this.h.h.aU > 0) {
            boolean var31 = false;
            var40 = var31?16777215:8453920;
            String var36 = "" + this.h.h.aU;
            var13 = (var6 - var8.a(var36)) / 2;
            var44 = var7 - 31 - 4;
            var8.b(var36, var13 + 1, var44, 0);
            var8.b(var36, var13 - 1, var44, 0);
            var8.b(var36, var13, var44 + 1, 0);
            var8.b(var36, var13, var44 - 1, 0);
            var8.b(var36, var13, var44, var40);
        }

        String var49;
        if(this.h.A.F) {
            GL11.glPushMatrix();
            if(Minecraft.J > 0L) {
                GL11.glTranslatef(0.0F, 32.0F, 0.0F);
            }

            var8.a("Minecraft 1.2.3 (" + this.h.M + ")", 2, 2, 16777215);
            var8.a(this.h.m(), 2, 12, 16777215);
            var8.a(this.h.n(), 2, 22, 16777215);
            var8.a(this.h.p(), 2, 32, 16777215);
            var8.a(this.h.o(), 2, 42, 16777215);
            long var32 = Runtime.getRuntime().maxMemory();
            long var41 = Runtime.getRuntime().totalMemory();
            long var45 = Runtime.getRuntime().freeMemory();
            long var48 = var41 - var45;
            var49 = "Used memory: " + var48 * 100L / var32 + "% (" + var48 / 1024L / 1024L + "MB) of " + var32 / 1024L / 1024L + "MB";
            this.b(var8, var49, var6 - var8.a(var49) - 2, 2, 14737632);
            var49 = "Allocated memory: " + var41 * 100L / var32 + "% (" + var41 / 1024L / 1024L + "MB)";
            this.b(var8, var49, var6 - var8.a(var49) - 2, 12, 14737632);
            this.b(var8, "x: " + this.h.h.o, 2, 64, 14737632);
            this.b(var8, "y: " + this.h.h.p, 2, 72, 14737632);
            this.b(var8, "z: " + this.h.h.q, 2, 80, 14737632);
            this.b(var8, "f: " + (gh.c((double)(this.h.h.u * 4.0F / 360.0F) + 0.5D) & 3), 2, 88, 14737632);
            var34 = gh.c(this.h.h.o);
            var40 = gh.c(this.h.h.p);
            var12 = gh.c(this.h.h.q);
            if(this.h.f != null && this.h.f.j(var34, var40, var12)) {
                acf var38 = this.h.f.c(var34, var12);
                this.b(var8, "lc: " + (var38.h() + 15) + " b: " + var38.a(var34 & 15, var12 & 15, this.h.f.i()).y + " bl: " + var38.a(wh.b, var34 & 15, var40, var12 & 15) + " sl: " + var38.a(wh.a, var34 & 15, var40, var12 & 15) + " rl: " + var38.c(var34 & 15, var40, var12 & 15, 0), 2, 96, 14737632);
            }

            this.b(var8, "Seed: " + this.h.f.v(), 2, 112, 14737632);
            GL11.glPopMatrix();
        }

        if(this.k > 0) {
            var10 = (float)this.k - var1;
            var40 = (int)(var10 * 256.0F / 20.0F);
            if(var40 > 255) {
                var40 = 255;
            }

            if(var40 > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                var12 = 16777215;
                if(this.l) {
                    var12 = Color.HSBtoRGB(var10 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                var8.b(this.j, -var8.a(this.j) / 2, -4, var12 + (var40 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }

        byte var35 = ImprovedChat.ChatLinesSmall;
        var11 = false;
        if(this.h.s instanceof yb) {
            var35 = ImprovedChat.ChatLinesBig;
            var11 = true;
        }

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);

        int var42;
        /*  for(var12 = 0; var12 < this.e.size() && var12 < var35; ++var12) {
            if(((nq)this.e.get(var12)).b < 200 || var11) {
                double var39 = (double)((nq)this.e.get(var12)).b / 200.0D;
                var39 = 1.0D - var39;
                var39 *= 10.0D;
                if(var39 < 0.0D) {
                    var39 = 0.0D;
                }

                if(var39 > 1.0D) {
                    var39 = 1.0D;
                }

                var39 *= var39;
                var42 = (int)(255.0D * var39);
                if(var11) {
                    var42 = 255;
                }

                if(var42 > 0) {
                    byte var47 = 2;
                    var17 = -var12 * 9;
                    var49 = ((nq)this.e.get(var12)).a;
                    this.a(var47, var17 - 1, var47 + 320, var17 + 8, var42 / 2 << 24);
                    GL11.glEnable(3042);
                    var8.a(var49, var47, var17, 16777215 + (var42 << 24));
                }
            }
        } */

        ImprovedChat.handle_draw(this, var8, var11, var35);

        GL11.glPopMatrix();
        if(this.h.h instanceof ahp && this.h.A.y.e) {
            adg var43 = ((ahp)this.h.h).cl;
            List var46 = var43.c;
            var44 = var43.d;
            var42 = var44;

            for(var16 = 1; var42 > 20; var42 = (var44 + var16 - 1) / var16) {
                ++var16;
            }

            var17 = 300 / var16;
            if(var17 > 150) {
                var17 = 150;
            }

            var18 = (var6 - var16 * var17) / 2;
            byte var50 = 10;
            this.a(var18 - 1, var50 - 1, var18 + var17 * var16, var50 + 9 * var42, Integer.MIN_VALUE);

            for(var20 = 0; var20 < var44; ++var20) {
                var51 = var18 + var20 % var16 * var17;
                var22 = var50 + var20 / var16 * 9;
                this.a(var51, var22, var51 + var17 - 1, var22 + 8, 553648127);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if(var20 < var46.size()) {
                    ag var54 = (ag)var46.get(var20);
                    var8.a(var54.a, var51, var22, 16777215);
                    this.h.p.b(this.h.p.b("/gui/icons.png"));
                    boolean var52 = false;
                    boolean var57 = false;
                    byte var53 = 0;
                    var57 = false;
                    byte var58;
                    if(var54.b < 0) {
                        var58 = 5;
                    } else if(var54.b < 150) {
                        var58 = 0;
                    } else if(var54.b < 300) {
                        var58 = 1;
                    } else if(var54.b < 600) {
                        var58 = 2;
                    } else if(var54.b < 1000) {
                        var58 = 3;
                    } else {
                        var58 = 4;
                    }

                    this.g += 100.0F;
                    this.b(var51 + var17 - 12, var22, 0 + var53 * 10, 176 + var58 * 8, 10, 8);
                    this.g -= 100.0F;
                }
            }
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private void c() {
        if(on.c != null) {
            om var1 = on.c;
            on.c = null;
            ni var2 = this.h.q;
            afy var3 = new afy(this.h.A, this.h.d, this.h.e);
            int var4 = var3.a();
            short var5 = 182;
            int var6 = var4 / 2 - var5 / 2;
            int var7 = (int)((float)var1.w() / (float)var1.d() * (float)(var5 + 1));
            byte var8 = 12;
            this.b(var6, var8, 0, 74, var5, 5);
            this.b(var6, var8, 0, 74, var5, 5);
            if(var7 > 0) {
                this.b(var6, var8, 0, 79, var7, 5);
            }

            String var9 = "Boss health";
            var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 16711935);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.h.p.b("/gui/icons.png"));
        }
    }

    private void a(int var1, int var2) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, this.h.p.b("%blur%/misc/pumpkinblur.png"));
        adu var3 = adu.a;
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
        GL11.glBindTexture(3553, this.h.p.b("%blur%/misc/vignette.png"));
        adu var4 = adu.a;
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
        GL11.glBindTexture(3553, this.h.p.b("/terrain.png"));
        float var4 = (float)(ox.be.bN % 16) / 16.0F;
        float var5 = (float)(ox.be.bN / 16) / 16.0F;
        float var6 = (float)(ox.be.bN % 16 + 1) / 16.0F;
        float var7 = (float)(ox.be.bN / 16 + 1) / 16.0F;
        adu var8 = adu.a;
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
        aai var5 = this.h.h.ap.a[var1];
        if(var5 != null) {
            float var6 = (float)var5.b - var4;
            if(var6 > 0.0F) {
                GL11.glPushMatrix();
                float var7 = 1.0F + var6 / 5.0F;
                GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
                GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
                GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
            }

            d.a(this.h.q, this.h.p, var5, var2, var3);
            if(var6 > 0.0F) {
                GL11.glPopMatrix();
            }

            d.b(this.h.q, this.h.p, var5, var2, var3);
        }
    }

    public void a() {
        if(this.k > 0) {
            --this.k;
        }

        ++this.i;

        for(int var1 = 0; var1 < this.e.size(); ++var1) {
            ++((nq)this.e.get(var1)).b;
        }

        ImprovedChat.tick();

    }

    public void b() {
        this.e.clear();
    }

    public void a(String var1) {
        this.e.add(0, new nq(var1));
        ImprovedChat.receiveLine(var1);
    }

    public void b(String var1) {
        this.j = "Now playing: " + var1;
        this.k = 60;
        this.l = true;
    }

    public void c(String var1) {
        adi var2 = adi.a();
        String var3 = var2.b(var1);
        this.a(var3);
    }

}