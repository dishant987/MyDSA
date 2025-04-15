/**
 * prob
 */
public class vowelreverse {

    public static void main(String[] args) {
        String str = "welcometogo";
        char[] st = str.toCharArray();
        int i = 0;
        int j = st.length - 1;
        while (i < j) {
            while (st[i] != 'a' && st[i] != 'i' && st[i] != 'o' && st[i] != 'u' && st[i] != 'e') {
                i++;
            }
            while (st[j] != 'a' && st[j] != 'i' && st[j] != 'o' && st[j] != 'u' && st[j] != 'e') {
                j++;
            }

            if (i >= j) {
                break;
            }
            char temp = st[i];
            st[i] = st[j];
            st[j] = temp;
            i++;
            j--;
        }

        for (char c : st) {
            System.out.print(c);
        }

    }
}