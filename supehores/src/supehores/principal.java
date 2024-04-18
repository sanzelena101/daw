/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package supehores;

/**
 *
 * @author Nocturno
 */
public class principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
              Superheroe sup1 = new Superheroe ("torrente");
       sup1.setDescripcion("el brazon tonto de la ley");
       
       System.out.println(sup1.toString());
       
       Superheroe sup2 = new Superheroe ("Linterna verde");
       sup2.setCapa(true);
       
       //crear dimension
       Dimension dimPeg = new Dimension (20,30,10);
       Dimension dimGrad = new Dimension (50, 60, 70);
       
       
       Coleccion c1= new Coleccion ("Superheroe español");
       
       //COLECCION
        Figura figura1 = new Figura("01", 2.5, dimPeg, sup2);
        Figura figura2 = new Figura("03", 30, disGrad, sup1);
        Figura figura3 = new Figura("01", 2.5, dimPeg, sup2);

        // Crear la colección
        Coleccion coleccionMarvel = new Coleccion("Marvel");

        c1.añadirFigura(figura1);
        c1.añadirFigura(figura2);
        c1.añadirFigura(figura3);

        
        System.out.println("La colección " + coleccionMarvel.getNombreColeccion() + " tiene: ");

        // método toString()
        System.out.println(coleccionMarvel.toString());

        // valor total de la colección
        double valorColeccion = coleccionMarvel.getValorColeccion();
        System.out.println("Valor total de la colección: " + valorColeccion);

        //volumen total de la colección
        double volumenColeccion = coleccionMarvel.getVolumenColeccion();
        System.out.println("Volumen total de la colección: " + volumenColeccion);

        //figura más valiosa
        Figura figuraMasValiosa = coleccionMarvel.masValioso();
        System.out.println("Figura más valiosa: " + figuraMasValiosa);

        //figuras con capa
        System.out.println("Figuras con capa: ");
        System.out.println(coleccionMarvel.ConCapa());
    }
    
}
