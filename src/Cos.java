import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class Cos {
    public static void main(String[] args){
        double[] n1 = {1, 2/*, 2, 1, 1, 1, 0, 0, 0*/};
        double[] n2 = {4, 5/*, 1, 0, 1, 1, 1, 1, 1*/};
        double[][] n3 = {{1,2}, {3,4}, {5,6}};
        double[][] n4 = {{1,2,3}, {4,5,6}};
//        for (double a: n1){
//            System.out.println(a);
//        }
//        for (double[] a: n3){
//            System.out.println(a[0]);
//            for (double b : a){
//                System.out.println(b);
//            }
//        }
        System.out.println(Arrays.deepToString(matrix(n3,n4)));
        /*System.out.println(cosCal(n1, n2));
        System.out.println(Double.POSITIVE_INFINITY);
        System.out.println(Double.NEGATIVE_INFINITY);
        System.out.println(Double.NaN);*/
    }
    public static double cosCal(double[] x, double[] y){
        double result = 0;
        if (x == null || x.length < 1 || y == null || y.length < 1 || x.length != y.length){
            return Double.MIN_VALUE;
        }
        double xy = 0;
        double xx = 0;
        double yy = 0;
        for (int i = 0; i < x.length; i++){
            xy += x[i]*y[i];
            xx += Math.pow(x[i], 2);
            yy += Math.pow(y[i], 2);
        }
        result = xy/(Math.sqrt(xx)*Math.sqrt(yy));

        return result;
    }
    public static double[][] matrix(double[][] x, double[][] y){
        double[][] xy = new double[x.length][y[0].length];
        if (x == null || x.length < 1 || x[0].length < 1
                || y == null || y.length < 1 || y[0].length < 1
                || x[0].length != y.length){
            return xy;
        }

        double xx = 0;
        double yy = 0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < y[0].length; j++){
                for (int k = 0; k < y.length; k++){
                    xy[i][j] += x[i][k]*y[k][j];
                }
            }

        }

        return xy;
    }
}
