import java.net.ConnectException;
import java.net.UnknownHostException;
import net.minecraft.client.Minecraft;

class aio extends Thread {

    final Minecraft a;
    final String b;
    final int c;
    final aho d;


    aio(aho var1, Minecraft var2, String var3, int var4) {
        this.d = var1;
        this.a = var2;
        this.b = var3;
        this.c = var4;
    }

    public void run() {
        try {
            aho.a(this.d, new abm(this.a, this.b, this.c));
            if(aho.a(this.d)) {
                return;
            }

            System.out.println("[ImprovedChat] Loading settings for "+this.b+":"+this.c);
            ImprovedChat.setCurrent(this.b+"_"+this.c);
            aho.b(this.d).c(new ir(this.a.k.b));
        } catch (UnknownHostException var2) {
            if(aho.a(this.d)) {
                return;
            }

            this.a.a((ug)(new dr("connect.failed", "disconnect.genericReason", new Object[]{"Unknown host \'" + this.b + "\'"})));
        } catch (ConnectException var3) {
            if(aho.a(this.d)) {
                return;
            }

            this.a.a((ug)(new dr("connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()})));
        } catch (Exception var4) {
            if(aho.a(this.d)) {
                return;
            }

            var4.printStackTrace();
            this.a.a((ug)(new dr("connect.failed", "disconnect.genericReason", new Object[]{var4.toString()})));
        }

    }
}