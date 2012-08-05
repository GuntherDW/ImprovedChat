/**
 * @author GuntherDW
 */
public abstract class icChannel {

    /**
     * The command prefix (~ for native ImprovedChat commands)
     */
    private Character prefix;

    /**
     * Should the command fall through to chat?
     */
    private boolean fallthrough = false;


    /**
     * Passthrough with command used and arguments
     * @param command
     * @param args
     */
    public abstract boolean process(String command, String[] args);

    protected icChannel(Character prefix, boolean fallthrough) {
        this.prefix = prefix;
        this.fallthrough = fallthrough;
    }

    public void setFallthrough(boolean fallthrough) {
        this.fallthrough = fallthrough;
    }

    public boolean isFallthrough() {
        return fallthrough;
    }

    public Character getPrefix() {
        return prefix;
    }
}
