public class ParseData {

    public final static int DEFAULT = 100;
    public final static int AND = 101;
    public final static int OR = 102;
    public final static int NOT = 103;

    private String[] input;
    private int[] modes;

    public void setInput(String[] strs) {
        input = strs;
    }

    public void setModes(int[] modes) {
        this.modes = modes;
    }

    public String[] getInput() {
        return input;
    }

    public int[] getModes() {
        return modes;
    }
}
