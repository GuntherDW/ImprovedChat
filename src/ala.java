import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class ala extends Thread {

    final Minecraft a;
    final String b;
    final int c;
    final ajy d;


    ala(ajy var1, Minecraft var2, String var3, int var4) {
        this.d = var1;
        this.a = var2;
        this.b = var3;
        this.c = var4;
    }

    public void run() {
        try {
            ajy.a(this.d, new adl(this.a, this.b, this.c));
            if(ajy.a(this.d)) {
                return;
            }

            System.out.println("[ImprovedChat] Loading settings for "+this.b+":"+this.c);
            ImprovedChat.setCurrent(this.b+"_"+this.c);

            ajy.b(this.d).c(new jf(this.a.k.b, this.b, this.c));
        } catch (UnknownHostException var2) {
            if(ajy.a(this.d)) {
                return;
            }

            this.a.a((vp)(new dw("connect.failed", "disconnect.genericReason", new Object[]{"Unknown host \'" + this.b + "\'"})));
        } catch (ConnectException var3) {
            if(ajy.a(this.d)) {
                return;
            }

            this.a.a((vp)(new dw("connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()})));
        } catch (Exception var4) {
            if(ajy.a(this.d)) {
                return;
            }

            var4.printStackTrace();
            this.a.a((vp)(new dw("connect.failed", "disconnect.genericReason", new Object[]{var4.toString()})));
        }

    }
}