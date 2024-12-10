package Graph;
import javax.crypto.spec.PSource;
import java.util.*;


public class TopolicalSort { //topological sorting must be applicable on DAG(Directed Acyclic Graph

    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> graph = new ArrayList<>();
        int v = 6;
        for(int i=0;i<v;i++) graph.add(new ArrayList<>());


        addEdge(graph,0,2);addEdge(graph,0,3);
        addEdge(graph,2,3);addEdge(graph,2,1);
        addEdge(graph,3,1);addEdge(graph,5,1);
        addEdge(graph,4,1);addEdge(graph,4,5);

//        topologicalSort1USingDFS(graph,v);
        topologicalSort2UsingBFS(graph,v);

    }

    static void topologicalSort2UsingBFS(ArrayList<ArrayList<Integer>> graph,int v) //named as khan's Algorithm
    {
        int[] inDegree = new int[v];
        for(int i=0;i<v;i++)
        {
            for(int a:graph.get(i))
            {
                inDegree[a]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();

        for(int i = 0;i<v;i++)
        {
            if(inDegree[i]==0) q.add(i);
        }
        while (!q.isEmpty())
        {
            int e = q.poll();
            System.out.println(e);
            for(int a:graph.get(e))
            {
                inDegree[a]--;
                if(inDegree[a]==0) q.add(a);
            }

        }


    }
    static void topologicalSort1USingDFS(ArrayList<ArrayList<Integer>> graph,int v){
        boolean[] vis = new boolean[v];
        ArrayDeque<Integer> ansStack = new ArrayDeque<>();

        for (int i=0;i<v;i++)
        {
            if(!vis[i])
            {
                dfs(i,graph,vis,ansStack);
            }
        }
        while(!ansStack.isEmpty())
        {
            System.out.println(ansStack.poll());
        }
    }
    static  void addEdge(ArrayList<ArrayList<Integer>> graph, int a,int b){
        graph.get(a).add(b);
    }

    static  void dfs(int i,ArrayList<ArrayList<Integer>> graph,boolean[] vis,ArrayDeque<Integer> ansStack){
        vis[i] = true;
        for(int a :graph.get(i))
        {
            if(!vis[a])
            {
                dfs(a,graph,vis,ansStack);
            }
        }
        ansStack.push(i); //backtrack for topological sort
    }

}
