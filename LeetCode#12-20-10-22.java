//LeetCode#12 Integer to Roman
class Solution {
    public String intToRoman(int num) {
        //This solution might be too verbose but it is as simple as it is

        //Strings are immutable, hence he use of StringBuilder
        StringBuilder sb = new StringBuilder();

        //The approach categorizes the number in which percentile it belongs
        //Calculates how many letters should be appended
        //Modifies the number so there would not be a need to reconsider the old percentile
        for(int i =0; i<(num/1000); i++){
            sb.append("M");
        }
        num = num%1000;
        for(int i = 0;i<(num/900); i++){
            sb.append("CM");
        }
        num = num%900;
        for(int i =0; i<(num/500); i++){
            sb.append("D");
        }
        num = num%500;
        for(int i= 0; i<(num/400); i++){
            sb.append("CD");
        }
        num = num%400;
        for(int i = 0; i<(num/100); i++){
            sb.append("C");
        }
        num = num%100;
        for(int i = 0; i<(num/90); i++){
            sb.append("XC");
        }
        num = num%90;
        for(int i = 0; i<(num/50); i++){
            sb.append("L");
        }
        num = num%50;
        for(int i =0; i<(num/40); i++){
            sb.append("XL");
        }
        num = num%40;
        for(int i =0; i<(num/10);i++){
            sb.append("X");
        }
        num = num%10;
        for(int i =0; i<(num/9); i++){
            sb.append("IX");
        }
        num = num%9;
        for(int i = 0; i<(num/5); i++){
            sb.append("V");
        }
        num = num%5;
        for(int i = 0; i<(num/4); i++){
            sb.append("IV");
        }
        num = num%4;
        for(int i =0; i<num; i++){
            sb.append("I");
        }

        //Output
        return sb.toString();
    }
}