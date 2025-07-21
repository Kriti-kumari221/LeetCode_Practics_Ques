class Solution {
    public boolean canFinish(int V, int[][] edges) {
        int e=edges.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());//[[],[],[],[]];
        }
        for(int[] edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);//[[],[0],[0],[0]]
                               // 0  1   2   3
        }
        int []indegree=new int[V];
        for(int []edge:edges){
            int from=edge[0];
            int to=edge[1];
            indegree[to]++; //[3,0,0,0];
                            // 0 1 2 3
        }
        List<Integer>ans=new ArrayList<>();
        Queue<Integer>queue=new LinkedList<>();//
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                queue.add(i);
        }
        }
        while(!queue.isEmpty()){
            int temp=queue.remove();
            ans.add(temp);
            for(int neighour:adj.get(temp)){
                indegree[neighour]--;
                if(indegree[neighour]==0){
                    queue.add(neighour);
                }
            }
            
        }
        return ans.size() == V;
    }
}