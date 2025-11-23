class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer>map=new HashMap<>();
        for(String w:words){
            map.put(w,map.getOrDefault(w,0)+1);
        }
        List<String>list=new ArrayList<>(map.keySet());
        Collections.sort(list,(a,b)->{
            if(map.get(a)==map.get(b)){
                return a.compareTo(b);
            }
            else{
                return map.get(b)-map.get(a);
            }
        });
        List<String>ans = new ArrayList<>();
        for(int i=0;i<k;i++){
            ans.add(list.get(i));
        }
        return ans;
    }
}