import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class aku extends Thread {

    // $FF: synthetic field
    final Minecraft a;
    // $FF: synthetic field
    final String b;
    // $FF: synthetic field
    final int c;
    // $FF: synthetic field
    final ajs d;


    aku(ajs var1, Minecraft var2, String var3, int var4) {
        this.d = var1;
        this.a = var2;
        this.b = var3;
        this.c = var4;
    }

    public void run() {
        try {
            ajs.a(this.d, new adg(this.a, this.b, this.c));
            if(ajs.a(this.d)) {
                return;
            }

            System.out.println("[ImprovedChat] Loading settings for "+this.b+":"+this.c);
            ImprovedChat.setCurrent(this.b+"_"+this.c);
            ajs.b(this.d).c(new jc(this.a.k.b, this.b, this.c));

        } catch (UnknownHostException var2) {
            if(ajs.a(this.d)) {
                return;
            }

            this.a.a((vl)(new du("connect.failed", "disconnect.genericReason", new Object[]{"Unknown host \'" + this.b + "\'"})));
        } catch (ConnectException var3) {
            if(ajs.a(this.d)) {
                return;
            }

            this.a.a((vl)(new du("connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()})));
        } catch (Exception var4) {
            if(ajs.a(this.d)) {
                return;
            }

            var4.printStackTrace();
            this.a.a((vl)(new du("connect.failed", "disconnect.genericReason", new Object[]{var4.toString()})));
        }

    }
}