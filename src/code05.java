package leetcode05.src;
public class code05 {
    public static void main(String[] args) {
        code05 test1 = new code05();
        test1.longestPalindrome("abaabb");
    }
    public code05(){

    }
    public String longestPalindrome(String s) {
        int len = s.length();
        int maxlen = 1;
        int begin =0;
        if (len<2){
            return s;
        }
        //System.out.print(len);
        char[] arraychar = s.toCharArray();
        boolean [][] p = new boolean[len][len];
        for (int L = 2; L <= len; L++){
            for (int i = 0; i < len; i++){
                int j = i + L - 1;
                if (j >= len){
                    break;
                }
                if (arraychar[i] != arraychar[j])
                {
                    p [i][j] = false;
                }
                else{
                    if (j-i <3)
                    {
                        p[i][j] = true;
                    }
                    else{
                        p [i][j] = p[i+1][j-1];
                    }
                }
                if (p[i][j]==true && j-i+1 > maxlen){
                    maxlen = j-i+1;
                    begin = i;
                }


            }
        }
        System.out.println(s.substring(begin, begin+maxlen));
        return s.substring(begin, begin+maxlen);

    }

    }

