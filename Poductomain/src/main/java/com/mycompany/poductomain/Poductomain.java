/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poductomain;
import java.util.ArrayList;
/**
 *
 * @author Nocturno
 */
public class Poductomain {

    public static void main(String[] args) {
        
      Porducto p = new Porducto("6-1-23",12); 
      ProductoF pf = new ProductoF("6-1-23",12,"12-08-26","España");
      ProductoF pfr = new ProductoF("6-1-23",12,"12-08-26","Portugal");
      ProductoF pfre = new ProductoF("6-1-23",12,"12-08-26","España");
      ProductoF pfres = new ProductoF("6-1-23",12,"12-08-26","España");
      ProductoC pc = new ProductoC("6-1-23",12,-19); 
      ProductoC pco = new ProductoC("6-1-23",12,2); 
      ProductoC pcon = new ProductoC("6-1-23",12,2);
      ProductoC pccong = new ProductoC("6-1-23",12,2);
      ProductoR pr = new ProductoR("6-1-23",12,"cvw34");
      ProductoR pre = new ProductoR("6-1-23",12,"cvw34"); 
      ProductoR pref = new ProductoR("6-1-23",12,"cvw34"); 
      ProductoR prefr = new ProductoR("6-1-23",12,"cvw34"); 
      
      
      
      pf.setFechaE("12-09-08");
  
      System.out.println(p);
      System.out.println(pf);
      System.out.println(pc);
      System.out.println(pr);
      
      ArrayList <ProductoF> prodF =new ArrayList<ProductoF>();
      prodF.add(pf);
      prodF.add(pfr);
      prodF.add(pfre);
      prodF.add(pfres);
      
      
      ArrayList <ProductoC> prodC =new ArrayList<ProductoC>();
      prodC.add(pc);
      prodC.add(pco);
      prodC.add(pcon);
      prodC.add(pccong);
      
      ArrayList <ProductoR> prodR =new ArrayList<ProductoR>();
      prodR.add(pr);
      prodR.add(pre);
      prodR.add(pref);
      prodR.add(prefr);
     
      
      
      ArrayList <Porducto> prod =new ArrayList<Porducto>();
      prod.addAll(prodF);
      prod.addAll(prodC);
      prod.addAll(prodR);
      
      // • Todos los productos introducidos.
          System.out.println(prod);
      // • Todos los productos congelados cuya temperatura de congelación sea menos a -18º.
       System.out.println("-----------------------------------------");
        for(ProductoC prodCongelado : prodC){
            if (prodCongelado.menorTemperatura())
                 System.out.println(prodCongelado);
            }
        
         System.out.println("-----------------------------------------");
         for(ProductoF prodFresco: prodF){
            if (prodFresco.esEspana())
                 System.out.println(prodFresco);
            }
    }
}
