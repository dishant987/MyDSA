/**
 * P2
 */
public class P2 {

  public static void main(String[] args) {
    int num = 12;
    String st = "1010011001101001";
    String decToBin = decimaltoBinary(num);
    int binToDec = binaryToDecimal(st);
    System.out.println(binToDec);
  }

  static String decimaltoBinary(int num) {
    StringBuffer st = new StringBuffer();
    while (num > 0) {
      int temp = num & 1;
      st.append(temp);
      num = num >> 1;
    }
    st.reverse();
    return st.toString();
  }

  static int binaryToDecimal(String num) {
    int decimalValue = 0;
    int exponent = 0;
    
    for (int i = num.length() - 1; i >= 0; i--) {
        int binaryDigit = Character.getNumericValue(num.charAt(i));
        decimalValue += binaryDigit * Math.pow(2, exponent);
        exponent++;
    }
    
    return decimalValue;
}
}