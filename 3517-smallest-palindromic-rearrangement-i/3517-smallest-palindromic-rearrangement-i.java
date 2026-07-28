class Solution {
    public String smallestPalindrome(String s) {
        if(s.length()==1){
            return s;
        }
        int n = s.length();
        int[] arr = new int[26];
        for(int i=0; i<n; i++){
            arr[s.charAt(i) - 'a']++;
        }
        char[] ans = new char[n];
        int left = 0;
        int right = n - 1;

    for (int i = 0; i < 26; i++) {
        while (arr[i] >= 2) {
            char c = (char) (i + 'a');
            ans[left++] = c;
            ans[right--] = c;
            arr[i] -= 2;
        }
    }

    for (int i = 0; i < 26; i++) {
        if (arr[i] == 1) {
            ans[n / 2] = (char) (i + 'a');
            break;
        }
    }

        return new String(ans);
        }
}