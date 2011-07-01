import java.util.Enumeration;
import java.util.Hashtable;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class Variables {

   private Hashtable vars = new Hashtable();


   public boolean add(String name, String regex) {
      try {
         Variables.Variable e = new Variables.Variable(regex);
         this.vars.put(name, e);
         return true;
      } catch (PatternSyntaxException var4) {
         ImprovedChat.stderr(var4.getMessage());
         return false;
      }
   }

   public Variables.Variable get(String name) {
      return (Variables.Variable)this.vars.get(name);
   }

   public String getPattern(String name) {
      Variables.Variable v = (Variables.Variable)this.vars.get(name);
      return v != null?v.pattern.toString():"";
   }

   public void remove(String name) {
      this.vars.remove(name);
   }

   public void process(String line) {
      String name;
      Variables.Variable v;
      for(Enumeration keys = this.vars.keys(); keys.hasMoreElements(); this.vars.put(name, v)) {
         name = (String)keys.nextElement();
         v = (Variables.Variable)this.vars.get(name);
         Matcher m = v.pattern.matcher(line);
         if(m.find()) {
            v.value = m.group();
         }
      }

   }

   public Enumeration keys() {
      return this.vars.keys();
   }

   public void clear() {
      this.vars.clear();
   }

   public class Variable {

      public String value = "";
      public Pattern pattern;


      public Variable(String regex) {
         this.pattern = Pattern.compile(regex);
      }
   }
}
