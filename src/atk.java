import java.awt.Color;
import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class atk extends atl {

    private static final bbt b = new bbt();
    private final Random c = new Random();
    private final Minecraft d;
    private final asu e;
    private int f = 0;
    private String g = "";
    private int h = 0;
    private boolean var_i = false;
    public float a = 1.0F;


    public atk(Minecraft var1) {
        this.d = var1;
        this.e = new asu(var1);
        ImprovedChat.init(var1);
    }

    public void a(float var1, boolean var2, int var3, int var4) {
        auf var5 = new auf(this.d.y, this.d.c, this.d.d);
        int var6 = var5.a();
        int var7 = var5.b();
        atj var8 = this.d.p;
        this.d.t.c();
        GL11.glEnable(3042);
        if (Minecraft.t()) {
            this.a(this.d.g.c(var1), var6, var7);
        } else {
            GL11.glBlendFunc(770, 771);
        }

        um var9 = this.d.g.bI.f(3);
        if (this.d.y.T == 0 && var9 != null && var9.c == amj.bd.cm) {
            this.a(var6, var7);
        }

        if (!this.d.g.a(ll.k)) {
            float var10 = this.d.g.cj + (this.d.g.j - this.d.g.cj) * var1;
            if (var10 > 0.0F) {
                this.b(var10, var6, var7);
            }
        }

        boolean var11;
        int var12;
        int var13;
        int var17;
        int var16;
        int var19;
        int var20;
        int var23;
        int var22;
        int var24;
        int var47;
        if (!this.d.b.a()) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.d.o.b("/gui/gui.png"));
            qw var31 = this.d.g.bI;
            this.j = -90.0F;
            this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
            this.b(var6 / 2 - 91 - 1 + var31.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            var11 = this.d.g.ae / 3 % 2 == 1;
            if (this.d.g.ae < 10) {
                var11 = false;
            }

            var12 = this.d.g.aU();
            var13 = this.d.g.aR;
            this.c.setSeed((long) (this.f * 312871));
            boolean var14 = false;
            ro var15 = this.d.g.cd();
            var16 = var15.a();
            var17 = var15.b();
            this.d.I.a("bossHealth");
            this.d();
            this.d.I.b();
            int var18;
            if (this.d.b.b()) {
                var18 = var6 / 2 - 91;
                var19 = var6 / 2 + 91;
                this.d.I.a("expBar");
                var20 = this.d.g.cc();
                if (var20 > 0) {
                    short var21 = 182;
                    var22 = (int) (this.d.g.cf * (float) (var21 + 1));
                    var23 = var7 - 32 + 3;
                    this.b(var18, var23, 0, 64, var21, 5);
                    if (var22 > 0) {
                        this.b(var18, var23, 0, 69, var22, 5);
                    }
                }

                var47 = var7 - 39;
                var22 = var47 - 10;
                var23 = this.d.g.aW();
                var24 = -1;
                if (this.d.g.a(ll.l)) {
                    var24 = this.f % 25;
                }

                this.d.I.c("healthArmor");

                int var25;
                int var26;
                int var29;
                int var28;
                for (var25 = 0; var25 < 10; ++var25) {
                    if (var23 > 0) {
                        var26 = var18 + var25 * 8;
                        if (var25 * 2 + 1 < var23) {
                            this.b(var26, var22, 34, 9, 9, 9);
                        }

                        if (var25 * 2 + 1 == var23) {
                            this.b(var26, var22, 25, 9, 9, 9);
                        }

                        if (var25 * 2 + 1 > var23) {
                            this.b(var26, var22, 16, 9, 9, 9);
                        }
                    }

                    var26 = 16;
                    if (this.d.g.a(ll.u)) {
                        var26 += 36;
                    } else if (this.d.g.a(ll.v)) {
                        var26 += 72;
                    }

                    byte var27 = 0;
                    if (var11) {
                        var27 = 1;
                    }

                    var28 = var18 + var25 * 8;
                    var29 = var47;
                    if (var12 <= 4) {
                        var29 = var47 + this.c.nextInt(2);
                    }

                    if (var25 == var24) {
                        var29 -= 2;
                    }

                    byte var30 = 0;
                    if (this.d.e.K().t()) {
                        var30 = 5;
                    }

                    this.b(var28, var29, 16 + var27 * 9, 9 * var30, 9, 9);
                    if (var11) {
                        if (var25 * 2 + 1 < var13) {
                            this.b(var28, var29, var26 + 54, 9 * var30, 9, 9);
                        }

                        if (var25 * 2 + 1 == var13) {
                            this.b(var28, var29, var26 + 63, 9 * var30, 9, 9);
                        }
                    }

                    if (var25 * 2 + 1 < var12) {
                        this.b(var28, var29, var26 + 36, 9 * var30, 9, 9);
                    }

                    if (var25 * 2 + 1 == var12) {
                        this.b(var28, var29, var26 + 45, 9 * var30, 9, 9);
                    }
                }

                this.d.I.c("food");

                int var51;
                for (var25 = 0; var25 < 10; ++var25) {
                    var26 = var47;
                    var51 = 16;
                    byte var52 = 0;
                    if (this.d.g.a(ll.s)) {
                        var51 += 36;
                        var52 = 13;
                    }

                    if (this.d.g.cd().e() <= 0.0F && this.f % (var16 * 3 + 1) == 0) {
                        var26 = var47 + (this.c.nextInt(3) - 1);
                    }

                    if (var14) {
                        var52 = 1;
                    }

                    var29 = var19 - var25 * 8 - 9;
                    this.b(var29, var26, 16 + var52 * 9, 27, 9, 9);
                    if (var14) {
                        if (var25 * 2 + 1 < var17) {
                            this.b(var29, var26, var51 + 54, 27, 9, 9);
                        }

                        if (var25 * 2 + 1 == var17) {
                            this.b(var29, var26, var51 + 63, 27, 9, 9);
                        }
                    }

                    if (var25 * 2 + 1 < var16) {
                        this.b(var29, var26, var51 + 36, 27, 9, 9);
                    }

                    if (var25 * 2 + 1 == var16) {
                        this.b(var29, var26, var51 + 45, 27, 9, 9);
                    }
                }

                this.d.I.c("air");
                if (this.d.g.a(agb.h)) {
                    var25 = this.d.g.al();
                    var26 = ke.f((double) (var25 - 2) * 10.0D / 300.0D);
                    var51 = ke.f((double) var25 * 10.0D / 300.0D) - var26;

                    for (var28 = 0; var28 < var26 + var51; ++var28) {
                        if (var28 < var26) {
                            this.b(var19 - var28 * 8 - 9, var22, 16, 18, 9, 9);
                        } else {
                            this.b(var19 - var28 * 8 - 9, var22, 25, 18, 9, 9);
                        }
                    }
                }

                this.d.I.b();
            }

            GL11.glDisable(3042);
            this.d.I.a("actionBar");
            GL11.glEnable('\u803a');
            aro.c();

            for (var18 = 0; var18 < 9; ++var18) {
                var19 = var6 / 2 - 90 + var18 * 20 + 2;
                var20 = var7 - 16 - 3;
                this.a(var18, var19, var20, var1);
            }

            aro.a();
            GL11.glDisable('\u803a');
            this.d.I.b();
        }

        float var33;
        if (this.d.g.bZ() > 0) {
            this.d.I.a("sleep");
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            int var32 = this.d.g.bZ();
            var33 = (float) var32 / 100.0F;
            if (var33 > 1.0F) {
                var33 = 1.0F - (float) (var32 - 100) / 10.0F;
            }

            var12 = (int) (220.0F * var33) << 24 | 1052704;
            a(0, 0, var6, var7, var12);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
            this.d.I.b();
        }

        int var38;
        int var40;
        if (this.d.b.f() && this.d.g.cd > 0) {
            this.d.I.a("expLevel");
            var11 = false;
            var12 = var11 ? 16777215 : 8453920;
            String var35 = "" + this.d.g.cd;
            var40 = (var6 - var8.a(var35)) / 2;
            var38 = var7 - 31 - 4;
            var8.b(var35, var40 + 1, var38, 0);
            var8.b(var35, var40 - 1, var38, 0);
            var8.b(var35, var40, var38 + 1, 0);
            var8.b(var35, var40, var38 - 1, 0);
            var8.b(var35, var40, var38, var12);
            this.d.I.b();
        }

        if (this.d.q()) {
            this.d.I.a("demo");
            String var36 = "";
            if (this.d.e.F() >= 120500L) {
                var36 = bm.a("demo.demoExpired");
            } else {
                var36 = String.format(bm.a("demo.remainingTime"), new Object[]{km.a((int) (120500L - this.d.e.F()))});
            }

            var12 = var8.a(var36);
            var8.a(var36, var6 - var12 - 10, 5, 16777215);
            this.d.I.b();
        }

        if (this.d.y.U) {
            this.d.I.a("debug");
            GL11.glPushMatrix();
            var8.a("Minecraft 1.4.5 (" + this.d.K + ")", 2, 2, 16777215);
            var8.a(this.d.m(), 2, 12, 16777215);
            var8.a(this.d.n(), 2, 22, 16777215);
            var8.a(this.d.p(), 2, 32, 16777215);
            var8.a(this.d.o(), 2, 42, 16777215);
            long var41 = Runtime.getRuntime().maxMemory();
            long var34 = Runtime.getRuntime().totalMemory();
            long var42 = Runtime.getRuntime().freeMemory();
            long var43 = var34 - var42;
            String var45 = "Used memory: " + var43 * 100L / var41 + "% (" + var43 / 1024L / 1024L + "MB) of " + var41 / 1024L / 1024L + "MB";
            this.b(var8, var45, var6 - var8.a(var45) - 2, 2, 14737632);
            var45 = "Allocated memory: " + var34 * 100L / var41 + "% (" + var34 / 1024L / 1024L + "MB)";
            this.b(var8, var45, var6 - var8.a(var45) - 2, 12, 14737632);
            var47 = ke.c(this.d.g.t);
            var22 = ke.c(this.d.g.u);
            var23 = ke.c(this.d.g.v);
            this.b(var8, String.format("x: %.5f (%d) // c: %d (%d)", new Object[]{Double.valueOf(this.d.g.t), Integer.valueOf(var47), Integer.valueOf(var47 >> 4), Integer.valueOf(var47 & 15)}), 2, 64, 14737632);
            this.b(var8, String.format("y: %.3f (feet pos, %.3f eyes pos)", new Object[]{Double.valueOf(this.d.g.D.b), Double.valueOf(this.d.g.u)}), 2, 72, 14737632);
            this.b(var8, String.format("z: %.5f (%d) // c: %d (%d)", new Object[]{Double.valueOf(this.d.g.v), Integer.valueOf(var23), Integer.valueOf(var23 >> 4), Integer.valueOf(var23 & 15)}), 2, 80, 14737632);
            var24 = ke.c((double) (this.d.g.z * 4.0F / 360.0F) + 0.5D) & 3;
            this.b(var8, "f: " + var24 + " (" + q.c[var24] + ") / " + ke.g(this.d.g.z), 2, 88, 14737632);
            if (this.d.e != null && this.d.e.f(var47, var22, var23)) {
                zs var53 = this.d.e.d(var47, var23);
                this.b(var8, "lc: " + (var53.h() + 15) + " b: " + var53.a(var47 & 15, var23 & 15, this.d.e.t()).y + " bl: " + var53.a(yh.b, var47 & 15, var22, var23 & 15) + " sl: " + var53.a(yh.a, var47 & 15, var22, var23 & 15) + " rl: " + var53.c(var47 & 15, var22, var23 & 15, 0), 2, 96, 14737632);
            }

            this.b(var8, String.format("ws: %.3f, fs: %.3f, g: %b, fl: %d", new Object[]{Float.valueOf(this.d.g.cc.b()), Float.valueOf(this.d.g.cc.a()), Boolean.valueOf(this.d.g.E), Integer.valueOf(this.d.e.f(var47, var23))}), 2, 104, 14737632);
            GL11.glPopMatrix();
            this.d.I.b();
        }

        if (this.h > 0) {
            this.d.I.a("overlayMessage");
            var33 = (float) this.h - var1;
            var12 = (int) (var33 * 256.0F / 20.0F);
            if (var12 > 255) {
                var12 = 255;
            }

            if (var12 > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float) (var6 / 2), (float) (var7 - 48), 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                var13 = 16777215;
                if (this.var_i) {
                    var13 = Color.HSBtoRGB(var33 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                var8.b(this.g, -var8.a(this.g) / 2, -4, var13 + (var12 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }

            this.d.I.b();
        }

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float) (var7 - 48), 0.0F);
        this.d.I.a("chat");
        this.e.a(this.f);
        this.d.I.b();
        GL11.glPopMatrix();
        if (this.d.y.M.e && (!this.d.A() || this.d.g.a.c.size() > 1)) {
            this.d.I.a("playerList");
            axz var37 = this.d.g.a;
            List var39 = var37.c;
            var13 = var37.d;
            var40 = var13;

            for (var38 = 1; var40 > 20; var40 = (var13 + var38 - 1) / var38) {
                ++var38;
            }

            var16 = 300 / var38;
            if (var16 > 150) {
                var16 = 150;
            }

            var17 = (var6 - var38 * var16) / 2;
            byte var44 = 10;
            a(var17 - 1, var44 - 1, var17 + var16 * var38, var44 + 9 * var40, Integer.MIN_VALUE);

            for (var19 = 0; var19 < var13; ++var19) {
                var20 = var17 + var19 % var38 * var16;
                var47 = var44 + var19 / var38 * 9;
                a(var20, var47, var20 + var16 - 1, var47 + 8, 553648127);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if (var19 < var39.size()) {
                    ayl var46 = (ayl) var39.get(var19);
                    var8.a(var46.a, var20, var47, 16777215);
                    this.d.o.b(this.d.o.b("/gui/icons.png"));
                    byte var50 = 0;
                    boolean var48 = false;
                    byte var49;
                    if (var46.b < 0) {
                        var49 = 5;
                    } else if (var46.b < 150) {
                        var49 = 0;
                    } else if (var46.b < 300) {
                        var49 = 1;
                    } else if (var46.b < 600) {
                        var49 = 2;
                    } else if (var46.b < 1000) {
                        var49 = 3;
                    } else {
                        var49 = 4;
                    }

                    this.j += 100.0F;
                    this.b(var20 + var16 - 12, var47, 0 + var50 * 10, 176 + var49 * 8, 10, 8);
                    this.j -= 100.0F;
                }
            }
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private void d() {
        if (azx.c != null && azx.b > 0) {
            --azx.b;
            atj var1 = this.d.p;
            auf var2 = new auf(this.d.y, this.d.c, this.d.d);
            int var3 = var2.a();
            short var4 = 182;
            int var5 = var3 / 2 - var4 / 2;
            int var6 = (int) (azx.a * (float) (var4 + 1));
            byte var7 = 12;
            this.b(var5, var7, 0, 74, var4, 5);
            this.b(var5, var7, 0, 74, var4, 5);
            if (var6 > 0) {
                this.b(var5, var7, 0, 79, var6, 5);
            }

            String var8 = azx.c;
            var1.a(var8, var3 / 2 - var1.a(var8) / 2, var7 - 10, 16777215);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
        }
    }

    private void a(int var1, int var2) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, this.d.o.b("%blur%/misc/pumpkinblur.png"));
        bao var3 = bao.a;
        var3.b();
        var3.a(0.0D, (double) var2, -90.0D, 0.0D, 1.0D);
        var3.a((double) var1, (double) var2, -90.0D, 1.0D, 1.0D);
        var3.a((double) var1, 0.0D, -90.0D, 1.0D, 0.0D);
        var3.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        var3.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(float var1, int var2, int var3) {
        var1 = 1.0F - var1;
        if (var1 < 0.0F) {
            var1 = 0.0F;
        }

        if (var1 > 1.0F) {
            var1 = 1.0F;
        }

        this.a = (float) ((double) this.a + (double) (var1 - this.a) * 0.01D);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(this.a, this.a, this.a, 1.0F);
        GL11.glBindTexture(3553, this.d.o.b("%blur%/misc/vignette.png"));
        bao var4 = bao.a;
        var4.b();
        var4.a(0.0D, (double) var3, -90.0D, 0.0D, 1.0D);
        var4.a((double) var2, (double) var3, -90.0D, 1.0D, 1.0D);
        var4.a((double) var2, 0.0D, -90.0D, 1.0D, 0.0D);
        var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        var4.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(770, 771);
    }

    private void b(float var1, int var2, int var3) {
        if (var1 < 1.0F) {
            var1 *= var1;
            var1 *= var1;
            var1 = var1 * 0.8F + 0.2F;
        }

        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
        GL11.glBindTexture(3553, this.d.o.b("/terrain.png"));
        float var4 = (float) (amj.bh.cl % 16) / 16.0F;
        float var5 = (float) (amj.bh.cl / 16) / 16.0F;
        float var6 = (float) (amj.bh.cl % 16 + 1) / 16.0F;
        float var7 = (float) (amj.bh.cl / 16 + 1) / 16.0F;
        bao var8 = bao.a;
        var8.b();
        var8.a(0.0D, (double) var3, -90.0D, (double) var4, (double) var7);
        var8.a((double) var2, (double) var3, -90.0D, (double) var6, (double) var7);
        var8.a((double) var2, 0.0D, -90.0D, (double) var6, (double) var5);
        var8.a(0.0D, 0.0D, -90.0D, (double) var4, (double) var5);
        var8.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(int var1, int var2, int var3, float var4) {
        um var5 = this.d.g.bI.a[var1];
        if (var5 != null) {
            float var6 = (float) var5.b - var4;
            if (var6 > 0.0F) {
                GL11.glPushMatrix();
                float var7 = 1.0F + var6 / 5.0F;
                GL11.glTranslatef((float) (var2 + 8), (float) (var3 + 12), 0.0F);
                GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
                GL11.glTranslatef((float) (-(var2 + 8)), (float) (-(var3 + 12)), 0.0F);
            }

            b.b(this.d.p, this.d.o, var5, var2, var3);
            if (var6 > 0.0F) {
                GL11.glPopMatrix();
            }

            b.c(this.d.p, this.d.o, var5, var2, var3);
        }
    }

    public void a() {
        if (this.h > 0) {
            --this.h;
        }

        ++this.f;
    }

    public void a(String var1) {
        this.g = "Now playing: " + var1;
        this.h = 60;
        this.var_i = true;
    }

    public asu b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

}
