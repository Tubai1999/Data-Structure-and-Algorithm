package Heap;

public class DisjointSet {

    int p[];
    int r[];
    int n;
    public DisjointSet(int n)
    {
        this.n = n;
        p = new int[n];
        for(int i=0;i<n;i++)
        {
            p[i] = i;
            r[i] = 1;
        }
    }

    public int find(int a)
    {
        if(p[a]==a) return a;
//        else return(find(p[a]));
        else //optimize ->path compression
        {
            int root = find(p[a]);
            p[a] = root;
            return root;
        }
    }

    public void union(int a,int b)
    {
      int first = find(a);
      int second = find(b);
      if(first != second)
      {
//          p[first] = second; below code is optimization of above code
          if(r[first]>r[second])
          {
              p[second]  = first;
          }
          else if(r[second]>r[first])
          {
              p[first] = second;
          }
          else
          {
              p[first] = second;
              r[second]++;
          }
      }
    }
}
