import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class abj extends lf {

    private static pj d = new pj();
    private List<kq> f = new ArrayList<kq>();
    private Random g = new Random();
    private Minecraft h;
    public String a = null;
    public int i = 0;
    private String j = "";
    private int k = 0;
    private boolean l = false;
    public float b;
    float c = 1.0F;
    private Object minimap = null;
    private boolean ReiMiniMap = false;
    private static int fade = 0;
    public static int commandScroll = 0;


    public abj(Minecraft var1) {

        this.h = var1;
        ImprovedChat.init(var1);
        // minimap = (Class.forName("ReiMinimap")!=null)?ReiMiniMap=true:ReiMiniMap=false;
        ClassLoader CL = abj.class.getClassLoader();
        if(CL.getResource("ReiMinimap.class") != null)
            ReiMiniMap = true;
    }

    public void a(float var1, boolean var2, int var3, int var4) {
        za var5 = new za(this.h.z, this.h.d, this.h.e);
        int var6 = var5.a();
        int var7 = var5.b();
        kh var8 = this.h.q;
        this.h.t.b();
        GL11.glEnable(3042);
        if(Minecraft.u()) {
            this.a(this.h.h.b(var1), var6, var7);
        }

        ul var9 = this.h.h.as.e(3);
        if(!this.h.z.D && var9 != null && var9.c == lr.bb.bA) {
            this.a(var6, var7);
        }

        float var10;
        if(!this.h.h.a(ud.k)) {
            var10 = this.h.h.aV + (this.h.h.aU - this.h.h.aV) * var1;
            if(var10 > 0.0F) {
                this.b(var10, var6, var7);
            }
        }

        boolean var11;
        int var12;
        int var17;
        int var16;
        int var18;
        int var20;
        int var22;
        int var47;
        if(!this.h.c.e()) {
            GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
            GL11.glBindTexture(3553, this.h.p.b("/gui/gui.png"));
            ui var31 = this.h.h.as;
            this.e = -90.0F;
            this.b(var6 / 2 - 91, var7 - 22, 0, 0, 182, 22);
            this.b(var6 / 2 - 91 - 1 + var31.c * 20, var7 - 22 - 1, 0, 22, 24, 22);
            GL11.glBindTexture(3553, this.h.p.b("/gui/icons.png"));
            GL11.glEnable(3042);
            GL11.glBlendFunc(775, 769);
            this.b(var6 / 2 - 7, var7 / 2 - 7, 0, 0, 16, 16);
            GL11.glDisable(3042);
            var11 = this.h.h.aa / 3 % 2 == 1;
            if(this.h.h.aa < 10) {
                var11 = false;
            }

            var12 = this.h.h.bz;
            int var13 = this.h.h.bA;
            this.g.setSeed((long)(this.i * 312871));
            boolean var14 = false;
            kc var15 = this.h.h.at();
            var16 = var15.a();
            var17 = var15.b();
            int var19;
            if(this.h.c.d()) {
                var18 = var6 / 2 - 91;
                var19 = var6 / 2 + 91;
                var20 = this.h.h.as();
                int var23;
                if(var20 > 0) {
                    short var21 = 182;
                    var22 = this.h.h.aX * (var21 + 1) / this.h.h.as();
                    var23 = var7 - 32 + 3;
                    this.b(var18, var23, 0, 64, var21, 5);
                    if(var22 > 0) {
                        this.b(var18, var23, 0, 69, var22, 5);
                    }
                }

                var47 = var7 - 39;
                var22 = var47 - 10;
                var23 = this.h.h.V();
                int var24 = -1;
                if(this.h.h.a(ud.l)) {
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
                    if(this.h.h.a(ud.u)) {
                        var26 += 36;
                    }

                    byte var27 = 0;
                    if(var11) {
                        var27 = 1;
                    }

                    int var28 = var18 + var25 * 8;
                    var29 = var47;
                    if(var12 <= 4) {
                        var29 = var47 + this.g.nextInt(2);
                    }

                    if(var25 == var24) {
                        var29 -= 2;
                    }

                    this.b(var28, var29, 16 + var27 * 9, 0, 9, 9);
                    if(var11) {
                        if(var25 * 2 + 1 < var13) {
                            this.b(var28, var29, var26 + 54, 0, 9, 9);
                        }

                        if(var25 * 2 + 1 == var13) {
                            this.b(var28, var29, var26 + 63, 0, 9, 9);
                        }
                    }

                    if(var25 * 2 + 1 < var12) {
                        this.b(var28, var29, var26 + 36, 0, 9, 9);
                    }

                    if(var25 * 2 + 1 == var12) {
                        this.b(var28, var29, var26 + 45, 0, 9, 9);
                    }
                }

                int var51;
                for(var25 = 0; var25 < 10; ++var25) {
                    var26 = var47;
                    var51 = 16;
                    byte var52 = 0;
                    if(this.h.h.a(ud.s)) {
                        var51 += 36;
                        var52 = 13;
                    }

                    if(this.h.h.at().d() <= 0.0F && this.i % (var16 * 3 + 1) == 0) {
                        var26 = var47 + (this.g.nextInt(3) - 1);
                    }

                    if(var14) {
                        var52 = 1;
                    }

                    var29 = var19 - var25 * 8 - 9;
                    this.b(var29, var26, 16 + var52 * 9, 27, 9, 9);
                    if(var14) {
                        if(var25 * 2 + 1 < var17) {
                            this.b(var29, var26, var51 + 54, 27, 9, 9);
                        }

                        if(var25 * 2 + 1 == var17) {
                            this.b(var29, var26, var51 + 63, 27, 9, 9);
                        }
                    }

                    if(var25 * 2 + 1 < var16) {
                        this.b(var29, var26, var51 + 36, 27, 9, 9);
                    }

                    if(var25 * 2 + 1 == var16) {
                        this.b(var29, var26, var51 + 45, 27, 9, 9);
                    }
                }

                if(this.h.h.a(wa.g)) {
                    var25 = (int)Math.ceil((double)(this.h.h.ab - 2) * 10.0D / 300.0D);
                    var26 = (int)Math.ceil((double)this.h.h.ab * 10.0D / 300.0D) - var25;

                    for(var51 = 0; var51 < var25 + var26; ++var51) {
                        if(var51 < var25) {
                            this.b(var19 - var51 * 8 - 9, var22, 16, 18, 9, 9);
                        } else {
                            this.b(var19 - var51 * 8 - 9, var22, 25, 18, 9, 9);
                        }
                    }
                }
            }

            GL11.glDisable(3042);
            GL11.glEnable('\u803a');
            GL11.glPushMatrix();
            GL11.glRotatef(120.0F, 1.0F, 0.0F, 0.0F);
            ow.b();
            GL11.glPopMatrix();

            for(var18 = 0; var18 < 9; ++var18) {
                var19 = var6 / 2 - 90 + var18 * 20 + 2;
                var20 = var7 - 16 - 3;
                this.a(var18, var19, var20, var1);
            }

            ow.a();
            GL11.glDisable('\u803a');
        }

        if(this.h.h.ap() > 0) {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            int var32 = this.h.h.ap();
            float var35 = (float)var32 / 100.0F;
            if(var35 > 1.0F) {
                var35 = 1.0F - (float)(var32 - 100) / 10.0F;
            }

            var12 = (int)(220.0F * var35) << 24 | 1052704;
            this.a(0, 0, var6, var7, var12);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }

        if(this.h.c.f() && this.h.h.aY > 0) {
            ;
        }

        String var45;
        if(this.h.z.E) {
            GL11.glPushMatrix();
            if(Minecraft.I > 0L) {
                GL11.glTranslatef(0.0F, 32.0F, 0.0F);
            }

            var8.a("Minecraft Beta 1.8.1 (" + this.h.L + ")", 2, 2, 16777215);
            var8.a(this.h.o(), 2, 12, 16777215);
            var8.a(this.h.p(), 2, 22, 16777215);
            var8.a(this.h.r(), 2, 32, 16777215);
            var8.a(this.h.q(), 2, 42, 16777215);
            long var30 = Runtime.getRuntime().maxMemory();
            long var33 = Runtime.getRuntime().totalMemory();
            long var39 = Runtime.getRuntime().freeMemory();
            long var43 = var33 - var39;
            var45 = "Used memory: " + var43 * 100L / var30 + "% (" + var43 / 1024L / 1024L + "MB) of " + var30 / 1024L / 1024L + "MB";
            this.b(var8, var45, var6 - var8.a(var45) - 2, 2, 14737632);
            var45 = "Allocated memory: " + var33 * 100L / var30 + "% (" + var33 / 1024L / 1024L + "MB)";
            this.b(var8, var45, var6 - var8.a(var45) - 2, 12, 14737632);
            this.b(var8, "x: " + this.h.h.o, 2, 64, 14737632);
            this.b(var8, "y: " + this.h.h.p, 2, 72, 14737632);
            this.b(var8, "z: " + this.h.h.q, 2, 80, 14737632);
            this.b(var8, "f: " + (et.b((double)(this.h.h.u * 4.0F / 360.0F) + 0.5D) & 3), 2, 88, 14737632);
            this.b(var8, "Seed: " + this.h.f.s(), 2, 104, 14737632);
            GL11.glPopMatrix();
        } else {
            var8.a("Minecraft Beta 1.8.1 ", 2, 2, 16777215);
        }
        if(ReiMiniMap) {
            if(!ReiMinimap.instance.useModloader) {
                ReiMinimap.instance.onTickInGame(this.h);
            }
        }

        if(this.k > 0) {
            var10 = (float)this.k - var1;
            int var36 = (int)(var10 * 256.0F / 20.0F);
            if(var36 > 255) {
                var36 = 255;
            }

            if(var36 > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(var6 / 2), (float)(var7 - 48), 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                var12 = 16777215;
                if(this.l) {
                    var12 = Color.HSBtoRGB(var10 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                var8.b(this.j, -var8.a(this.j) / 2, -4, var12 + (var36 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }



        byte var34 = ImprovedChat.ChatLinesSmall;
        var11 = false;
        if(this.h.r instanceof so) {
            var34 = ImprovedChat.ChatLinesBig;
            var11 = true;
        }

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float)(var7 - 48), 0.0F);


        /* int var38;
        for(var12 = 0; var12 < this.f.size() && var12 < var34; ++var12) {
            if(this.f.get(var12).b < 200 || var11) {
                double var37 = (double)this.f.get(var12).b / 200.0D;
                var37 = 1.0D - var37;
                var37 *= 10.0D;
                if(var37 < 0.0D) {
                    var37 = 0.0D;
                }

                if(var37 > 1.0D) {
                    var37 = 1.0D;
                }

                var37 *= var37;
                var38 = (int)(255.0D * var37);
                if(var11) {
                    var38 = 255;
                }

                if(var38 > 0) {
                    byte var42 = 2;
                    var17 = -var12 * 9;
                    var45 = this.f.get(var12).a;
                    this.a(var42, var17 - 1, var42 + 320, var17 + 8, var38 / 2 << 24);
                    GL11.glEnable(3042);
                    var8.a(var45, var42, var17, 16777215 + (var38 << 24));
                }
            }
        } */

        ImprovedChat.handle_draw(this, var8, var11, var34);
        GL11.glPopMatrix();
        if(this.h.h instanceof aan && this.h.z.x.e) {
            wt var41 = ((aan)this.h.h).ci;
            List<ab> var44 = var41.c;
            int var40 = var41.d;
            int var39 = var40;

            for(var16 = 1; var39 > 20; var39 = (var40 + var16 - 1) / var16) {
                ++var16;
            }

            var17 = 300 / var16;
            if(var17 > 150) {
                var17 = 150;
            }

            var18 = (var6 - var16 * var17) / 2;
            byte var46 = 10;
            this.a(var18 - 1, var46 - 1, var18 + var17 * var16, var46 + 9 * var39, Integer.MIN_VALUE);
            // this.a(var18 - 1, var441 - 1, var18 + var17 * var16, var441 + 9 * var37, Integer.MIN_VALUE);

            for(var20 = 0; var20 < var40; ++var20) {
                var47 = var18 + var20 % var16 * var17;
                var22 = var46 + var20 / var16 * 9;
                this.a(var47, var22, var47 + var17 - 1, var22 + 8, 553648127);
                GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
                GL11.glEnable(3008);
                if(var20 < var44.size()) {
                    ab var50 = (ab)var44.get(var20);
                    var8.a(var50.a, var47, var22, 16777215);
                    this.h.p.b(this.h.p.b("/gui/icons.png"));
                    boolean var48 = false;
                    boolean var53 = false;
                    byte var49 = 0;
                    var53 = false;
                    byte var54;
                    if(var50.b < 0) {
                        var54 = 5;
                    } else if(var50.b < 150) {
                        var54 = 0;
                    } else if(var50.b < 300) {
                        var54 = 1;
                    } else if(var50.b < 600) {
                        var54 = 2;
                    } else if(var50.b < 1000) {
                        var54 = 3;
                    } else {
                        var54 = 4;
                    }

                    this.e += 100.0F;
                    this.b(var47 + var17 - 12, var22, 0 + var49 * 10, 176 + var54 * 8, 10, 8);
                    this.e -= 100.0F;
                }
            }
        }





        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(2896);
        GL11.glEnable(3008);
    }

    private void a(int var1, int var2) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, this.h.p.b("%blur%/misc/pumpkinblur.png"));
        xe var3 = xe.a;
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
        xe var4 = xe.a;
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
        float var4 = (float)(lr.bf.bz % 16) / 16.0F;
        float var5 = (float)(lr.bf.bz / 16) / 16.0F;
        float var6 = (float)(lr.bf.bz % 16 + 1) / 16.0F;
        float var7 = (float)(lr.bf.bz / 16 + 1) / 16.0F;
        xe var8 = xe.a;
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
        ul var5 = this.h.h.as.a[var1];
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

        for(int var1 = 0; var1 < this.f.size(); ++var1) {
            ++((kq)this.f.get(var1)).b;
        }

        ImprovedChat.tick();

    }

    public void b() {
        this.f.clear();
    }

    public void a(String var1) {
        /* while(this.h.q.a(var1) > 320) {
            int var2;
            for(var2 = 1; var2 < var1.length() && this.h.q.a(var1.substring(0, var2 + 1)) <= 320; ++var2) {
                ;
            }

            this.a(var1.substring(0, var2));
            var1 = var1.substring(var2);
        } */

        this.f.add(0, new kq(var1));

        /* while(this.f.size() > 50) {
            this.f.remove(this.f.size() - 1);
        }*/
        ImprovedChat.receiveLine(var1);

    }

    public void b(String var1) {
        this.j = "Now playing: " + var1;
        this.k = 60;
        this.l = true;
    }

    public void c(String var1) {
        wv var2 = wv.a();
        String var3 = var2.a(var1);
        this.a(var3);
    }

}