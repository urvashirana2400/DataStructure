import Queue.QueueImplementation;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class GraphImplementation {
    private LinkedList<Integer> adj[];
    private int V;
    private int E;

    GraphImplementation(int nodes){
        this.V=nodes;
        this.E=0;
        this.adj=new  LinkedList[nodes];
        for(int v=0;v<V;v++){
            adj[v]=new LinkedList<>();
        }
    }
    public void bfs(int s){
        boolean[] visited=new boolean[V];
        Queue<Integer> queue=new LinkedList<>();
        visited[s]=true;
        queue.offer(s);
        while (!queue.isEmpty()){
            int u= queue.poll();
            System.out.println(u+" ");
            for(int v:adj[u]){
                if(!visited[v]){
                    visited[v]=true;
                    queue.offer(v);
                }
            }

        }


    }
    public void addEdge(int u,int v){
        adj[u].add(v);
        adj[v].add(u);
        E++;
    }

    public void dfs(int s){
        boolean visited[]=new boolean[V];
        Stack<Integer> stack=new Stack<>();
        stack.push(s);
        while (!stack.isEmpty()){
            int u=stack.pop();
            if(!visited[u]){
                visited[u]=true;
                System.out.println(u+" ");
                for(int v:adj[u]){
                    if(!visited[v]){
                        stack.push(v);
                    }
                }
            }
        }
    }
    public String toString(){
        StringBuilder sb=new StringBuilder();
        sb.append("vertices:"+V+ ", Edges: "+E+"\n");
        for(int v=0;v<V;v++){
            sb.append(v+":");
            for(int w:adj[v]){
                sb.append(w+" ");
            }
            sb.append("\n");
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        GraphImplementation graph=new GraphImplementation(4);
        graph.addEdge(0,1);
        graph.addEdge(1,2);
        graph.addEdge(2,3);
        graph.addEdge(3,0);
        System.out.println("Original Graph:"+graph);
        System.out.println("BFS:");
        graph.bfs(0);
        System.out.println("DFS:");
        graph.dfs(0);

    }
}
