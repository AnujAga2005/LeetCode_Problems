class MyHashMap {
    public Integer[] hashmap;
    public MyHashMap() {
        hashmap = new Integer[1000001];
        
    }
    
    public void put(int key, int value) {
        hashmap[key] = value;
        
    }
    
    public int get(int key) {
        return hashmap[key]==null ? -1 : hashmap[key];
    }
    
    public void remove(int key) {
        hashmap[key] = null;        
    }
}

/**
 * Your MyHashMap object will be instantiated and called as such:
 * MyHashMap obj = new MyHashMap();
 * obj.put(key,value);
 * int param_2 = obj.get(key);
 * obj.remove(key);
 */