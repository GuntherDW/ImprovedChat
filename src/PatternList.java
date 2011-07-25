import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

public class PatternList {

    public ArrayList list = new ArrayList();
    private static Pattern evilDollarSign = Pattern.compile("\\$(?!\\d)");


    public void add(String pattern, String replacement) {
        replacement = evilDollarSign.matcher(replacement).replaceAll("\\$");

        try {
            this.list.add(new PatternList.Entry(Pattern.compile(pattern), replacement));
        } catch (PatternSyntaxException var4) {
            ;
        }

    }

    public String process(String line) {
        String repl;
        Matcher m;
        for(Iterator var4 = this.list.iterator(); var4.hasNext(); line = m.replaceAll(repl)) {
            PatternList.Entry e = (PatternList.Entry)var4.next();
            m = e.pattern.matcher(line);
            repl = ImprovedChat.replaceVars(e.replacement);
            repl = evilDollarSign.matcher(repl).replaceAll("\\\\\\$");
        }

        return line;
    }

    public void list() {
        for(int i = 0; i < this.list.size(); ++i) {
            PatternList.Entry e = (PatternList.Entry)this.list.get(i);
            ImprovedChat.unProccessedInput(i + ". (" + e.pattern.toString() + ")->(" + e.replacement + ")");
        }

        if(this.list.size() == 0) {
            ImprovedChat.unProccessedInput("Empty");
        }

    }

    public String move(int from, int to) {
        if(from >= 0 && from <= this.list.size()) {
            if(to >= 0 && to <= this.list.size()) {
                this.list.add(to, (PatternList.Entry)this.list.remove(from));
                return "Move: Rule succesfully moved";
            } else {
                return "Move: Second index out of range";
            }
        } else {
            return "Move: First index out of range";
        }
    }

    public void clear() {
        this.list.clear();
    }

    public class Entry {

        public Pattern pattern;
        public String replacement;


        public Entry(Pattern pattern, String replacement) {
            this.pattern = pattern;
            this.replacement = replacement;
        }
    }
}
