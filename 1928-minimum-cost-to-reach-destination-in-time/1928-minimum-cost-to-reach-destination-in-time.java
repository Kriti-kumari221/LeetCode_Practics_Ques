class Solution {
    static class State implements Comparable<State>{
        int city,cost,time;
        State(int city,int cost,int time){
            this.city=city;
            this.cost=cost;
            this.time=time;
        }
        public int compareTo(State object){
            return this.cost-object.cost;
        }
    }
    public int minCost(int maxTime, int[][] edges, int[] passingFees) {
        int nCities = passingFees.length;
        List<int[]>[]graph=new ArrayList[nCities];
        for(int i=0;i<nCities;i++){
            graph[i]=new ArrayList<>();
        }
        for(int[]edge:edges){
            int u=edge[0], v=edge[1], t=edge[2];
            graph[u].add(new int[]{v,t});
            graph[v].add(new int[]{u,t});

        }
        PriorityQueue<State>pq=new PriorityQueue<>();
          pq.offer(new State(0, passingFees[0], 0));
        boolean[][] visited = new boolean[nCities][maxTime + 1];
        visited[0][0]=true;
        while(!pq.isEmpty()){
            State current=pq.poll();
            int city=current.city;
            int cost=current.cost;
            int time=current.time;
            if(city==nCities-1){
                return cost;
            }
            if(time>maxTime){
                 continue;
            }
            for(int []neighour:graph[city]){
                int newCity=neighour[0], travelTime=neighour[1],newTime=time+travelTime;
                if(newTime<=maxTime&&!visited[newCity][newTime]){
                    visited[newCity][newTime]=true;
                    int newCost=cost+passingFees[newCity];
                    pq.offer(new State(newCity,newCost,newTime));
                }
            }
        }
        return -1;
        
    }
}