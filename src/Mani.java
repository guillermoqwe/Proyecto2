
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Guillermolp
 */

public class Mani {
 
   public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       System.out.println("--------------------------------");
          System.out.println("CALCULAR LA AREA DE EL CUADRADO");
         Cuadrado cu = new Cuadrado();
        int x,y;
          System.out.println("Valor de x  :");
          x= sc.nextInt();
          System.out.println("Valor de y :");
          y =sc.nextInt();
           cu= new Cuadrado(x,y);
     
        System.out.println("Area de el cuadrado es :"+ cu.getAreaCu());
         System.out.println("--------------------------------");
          System.out.println("CALCULAR LA AREA DE EL RECTANGULO");
         
       Rectangulo re = new Rectangulo();
        int Rex,Rey;
          System.out.println("Valor de x  :");
          Rex= sc.nextInt();
          System.out.println("Valor de y :");
          Rey=sc.nextInt();
           re= new Rectangulo(Rex,Rey);
     
        System.out.println("Area de el Rectangulo es :"+ re.getAreaRe());
        
         System.out.println("--------------------------------");
          System.out.println("CALCULAR LA AREA DE EL TRAPECIO");
          
           
          Trapecio tra = new Trapecio();
        int TrX,Trx,A;
          System.out.println("Valor de x  :");
          TrX= sc.nextInt();
          System.out.println("Valor de x chiquita :");
          Trx=sc.nextInt();
          System.out.println("Introduce la altura");
          A=sc.nextInt();
          tra= new Trapecio(TrX,Trx,A);
          System.out.println("Area de Trapecio :" + tra.getAreaTra());
       
    
       }
} 
