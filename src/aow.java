import java.awt.Color;
import java.util.List;
import java.util.Random;

import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;
import org.lwjgl.opengl.GL12;

public class aow extends aox {

    private static final awh b = new awh();
    private final Random c = new Random();
    private final Minecraft d;
    private final aoi e;
    private int f = 0;
    private String g = "";
    private int h = 0;
    private boolean j = false;
    public float a = 1.0F;


    public aow(Minecraft var1) {
        this.d = var1;
        this.e = new aoi(var1);
        ImprovedChat.init(var1);
    }

    public void a(float var1, boolean var2, int var3, int var4) {
        apo var5 = new apo(this.d.y, this.d.c, this.d.d);
        int var6 = var5.a();
        int var7 = var5.b();
        aov var8 = this.d.p;
        this.d.t.c();
        GL11.glEnable(GL11.GL_BLEND);
        if (Minecraft.t()) {
            this.a(this.d.g.c(var1), var6, var7);
        } else {
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        }

        rj var9 = this.d.g.by.f(3);
        if (this.d.y.P == 0 && var9 != null && var9.c == aig.ba.ca) {
            this.a(var6, var7);
        }

        if (!this.d.g.a(ji.k)) {
            float var10 = this.d.g.cy + (this.d.g.bY - this.d.g.cy) * var1;
            if (var10 > 0.0F) {
                this.b(var10, var6, var7);
            }
        }

        boolean var11;
        int var12,var13,var17,var16,var19,var20,var23,var22,var47;

        if (!this.d.b.a()) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.d.o.b("/gui/gui.png"));
            of var31 = this.d.g.by;
            this.i = -90.0F;
            this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
            this.b(var6 / 2 - 91 - 1 + var31.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
            GL11.glEnable(GL11.GL_BLEND);
            GL11.glBlendFunc(GL11.GL_ONE_MINUS_DST_COLOR, GL11.GL_ONE_MINUS_SRC_COLOR);
            this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(GL11.GL_BLEND);
            var11 = this.d.g.ad / 3 % 2 == 1;
            if (this.d.g.ad < 10) {
                var11 = false;
            }

            var12 = this.d.g.aN();
            var13 = this.d.g.aL;
            this.c.setSeed((long) (this.f * 312871));
            boolean var14 = false;
            ou var15 = this.d.g.bL();
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
                var20 = this.d.g.bK();
                if (var20 > 0) {
                    short var21 = 182;
                    var22 = (int) (this.d.g.cc * (float) (var21 + 1));
                    var23 = var7 - 32 + 3;
                    this.b(var18, var23, 0, 64, var21, 5);
                    if (var22 > 0) {
                        this.b(var18, var23, 0, 69, var22, 5);
                    }
                }

                var47 = var7 - 39;
                var22 = var47 - 10;
                var23 = this.d.g.aO();
                int var24 = -1;
                if (this.d.g.a(ji.l)) {
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
                    if (this.d.g.a(ji.u)) {
                        var26 += 36;
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
                    if (this.d.e.H().s()) {
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

                int var52;
                for (var25 = 0; var25 < 10; ++var25) {
                    var26 = var47;
                    var52 = 16;
                    byte var53 = 0;
                    if (this.d.g.a(ji.s)) {
                        var52 += 36;
                        var53 = 13;
                    }

                    if (this.d.g.bL().e() <= 0.0F && this.f % (var16 * 3 + 1) == 0) {
                        var26 = var47 + (this.c.nextInt(3) - 1);
                    }

                    if (var14) {
                        var53 = 1;
                    }

                    var29 = var19 - var25 * 8 - 9;
                    this.b(var29, var26, 16 + var53 * 9, 27, 9, 9);
                    if (var14) {
                        if (var25 * 2 + 1 < var17) {
                            this.b(var29, var26, var52 + 54, 27, 9, 9);
                        }

                        if (var25 * 2 + 1 == var17) {
                            this.b(var29, var26, var52 + 63, 27, 9, 9);
                        }
                    }

                    if (var25 * 2 + 1 < var16) {
                        this.b(var29, var26, var52 + 36, 27, 9, 9);
                    }

                    if (var25 * 2 + 1 == var16) {
                        this.b(var29, var26, var52 + 45, 27, 9, 9);
                    }
                }

                this.d.I.c("air");
                if (this.d.g.a(aco.g)) {
                    var25 = this.d.g.ai();
                    var26 = ih.f((double) (var25 - 2) * 10.0D / 300.0D);
                    var52 = ih.f((double) var25 * 10.0D / 300.0D) - var26;

                    for (var28 = 0; var28 < var26 + var52; ++var28) {
                        if (var28 < var26) {
                            this.b(var19 - var28 * 8 - 9, var22, 16, 18, 9, 9);
                        } else {
                            this.b(var19 - var28 * 8 - 9, var22, 25, 18, 9, 9);
                        }
                    }
                }

                this.d.I.b();
            }

            GL11.glDisable(GL11.GL_BLEND);
            this.d.I.a("actionBar");
            GL11.glEnable(GL12.GL_RESCALE_NORMAL);
            ang.c();

            for (var18 = 0; var18 < 9; ++var18) {
                var19 = var6 / 2 - 90 + var18 * 20 + 2;
                var20 = var7 - 16 - 3;
                this.a(var18, var19, var20, var1);
            }

            ang.a();
            GL11.glDisable(GL12.GL_RESCALE_NORMAL);
            this.d.I.b();
        }

        float var33;
        if (this.d.g.bI() > 0) {
            this.d.I.a("sleep");
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glDisable(GL11.GL_ALPHA_TEST);
            int var32 = this.d.g.bI();
            var33 = (float) var32 / 100.0F;
            if (var33 > 1.0F) {
                var33 = 1.0F - (float) (var32 - 100) / 10.0F;
            }

            var12 = (int) (220.0F * var33) << 24 | 1052704;
            a(0, 0, var6, var7, var12);
            GL11.glEnable(GL11.GL_ALPHA_TEST);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
            this.d.I.b();
        }

        int var38;
        int var40;
        if (this.d.b.f() && this.d.g.ca > 0) {
            this.d.I.a("expLevel");
            var11 = false;
            var12 = var11 ? 16777215 : 8453920;
            String var35 = "" + this.d.g.ca;
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
            if (this.d.e.D() >= 120500L) {
                var36 = aj.a("demo.demoExpired");
            } else {
                var36 = String.format(aj.a("demo.remainingTime"), new Object[]{ip.a((int) (120500L - this.d.e.D()))});
            }

            var12 = var8.a(var36);
            var8.a(var36, var6 - var12 - 10, 5, 16777215);
            this.d.I.b();
        }

        if (this.d.y.Q) {
            this.d.I.a("debug");
            GL11.glPushMatrix();
            var8.a("Minecraft 1.3.2 (" + this.d.K + ")", 2, 2, 16777215);
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
            this.b(var8, String.format("x: %.5f", new Object[]{Double.valueOf(this.d.g.t)}), 2, 64, 14737632);
            this.b(var8, String.format("y: %.3f (feet pos, %.3f eyes pos)", new Object[]{Double.valueOf(this.d.g.D.b), Double.valueOf(this.d.g.u)}), 2, 72, 14737632);
            this.b(var8, String.format("z: %.5f", new Object[]{Double.valueOf(this.d.g.v)}), 2, 80, 14737632);
            this.b(var8, "f: " + (ih.c((double) (this.d.g.z * 4.0F / 360.0F) + 0.5D) & 3), 2, 88, 14737632);
            var47 = ih.c(this.d.g.t);
            var22 = ih.c(this.d.g.u);
            var23 = ih.c(this.d.g.v);
            if (this.d.e != null && this.d.e.e(var47, var22, var23)) {
                wl var48 = this.d.e.d(var47, var23);
                this.b(var8, "lc: " + (var48.h() + 15) + " b: " + var48.a(var47 & 15, var23 & 15, this.d.e.r()).y + " bl: " + var48.a(vb.b, var47 & 15, var22, var23 & 15) + " sl: " + var48.a(vb.a, var47 & 15, var22, var23 & 15) + " rl: " + var48.c(var47 & 15, var22, var23 & 15, 0), 2, 96, 14737632);
            }

            this.b(var8, String.format("ws: %.3f, fs: %.3f, g: %b", new Object[]{Float.valueOf(this.d.g.bZ.b()), Float.valueOf(this.d.g.bZ.a()), Boolean.valueOf(this.d.g.E)}), 2, 104, 14737632);
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
                GL11.glEnable(GL11.GL_BLEND);
                GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
                var13 = 16777215;
                if (this.j) {
                    var13 = Color.HSBtoRGB(var33 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                var8.b(this.g, -var8.a(this.g) / 2, -4, var13 + (var12 << 24));
                GL11.glDisable(GL11.GL_BLEND);
                GL11.glPopMatrix();
            }

            this.d.I.b();
        }

        GL11.glEnable(GL11.GL_BLEND);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float) (var7 - 48), 0.0F);
        this.d.I.a("chat");
        this.e.a(this.f);
        this.d.I.b();
        GL11.glPopMatrix();
        if (this.d.y.I.e && (!this.d.A() || this.d.g.a.c.size() > 1)) {
            this.d.I.a("playerList");
            asv var37 = this.d.g.a;
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
                GL11.glEnable(GL11.GL_ALPHA_TEST);
                if (var19 < var39.size()) {
                    ath var46 = (ath) var39.get(var19);
                    var8.a(var46.a, var20, var47, 16777215);
                    this.d.o.b(this.d.o.b("/gui/icons.png"));
                    byte var51 = 0;
                    boolean var49 = false;
                    byte var50;
                    if (var46.b < 0) {
                        var50 = 5;
                    } else if (var46.b < 150) {
                        var50 = 0;
                    } else if (var46.b < 300) {
                        var50 = 1;
                    } else if (var46.b < 600) {
                        var50 = 2;
                    } else if (var46.b < 1000) {
                        var50 = 3;
                    } else {
                        var50 = 4;
                    }

                    this.i += 100.0F;
                    this.b(var20 + var16 - 12, var47, 0 + var51 * 10, 176 + var50 * 8, 10, 8);
                    this.i -= 100.0F;
                }
            }
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
    }

    private void d() {
        if (avw.a != null) {
            nd var1 = avw.a;
            avw.a = null;
            aov var2 = this.d.p;
            apo var3 = new apo(this.d.y, this.d.c, this.d.d);
            int var4 = var3.a();
            short var5 = 182;
            int var6 = var4 / 2 - var5 / 2;
            int var7 = (int) ((float) var1.i() / (float) var1.aM() * (float) (var5 + 1));
            byte var8 = 12;
            this.b(var6, var8, 0, 74, var5, 5);
            this.b(var6, var8, 0, 74, var5, 5);
            if (var7 > 0) {
                this.b(var6, var8, 0, 79, var7, 5);
            }

            String var9 = "Boss health";
            var2.a(var9, var4 / 2 - var2.a(var9) / 2, var8 - 10, 16711935);
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.d.o.b("/gui/icons.png"));
        }
    }

    private void a(int var1, int var2) {
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, this.d.o.b("%blur%/misc/pumpkinblur.png"));
        ave var3 = ave.a;
        var3.b();
        var3.a(0.0D, (double) var2, -90.0D, 0.0D, 1.0D);
        var3.a((double) var1, (double) var2, -90.0D, 1.0D, 1.0D);
        var3.a((double) var1, 0.0D, -90.0D, 1.0D, 0.0D);
        var3.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        var3.a();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
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
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, GL11.GL_ONE_MINUS_SRC_COLOR);
        GL11.glColor4f(this.a, this.a, this.a, 1.0F);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, this.d.o.b("%blur%/misc/vignette.png"));
        ave var4 = ave.a;
        var4.b();
        var4.a(0.0D, (double) var3, -90.0D, 0.0D, 1.0D);
        var4.a((double) var2, (double) var3, -90.0D, 1.0D, 1.0D);
        var4.a((double) var2, 0.0D, -90.0D, 1.0D, 0.0D);
        var4.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        var4.a();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
    }

    private void b(float var1, int var2, int var3) {
        if (var1 < 1.0F) {
            var1 *= var1;
            var1 *= var1;
            var1 = var1 * 0.8F + 0.2F;
        }

        GL11.glDisable(GL11.GL_ALPHA_TEST);
        GL11.glDisable(GL11.GL_DEPTH_TEST);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, var1);
        GL11.glBindTexture(GL11.GL_TEXTURE_2D, this.d.o.b("/terrain.png"));
        float var4 = (float) (aig.be.bZ % 16) / 16.0F;
        float var5 = (float) (aig.be.bZ / 16) / 16.0F;
        float var6 = (float) (aig.be.bZ % 16 + 1) / 16.0F;
        float var7 = (float) (aig.be.bZ / 16 + 1) / 16.0F;
        ave var8 = ave.a;
        var8.b();
        var8.a(0.0D, (double) var3, -90.0D, (double) var4, (double) var7);
        var8.a((double) var2, (double) var3, -90.0D, (double) var6, (double) var7);
        var8.a((double) var2, 0.0D, -90.0D, (double) var6, (double) var5);
        var8.a(0.0D, 0.0D, -90.0D, (double) var4, (double) var5);
        var8.a();
        GL11.glDepthMask(true);
        GL11.glEnable(GL11.GL_DEPTH_TEST);
        GL11.glEnable(GL11.GL_ALPHA_TEST);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(int var1, int var2, int var3, float var4) {
        rj var5 = this.d.g.by.a[var1];
        if (var5 != null) {
            float var6 = (float) var5.b - var4;
            if (var6 > 0.0F) {
                GL11.glPushMatrix();
                float var7 = 1.0F + var6 / 5.0F;
                GL11.glTranslatef((float) (var2 + 8), (float) (var3 + 12), 0.0F);
                GL11.glScalef(1.0F / var7, (var7 + 1.0F) / 2.0F, 1.0F);
                GL11.glTranslatef((float) (-(var2 + 8)), (float) (-(var3 + 12)), 0.0F);
            }

            b.a(this.d.p, this.d.o, var5, var2, var3);
            if (var6 > 0.0F) {
                GL11.glPopMatrix();
            }

            b.b(this.d.p, this.d.o, var5, var2, var3);
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
        this.j = true;
    }

    public aoi b() {
        return this.e;
    }

    public int c() {
        return this.f;
    }

}