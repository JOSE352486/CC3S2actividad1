/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package uni.aed.matrix;

/**
 *
 * @author ismae
 */
public class Matrix {
private int ROWS;
private int COLS;
private double[][] M;
//------------------------------------------------------
//------------------------------------------------------
public Matrix(double[][] M) {
    this.M = M;
    this.ROWS = M.length;
    this.COLS = M[0].length;
}
//------------------------------------------------------
//------------------------------------------------------
public double GetCell(int i, int j){
    return M[i][j];
}
//------------------------------------------------------
//------------------------------------------------------
public void SetCell(int i, int j, double val){
        M[i][j] = val;
}
//------------------------------------------------------
//------------------------------------------------------
public int getRows() {
    return ROWS;
}
//------------------------------------------------------
//------------------------------------------------------
public int getCols() {
    return COLS;
}
//------------------------------------------------------
//------------------------------------------------------
void imprimir() {
    for (int i = 0; i < ROWS; i++) {
        for (int j = 0; j < COLS; j++) {
        System.out.printf("%12.2f", M[i][j]);
        }
        System.out.println();
    }
}
//------------------------------------------------------
//------------------------------------------------------
public synchronized void incrementar(int fil, int col, double cant) {
    M[fil][col] = M[fil][col] + cant;
}
//------------------------------------------------------
//------------------------------------------------------
public double prodEsc(int col1, int col2, int filIni, int filFin) {
double resp = 0;
    for (int k = filIni; k <= filFin; k++) {
        resp += (M[k][col1] * M[k][col2]);
    }
    return resp;
}
//------------------------------------------------------
//------------------------------------------------------
public double prodEsc(int col1, int col2) {
double resp = 0;
    for (int k = 0; k < ROWS; k++) {
        resp += (M[k][col1] * M[k][col2]);
    }
    return resp;
}
//------------------------------------------------------
//------------------------------------------------------
Matrix prod(Matrix B) {
int col = B.getCols();
    Matrix C = new Matrix(new double[ROWS][col]);
        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < col; j++) {
                for (int k = 0; k < COLS; k++) {
double x = GetCell(i, k) * B.GetCell(k, j);
                    C.SetCell(i, j, C.GetCell(i, j) + x);
                }
            }
        }
        return C;
    }
}
