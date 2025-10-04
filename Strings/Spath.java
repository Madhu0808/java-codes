package Strings;

public class Spath {
    public static float GetshortestPath(int startX, int startY, String path) {
        int x=startX, y=startY;
        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);
            if (dir == 'S'){
                y--;
            } else if(dir == 'N'){
                y++;
            } else if (dir == 'W'){
                x--;
            } else if (dir == 'E'){
                x++;
            }
        }
        int dx = x - startX;
        int dy = y - startY;
        return (float) Math.sqrt(dx*dx + dy*dy);

    }
    public static void main(String[] args) {
         int startX=0; int startY=0;
        String path = "WNEENESENNN";
        System.out.println(GetshortestPath(startY, startY, path));
    }
}
