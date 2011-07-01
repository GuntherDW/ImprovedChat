import java.awt.Color;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.GL11;

public class uq extends ub {

    private static bb d = new bb();
    private List<sw> e = new ArrayList<sw>();
    private Random f = new Random();
    private Minecraft g;
    public String a = null;
    private int h = 0;
    private String i = "";
    private int j = 0;
    private boolean l = false;
    public float b;
    float c = 1.0F;
    private Object minimap = null;
    private static int fade = 0;
    public static int commandScroll = 0;


    public uq(Minecraft minecraft) {
        this.g = minecraft;
        ImprovedChat.init(minecraft);
        ClassLoader CL = uk.class.getClassLoader();
        if(CL.getResource("ZanMinimap.class") != null) {
            this.minimap = new ZanMinimap();
        }
    }

    public void a(float f1, boolean flag, int k, int i1) {
        qq qq1 = new qq(this.g.z, this.g.d, this.g.e);
        int j1 = qq1.a();
        int k1 = qq1.b();
        sj sj1 = this.g.q;
        this.g.t.b();
        GL11.glEnable(3042);
        if(Minecraft.u()) {
            this.a(this.g.h.a(f1), j1, k1);
        }

        iz iz1 = this.g.h.c.d(3);
        if(!this.g.z.A && iz1 != null && iz1.c == uu.bb.bn) {
            this.a(j1, k1);
        }

        float f2 = this.g.h.C + (this.g.h.B - this.g.h.C) * f1;
        if(f2 > 0.0F) {
            this.b(f2, j1, k1);
        }

        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBindTexture(3553, this.g.p.b("/gui/gui.png"));
        ix ix1 = this.g.h.c;
        this.k = -90.0F;
        this.b(j1 / 2 - 91, k1 - 22, 0, 0, 182, 22);
        this.b(j1 / 2 - 91 - 1 + ix1.c * 20, k1 - 22 - 1, 0, 22, 24, 22);
        GL11.glBindTexture(3553, this.g.p.b("/gui/icons.png"));
        GL11.glEnable(3042);
        GL11.glBlendFunc(775, 769);
        this.b(j1 / 2 - 7, k1 / 2 - 7, 0, 0, 16, 16);
        GL11.glDisable(3042);
        boolean flag1 = this.g.h.by / 3 % 2 == 1;
        if(this.g.h.by < 10) {
            flag1 = false;
        }

        int l1 = this.g.h.Y;
        int i2 = this.g.h.Z;
        this.f.setSeed((long)(this.h * 312871));
        int byte0;
        int k5;
        int flag2;
        if(this.g.c.d()) {
            byte0 = this.g.h.s();

            int d1;
            for(flag2 = 0; flag2 < 10; ++flag2) {
                k5 = k1 - 32;
                if(byte0 > 0) {
                    d1 = j1 / 2 + 91 - flag2 * 8 - 9;
                    if(flag2 * 2 + 1 < byte0) {
                        this.b(d1, k5, 34, 9, 9, 9);
                    }

                    if(flag2 * 2 + 1 == byte0) {
                        this.b(d1, k5, 25, 9, 9, 9);
                    }

                    if(flag2 * 2 + 1 > byte0) {
                        this.b(d1, k5, 16, 9, 9, 9);
                    }
                }

                byte var31 = 0;
                if(flag1) {
                    var31 = 1;
                }

                int l7 = j1 / 2 - 91 + flag2 * 8;
                if(l1 <= 4) {
                    k5 += this.f.nextInt(2);
                }

                this.b(l7, k5, 16 + var31 * 9, 0, 9, 9);
                if(flag1) {
                    if(flag2 * 2 + 1 < i2) {
                        this.b(l7, k5, 70, 0, 9, 9);
                    }

                    if(flag2 * 2 + 1 == i2) {
                        this.b(l7, k5, 79, 0, 9, 9);
                    }
                }

                if(flag2 * 2 + 1 < l1) {
                    this.b(l7, k5, 52, 0, 9, 9);
                }

                if(flag2 * 2 + 1 == l1) {
                    this.b(l7, k5, 61, 0, 9, 9);
                }
            }

            if(this.g.h.a(ln.g)) {
                flag2 = (int)Math.ceil((double)(this.g.h.bz - 2) * 10.0D / 300.0D);
                k5 = (int)Math.ceil((double)this.g.h.bz * 10.0D / 300.0D) - flag2;

                for(d1 = 0; d1 < flag2 + k5; ++d1) {
                    if(d1 < flag2) {
                        this.b(j1 / 2 - 91 + d1 * 8, k1 - 32 - 9, 16, 18, 9, 9);
                    } else {
                        this.b(j1 / 2 - 91 + d1 * 8, k1 - 32 - 9, 25, 18, 9, 9);
                    }
                }
            }
        }

        GL11.glDisable(3042);
        GL11.glEnable('\u803a');
        GL11.glPushMatrix();
        GL11.glRotatef(120.0F, 1.0F, 0.0F, 0.0F);
        u.b();
        GL11.glPopMatrix();

        for(byte0 = 0; byte0 < 9; ++byte0) {
            flag2 = j1 / 2 - 90 + byte0 * 20 + 2;
            k5 = k1 - 16 - 3;
            this.a(byte0, flag2, k5, f1);
        }

        u.a();
        GL11.glDisable('\u803a');
        if(this.g.h.P() > 0) {
            GL11.glDisable(2929);
            GL11.glDisable(3008);
            byte0 = this.g.h.P();
            float var26 = (float)byte0 / 100.0F;
            if(var26 > 1.0F) {
                var26 = 1.0F - (float)(byte0 - 100) / 10.0F;
            }

            k5 = (int)(220.0F * var26) << 24 | 1052704;
            this.a(0, 0, j1, k1, k5);
            GL11.glEnable(3008);
            GL11.glEnable(2929);
        }

        if(this.minimap != null) {
            ((ZanMinimap)this.minimap).OnTickInGame(this.g);
        }
        String s1;
        if(this.g.z.B) {
            GL11.glPushMatrix();
            if(Minecraft.H > 0L) {
                GL11.glTranslatef(0.0F, 32.0F, 0.0F);
            }

            sj1.a("Minecraft Beta 1.7.2 (" + this.g.K + ")", 2, 2, 16777215);
            sj1.a(this.g.o(), 2, 12, 16777215);
            sj1.a(this.g.p(), 2, 22, 16777215);
            sj1.a(this.g.r(), 2, 32, 16777215);
            sj1.a(this.g.q(), 2, 42, 16777215);
            long var25 = Runtime.getRuntime().maxMemory();
            long var30 = Runtime.getRuntime().totalMemory();
            long var29 = Runtime.getRuntime().freeMemory();
            long byte1 = var30 - var29;
            s1 = "Used memory: " + byte1 * 100L / var25 + "% (" + byte1 / 1024L / 1024L + "MB) of " + var25 / 1024L / 1024L + "MB";
            this.b(sj1, s1, j1 - sj1.a(s1) - 2, 2, 14737632);
            s1 = "Allocated memory: " + var30 * 100L / var25 + "% (" + var30 / 1024L / 1024L + "MB)";
            this.b(sj1, s1, j1 - sj1.a(s1) - 2, 12, 14737632);
            this.b(sj1, "x: " + this.g.h.aM, 2, 64, 14737632);
            this.b(sj1, "y: " + this.g.h.aN, 2, 72, 14737632);
            this.b(sj1, "z: " + this.g.h.aO, 2, 80, 14737632);
            this.b(sj1, "f: " + (in.b((double)(this.g.h.aS * 4.0F / 360.0F) + 0.5D) & 3), 2, 88, 14737632);
            GL11.glPopMatrix();
        }

        if(this.j > 0) {
            float var24 = (float)this.j - f1;
            flag2 = (int)(var24 * 256.0F / 20.0F);
            if(flag2 > 255) {
                flag2 = 255;
            }

            if(flag2 > 0) {
                GL11.glPushMatrix();
                GL11.glTranslatef((float)(j1 / 2), (float)(k1 - 48), 0.0F);
                GL11.glEnable(3042);
                GL11.glBlendFunc(770, 771);
                k5 = 16777215;
                if(this.l) {
                    k5 = Color.HSBtoRGB(var24 / 50.0F, 0.7F, 0.6F) & 16777215;
                }

                sj1.b(this.i, -sj1.a(this.i) / 2, -4, k5 + (flag2 << 24));
                GL11.glDisable(3042);
                GL11.glPopMatrix();
            }
        }

        byte var27 = 10;
        boolean var28 = false;
        if(this.g.r instanceof gc) {
            var27 = 20;
            var28 = true;
        }

        GL11.glEnable(3042);
        GL11.glBlendFunc(770, 771);
        GL11.glDisable(3008);
        GL11.glPushMatrix();
        GL11.glTranslatef(0.0F, (float)(k1 - 48), 0.0F);


        int var39;
        String var34;
        if(ImprovedChat.Current != null) {
            if(ImprovedChat.Current.tabs.size() > 1) {
                var39 = -312;
                int d1 = 0;

                int var37;
                for(var37 = 0; var37 <= ImprovedChat.Current.currentTabIndex; ++var37) {
                    var39 += 4 + ((Tab)ImprovedChat.Current.tabs.get(var37)).width;
                }

                if(var39 < 0) {
                    var39 = 0;
                }

                for(var37 = 0; var37 < ImprovedChat.Current.tabs.size(); ++var37) {
                    Tab i11 = (Tab)ImprovedChat.Current.tabs.get(var37);
                    if(d1 + 4 + i11.width > 312) {
                        break;
                    }

                    if(d1 >= var39) {
                        if(ImprovedChat.Current.currentTabIndex == var37) {
                            if(var28) {
                                sj1.a(i11.name, 2 + d1, -180, 16777215);
                            } else {
                                if(i11.blinking) {
                                    fade = 64;
                                    i11.blinking = false;
                                }

                                if(fade > 0) {
                                    sj1.a(i11.name, 2 + d1, -180, (fade << 25) + 16777215);
                                    --fade;
                                }
                            }
                        } else if(i11.blinking) {
                            int var30 = this.h % 40 - 20;
                            if(var30 < 0) {
                                var30 = -var30;
                            }

                            var30 = (int)((double)var30 * 12.75D);
                            if(var30 == 0) {
                                ++var30;
                            }

                            sj1.a(i11.name, 2 + d1, -180, (var30 << 24) + 16777215);
                        } else if(var28) {
                            sj1.a(i11.name, 2 + d1, -180, -2130706433);
                        }

                        d1 += 4 + i11.width;
                    } else {
                        var39 -= 4 + i11.width;
                    }
                }
            }

            for(var39 = ImprovedChat.currentTab().chatScroll; var39 < ImprovedChat.currentTab().e.size() && var39 < var27 + ImprovedChat.currentTab().chatScroll; ++var39) {
                if(((sw)ImprovedChat.currentTab().e.get(var39)).b < 200 || var28) {
                    double var29 = (double)((sw)ImprovedChat.currentTab().e.get(var39)).b / 200.0D;
                    var29 = 1.0D - var29;
                    var29 *= 10.0D;
                    if(var29 < 0.0D) {
                        var29 = 0.0D;
                    }

                    if(var29 > 1.0D) {
                        var29 = 1.0D;
                    }

                    var29 *= var29;
                    int var35 = (int)((double)ImprovedChat.historyOpacity * var29);
                    if(var28) {
                        var35 = ImprovedChat.historyOpacity;
                    }

                    if(var35 > 0) {
                        byte var38 = 2;
                        int i13 = (-var39 + ImprovedChat.currentTab().chatScroll) * 9;
                        var34 = ((sw)ImprovedChat.currentTab().e.get(var39)).a;
                        this.a(var38, i13 - 1, var38 + 320, i13 + 8, (var35 << 24) + ImprovedChat.historyColor);
                        GL11.glEnable(3042);
                        sj1.a(var34, var38, i13, 16777215);
                    }
                }
            }
        }

        GL11.glPopMatrix();
        GL11.glEnable(3008);
        GL11.glDisable(3042);
    }

    private void a(int k, int i1) {
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glDisable(3008);
        GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/pumpkinblur.png"));
        nw nw1 = nw.a;
        nw1.b();
        nw1.a(0.0D, (double)i1, -90.0D, 0.0D, 1.0D);
        nw1.a((double)k, (double)i1, -90.0D, 1.0D, 1.0D);
        nw1.a((double)k, 0.0D, -90.0D, 1.0D, 0.0D);
        nw1.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        nw1.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(float f1, int k, int i1) {
        f1 = 1.0F - f1;
        if(f1 < 0.0F) {
            f1 = 0.0F;
        }

        if(f1 > 1.0F) {
            f1 = 1.0F;
        }

        this.c += (float)((double)(f1 - this.c) * 0.01D);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(0, 769);
        GL11.glColor4f(this.c, this.c, this.c, 1.0F);
        GL11.glBindTexture(3553, this.g.p.b("%blur%/misc/vignette.png"));
        nw nw1 = nw.a;
        nw1.b();
        nw1.a(0.0D, (double)i1, -90.0D, 0.0D, 1.0D);
        nw1.a((double)k, (double)i1, -90.0D, 1.0D, 1.0D);
        nw1.a((double)k, 0.0D, -90.0D, 1.0D, 0.0D);
        nw1.a(0.0D, 0.0D, -90.0D, 0.0D, 0.0D);
        nw1.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
        GL11.glBlendFunc(770, 771);
    }

    private void b(float f1, int k, int i1) {
        if(f1 < 1.0F) {
            f1 *= f1;
            f1 *= f1;
            f1 = f1 * 0.8F + 0.2F;
        }

        GL11.glDisable(3008);
        GL11.glDisable(2929);
        GL11.glDepthMask(false);
        GL11.glBlendFunc(770, 771);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, f1);
        GL11.glBindTexture(3553, this.g.p.b("/terrain.png"));
        float f2 = (float)(uu.bf.bm % 16) / 16.0F;
        float f3 = (float)(uu.bf.bm / 16) / 16.0F;
        float f4 = (float)(uu.bf.bm % 16 + 1) / 16.0F;
        float f5 = (float)(uu.bf.bm / 16 + 1) / 16.0F;
        nw nw1 = nw.a;
        nw1.b();
        nw1.a(0.0D, (double)i1, -90.0D, (double)f2, (double)f5);
        nw1.a((double)k, (double)i1, -90.0D, (double)f4, (double)f5);
        nw1.a((double)k, 0.0D, -90.0D, (double)f4, (double)f3);
        nw1.a(0.0D, 0.0D, -90.0D, (double)f2, (double)f3);
        nw1.a();
        GL11.glDepthMask(true);
        GL11.glEnable(2929);
        GL11.glEnable(3008);
        GL11.glColor4f(1.0F, 1.0F, 1.0F, 1.0F);
    }

    private void a(int k, int i1, int j1, float f1) {
        iz iz1 = this.g.h.c.a[k];
        if(iz1 != null) {
            float f2 = (float)iz1.b - f1;
            if(f2 > 0.0F) {
                GL11.glPushMatrix();
                float f3 = 1.0F + f2 / 5.0F;
                GL11.glTranslatef((float)(i1 + 8), (float)(j1 + 12), 0.0F);
                GL11.glScalef(1.0F / f3, (f3 + 1.0F) / 2.0F, 1.0F);
                GL11.glTranslatef((float)(-(i1 + 8)), (float)(-(j1 + 12)), 0.0F);
            }

            d.a(this.g.q, this.g.p, iz1, i1, j1);
            if(f2 > 0.0F) {
                GL11.glPopMatrix();
            }

            d.b(this.g.q, this.g.p, iz1, i1, j1);
        }
    }

    public void a() {
        if(this.j > 0) {
            --this.j;
        }

        ++this.h;

        for(int k = 0; k < this.e.size(); ++k) {
            ++((sw)this.e.get(k)).b;
        }

        ImprovedChat.tick();
    }

    public void b() {
        this.e.clear();
    }

    public void a(String s) {
        e.add(0, new sw(s));
        ImprovedChat.receiveLine(s);
    }

    public void b(String s) {
        this.i = "Now playing: " + s;
        this.j = 60;
        this.l = true;
    }

    public void c(String s) {
        nh nh1 = nh.a();
        String s1 = nh1.a(s);
        this.a(s1);
    }
}
