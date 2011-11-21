import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class qd extends ht {

    private static iw d = new iw();
    private List e = new ArrayList();
    private Random f = new Random();
    private Minecraft g;
    public String a = null;
    public int h = 0;
    private String j = "";
    private int k = 0;
    private boolean l = false;
    public float b;
    float c = 1.0F;


    public qd(Minecraft var1) {
        ImprovedChat.init(var1);
        this.g = var1;
    }

    public void a(float var1, boolean var2, int var3, int var4) {
        ef var5 = new ef(this.g.A, this.g.d, this.g.e);
        int var6 = var5.a();
        int var7 = var5.b();
        abe var8 = this.g.q;
        this.g.u.b();
        GL11.glEnable(3042);
        if(Minecraft.s()) {
            this.a(this.g.h.b(var1), var6, var7);
        } else {
            GL11.glBlendFunc(770, 771);
        }

        dk var9 = this.g.h.by.e(3);
        if(this.g.A.E == 0 && var9 != null && var9.c == yy.ba.bM) {
            this.a(var6, var7);
        }

        float var10;
        if(!this.g.h.a(abg.k)) {
            var10 = this.g.h.cb + (this.g.h.ca - this.g.h.cb) * var1;
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
        int var50;
        if(!this.g.c.i()) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.g.p.b("/gui/gui.png"));
            x var33 = this.g.h.by;
            this.i = -90.0F;
            this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
            this.b(var6 / 2 - 91 - 1 + var33.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            var11 = this.g.h.ac / 3 % 2 == 1;
            if(this.g.h.ac < 10) {
                var11 = false;
            }

            var12 = this.g.h.ag();
            var13 = this.g.h.aN;
            this.f.setSeed((long)(this.h * 312871));
            boolean var14 = false;
            eq var15 = this.g.h.aO();
            var16 = var15.a();
            var17 = var15.b();
            this.c();
            int var19;
            if(this.g.c.a()) {
                var18 = var6 / 2 - 91;
                var19 = var6 / 2 + 91;
                var20 = this.g.h.aN();
                int var23;
                if(var20 > 0) {
                    short var21 = 182;
                    var22 = (int)(this.g.h.cf * (float)(var21 + 1));
                    var23 = var7 - 32 + 3;
                    this.b(var18, var23, 0, 64, var21, 5);
                    if(var22 > 0) {
                        this.b(var18, var23, 0, 69, var22, 5);
                    }
                }

                var50 = var7 - 39;
                var22 = var50 - 10;
                var23 = this.g.h.p();
                int var24 = -1;
                if(this.g.h.a(abg.l)) {
                    var24 = this.h % 25;
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
                    if(this.g.h.a(abg.u)) {
                        var26 += 36;
                    }

                    byte var27 = 0;
                    if(var11) {
                        var27 = 1;
                    }

                    int var28 = var18 + var25 * 8;
                    var29 = var50;
                    if(var12 <= 4) {
                        var29 = var50 + this.f.nextInt(2);
                    }

                    if(var25 == var24) {
                        var29 -= 2;
                    }

                    byte var30 = 0;
                    if(this.g.f.z().s()) {
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
                    if(this.g.h.a(abg.s)) {
                        var54 += 36;
                        var55 = 13;
                    }

                    if(this.g.h.aO().d() <= 0.0F && this.h % (var16 * 3 + 1) == 0) {
                        var26 = var50 + (this.f.nextInt(3) - 1);
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

                if(this.g.h.a(p.g)) {
                    var25 = (int)Math.ceil((double)(this.g.h.Z() - 2) * 10.0D / 300.0D);
                    var26 = (int)Math.ceil((double)this.g.h.Z() * 10.0D / 300.0D) - var25;

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
            rt.c();

            for(var18 = 0; var18 < 9; ++var18) {
                var19 = var6 / 2 - 90 + var18 * 20 + 2;
                var20 = var7 - 16 - 3;
                this.a(var18, var19, var20, var1);
            }

            rt.a();
            GL11.glDisable('\u803a');
        }

        if(this.g.h.aL() > 0) {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            int var34 = this.g.h.aL();
            float var37 = (float)var34 / 100.0F;
            if(var37 > 1.0F) {
                var37 = 1.0F - (float)(var34 - 100) / 10.0F;
            }

            var12 = (int)(220.0F * var37) << 24 | 1052704;
            this.a(0, 0, var6, var7, var12);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }

        int var39;
        int var43;
        if(this.g.c.e() && this.g.h.cd > 0) {
            boolean var31 = false;
            var39 = var31?16777215:8453920;
            String var35 = "" + this.g.h.cd;
            var13 = (var6 - var8.a(var35)) / 2;
            var43 = var7 - 31 - 4;
            var8.b(var35, var13 + 1, var43, 0);
            var8.b(var35, var13 - 1, var43, 0);
            var8.b(var35, var13, var43 + 1, 0);
            var8.b(var35, var13, var43 - 1, 0);
            var8.b(var35, var13, var43, var39);
        }

        String var48;
        if(this.g.A.F) {
            GL11.glPushMatrix();
            if(Minecraft.J > 0L) {
                GL11.glTranslatef(0.0F, 32.0F, 0.0F);
            }

            var8.a("Minecraft 1.0.0 (" + this.g.M + ")", 2, 2, 16777215);
            var8.a(this.g.m(), 2, 12, 16777215);
            var8.a(this.g.n(), 2, 22, 16777215);
            var8.a(this.g.p(), 2, 32, 16777215);
            var8.a(this.g.o(), 2, 42, 16777215);
            long var32 = Runtime.getRuntime().maxMemory();
            long var40 = Runtime.getRuntime().totalMemory();
            long var44 = Runtime.getRuntime().freeMemory();
            long var47 = var40 - var44;
            var48 = "Used memory: " + var47 * 100L / var32 + "% (" + var47 / 1024L / 1024L + "MB) of " + var32 / 1024L / 1024L + "MB";
            this.b(var8, var48, var6 - var8.a(var48) - 2, 2, 14737632);
            var48 = "Allocated memory: " + var40 * 100L / var32 + "% (" + var40 / 1024L / 1024L + "MB)";
            this.b(var8, var48, var6 - var8.a(var48) - 2, 12, 14737632);
            this.b(var8, "x: " + this.g.h.s, 2, 64, 14737632);
            this.b(var8, "y: " + this.g.h.t, 2, 72, 14737632);
            this.b(var8, "z: " + this.g.h.u, 2, 80, 14737632);
            this.b(var8, "f: " + (me.c((double)(this.g.h.y * 4.0F / 360.0F) + 0.5D) & 3), 2, 88, 14737632);
            this.b(var8, "Seed: " + this.g.f.t(), 2, 104, 14737632);
            GL11.glPopMatrix();
        }

        if(this.k > 0) {
            var10 = (float)this.k - var1;
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
                if(this.l) {
                    var12 = Color.HSBtoRGB(var10 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                var8.b(this.j, -var8.a(this.j) / 2, -4, var12 + (var39 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }

        byte var36 = ImprovedChat.ChatLinesSmall;
        var11 = false;
        if(this.g.s instanceof gx) {
            var36 = ImprovedChat.ChatLinesBig;
            var11 = true;
        }

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);

        /* int var42;
        for(var12 = 0; var12 < this.e.size() && var12 < var36; ++var12) {
            if(((ahe)this.e.get(var12)).b < 200 || var11) {
                double var38 = (double)((ahe)this.e.get(var12)).b / 200.0D;
                var38 = 1.0D - var38;
                var38 *= 10.0D;
                if(var38 < 0.0D) {
                    var38 = 0.0D;
                }

                if(var38 > 1.0D) {
                    var38 = 1.0D;
                }

                var38 *= var38;
                var42 = (int)(255.0D * var38);
                if(var11) {
                    var42 = 255;
                }

                if(var42 > 0) {
                    byte var45 = 2;
                    var17 = -var12 * 9;
                    var48 = ((ahe)this.e.get(var12)).a;
                    this.a(var45, var17 - 1, var45 + 320, var17 + 8, var42 / 2 << 24);
                    GL11.glEnable(3042);
                    var8.a(var48, var45, var17, 16777215 + (var42 << 24));
                }
            }
        } */
        ImprovedChat.handle_draw(this, var8, var11, var36);

        GL11.glPopMatrix();
        if(this.g.h instanceof cx && this.g.A.y.e) {
            abp var41 = ((cx)this.g.h).a;
            List var46 = var41.c;
            var43 = var41.d;
            int var42 = var43;

            for(var16 = 1; var42 > 20; var42 = (var43 + var16 - 1) / var16) {
                ++var16;
            }

            var17 = 300 / var16;
            if(var17 > 150) {
                var17 = 150;
            }

            var18 = (var6 - var16 * var17) / 2;
            byte var49 = 10;
            this.a(var18 - 1, var49 - 1, var18 + var17 * var16, var49 + 9 * var42, Integer.MIN_VALUE);

            for(var20 = 0; var20 < var43; ++var20) {
                var50 = var18 + var20 % var16 * var17;
                var22 = var49 + var20 / var16 * 9;
                this.a(var50, var22, var50 + var17 - 1, var22 + 8, 553648127);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if(var20 < var46.size()) {
                    ao var53 = (ao)var46.get(var20);
                    var8.a(var53.a, var50, var22, 16777215);
                    this.g.p.b(this.g.p.b("/gui/icons.png"));
                    boolean var51 = false;
                    boolean var56 = false;
                    byte var52 = 0;
                    var56 = false;
                    byte var57;
                    if(var53.b < 0) {
                        var57 = 5;
                    } else if(var53.b < 150) {
                        var57 = 0;
                    } else if(var53.b < 300) {
                        var57 = 1;
                    } else if(var53.b < 600) {
                        var57 = 2;
                    } else if(var53.b < 1000) {
                        var57 = 3;
                    } else {
                        var57 = 4;
                    }

                    this.i += 100.0F;
                    this.b(var50 + var17 - 12, var22, 0 + var52 * 10, 176 + var57 * 8, 10, 8);
                    this.i -= 100.0F;
                }
            }
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private void c() {
        if(ado.a != null) {
            oo var1 = ado.a;
            ado.a = null;
            abe var2 = this.g.q;
            ef var3 = new ef(this.g.A, this.g.d, this.g.e);
            int var4 = var3.a();
            short var5 = 182;
            int var6 = var4 / 2 - var5 / 2;
            int var7 = (int)((float)var1.ax() / (float)var1.f_() * (float)(var5 + 1));
            byte var8 = 12;
            this.b(var6, var8, 0, 74, var5, 5);
            this.b(var6, var8, 0, 74, var5, 5);
            if(var7 > 0) {
                this.b(var6, var8, 0, 79, var7, 5);
            }

            String var9 = "Boss health";
            var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 16711935);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
        }
    }

    private void a(int var1, int var2) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/pumpkinblur.png"));
        cv var3 = cv.a;
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
        GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/vignette.png"));
        cv var4 = cv.a;
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
        GL11.glBindTexture(3553, this.g.p.b("/terrain.png"));
        float var4 = (float)(yy.be.bL % 16) / 16.0F;
        float var5 = (float)(yy.be.bL / 16) / 16.0F;
        float var6 = (float)(yy.be.bL % 16 + 1) / 16.0F;
        float var7 = (float)(yy.be.bL / 16 + 1) / 16.0F;
        cv var8 = cv.a;
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
        dk var5 = this.g.h.by.a[var1];
        if(var5 != null) {
            float var6 = (float)var5.b - var4;
            if(var6 > 0.0F) {
                GL11.glPushMatrix();
                float var7 = 1.0F + var6 / 5.0F;
                GL11.glTranslatef((float)(var2 + 8), (float)(var3 + 12), 0.0F);
                GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
                GL11.glTranslatef((float)(-(var2 + 8)), (float)(-(var3 + 12)), 0.0F);
            }

            d.a(this.g.q, this.g.p, var5, var2, var3);
            if(var6 > 0.0F) {
                GL11.glPopMatrix();
            }

            d.b(this.g.q, this.g.p, var5, var2, var3);
        }
    }

    public void a() {
        if(this.k > 0) {
            --this.k;
        }

        ++this.h;

        for(int var1 = 0; var1 < this.e.size(); ++var1) {
            ++((ahe)this.e.get(var1)).b;
        }
        ImprovedChat.tick();
    }

    public void b() {
        this.e.clear();
    }

    public void a(String var1) {
        /* while(this.g.q.a(var1) > 320) {
            int var2;
            for(var2 = 1; var2 < var1.length() && this.g.q.a(var1.substring(0, var2 + 1)) <= 320; ++var2) {
                ;
            }

            this.a(var1.substring(0, var2));
            var1 = var1.substring(var2);
        }

        this.e.add(0, new ahe(var1));

        while(this.e.size() > 50) {
            this.e.remove(this.e.size() - 1);
        } */

        this.e.add(0, new ahe(var1));
        ImprovedChat.receiveLine(var1);

    }

    public void b(String var1) {
        this.j = "Now playing: " + var1;
        this.k = 60;
        this.l = true;
    }

    public void c(String var1) {
        qp var2 = qp.a();
        String var3 = var2.a(var1);
        this.a(var3);
    }

}