public class Toggle {
    public static void main(String[] args) {
        String a = "NiCeTRyDidDy";
        String toggle = "";
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (ch >= 65 && ch <= 90) {
                toggle = toggle + (char) (ch + 32);
            } else if (ch >= 97 && ch <= 122) {
                toggle = toggle + (char) (ch - 32);
            }
        }
        System.out.println(toggle);
    }
}
