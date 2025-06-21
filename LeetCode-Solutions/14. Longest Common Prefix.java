//11ms 41.2mb

class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix="";
        byte f = 0;

        for(short i=0; i<strs[0].length(); i++){
            prefix+=strs[0].charAt(i);
            for(short j=1; j<strs.length;j++){
                if(strs[j].startsWith(prefix))
                    continue;
                else{
                    f=1;
                    prefix = prefix.substring(0, i);
                    break;
                }
            }
            if(f==1)
                break;
        }
        return prefix;
    }
}