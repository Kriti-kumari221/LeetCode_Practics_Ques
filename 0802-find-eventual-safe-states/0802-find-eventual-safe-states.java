class Solution {
    boolean DFS(ArrayList<ArrayList<Integer>>adj,int node,int[] state,int []visited,int []path){
        visited[node]=1;
        path[node]=1;
        for(int neighour:adj.get(node)){
            if(visited[neighour]==0){
                if(DFS(adj,neighour,state,visited,path))
                return true;
            }
            else if(path[neighour]==1){
                return true;
            }
        }
       
        state[node]=1;
        path[node]=0;
        return false;
    }
    public List<Integer> eventualSafeNodes(int[][] graph) {
        ArrayList<ArrayList<Integer>>adj=new ArrayList<>();
        int visited[]=new int[graph.length];
        int state[]=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            adj.add(new ArrayList<>());
        }
        for(int i=0;i<graph.length;i++){
           for(int v : graph[i]){
           adj.get(i).add(v);
    }
}
        int []path=new int[graph.length];
        for(int i=0;i<graph.length;i++){
            if(visited[i]==0){
                DFS(adj,i,state,visited,path);
            }
        }
        ArrayList<Integer>res=new ArrayList<>();
        for(int i=0;i<graph.length;i++){
            if(state[i]==1){
                res.add(i);
            }
        }
        return res;
    }
}