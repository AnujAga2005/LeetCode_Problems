class Solution {
    public int romanToInt(String s){
        if(s.length()==0){
            return 0;
        }

    HashMap<Character,Integer> hm = new HashMap<>();
    hm.put('I',1);
    hm.put('V',5);
    hm.put('X',10);
    hm.put('L',50);
    hm.put('C',100);
    hm.put('D',500);
    hm.put('M',1000);
    int sum=0;
    int length = s.length();
    if(length==1){
        return hm.get(s.charAt(0));
    }
    for(int i=0; i<length-1;i++){
        int value = hm.get(s.charAt(i));
        if(hm.get(s.charAt(i))<hm.get(s.charAt(i+1))){
            sum = sum-value;
        }else{
            sum = sum + value;
        }
        
    }
    sum += hm.get(s.charAt(s.length() - 1));
    
    
    return sum;  
    }
}