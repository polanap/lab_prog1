// вариант 512
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        // 1 пункт
        int len_c = 18;
        short[] c = new short[ len_c ];
        for (short i = 0; i <  len_c ; i++) {
            c[i] = (short) (20-i);
        }
        // 2 пункт
        int len_x = 14;
        float[] x = new float[len_x];
        int minn = -12;
        int maxx = 2;
        for (int i = 0; i < len_x; i++) {
            x[i] = (float) (random() * (maxx - minn) + minn);
        }
        // 3 пункт
        int n = len_c;
        int m = len_x;
        double[][] c2 = new double[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                switch (c[i]) {
                    case 7:
                        c2[i][j] = tan(atan(1/pow(E, abs(x[j]))));
                        break;
                    case 3, 4, 5, 6, 9, 11, 15, 18, 20:
                        c2[i][j] = pow( ((1.0/3.0)/(1-atan((x[j]-5.0)/14.0))*(cos(cbrt(x[j]))+1)), 2.0);
                        break;
                    default:
                        c2[i][j] = pow( pow(cos(cos(x[j])), 1.0/3.0)/2.0 ,3.0);
                        break;
                }
            }
        }
        // 4 пункт
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.printf("%6.3f ", c2[i][j]);
            }
            System.out.println();
        }

    }
}