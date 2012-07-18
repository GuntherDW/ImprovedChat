import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

public class Server {

    public List<Tab> tabs;
    public int currentTabIndex;
    public List<Hashtable<Integer, String>> bindings;
    public Boolean colorchat;
    public Boolean heroChat;
    public Integer lines;
    public Variables vars;
    public String[] translations;
    public String ChatMode;
    public String name;
    public String address;


    public Server(String name) {
        this(name, name);
        tabs = new ArrayList<Tab>();
        Tab d = new Tab("Default");
        this.tabs.add(d);
        d.track("^");
    }

    public Server(String name, String add) {
        this.currentTabIndex = 0;
        this.vars = new Variables();
        this.name = name;
        this.address = add;
        // this.bindings = (Hashtable<Integer, String>[]) new Hashtable<?,?>[4];
        this.bindings = new ArrayList<Hashtable<Integer, String>>();
        this.colorchat = false;
        this.heroChat = false;
        this.tabs = new ArrayList<Tab>();
        this.lines = 20;
        this.ChatMode = null;

        for (int i = 0; i < 4; ++i) {
            this.bindings.add(new Hashtable<Integer, String>());
        }

    }

    public Tab currentTab() {
        return this.tabs.get(this.currentTabIndex);
    }

    public void nextTab() {
        this.tabs.get(this.currentTabIndex).blinking = false;
        ++this.currentTabIndex;
        if (this.currentTabIndex >= this.tabs.size()) {
            this.currentTabIndex = 0;
        }

        this.tabs.get(this.currentTabIndex).blinking = true;
    }

    public void previousTab() {
        this.tabs.get(this.currentTabIndex).blinking = false;
        --this.currentTabIndex;
        if (this.currentTabIndex < 0) {
            this.currentTabIndex = this.tabs.size() - 1;
        }

        this.tabs.get(this.currentTabIndex).blinking = true;
    }
}
