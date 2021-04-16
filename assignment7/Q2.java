package Assignments.assignment7;

public class Q2 {
    public String reverseWords(String s) {
        int left = s.length() - 1,right = s.length() - 1;
        StringBuilder res = new StringBuilder();
        while(left >= 0){
            while(left >= 0 && s.charAt(left) != ' '){
                left--;
            }
            res.append(s.substring(left+1,right+1)).append(" ");
            while(left >= 0 && s.charAt(left) == ' '){
                left--;
            }
            right = left;
        }
        return res.toString().trim();
    }
}
