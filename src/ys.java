import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ys {

    public static List<ys> a = new ArrayList<ys>();
    public static vc b = new vc();
    public String c;
    public int d;
    public boolean e;
    public int f = 0;


    public static void a(int var0) {
        ys var1 = (ys)b.a(var0);
        if(var1 != null) {
            ++var1.f;
        }
    }

    public static void a(int var0, boolean var1) {
        ys var2 = (ys)b.a(var0);
        if(var2 != null) {
            var2.e = var1;
        }
        if(ImprovedChat.m.l()) {
            if(!var1) {
                ImprovedChat.keyPressed(var0);
            } else if((Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157)) && Keyboard.isKeyDown(15)) {
                if(Keyboard.isKeyDown(42)) {
                    ImprovedChat.Current.previousTab();
                } else {
                    ImprovedChat.Current.nextTab();
                }
            }
        }
    }

    public static void a() {
        Iterator var0 = a.iterator();

        while(var0.hasNext()) {
            ys var1 = (ys)var0.next();
            var1.d();
        }

    }

    public static void b() {
        b.a();
        Iterator var0 = a.iterator();

        while(var0.hasNext()) {
            ys var1 = (ys)var0.next();
            b.a(var1.d, var1);
        }

    }

    public ys(String var1, int var2) {
        this.c = var1;
        this.d = var2;
        a.add(this);
        b.a(var2, this);
    }

    public boolean c() {
        if(this.f == 0) {
            return false;
        } else {
            --this.f;
            return true;
        }
    }

    private void d() {
        this.f = 0;
        this.e = false;
    }

}
