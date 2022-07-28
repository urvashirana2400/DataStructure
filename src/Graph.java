public class Graph {
    private int V;
    private int E;
    private int adjMatrix[][];
    Graph(int nodes){
        this.V=nodes;
        this.E=0;
        this.adjMatrix=new int[nodes][nodes];
    }

    public void getEdge(int n,int m){
        this.adjMatrix[n][m]=1;
        this.adjMatrix[m][n]=1;
        E++;
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append(V+" vertices, and "+ E+"Edges \n");
        for(int v=0;v<V;v++){
            sb.append(v +": ");
            for(int w:this.adjMatrix[v]){
                sb.append(w + " ");
            }
            sb.append("\n");
        }
        return sb.toString();

    }

    public static void main(String[] args) {
        Graph graph=new Graph(4);
        graph.getEdge(0,1);
        graph.getEdge(1,2);
        graph.getEdge(2,3);
        graph.getEdge(3,0);
        System.out.println(graph);
    }
}
