public class RomantoInteger2 {
    public static void main(String[] args) {
        String s = "MCMXCIV";
        int result = romanToInt(s);
        System.out.println("The integer value of the Roman numeral " + s + " is: " + result);

    }
    public static int romanToInt(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) == 'I'){
                count += 1;
            }else if(s.charAt(i) == 'V'){
                count += 5;

            }else if(s.charAt(i) == 'X'){
                count += 10;
            }else if(s.charAt(i) == 'L'){
                count += 50;
            }else if(s.charAt(i) == 'C'){
                count += 100;
            }else if(s.charAt(i) == 'D'){
                count += 500;
            }else if(s.charAt(i) == 'M'){
                count += 1000;
            }
                
        }
        return count;
    }
}
