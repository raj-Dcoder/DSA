package Strings;

public class shortestDist {
    public static float displacement (String path) {
        // int x1 = 0, y1 =0; // setting up the origin point (no need though)
        int x2 = 0, y2 = 0; // setting up the distination point 

        for (int i = 0; i < path.length(); i++){
            switch (path.charAt(i)) {
                case 'N': y2++;break;
                case 'S': y2--;break;
                case 'E': x2++;break;
                case 'W': x2--;break;
                default:
                    break;
            }
        }
        return (float)Math.sqrt(Math.pow(x2,2)+Math.pow(y2,2));
    }
    public static void main(String[] args) {
        String path = "NSEWWWWNNNN";
        
        float dist = displacement(path);
        System.out.println(dist);
    }
}
