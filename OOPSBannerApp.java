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
    }
}