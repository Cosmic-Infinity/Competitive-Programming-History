//0ms 41.88mb

class Solution {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1))
            return "";

        int l1 = str1.length(), l2 = str2.length();
        if (l2 > l1) {
            String temp = str1;
            str1 = str2;
            str2 = temp;
        }
        int temp = 0;
        while (l2 > 0) {
            temp = l2;
            l2 = l1 % l2;
            l1 = temp;
        }
        return str1.substring(0, l1);

        // if (str2.length() > str1.length()) {
        //     String temp = str1;
        //     str1 = str2;
        //     str2 = temp;
        // }
        // if (str1.replace(str2, "").length() == 0)
        //     return str2;
        // String res = "";
        // for (int i = 1; i < str2.length(); i++) {
        //     if (l1 % i == 0 && l2 % i == 0) {
        //         String sub = str2.substring(0, i);
        //         if (str1.replace(sub, "").length() == 0 && str2.replace(sub, "").length() == 0) {
        //             res = sub;
        //         }
        //     }
        // }
        // return res;
    }
}
