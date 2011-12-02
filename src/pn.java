import net.minecraft.client.Minecraft;

import java.net.ConnectException;
import java.net.UnknownHostException;

class pn extends Thread {

    // $FF: synthetic field
    final Minecraft a;
    // $FF: synthetic field
    final String b;
    // $FF: synthetic field
    final int c;
    // $FF: synthetic field
    final ri d;


    pn(ri var1, Minecraft var2, String var3, int var4) {
        this.d = var1;
        this.a = var2;
        this.b = var3;
        this.c = var4;
    }

    public void run() {
        try {
            ri.a(this.d, new abp(this.a, this.b, this.c));
            if(ri.a(this.d)) {
                return;
            }

            System.out.println("[ImprovedChat] Connected to "+this.b+":"+this.c);
            ImprovedChat.setCurrent(this.b+"_"+this.c);
            ri.b(this.d).c(new hh(this.a.k.b));
        } catch (UnknownHostException var2) {
            if(ri.a(this.d)) {
                return;
            }

            this.a.a(new aam("connect.failed", "disconnect.genericReason", new Object[]{"Unknown host \'" + this.b + "\'"}));
        } catch (ConnectException var3) {
            if(ri.a(this.d)) {
                return;
            }

            this.a.a(new aam("connect.failed", "disconnect.genericReason", new Object[]{var3.getMessage()}));
        } catch (Exception var4) {
            if(ri.a(this.d)) {
                return;
            }

            var4.printStackTrace();
            this.a.a(new aam("connect.failed", "disconnect.genericReason", new Object[]{var4.toString()}));
        }

    }
}