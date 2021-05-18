/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */
public class Rectangulo extends Cuadrilatero{

    public Rectangulo() {
    }
 int Rex,Rey;

    public Rectangulo(int Rex, int Rey) {
        this.Rex = Rex;
        this.Rey = Rey;
    }

    public Rectangulo(int x) {
        super(x);
    }

    @Override
    public int getAreaTra() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getAreaRe() {
   int areare=(Rex*Rey);
   return areare;
    }

    @Override
    public int getAreaCu() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    

    }
    



   