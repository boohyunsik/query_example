import java.util.ArrayList;
import java.util.List;

public class Parser {

    public ParseData parse(String query) {
        String[] arr = query.split("[&|! ]");
        List<String> list = new ArrayList<>();
        for (int i=0; i < arr.length; i++){
            if (arr[i].length() > 0) {
                list.add(arr[i]);
            }
        }
        String[] result = new String[list.size()];
        int index = 0;
        for (String str : list) {
            result[index++] = str;
        }

        int[] modes = new int[arr.length];
        modes[0] = ParseData.DEFAULT;
        int idx = 1;
        for (int i=0; i<query.length(); i++) {
            switch (query.charAt(i)) {
                case '&':
                    modes[idx++] = ParseData.AND;
                    break;
                case '|':
                    modes[idx++] = ParseData.OR;
                    break;
                case '!':
                    modes[idx++] = ParseData.NOT;
                    break;
            }
        }

        ParseData data = new ParseData();
        data.setInput(result);
        data.setModes(modes);
        return data;
    }
}