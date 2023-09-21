package interview.agoda;

import java.util.*;

class Editor {
    private StringBuilder text;
    private int cursor;

    public Editor() {
        this.text = new StringBuilder();
        this.cursor = 0;
    }

    public String onPressLeft() {
        if (cursor > 0) {
            cursor--;
        }
        return text.toString();
    }

    public String onPressRight() {
        if (cursor < text.length()) {
            cursor++;
        }
        return text.toString();
    }

    public String onPressHome() {
        cursor = 0;
        return text.toString();
    }

    public String onPressEnd() {
        cursor = text.length();
        return text.toString();
    }

    public String onPressDelete() {
        if (cursor < text.length()) {
            text.deleteCharAt(cursor);
        }
        return text.toString();
    }

    public String onPressBackspace() {
        if (cursor > 0) {
            text.deleteCharAt(cursor - 1);
            cursor--;
        }
        return text.toString();
    }

    public String onInputCharacter(String character) {
        text.insert(cursor, character);
        cursor++;
        return text.toString();
    }
}

class Solution {
    public static List<String> solution(String[] commands) {
        Editor editor = new Editor();
        List<String> result = new ArrayList<>();

        for (String command : commands) {
            if (command.equals("left")) {
                result.add(editor.onPressLeft());
            } else if (command.equals("right")) {
                result.add(editor.onPressRight());
            } else if (command.equals("home")) {
                result.add(editor.onPressHome());
            } else if (command.equals("end")) {
                result.add(editor.onPressEnd());
            } else if (command.equals("delete")) {
                result.add(editor.onPressDelete());
            } else if (command.equals("backspace")) {
                result.add(editor.onPressBackspace());
            } else {
                result.add(editor.onInputCharacter(command));
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] commands = {"S", "S", "i", "g", "g", "backspace", "n", "a", "l", "left", "left", "left", "left", "left", "backspace", "left", "C", "o", "d", "e"};
        List<String> result = solution(commands);
        for (String entry : result) {
            System.out.println(entry);
        }
    }
}
