package bootcamp.java.mod6.morsecode.translator;

import java.util.HashMap;
import java.util.Map;

public final class MorseCode {
    private static final Map<String, Character> dict = new HashMap<>();

    private MorseCode() {}

    // -- . .-. -.-. .- -.. ---   .-.. .. -... .-. .
    public static String interpret(String morseMessage) {
        StringBuilder b = new StringBuilder();
        for (String word : morseMessage.split("   ")) {
            for (String signal : word.split(" ")) {
                b.append(dict.get(signal));
            }
            b.append(" ");
        }
        return b.substring(0, b.length() - 1);
    }

    static {
        dict.put(".-", 'A');
        dict.put("-.", 'N');
        dict.put("-...", 'B');
        dict.put("---", 'O');
        dict.put("-.-.", 'C');
        dict.put(".--.", 'P');
        dict.put("-..", 'D');
        dict.put("--.-", 'Q');
        dict.put(".", 'E');
        dict.put(".-.", 'R');
        dict.put("..-.", 'F');
        dict.put("...", 'S');
        dict.put("--.", 'G');
        dict.put("-", 'T');
        dict.put("....", 'H');
        dict.put("..-", 'U');
        dict.put("..", 'I');
        dict.put("...-", 'V');
        dict.put(".---", 'J');
        dict.put(".--", 'W');
        dict.put("-.-", 'K');
        dict.put("-..-", 'X');
        dict.put(".-..", 'L');
        dict.put("-.--", 'Y');
        dict.put("--", 'M');
        dict.put("--..", 'Z');
        dict.put("·----", '1');
        dict.put("··---", '2');
        dict.put("···--", '3');
        dict.put("····-", '4');
        dict.put("·····", '5');
        dict.put("-····", '6');
        dict.put("--···", '7');
        dict.put("---··", '8');
        dict.put("----·", '9');
        dict.put("-----", '0');
        dict.put("·-·-·-", '.');
        dict.put("--··--", ',');
        dict.put("··--··", '?');
        dict.put("·----·", '\'');
        dict.put("-·-·--", '!');
        dict.put("-··-·", '/');
        dict.put("-·--·", '(');
        dict.put("-·--·-", ')');
        dict.put("·-···", '&');
        dict.put("---···", ':');
        dict.put("-·-·-·", ';');
        dict.put("-···-", '=');
        dict.put("-····-", '-');
        dict.put("··--·-", '_');
        dict.put("·-··-·", '"');
        dict.put("···-··-", '$');
        dict.put("·--·-·", '@');
    }
}
