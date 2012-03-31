import java.net.URI;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.lwjgl.input.Keyboard;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.GL11;

public class yf extends vp {

    public String b = ""; // ImprovedChat
    private int c = -1;
    private boolean d = false;
    private String e = "";
    private String f = "";
    private int h = 0;
    private List i = new ArrayList();
    private URI j = null;
    protected agu a;
    private String k = "";

    private static Pattern prefixPattern = Pattern.compile("~\\(.*?[^\\\\]\\)");
    public int cursorPosition;

    public yf() {}

    public yf(String var1) {
        this.k = var1;
    }

    public void c() {
        Keyboard.enableRepeatEvents(true);
        this.c = this.p.w.c().size();
        this.a = new agu(this.u, 4, this.r - 12, this.q - 4, 12);
        this.a.f(300);
        this.a.a(false);
        this.a.b(true);
        this.a.a(this.k);
        this.a.c(false);
    }

    public void e() {
        Keyboard.enableRepeatEvents(false);
        this.p.w.d();
    }

    public void a() {
        this.a.a();
    }

    protected void a(char var1, int var2) {
        if(var2 == Keyboard.KEY_TAB) {
            this.d();
        } else {
            this.d = false;
        }

        if(var2 == Keyboard.KEY_ESCAPE) {
            this.p.a((vp)null);
        } else if(var2 == Keyboard.KEY_RETURN || var2 == Keyboard.KEY_NUMPADENTER) {
            String var3 = this.a.b().trim();
            if(var3.length() > 0 && !this.p.c(var3)) {
                // this.p.h.a(var3);
                ImprovedChat.pastCommands.add(var3);
                ImprovedChat.process(var3);
                ImprovedChat.commandScroll = 0;
                ImprovedChat.currentTab().chatScroll = 0;
            }
            this.p.a((vp)null);
        } else if(var2 == Keyboard.KEY_UP && ImprovedChat.commandScroll < ImprovedChat.pastCommands.size()) {

            // this.a(-1);
            ++ImprovedChat.commandScroll;
            this.a.a(ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll));

        } else if(var2 == Keyboard.KEY_DOWN && ImprovedChat.commandScroll > 0) {
            --ImprovedChat.commandScroll;
            if(ImprovedChat.commandScroll == 0) {
                this.a.a("");
            } else {
                this.a.a(ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll));
            }
            // this.a(1);

        } else if(var2 == Keyboard.KEY_PRIOR) { // Page up
            this.p.w.a(1);
        } else if(var2 == Keyboard.KEY_NEXT) { // Page down
            this.p.w.a(-1);
        } else {
            this.a.a(var1, var2);
        }

        /*
        * TODO : a whole lot
        */

        /* boolean ctrlPressed = Keyboard.isKeyDown(29) || Keyboard.isKeyDown(157);
        if(Keyboard.isKeyDown(203) && this.cursorPosition > 0) {
            --this.cursorPosition;

            while(ctrlPressed && this.cursorPosition > 0 && Character.isLetterOrDigit(this.a.charAt(this.cursorPosition - 1))) {
                --this.cursorPosition;
            }
        } else if(Keyboard.isKeyDown(205) && this.cursorPosition < this.a.length()) {
            ++this.cursorPosition;

            while(ctrlPressed && this.cursorPosition < this.a.length() && Character.isLetterOrDigit(this.a.charAt(this.cursorPosition - 1))) {
                ++this.cursorPosition;
            }
        } else if(Keyboard.isKeyDown(211) && this.cursorPosition < this.a.length()) {
            this.a = this.a.substring(0, this.cursorPosition) + this.a.substring(this.cursorPosition + 1);
        } else if(Keyboard.isKeyDown(201) && ImprovedChat.currentTab().chatScroll <= ImprovedChat.currentTab().e.size() - 10) {
            ++ImprovedChat.currentTab().chatScroll;
        } else if(Keyboard.isKeyDown(209) && ImprovedChat.currentTab().chatScroll > 0) {
            --ImprovedChat.currentTab().chatScroll;
        } else if(Keyboard.isKeyDown(199)) {
            this.cursorPosition = 0;
        } else if(Keyboard.isKeyDown(207)) {
            this.cursorPosition = this.a.length();
        } else if(Keyboard.isKeyDown(200) && ImprovedChat.commandScroll < ImprovedChat.pastCommands.size()) {
            ++ImprovedChat.commandScroll;
            this.a = ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll);
            this.cursorPosition = this.a.length();
        } else if(Keyboard.isKeyDown(208) && ImprovedChat.commandScroll > 0) {
            --ImprovedChat.commandScroll;
            if(ImprovedChat.commandScroll == 0) {
                this.a = "";
            } else {
                this.a = ImprovedChat.pastCommands.get(ImprovedChat.pastCommands.size() - ImprovedChat.commandScroll);
            }

            this.cursorPosition = this.a.length();
        } else if(ctrlPressed && Keyboard.isKeyDown(15)) {
            if(Keyboard.isKeyDown(42)) {
                ImprovedChat.Current.previousTab();
            } else {
                ImprovedChat.Current.nextTab();
            }
        }

        if(var1 == 22) {
            String str = ImprovedChat.paste();
            int j = 300 - this.a.length();
            if(j > str.length()) {
                j = str.length();
            }

            if(j > 0) {
                this.a = this.a.substring(0, this.cursorPosition) + str.substring(0, j) + this.a.substring(this.cursorPosition);
                this.cursorPosition += j;
            }

            this.checkcursor();
        } else if(var1 == 3) {
            ImprovedChat.copy(this.a);
        } else if(var2 == 1) {
            this.p.a((vl)null);
            ImprovedChat.currentTab().chatScroll = 0;
        } else if(var2 != 28 && var2 != 156) {
            if(var2 == 14 && this.a.length() > 0 && this.cursorPosition > 0) {
                this.a = this.a.substring(0, this.cursorPosition - 1) + this.a.substring(this.cursorPosition);
                --this.cursorPosition;
            }

            if(ImprovedChat.getAllowedCharacters().indexOf(var1) >= 0 && this.a.length() < 300 && (!this.a.startsWith("/") || this.a.length() < 100)) {
                this.a = this.a.substring(0, this.cursorPosition) + var1 + this.a.substring(this.cursorPosition);
                ++this.cursorPosition;
            }

        } else {
            ImprovedChat.pastCommands.add(this.a);
            ImprovedChat.commandScroll = 0;
            ImprovedChat.process(this.a);
            this.p.a((vl)null);
            ImprovedChat.currentTab().chatScroll = 0;
        }
        */
    }

    public void f() {
        super.f();
        int var1 = Mouse.getEventDWheel();
        if(var1 != 0) {
            if(var1 > 1) {
                var1 = 1;
            }

            if(var1 < -1) {
                var1 = -1;
            }

            /* if(!m()) { // m == mousewheel
                var1 *= 7;
            } */

            this.p.w.a(var1);
        }

    }

    protected void a(int var1, int var2, int var3) {
        if(var3 == 0) {
            dx var4 = this.p.w.a(Mouse.getX(), Mouse.getY());
            if(var4 != null) {
                URI var5 = var4.b();
                if(var5 != null) {
                    this.j = var5;
                    this.p.a((vp)(new be(this, this, var4.a(), 0, var4)));
                    return;
                }
            }
        }

        this.a.a(var1, var2, var3);
        super.a(var1, var2, var3);
    }

    public void a(boolean var1, int var2) {
        if(var2 == 0) {
            if(var1) {
                try {
                    Class var3 = Class.forName("java.awt.Desktop");
                    Object var4 = var3.getMethod("getDesktop", new Class[0]).invoke((Object)null, new Object[0]);
                    var3.getMethod("browse", new Class[]{URI.class}).invoke(var4, new Object[]{this.j});
                } catch (Throwable var5) {
                    var5.printStackTrace();
                }
            }

            this.j = null;
            this.p.a((vp)this);
        }

    }

    public void d() {
        Iterator var2;
        ah var3;
        if(this.d) {
            this.a.a(-1);
            if(this.h >= this.i.size()) {
                this.h = 0;
            }
        } else {
            int var1 = this.a.c(-1);
            if(this.a.h() - var1 < 1) {
                return;
            }

            this.i.clear();
            this.e = this.a.b().substring(var1);
            this.f = this.e.toLowerCase();
            var2 = ((ahv)this.p.h).cl.c.iterator();

            while(var2.hasNext()) {
                var3 = (ah)var2.next();
                if(var3.a(this.f)) {
                    this.i.add(var3);
                }
            }

            if(this.i.size() == 0) {
                return;
            }

            this.d = true;
            this.h = 0;
            this.a.b(var1 - this.a.h());
        }

        if(this.i.size() > 1) {
            StringBuilder var4 = new StringBuilder();

            for(var2 = this.i.iterator(); var2.hasNext(); var4.append(var3.a)) {
                var3 = (ah)var2.next();
                if(var4.length() > 0) {
                    var4.append(", ");
                }
            }

            this.p.w.a(var4.toString());
        }

        this.a.b(((ah)this.i.get(this.h++)).a);
    }

    public void a(int var1) {
        int var2 = this.c + var1;
        int var3 = this.p.w.c().size();
        if(var2 < 0) {
            var2 = 0;
        }

        if(var2 > var3) {
            var2 = var3;
        }

        if(var2 != this.c) {
            if(var2 == var3) {
                this.c = var3;
                this.a.a(this.b);
            } else {
                if(this.c == var3) {
                    this.b = this.a.b();
                }

                this.a.a((String)this.p.w.c().get(var2));
                this.c = var2;
            }
        }
    }

    private void drawSelection(int var1, int var2, int var3, int var4) {
        int var5;
        if(var1 < var3) {
            var5 = var1;
            var1 = var3;
            var3 = var5;
        }

        if(var2 < var4) {
            var5 = var2;
            var2 = var4;
            var4 = var5;
        }

        adz var6 = adz.a;
        GL11.glColor4f(0.0F, 0.0F, 255.0F, 255.0F);
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_COLOR_LOGIC_OP);
        GL11.glLogicOp(GL11.GL_OR_REVERSE);
        var6.b();
        var6.a((double)var1, (double)var4, 0.0D);
        var6.a((double)var3, (double)var4, 0.0D);
        var6.a((double)var3, (double)var2, 0.0D);
        var6.a((double)var1, (double)var2, 0.0D);
        var6.a();
        GL11.glDisable(GL11.GL_COLOR_LOGIC_OP);
        GL11.glEnable(GL11.GL_TEXTURE_2D);
    }

    public void a(int var1, int var2, float var3) {

        // this.a.f();

        int xpos = a.getXPos();
        int ypos = a.getYPos();


        String cm = null;
        if(ImprovedChat.Current.ChatMode!=null) { cm = ImprovedChat.Current.ChatMode; }
        if(cm!=null) { cm = cm + " "; }
        int bg = ((ImprovedChat.bgOpacity & 255) << 24) + ImprovedChat.bgColor;

        this.checkcursor();
        String chatLine = this.a.b();
        // Character inputLine = this.a.i / 6 % 2 == 0?'|':':';

        String line = chatLine.substring(0, this.a.o) + chatLine.substring(this.a.o);


        int len = line.length();
        int HLFROM1 = this.a.n;
        int HLFROM = this.a.p;
        int HLTO = this.a.o;
        boolean mark = (HLTO - HLFROM1) != (HLFROM - HLFROM1);
        int markSize = HLFROM - HLFROM1;
        boolean check = a.isEditing();
        int ominn = HLTO - HLFROM1;

        byte pos = 100;
        Matcher m = prefixPattern.matcher(line);
        int var14;
        if(m.find()) {
            var14 = pos + 3;
        } else {
            var14 = pos - ImprovedChat.currentTab().prefix.length();
        }

        if(var14 > this.cursorPosition) {
            ++var14;
        }

        if(len > var14) {
            line = line.substring(0, var14) + "§4" + line.substring(var14);
        }

        List<String> vl = ImprovedChat.processDisplay(line, this.a);

        int size = vl.size();
        int lines = size;

        if(size<=0) size = 1;

        this.a(2, this.r - 4 - size * 12, this.q - 2, this.r - 2, bg);
        Iterator<String> var12 = vl.iterator();

        int x = 0;
        int linefrom = 0;
        int lineto = 0;


        /**
         * Draw cursor
         */

        if(vl.size() == 0) {
            int heigth = this.r - 12 * size;
            int width = a.getXPos();
            oo.a(width, heigth - 1, width + 1, heigth + 1 + u.b, -3092272);
        } else {
            int line_index = 0;
            String w = vl.get(line_index);

            String filtered_string = u.a(w.substring(a.n), a.l());
            boolean var5 = ominn >= 0 && ominn <= filtered_string.length();

            int height = 0;
            int width = 0;

            int other_len = a.getXPos();
            int prev_line_end = 0;
            int line_ominn = ominn;
            int line_end = 0;
            String w_f = "";
            String w_f_nocolor = "";
            int extra_Sub = 0;
            boolean var13 = false;

            if(filtered_string.length()>0) {
                do {

                    w = vl.get(line_index);
                    if(line_index > 0)
                        w = w.substring(2);

                    w = ImprovedChat.stripColors(w);

                    prev_line_end = line_end;
                    line_end = w.length();
                    int length_to_grab;


                    if(line_index > 0) {
                        line_ominn -= prev_line_end;
                        extra_Sub += prev_line_end;
                    }
                    int toFetch = a.n;

                    length_to_grab = line_ominn;

                    if(length_to_grab > line_end)
                        length_to_grab = line_end;

                    if(toFetch < 0) toFetch = 0;

                    filtered_string = u.a(w.substring(toFetch), a.l());

                    w_f = filtered_string.substring(0, length_to_grab);
                    w_f_nocolor = ImprovedChat.replaceColors(w_f);

                    other_len = a.getXPos() + u.a(w_f_nocolor);

                    height = this.r - 12 * (size - line_index);


                    line_index++;
                    var13 = (a.o - extra_Sub) < filtered_string.length() || filtered_string.length() >= a.g();

                    width = other_len;

                    var5 = line_ominn >= 0 && line_ominn <= filtered_string.length();

                    if(!var5) {
                        width = a.getWidth();
                    } else if(var13) {
                        width = other_len - 1;
                    }

                } while(line_ominn > line_end);
            }

            oo.a(width, height - 1, width + 1, height + 1 + u.b, -3092272);
        }


        int line_index = 0;
        /**
         * Draw text and possibly selection
         */
        while(var12.hasNext()) {

            String w = var12.next();
            lineto = lineto + w.length();
            int width = 0;


            int height = this.r - 12 * size;

            String wheel = (cm != null?cm:"")+w;
            String line_noColor = ImprovedChat.stripColors(wheel);

            int stringLen = u.a(line_noColor, 4, height, 14737632);
            size--;

            if(mark) {

                /* if(line_index > 0)
                    wheel = */

                System.out.println("HLFROM : "+HLFROM+" HLTO : "+HLTO+" HLFROM1 : "+HLFROM1);

                int sel_width = 0;
                int countLength = 0;
                int sub_length = a.o - a.n;
                int varwidth = 0;

                if(lines == 1) {
                    // int sub_len = a.o - a.n;
                    width = a.getLineWidth(line_noColor, a.o, a.n/* , sub_len */);
                    System.out.println("width :::: "+width);
                    sel_width = markSize;

                    String rommel = line_noColor.substring(a.n/* sub_length*/);
                    countLength = u.a(rommel, a.l()).length();

                    System.out.println("sel_width : "+sel_width+" countLength : "+countLength);
                    System.out.println("rommel : "+rommel);

                    if(sel_width > countLength) {
                        sel_width = countLength;
                    }

                    varwidth = xpos + u.a(line_noColor.substring(0, sel_width));
                    System.out.println("varwidth :::: "+varwidth);

                    // ypos -= yPosPlus;
                } else {

                    /* if(line_noColor.length() > 0)
                        line_noColor = line_noColor.substring(0, line_noColor.length() - 1); */

                    if(HLFROM > linefrom -1) {
                        /* if(HLTO > lineto) { // Volle lijn
                            // int sub_len = linefrom - lineto;
                            width = a.getLineWidth(line_noColor, linefrom, lineto);
                            sel_width = markSize;

                            countLength = u.a(line_noColor, a.l()).length();

                            if(sel_width > countLength) {
                                sel_width = countLength;
                            }

                            varwidth = xpos + u.a(line_noColor);

                        } else { // Stuk van lijn */
                        if(HLFROM < lineto) {
                            System.out.println("lineFrom : "+linefrom+" lineTo : "+lineto);
                            System.out.println("HLFROM > linefrom");
                            System.out.println(HLFROM +" > "+linefrom);

                            int amountSelected = a.o - a.p;
                            int sel_skip = lineto - linefrom;
                            int sel_rommel = line_noColor.length() - amountSelected;
                            /* int input1 = a.n - linefrom;
                      int input2 = a.p - linefrom; */
                            int input1 = a.o - linefrom;
                            int input2 = a.n/*  - linefrom */;
                            if(input2 > linefrom) input2 -= linefrom;

                            System.out.println("wheel    : "+line_noColor);
                            System.out.println("calcLen  : "+sel_skip+ " a.p   : "+a.p);
                            System.out.println("sel_ski  : "+sel_skip+" sel_r : "+sel_rommel);
                            System.out.println("input1   : "+input1  +" input2: "+input2);
                            System.out.println("a.o      : "+a.o     +" input2: "+input2);

                            //width = a.getLineWidth(line_noColor, a.o, a.n/* , sub_len */);
                            width = a.getLineWidth(line_noColor, input1, input2  /* , sub_len */);
                            System.out.println("width :::: "+width);

                            sel_width = markSize;
                            // sel_width = lineto - sel_rommel;
                            // sel_width = HLFROM1 - HLTO;

                            System.out.println("Trying to get "+sel_rommel+" -> "+line_noColor.length());
                            //String rommel = line_noColor.substring(a.n/* sub_length*/);
                            String rommel = line_noColor.substring(a.n);
                            System.out.println("Rommel   : "+rommel);

                            countLength = u.a(line_noColor, a.l()).length();

                            System.out.println("sel_width : "+sel_width+" countLength : "+countLength);
                            if(sel_width > countLength) {
                                sel_width = countLength;
                            }

                            //varwidth = xpos + u.a(line_noColor.substring(0, sel_width));
                            varwidth = xpos + u.a(line_noColor.substring(0, sel_rommel));
                            System.out.println("varwidth :::: "+varwidth);
                        }
                    }
                }

                this.drawSelection(width, height - 1, varwidth - 1, height + 1 + u.b);
            }
            x++;
            linefrom = lineto;
            line_index++;
        }
        int var13 = Mouse.getDWheel();

        Tab var10000;
        if(var13 > 0) {
            if(ImprovedChat.currentTab().chatScroll <= ImprovedChat.currentTab().e.size() - 11) {
                var10000 = ImprovedChat.currentTab();
                var10000.chatScroll += 2;
            }
        } else if(var13 < 0) {
            var10000 = ImprovedChat.currentTab();
            var10000.chatScroll -= 2;
            if(ImprovedChat.currentTab().chatScroll < 0) {
                ImprovedChat.currentTab().chatScroll = 0;
            }
        }

        super.a(var1, var2, var3);


        /*
        * TODO: A whole lot
        */

        /*
       this.checkcursor();
               String line = this.a.substring(0, this.cursorPosition) + (this.b / 6 % 2 == 0?"|":":") + this.a.substring(this.cursorPosition);
               String cm = null;
               if(ImprovedChat.Current.ChatMode!=null) { cm = ImprovedChat.Current.ChatMode; }
               int len = line.length();
               if(cm!=null) { cm = cm + " "; } else { cm = ""; }
               byte pos = 100;
               Matcher m = prefixPattern.matcher(line);
               int var14;
               if(m.find()) {
                   var14 = pos + 3;
               } else {
                   var14 = pos - ImprovedChat.currentTab().prefix.length();
               }

               if(var14 > this.cursorPosition) {
                   ++var14;
               }

               if(len > var14) {
                   line = line.substring(0, var14) + "§4" + line.substring(var14);
               }

               List<String> vl = ImprovedChat.processDisplay(line);
               int size = vl.size();
               int bg = ((ImprovedChat.bgOpacity & 255) << 24) + ImprovedChat.bgColor;
               this.a(2, this.r - 4 - size * 12, this.q - 2, this.r - 2, bg);
               Iterator<String> var12 = vl.iterator();

               while(var12.hasNext()) {
                   String wheel = var12.next();
                   this.b(this.u, cm + wheel, 4, this.r - 12 * size--, 14737632);
               }

               int var13 = Mouse.getDWheel();
               Tab var10000;
               if(var13 > 0) {
                   if(ImprovedChat.currentTab().chatScroll <= ImprovedChat.currentTab().e.size() - 11) {
                       var10000 = ImprovedChat.currentTab();
                       var10000.chatScroll += 2;
                   }
               } else if(var13 < 0) {
                   var10000 = ImprovedChat.currentTab();
                   var10000.chatScroll -= 2;
                   if(ImprovedChat.currentTab().chatScroll < 0) {
                       ImprovedChat.currentTab().chatScroll = 0;
                   }
               }

               super.a(var1, var2, var3);
        */
    }

    private void checkcursor() {
        String chatLine = this.a.b();
        this.cursorPosition = this.a.o;

        if(this.cursorPosition > chatLine.length()) {
            this.cursorPosition = chatLine.length();
        }

        if(this.cursorPosition < 0) {
            this.cursorPosition = 0;
        }

    }
}