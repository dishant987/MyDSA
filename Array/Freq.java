public class Freq {
    public static void main(String[] args) {
        String name = "NiceTryDiddy";
        int arr[] = new int[128];

        for (int i = 0; i < name.length(); i++) {
            int ch = name.charAt(i);
            arr[ch] = arr[ch] + 1;

        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                System.out.println((char) i + "Times " + arr[i]);
            }
        }
    }
}
