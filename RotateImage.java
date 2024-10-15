public class RotateImage {
    public void rotate(int[][] m) {
        int n = m.length;
        for(int i = 0; i < n; i++) {
            for(int j = i+1; j < n; j++) {
                int val = m[i][j];
                m[i][j] = m[j][i];
                m[j][i] = val;
            }
        }

        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n/2; j++) {
                int val = m[i][j];
                m[i][j] = m[i][n - j - 1];
                m[i][n - j - 1] = val;
            }
        }
    }
}
