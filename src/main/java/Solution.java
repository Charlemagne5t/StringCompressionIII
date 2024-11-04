class Solution {
    public String compressedString(String word) {
        char ch = word.charAt(0);
        int c = 1;
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i < word.length(); i++) {
            if(word.charAt(i) == word.charAt(i - 1) && c < 9) {
                c++;
            }else {
                sb.append(c + "");
                sb.append(ch);
                ch = word.charAt(i);
                c = 1;
            }
        }
        sb.append(c + "");
        sb.append(ch);

        return sb.toString(); 

    }
}