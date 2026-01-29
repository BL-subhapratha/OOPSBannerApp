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
    }

    static String[] getOPattern() {
        return new String[] {
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
        return new String[] {
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
        return new String[] {
            "  *****  ",
            " *      ",
            " *      ",
            "  *****  ",
            "       * ",
            "       * ",
            "  ****** "
        };
    }
}