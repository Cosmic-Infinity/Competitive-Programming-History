//9ms 45.15mb

class Solution {
    public String generateTag(String caption) {
        caption = caption.trim();
        if (caption.isEmpty()) return "#";
        StringBuilder res = new StringBuilder("#");
        String[] words = caption.split("\\s+");
        res.append(words[0].toLowerCase());
        for (int i = 1; i < words.length; i++) {
            if (!words[i].isEmpty()) {
                res.append(Character.toUpperCase(words[i].charAt(0)));
                if (words[i].length() > 1)
                    res.append(words[i].substring(1).toLowerCase());
            }
        }
        if (res.length() > 100)
            return res.substring(0, 100);
        return res.toString();
    }
}