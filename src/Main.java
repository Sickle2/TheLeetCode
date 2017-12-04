/**
 * @author jrgc-Sickle
 * @comment
 * @date 2017/12/4 10:26
 */
public class Main {
    public static void main(String[] args) {
        MaxAreaofIsland maxAreaofIsland = new MaxAreaofIsland();
        int[][] grid = {{0,0,1,0,0,0,0,1,0,0,0,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,1,1,0,1,0,0,0,0,0,0,0,0},
 {0,1,0,0,1,1,0,0,1,0,1,0,0},
 {0,1,0,0,1,1,0,0,1,1,1,0,0},
 {0,0,0,0,0,0,0,0,0,0,1,0,0},
 {0,0,0,0,0,0,0,1,1,1,0,0,0},
 {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.println(maxAreaofIsland.maxAreaOfIsland(grid));
    }
}
