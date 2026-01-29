import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;
import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {
    public static void main(String[] args){

        // UC1: Print OOPS to console
        System.out.println("OOPS");

        // UC2: Print multiple lines of * and spaces
        System.out.println("UC2: Print OOPS Banner");
        System.out.println("  *****   " + "  *****   " + "  *****   " + "  ******  ");
        System.out.println(" *     *  " + " *     *  " + " *     *  " + " *       ");
        System.out.println(" *     *  " + " *     *  " + " *     *  " + " *       ");
        System.out.println(" *     *  " + " *     *  " + "  *****   " + "  ******  ");
        System.out.println(" *     *  " + " *     *  " + " *        " + "       *  ");
        System.out.println(" *     *  " + " *     *  " + " *        " + "       *  ");
        System.out.println("  *****   " + "  *****   " + " *        " + "  ******  ");

        //UC3: Print OOPS as Banner using string.join()
        System.out.println("UC3: Print OOPS Banner using string.join()");
        System.out.println(String.join(" ", "  *****  ", "  *****  ","  *****  ","  ****** "));
        System.out.println(String.join(" "," *     * "," *     * "," *     * "," *      "));
        System.out.println(String.join(" "," *     * "," *     * "," *     * "," *      "));
        System.out.println(String.join(" "," *     * ", " *     * ", "  *****  ","  ****** "));
        System.out.println(String.join(" ", " *     * ", " *     * ", " *       ","       * "));
        System.out.println(String.join(" ", " *     * ", " *     * "," *       ","       * "));
        System.out.println(String.join(" ", "  *****  ","  *****  "," *       ","  ****** "));

        //UC4: OOPS Banner using String Array and Loop
        System.out.println("UC4: Print OOPS Banner using string array and loop");
        String[] bannerLines = new String[7];
        bannerLines[0] = String.join(" ", "  *****  ", "  *****  ", "  *****  ", "  ****** ");
        bannerLines[1] = String.join(" ", " *     * ", " *     * ", " *     * ", " *      ");
        bannerLines[2] = String.join(" ", " *     * ", " *     * ", " *     * ", " *      ");
        bannerLines[3] = String.join(" ", " *     * ", " *     * ", "  *****  ", "  ****** ");
        bannerLines[4] = String.join(" ", " *     * ", " *     * ", " *       ", "       * ");
        bannerLines[5] = String.join(" ", " *     * ", " *     * ", " *       ", "       * ");
        bannerLines[6] = String.join(" ", "  *****  ", "  *****  ", " *       ", "  ****** ");

        for (String line : bannerLines) {
            System.out.println(line);
        }

        //UC5: OOPS Banner using Inline Array
        System.out.println("UC5: Print OOPS Banner using inline array");
        String[] bannerInLines = {
            String.join(" ", "  *****  ", "  *****  ","  *****  ","  ****** "),
            String.join(" "," *     * "," *     * "," *     * "," *      "),
            String.join(" "," *     * "," *     * "," *     * "," *      "),
            String.join(" "," *     * ", " *     * ", "  *****  ","  ****** "),
            String.join(" ", " *     * ", " *     * ", " *       ","       * "),
            String.join(" ", " *     * ", " *     * "," *       ","       * "),
            String.join(" ", "  *****  ","  *****  "," *       ","  ****** ")
        };
        for (String line : bannerInLines) {
            System.out.println(line);
        }

        //UC6: Refractor Banner Logic into Functions
                System.out.println("UC6: Refactor Banner Logic into Functions");

        String[] bannerFunLines = {
            String.join(" ", getOPattern()[0], getOPattern()[0], getPPattern()[0], getSPattern()[0]),
            String.join(" ", getOPattern()[1], getOPattern()[1], getPPattern()[1], getSPattern()[1]),
            String.join(" ", getOPattern()[2], getOPattern()[2], getPPattern()[2], getSPattern()[2]),
            String.join(" ", getOPattern()[3], getOPattern()[3], getPPattern()[3], getSPattern()[3]),
            String.join(" ", getOPattern()[4], getOPattern()[4], getPPattern()[4], getSPattern()[4]),
            String.join(" ", getOPattern()[5], getOPattern()[5], getPPattern()[5], getSPattern()[5]),
            String.join(" ", getOPattern()[6], getOPattern()[6], getPPattern()[6], getSPattern()[6])
        };

        for (String line : bannerFunLines) {
            System.out.println(line);
        }

    // UC7: Store character pattern in a class
        System.out.println("UC7: Store Character Pattern in a Class");

        CharacterPatternMap o = new CharacterPatternMap('O', getOPattern());
        CharacterPatternMap p = new CharacterPatternMap('P', getPPattern());
        CharacterPatternMap s = new CharacterPatternMap('S', getSPattern());

        CharacterPatternMap[] wordArr = { o, o, p, s };
        String[] bannerUC7 = new String[7];

        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (int col = 0; col < wordArr.length; col++) {
                sb.append(wordArr[col].getPattern()[row]);
                if (col < wordArr.length - 1) sb.append(" ");
            }
            bannerUC7[row] = sb.toString();
        }

        for (String line : bannerUC7) {
            System.out.println(line);
        }

        // UC8: Use Map for Character Patterns and Render via Function
        System.out.println("UC8: Use Map for Character Patterns and Render via Function");
        Map<Character, String[]> patternMap = buildCharacterPatternMap();
        renderBanner("OOPS", patternMap);
   }
   // ===== UC6 Helper Methods =====

    static String[] getOPattern() {
        return new String[]{
                "  *****  ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                " *     * ",
                "  *****  "
        };
    }
    static String[] getPPattern() {
        return new String[]{
                " ******  ",
                " *     * ",
                " *     * ",
                " ******  ",
                " *       ",
                " *       ",
                " *       "
        };
    }

    static String[] getSPattern() {
        return new String[]{
                "  *****  ",
                " *       ",
                " *       ",
                "  *****  ",
                "       * ",
                "       * ",
                "  ****** "
        };
    }

    // ===== UC7 Inner Static Class =====

    static class CharacterPatternMap {
        private final char character;
        private final String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }
    // ===== UC8 Helper Methods =====

    static Map<Character, String[]> buildCharacterPatternMap() {
        Map<Character, String[]> map = new HashMap<>();
        map.put('O', getOPattern());
        map.put('P', getPPattern());
        map.put('S', getSPattern());
        return map;
    }

    static void renderBanner(String word, Map<Character, String[]> patternMap) {

        for (int row = 0; row < 7; row++) {
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < word.length(); i++) {
                sb.append(patternMap.get(word.charAt(i))[row]);
                if (i < word.length() - 1) sb.append(" ");
            }
            System.out.println(sb);
        }
    }
}