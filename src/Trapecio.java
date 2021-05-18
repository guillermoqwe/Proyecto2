/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public  class Trapecio extends Cuadrilatero {
    
    private int TrX,Trx,A;
    
    
    public Trapecio() {
    }

    public Trapecio(int x, int y) {
        
        super(x, y);
        
    
                
    }

    public Trapecio(int TrX, int Trx, int A) {
        super(TrX, Trx, A);
    }

    @Override
    public int getAreaTra() {
        int  areatra =(3);
        return areatra;
    }

    @Override
    public int getAreaRe() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaCu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    

}