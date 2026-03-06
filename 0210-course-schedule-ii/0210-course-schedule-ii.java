class Solution {
    public int[] findOrder(int n, int[][] prerequisites) {
        ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int indegree[]=new int[n];
        for(int e[]:prerequisites){
            int u=e[0];
            int v=e[1];
            adj.get(v).add(u);
            indegree[u]++;
        }
        Queue<Integer>q=new LinkedList<>();
        for(int i=0;i<n;i++){
            if(indegree[i]==0){
                q.add(i);
            }
        }
        List<Integer>list=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.remove();
            list.add(node);
            for(int neighour:adj.get(node)){
                indegree[neighour]--;
                if(indegree[neighour]==0){
                    q.add(neighour);
                }
            }
        }
        if(list.size() != n) return new int[0];
        int i=0;
        int r[]=new int[list.size()];
        for(int res:list){
            r[i++]=res;
        }
return r;
        
    }
}