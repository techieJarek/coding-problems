import java.time.Instant;

/**
 * A robot is located at the top-left corner of a m x n grid.
 *
 * The robot can only move either down or right at any point in time.
 * The robot is trying to reach the bottom-right corner of the grid.
 *
 * How many possible unique paths are there?
 */
public class UniquePaths {
    public static void main(String[] args){

        Instant before = Instant.now();
        int paths = uniquePathsWithMemo(20,10);
        Instant after = Instant.now();
        System.out.println("Unique paths with memo : " + paths + ", time : " + (after.toEpochMilli() - before.toEpochMilli()));

        before = Instant.now();
        paths = uniquePathsNoMemo(20,10);
        after = Instant.now();
        System.out.println("Unique paths no memo : " + paths + ", time : " + (after.toEpochMilli() - before.toEpochMilli()));

    }

    public static int uniquePathsWithMemo(int m, int n) {
        return uniquePathsWithMemo(m,n,0,0,new int[m][n]);
    }

    public static int uniquePathsWithMemo(int m, int n, int x, int y, int[][] memo) {
        if(x == m || y == n) return 0;
        if(x == m-1 && y == n-1) return 1;
        if(memo[x][y] != 0) return  memo[x][y];
        memo[x][y] = uniquePathsWithMemo(m,n,x, y+1, memo) + uniquePathsWithMemo(m,n,x + 1, y, memo);
        return memo[x][y];
    }

    public static int uniquePathsNoMemo(int m, int n) {
        return uniquePathsNoMemo(m,n,0,0);
    }

    public static int uniquePathsNoMemo(int m, int n, int x, int y) {
        if(x == m || y == n) return 0;
        if(x == m -1 || y == n - 1) return 1;
        return uniquePathsNoMemo(m,n,x, y + 1) + uniquePathsNoMemo(m,n,x + 1, y);
    }
}
