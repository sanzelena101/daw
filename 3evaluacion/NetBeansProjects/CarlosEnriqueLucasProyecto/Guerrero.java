import java.util.Random;
/**
 * @author Carlos Enrique
 */
public class Guerrero extends Personaje{
    
    /**
     * Constructor para crear una instancia de la clase Guerrero
     * @param ataque puntos de ataque del personaje
     * @param defensa puntos de defensa del personaje
     * @param vida puntos de vida
     * @param nombre nombre del personaje
     */
    public Guerrero (int ataque, int defensa, int vida,String nombre){
        super(ataque,defensa,vida,nombre);
    }

    
    /**
     * Método para atacar, lanza un número aleatorio entre 1 y el máximo ataque que tenga el personaje
     * Tiene además una habilidad que es ataque crítico que aumenta el daño por 2 siempre y cuando el ataque se mayor
     * que la mitad del ataque del jugador
     */
    public int atacar(){
        Random azar = new Random();
        int numeroAleatorio = azar.nextInt(5) + 1;
        //Ataque mínimo: 1, Máximo: según nivel de ataque
        int puntosAtaque = azar.nextInt(getAtaque()) + 1;
        
        if(numeroAleatorio == 1 && (puntosAtaque > getAtaque()/2)){
            System.out.println(getNombre() + " ha realizado un crítico de " + puntosAtaque*2 + "!!!");
            return puntosAtaque * 2;
        }
        return puntosAtaque;
    }

    /**
     * Método que sirve para generar una defensa aleatoria entre 0 y el máximo de defensa que tenga el personaje
     */
    public int defender(){
        Random azar = new Random();
        //Defensa mínima:1, Máxima: según nivel de defensa
        int puntosDefensa = azar.nextInt(getDefensa()) + 1;
        return puntosDefensa;
    }
    
    /**
     * Método que sobrescribe el método informacionPersonaje() que hereda de la clase padre
     */
    @Override
    public void informacionPersonaje(){
        super.informacionPersonaje();
        System.out.println("Clase: Guerrero \n");
    }
}
