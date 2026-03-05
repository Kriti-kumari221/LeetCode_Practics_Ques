class Solution {
    public boolean canFinish(int V, int[][] edges) {
        int n=edges.length;
        List<List<Integer>>adj=new ArrayList<>();
        for(int i=0;i<V;i++){
            adj.add(new ArrayList<>());
        }
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            adj.get(u).add(v);
        }
        int []indegree=new int[V];
        for(int []edge:edges){
            int u=edge[0];
            int v=edge[1];
            indegree[v]++;
        }
        Queue<Integer>queue=new LinkedList<>();
        List<Integer>res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0){
                queue.add(i);
            }
        }
        while(!queue.isEmpty()){
            int node=queue.remove();
            res.add(node);
            for(int neighour:adj.get(node)){
                indegree[neighour]--;
                if(indegree[neighour]==0){
                    queue.add(neighour);
                }
            }
        }
        return res.size()==V;
    }
}