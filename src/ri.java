import net.minecraft.client.Minecraft;

public class ri extends xe {

   private abp a;
   private boolean b = false;


   public ri(Minecraft var1, String var2, int var3) {
      System.out.println("Connecting to " + var2 + ", " + var3);
      var1.a((ry)null);
      (new pn(this, var1, var2, var3)).start();
   }

   public void s_() {
      if(this.a != null) {
         this.a.b();
      }

   }

   protected void a(char var1, int var2) {}

   public void a() {
      qp var1 = qp.a();
      this.o.clear();
      this.o.add(new ct(0, this.m / 2 - 100, this.n / 4 + 120 + 12, var1.a("gui.cancel")));
   }

   protected void a(ct var1) {
      if(var1.f == 0) {
         this.b = true;
         if(this.a != null) {
            this.a.c();
         }

         this.l.a((xe)(new eh()));
      }

   }

   public void a(int var1, int var2, float var3) {
      this.j();
      qp var4 = qp.a();
      if(this.a == null) {
         this.a(this.q, var4.a("connect.connecting"), this.m / 2, this.n / 2 - 50, 16777215);
         this.a(this.q, "", this.m / 2, this.n / 2 - 10, 16777215);
      } else {
         this.a(this.q, var4.a("connect.authorizing"), this.m / 2, this.n / 2 - 50, 16777215);
         this.a(this.q, this.a.a, this.m / 2, this.n / 2 - 10, 16777215);
      }

      super.a(var1, var2, var3);
   }

   // $FF: synthetic method
   static abp a(ri var0, abp var1) {
      return var0.a = var1;
   }

   // $FF: synthetic method
   static boolean a(ri var0) {
      return var0.b;
   }

   // $FF: synthetic method
   static abp b(ri var0) {
      return var0.a;
   }
}