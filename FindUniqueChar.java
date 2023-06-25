public class FindUniqueChar {
    public static int uniqueChar(String str){
        int charCount[] = new int[26];
        for (char ch : str.toCharArray()) {
            charCount[ch-'a']++;
        }
        for(int i = 0; i<charCount.length; i++){
            if(charCount[str.charAt(i)-'a']==1){
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "leetcode";
        int index = uniqueChar(s);
        System.out.println("Index of the first non-repeating character: " + index);
    }
}
