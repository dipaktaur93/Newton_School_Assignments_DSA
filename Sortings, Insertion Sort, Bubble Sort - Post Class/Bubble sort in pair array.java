/*
class Pair { 
    int x; 
    int y; 
  
    // Constructor 
public Pair(int x, int y) 
    { 
        this.x = x; 
        this.y = y; 
    } 
} 
*/ 

static class  secondelement implements Comparator<Pair> 
{
    public int compare(Pair a, Pair b)
    {
        if(a.x==b.x)
        {
            return b.y-a.y;
        }
        return b.x - a.x;
    }
}

static Pair[] SortPair(Pair arr[], int n)  { 
 Arrays.sort(arr, new secondelement());
return arr;//enter your code here
 }
