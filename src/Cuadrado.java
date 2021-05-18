/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public class Cuadrado  extends Cuadrilatero{
    private int x,y;

    public Cuadrado() {
    }

    public Cuadrado(int x) {
        super(x);
    }

    public Cuadrado(int x, int y) {
        this.x = x;
        this.y = y;
    }

    
    @Override
    public int getAreaTra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaRe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaCu() {
        int areacu=(x*y);
        return areacu;
                
        
    }

}