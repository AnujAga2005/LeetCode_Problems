class MyCalendar {
    TreeMap<Integer, Integer> map = new TreeMap<>();
    
    public boolean book(int start, int end) {
        Map.Entry<Integer, Integer> floor = map.floorEntry(start);
        Map.Entry<Integer, Integer> ceiling = map.ceilingEntry(start);
        
        if ((floor == null || floor.getValue() <= start) &&
            (ceiling == null || ceiling.getKey() >= end)) {
            map.put(start, end);
            return true;
        }
        return false;
    }
}