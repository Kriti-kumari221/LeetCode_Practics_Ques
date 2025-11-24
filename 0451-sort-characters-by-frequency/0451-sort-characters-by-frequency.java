class Solution {
    public String frequencySort(String s) {
        HashMap<Character,Integer>map=new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        List<Character>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
                return map.get(b)-map.get(a);
        });
        StringBuilder s1=new StringBuilder();
        for(char k:list){
            int f=map.get(k);
            while(f-->0){
                s1.append(k);
            }
        }
        return s1.toString();
    }
}