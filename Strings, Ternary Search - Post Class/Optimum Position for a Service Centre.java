import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
class Main {
	public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] arr = new int[n][2];
        for(int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();  
        }
        System.out.printf("%.5f",getMinDistSum(arr));
	}
     static double getMinDistSum(int[][] positions) {
        double[] pos = getXY(positions);
        return dist(positions, pos[0], pos[1]);
    }
    
    static double[] getXY(int[][] points) {
        double start = 0, end = 100;
        while(end - start > 1e-6) {
            double mid1 = start + (end - start)/3;
            double mid2 = end - (end - start)/3;
            double dist1 = dist(points, mid1, getY(points, mid1));
            double dist2 = dist(points, mid2, getY(points, mid2));
            if(dist1 < dist2) {
                end = mid2;
            } else {
                start = mid1;
            }
        }
        
        return new double[]{start, getY(points, start)};
    }
    
    static double getY(int[][] points, double x) {
        double start = 0, end = 100;
        while(end - start > 1e-6) {
            double mid1 = start + (end - start)/3;
            double mid2 = end - (end- start)/3;
            double dist1 = dist(points, x, mid1);
            double dist2 = dist(points, x, mid2);
            if(dist1 < dist2){
                end = mid2;
            } else {
                start = mid1;
            }
        }
        
        return start;
    }
    
    static double dist(int[][] points, double x, double y) {
        double val = 0;
        for(int[] point : points) {
            double xVal = point[0] - x, yVal = point[1] - y;
            val += Math.sqrt(xVal*xVal + yVal*yVal);
        }
        
        return val;
    }
}
