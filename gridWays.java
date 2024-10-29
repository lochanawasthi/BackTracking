package BackTracking;

public class gridWays {

    public static int gridW(int i, int j, int n, int m)
    {
          ///base case
          if(i == n-1 && j == m-1){
            return 1;

        }
        else if(i==n || j ==n){//boundry cross 
            return 0;

        }
        int w1 = gridW(i+1,j,n,m);
        int w2= gridW(i, j+1, n,m);
        return w1+w2;
    }

 
    
    public static void main(String[] args) {
    int n=3,m=3;
    System.out.println(gridW(0, 0, n, m));
    }
    
}
