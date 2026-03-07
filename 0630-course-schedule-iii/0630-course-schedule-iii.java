class Solution {
    public int scheduleCourse(int[][] courses) {
        Arrays.sort(courses,(a,b)->(a[1]-b[1]));
        PriorityQueue<Integer>q=new PriorityQueue<>((a,b)->b-a);

        int time=0;
        for(int c[]:courses){
            int d=c[0];
            int l=c[1];
            time+=d;
            q.add(d);
            if(time>l){
                time-=q.poll();
            }
        }
        return q.size();
    }
}