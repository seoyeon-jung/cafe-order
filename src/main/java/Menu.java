public class Menu {
    public static int getPrice(String name) {
        if (name == null) {
            return 0;
        }

        if (name.equals("아메리카노")) {
            return 3000;
        } else if (name.equals("라테")) {
            return 4000;
        }
        return 0;
    }
}