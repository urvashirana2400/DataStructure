package DijkastraSAlgo;

public class ShortestPath {
    static final int V=9;

    public int minDistance(int dist[],boolean visited[]){
        int min=Integer.MAX_VALUE;
        int min_index=-1;
        for(int v=0;v<V;v++){
            if(visited[v]==false && dist[v]<=min){
            min=dist[v];
            min_index=v;
            }
        }
        return min_index;
    }

    public void printDistance(int dist[]){
        for(int v=0;v<V;v++){
            System.out.println(v +": "+dist[v]);
        }
    }
    public void dijkastra(int graph[][],int src){
        int dist[]=new int[V];
        boolean visited[]=new boolean[V];

        for(int v=0;v<V;v++){
            dist[v]=Integer.MAX_VALUE;
            visited[v]=false;
        }

        dist[src]=0;
        for(int count=0;count<V-1;count++){
            int u=minDistance(dist,visited);
            visited[u]=true;
            for(int v=0;v<V;v++){
                if(!visited[v] && graph[u][v]!=0 && dist[u]!=Integer.MAX_VALUE && graph[u][v]+dist[u]<dist[v]){
                    dist[v]=dist[u]+graph[u][v];
                }
            }
        }
        printDistance(dist);

    }
    public static void main(String[] args) {
    ShortestPath shortestPath=new ShortestPath();
        int graph[][] = new int[][] { { 0, 4, 0, 0, 0, 0, 0, 8, 0 },
                { 4, 0, 8, 0, 0, 0, 0, 11, 0 },
                { 0, 8, 0, 7, 0, 4, 0, 0, 2 },
                { 0, 0, 7, 0, 9, 14, 0, 0, 0 },
                { 0, 0, 0, 9, 0, 10, 0, 0, 0 },
                { 0, 0, 4, 14, 10, 0, 2, 0, 0 },
                { 0, 0, 0, 0, 0, 2, 0, 1, 6 },
                { 8, 11, 0, 0, 0, 0, 1, 0, 7 },
                { 0, 0, 2, 0, 0, 0, 6, 7, 0 } };
        shortestPath.dijkastra(graph,0);
    }
}
