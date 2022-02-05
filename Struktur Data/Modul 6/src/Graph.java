import java.util.*;

class Edge
{

    int s, d;

    Edge(int s, int d)
    {
        this.s = s;
        this.d = d;
    }
}

class DirectedGraph
{

    List<List<Integer>> adjlist = new ArrayList<>();

    public DirectedGraph(List<Edge> edges)
    {
        int n = 0;

        for (Edge e: edges)
        {

            n = Integer.max(n, Integer.max(e.s, e.d));
        }

        for (int i = 0; i <= n; i++)
        {
            adjlist.add(i, new ArrayList<>());
        }

        for (Edge current: edges)
        {

            adjlist.get(current.s).add(current.d);
        }
    }

    public static void showGraph(DirectedGraph graph)
    {
        int s = 0;

        int n = graph.adjlist.size();
        while (s < n)
        {

            for (int d: graph.adjlist.get(s))
            {
                System.out.print("Directed Graph : ");

                System.out.print("(" + s + " -- > " + d + ")\t");
            }
            System.out.println();

            s++;
        }
    }

    void traversalDFS(int v, boolean[] vnodelist)
    {

        vnodelist[v] = true;
        System.out.print(v+" ");

        Iterator<Integer> i = adjlist.get(v).listIterator();
        while (i.hasNext())
        {

            int n = i.next();
            if (!vnodelist[n])

                traversalDFS(n, vnodelist);
        }
    }


    void DFS(int v)
    {

        boolean[] visited = new boolean[12];

        traversalDFS(v, visited);
    }

    void traversalBFS(int rnode)
    {

        boolean[] visitednode = new boolean[12];

        LinkedList<Integer> vnodelist = new LinkedList<>();

        visitednode[rnode]=true;

        vnodelist.add(rnode);

        while (vnodelist.size() != 0)
        {

            rnode = vnodelist.poll();
            System.out.print(rnode+" ");
            //iterator digunakan apakah sudah ada apa tidak
            Iterator<Integer> i = adjlist.get(rnode).listIterator();
            while (i.hasNext())
            {

                int n = i.next();

                if (!visitednode[n])
                {

                    visitednode[n] = true;

                    vnodelist.add(n);
                }
            }
        }
    }
}


public class Graph
{
    public static void main (String[] args)
    {


        List<Edge> edges = Arrays.asList(
                new Edge(1, 2),
                new Edge(1, 4),
                new Edge(2, 1),
                new Edge(2, 5),
                new Edge(4, 6),
                new Edge(5, 2),
                new Edge(5, 3),
                new Edge(5, 9),
                new Edge(5, 7),
                new Edge(6, 7),
                new Edge(7, 6),
                new Edge(7, 11),
                new Edge(8, 9),
                new Edge(8, 11),
                new Edge(9, 5),
                new Edge(9, 8),
                new Edge(11, 10),
                new Edge(11, 7));

        DirectedGraph graph = new DirectedGraph(edges);
        System.out.print("Traversal DFS : ");
        graph.DFS(1);
        System.out.println();
        System.out.print("Traversal BFS : ");
        graph.traversalBFS(1);
        System.out.println("\n");

        DirectedGraph.showGraph(graph);
    }
}


