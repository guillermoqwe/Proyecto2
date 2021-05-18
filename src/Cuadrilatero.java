/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public abstract class Cuadrilatero implements Verices {

    public Cuadrilatero() {
    }
    int x;
    int y;
    int ReX;
    int Rey;
    int TrX;
     int Trx;
     int A;

    public Cuadrilatero(int ReX, int Rey, int TrX, int Trx, int A) {
        this.ReX = ReX;
        this.Rey = Rey;
        this.TrX = TrX;
        this.Trx = Trx;
        this.A = A;
    }

    public Cuadrilatero(int TrX, int Trx, int A) {
        this.TrX = TrX;
        this.Trx = Trx;
        this.A = A;
    }

    public Cuadrilatero(int x) {
        this.x =this.y = x;
    }

    public void setReX(int ReX) {
        this.ReX = ReX;
    }

    public void setRey(int Rey) {
        this.Rey = Rey;
    }

    public void setTrX(int TrX) {
        this.TrX = TrX;
    }

    public void setTrx(int Trx) {
        this.Trx = Trx;
    }

    public void setA(int A) {
        this.A = A;
    }
            

    public Cuadrilatero(int x, int y) {
        this.x = x;
        this.y = y;
    }

   

    public void setY(int y) {
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public abstract int getAreaTra();

    @Override
    public abstract int getAreaRe();

    @Override
    public abstract int getAreaCu();
}