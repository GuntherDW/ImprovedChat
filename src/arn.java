import org.lwjgl.input.Keyboard;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class arn {

    public static List a = new ArrayList();
    public static jz b = new jz();
    public String c;
    public int d;
    public boolean e;
    public int f = 0;

    /* private static Class get_b_class() { try{ Class c = Class.forName("b"); return c; } catch (Exception idontcare) { idontcare.printStackTrace(); return null; }}
    private static void b_c() { try{ Method m = get_b_class().getDeclaredMethod("c"); m.invoke(null); } catch (Exception idontcare) { idontcare.printStackTrace(); }}
    private static void b_a(int var0, arn var1) { try{ Method m = get_b_class().getDeclaredMethod("a", int.class, arn.class); m.invoke(null, var0, var1); } catch (Exception idontcare) { idontcare.printStackTrace(); }}
    private static arn b_a(int var0) { try{ Method m = get_b_class().getDeclaredMethod("a", int.class); return (arn) m.invoke(null, var0); } catch (Exception idontcare) { idontcare.printStackTrace(); return null; }} */

    public static void a(int var0) {
        arn var1 = (arn) b.a(var0);
        if (var1 != null) {
            ++var1.f;
        }

    }

    public static void a(int var0, boolean var1) {
        arn var2 = (arn) b.a(var0);
        if (var2 != null) {
            var2.e = var1;
        }

        if (ImprovedChat.minecraft.e.J) {
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

        while (var0.hasNext()) {
            arn var1 = (arn) var0.next();
            var1.d();
        }

    }

    public static void b() {
        b.c();
        Iterator var0 = a.iterator();

        while (var0.hasNext()) {
            arn var1 = (arn) var0.next();
            b.a(var1.d, var1);
        }

    }

    public arn(String var1, int var2) {
        this.c = var1;
        this.d = var2;
        a.add(this);
        b.a(var2, this);
    }

    public boolean c() {
        if (this.f == 0) {
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