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
    }
}