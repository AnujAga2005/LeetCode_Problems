class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        int n = address.length();
        for(int i =0; i<n; i++){
            if(!Character.isDigit(address.charAt(i))){
                sb.append('[');
                sb.append(address.charAt(i));
                sb.append(']');
            }else{
                sb.append(address.charAt(i));
            }
        }
        return sb.toString();
    }
}