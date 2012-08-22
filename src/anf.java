import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class anf {

    public static List<anf> a = new ArrayList<anf>();
    public static ic b = new ic();
    public String c;
    public int d;
    public boolean e;
    public int f = 0;


    public static void a(int var0) {
        anf var1 = (anf)b.a(var0);
        if(var1 != null) {
            ++var1.f;
        }

    }

    public static void a(int var0, boolean var1) {
        anf var2 = (anf)b.a(var0);
        if(var2 != null) {
            var2.e = var1;
        }

        if (ImprovedChat.minecraft.e.K) {
            if (!var1) {
                ImprovedChat.keyPressed(var0);
            } else if ((Keyboard.isKeyDown(Keyboard.KEY_LCONTROL) || Keyboard.isKeyDown(Keyboard.KEY_RCONTROL)) && Keyboard.isKeyDown(Keyboard.KEY_TAB)) {
                if (Keyboard.isKeyDown(Keyboard.KEY_LSHIFT)) {
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
            anf var1 = (anf)var0.next();
            var1.d();
        }

    }

    public static void b() {
        b.c();
        Iterator var0 = a.iterator();

        while(var0.hasNext()) {
            anf var1 = (anf)var0.next();
            b.a(var1.d, var1);
        }

    }

    public anf(String var1, int var2) {
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