import java.util.ArrayList;
import java.util.Hashtable;

public class Server {

    ArrayList tabs;
    int currentTabIndex;
    Hashtable[] bindings;
    Boolean colorchat;
    Integer lines;
    Variables vars;
    String[] translations;
    String ChatMode;
    public String name;
    public String address;


    public Server(String name) {
        this(name, name);
        Tab d = new Tab("Default");
        this.tabs.add(d);
        d.track("^");
    }

    public Server(String name, String add) {
        this.currentTabIndex = 0;
        this.vars = new Variables();
        this.name = name;
        this.address = add;
        this.bindings = new Hashtable[4];
        this.colorchat = false;
        this.tabs = new ArrayList();
        this.lines = 20;
        this.ChatMode = null;

        for(int i = 0; i < 4; ++i) {
            this.bindings[i] = new Hashtable();
        }

    }

    public Tab currentTab() {
        return (Tab)this.tabs.get(this.currentTabIndex);
    }

    public void nextTab() {
        ((Tab)this.tabs.get(this.currentTabIndex)).blinking = false;
        ++this.currentTabIndex;
        if(this.currentTabIndex >= this.tabs.size()) {
            this.currentTabIndex = 0;
        }

        ((Tab)this.tabs.get(this.currentTabIndex)).blinking = true;
    }

    public void previosTab() {
        ((Tab)this.tabs.get(this.currentTabIndex)).blinking = false;
        --this.currentTabIndex;
        if(this.currentTabIndex < 0) {
            this.currentTabIndex = this.tabs.size() - 1;
        }

        ((Tab)this.tabs.get(this.currentTabIndex)).blinking = true;
    }
}
