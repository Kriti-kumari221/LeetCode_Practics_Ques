import java.util.PriorityQueue;
class Solution {
    public double maxAverageRatio(int[][] classes, int extraStudents) {
        java.util.function.BiFunction<Integer, Integer, Double> gain = (p, t) -> 
            (double)(p + 1) / (t + 1) - (double)p / t;
        PriorityQueue<double[]>pq=new PriorityQueue<>((a,b)->Double.compare(b[0],a[0]));
        for(int[]c:classes){
            int p=c[0], t=c[1];
            pq.offer(new double[]{gain.apply(p,t),p,t});
        }
        for(int i=0;i<extraStudents;i++){
              double[] top = pq.poll();
            int p = (int) top[1];
            int t = (int) top[2];
            p++; t++;
            pq.offer(new double[]{gain.apply(p, t), p, t});
        }
        double total=0.0;
        while(!pq.isEmpty()){
            double[] cur = pq.poll();
            int p = (int) cur[1];
            int t = (int) cur[2];
            total += (double)p / t;
        }
        return total/classes.length;
        
    }
}