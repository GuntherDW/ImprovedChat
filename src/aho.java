import net.minecraft.client.Minecraft;

public class aho extends ug {

   private abm a;
   private boolean b = false;


   public aho(Minecraft var1, String var2, int var3) {
      System.out.println("Connecting to " + var2 + ", " + var3);
      var1.a((vq)null);
      (new aio(this, var1, var2, var3)).start();
   }

   public void a() {
      if(this.a != null) {
         this.a.b();
      }

   }

   protected void a(char var1, int var2) {}

   public void c() {
      abn var1 = abn.a();
      this.s.clear();
      this.s.add(new zr(0, this.q / 2 - 100, this.r / 4 + 120 + 12, var1.b("gui.cancel")));
   }

   protected void a(zr var1) {
      if(var1.f == 0) {
         this.b = true;
         if(this.a != null) {
            this.a.c();
         }

         this.p.a((ug)(new wc()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.k();
      abn var4 = abn.a();
      if(this.a == null) {
         this.a(this.u, var4.b("connect.connecting"), this.q / 2, this.r / 2 - 50, 16777215);
         this.a(this.u, "", this.q / 2, this.r / 2 - 10, 16777215);
      } else {
         this.a(this.u, var4.b("connect.authorizing"), this.q / 2, this.r / 2 - 50, 16777215);
         this.a(this.u, this.a.a, this.q / 2, this.r / 2 - 10, 16777215);
      }

      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static abm a(aho var0, abm var1) {
      return var0.a = var1;
   }

   // $FF: synthetic method
   static boolean a(aho var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static abm b(aho var0) {
      return var0.a;
   }
}