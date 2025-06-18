//28ms 45.23mb

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if(!(str1 + str2).equals(str2 + str1)) return "";
        if (str2.length() > str1.length()) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        String res = "";
        for (int i = 0; i < str2.length(); i++) {
            String sub = str2.substring(0, i + 1);
            if (str1.replace(sub, "").length() == 0 && str2.replace(sub, "").length() == 0) {
                res = sub;
            }
        }
        return res;
    }
}