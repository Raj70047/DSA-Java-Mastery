public class ShortestPath {
    public static double shortestPath(String path) { // Change return type to double

        int x = 0, y = 0;
        for (int i = 0; i < path.length(); i++) { // Fix loop condition
            char direction = path.charAt(i);
            if (direction == 'n') {
                y += 1;
            } else if (direction == 'e') {
                x += 1;
            } else if (direction == 's') {
                y -= 1;
            } else if (direction == 'w') {
                x -= 1;
            }
        }

        // Use proper calculation for Euclidean distance
        return Math.sqrt(x * x + y * y);
    }

    public static void main(String args[]) {
        String path = "wneenesennn";
        System.out.println(shortestPath(path));
    }
}
