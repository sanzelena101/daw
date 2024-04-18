import java.util.Scanner;

public class Funcionalidad {
    static Scanner teclado = new Scanner(System.in);
    
    /**
     * Este método es el principal, es donde ocurre todo el juego
     * @param equipo representa tu bando de personajes podrá ser o bien la matriz luz u oscuridad
     * @param equipoEnemigo representa el bando de tu enemigo
     * @return Devuelve true en caso de que tu equipo de personajes este con vida o false en caso negativo
     */
    public static boolean juego(Personaje [] equipo, Personaje[] equipoEnemigo){
        Personaje aliado, enemigo;
        int a = 0,b = 0; //a -> Guardan posicion del array de los personajes, es útil en el seteo a null de la matriz.
        int miAtaque, miDefensa, ataqueEnemigo, defensaEnemigo, numAleatorio;
        String respuesta ="";
        boolean equipoVivo, equipoEnemigoVivo;

        enemigo = equipoEnemigo[0];
        aliado = equipo[0];
        System.out.println("Tu personaje por defecto es " + aliado.getNombre());

        do{

            do{
                if(aliado instanceof Mago){
                    System.out.print("¿Qué deseas hacer? a)lanzar Hechizo b)defender m)Ver equipo c)cambiar personaje: ");
                    respuesta = teclado.nextLine();
                }else{
                    System.out.print("¿Qué deseas hacer? a)atacar b)defender m)Ver equipo c)cambiar personaje: ");
                    respuesta = teclado.nextLine();
                }

                switch (respuesta) {
                    case "a":
                        numAleatorio = (int) Math.floor(Math.random() * 2 + 1);
        
                        if(numAleatorio == 1){//1 -> Enemigo ataca
                            miAtaque = aliado.atacar();
                            ataqueEnemigo = enemigo.atacar();
                            enemigo.setVida(enemigo.getVida() - miAtaque);
                            aliado.setVida(aliado.getVida() - ataqueEnemigo);
                            System.out.println(aliado.getNombre() + " ha realizado un ataque de: " + miAtaque
                            + "\n" + enemigo.getNombre() + " ha realizado un ataque de: " + ataqueEnemigo);
                        }else{ //numAleatorio == 2 -> Enemigo se defiende
                            miAtaque = aliado.atacar();
                            defensaEnemigo = enemigo.defender();
                            if(defensaEnemigo > miAtaque - 1){
                                System.out.println("////El ataque de " + aliado.getNombre() + " ha sido bloqueado////");
                            }else{
                                enemigo.setVida(enemigo.getVida() - (miAtaque - defensaEnemigo));
                                System.out.println(aliado.getNombre() + " ha realizado un ataque de: " + miAtaque
                                + " pero el enemigo ha bloqueado " + defensaEnemigo + " puntos");
                            }
                        }
                                
                        System.out.println("------Vida de " + aliado.getNombre() + ": " + aliado.getVida()
                        + "\n------Vida de " + enemigo.getNombre() + ": " + enemigo.getVida());
                    break;
                    case "b":
                        numAleatorio = (int) Math.floor(Math.random() * 2 + 1);
                       
                        if(numAleatorio == 1){
                            miDefensa = aliado.getDefensa();
                            ataqueEnemigo = enemigo.atacar();
                            if(miDefensa > ataqueEnemigo - 1){
                                System.out.println("////El ataque de " + enemigo.getNombre() + " ha sido bloqueado////");
                            }else{
                                aliado.setVida(aliado.getVida() - (ataqueEnemigo - miDefensa));
                                System.out.println(enemigo.getNombre() + " ha realizado un ataque de: " + ataqueEnemigo
                                + " pero "  + aliado.getNombre() + " ha bloqueado " + miDefensa + " puntos");
                            }
                        }else{
                            System.out.println("Ninguno de los dos realiza un ataque, ambos chocan escudos");
                        }
                                
                        System.out.println("------Vida de " + aliado.getNombre() + ": " + aliado.getVida()
                        + "\n------Vida de " + enemigo.getNombre() + ": " + enemigo.getVida());
                    break;
                    case "c":
                    	a = seleccionarPersonaje(equipo);
                    	
                        aliado = equipo[a];
                    break;
                    case "m":
                        visualizarEquipo(equipo);
                        try{
                            Thread.sleep(10000);
                        }catch(Exception e){
                            System.out.println("Error: Fallo en la espera de tiempo");
                        }
                        System.out.print("\033[H\033[2J");  
                        System.out.flush(); 
                    break;
                    default:
                        System.out.println("Respuesta no válida!!!");
                        break;
                }
                
            }while(aliado.getVida() > 1 && enemigo.getVida() > 1);

            equipoVivo = verificarPersonajesConvida(equipo);
            equipoEnemigoVivo = verificarPersonajesConvida(equipoEnemigo);

            if(enemigo.getVida() < 1 && equipoEnemigoVivo){
                System.out.println(enemigo.getNombre() + " ha muerto!!!");
                equipoEnemigo[b] = null;
                do{
                    b=(int) Math.floor(Math.random()* 4);
                    enemigo = equipoEnemigo[b];
                }while(enemigo == null);
            }
            if(aliado.getVida() < 1 && equipoVivo){//Esta condición sirve para mantener al luchador si aún tiene vida
                System.out.print("***" + aliado.getNombre() + " ha fallecido*** \n");
                equipo[a] = null;
                a = seleccionarPersonaje(equipo);
                aliado = equipo[a];
            }else{
                System.out.println(aliado.getNombre() + " aún tiene vida, puede seguir luchando");
            }

            teclado.nextLine();
        }while(equipoVivo && equipoEnemigoVivo);

        return equipoVivo;
    }
    
    /**
     * Sirve para cambiar de personaje durante la batalla o elegir personaje después de que te eliminen uno
     * @param equipo es la matriz de personajes de tu bando
     * @return la posicion del array del personaje que has seleccionado
     */
    private static int seleccionarPersonaje(Personaje [] equipo){
        String respuesta;
        boolean fallo = true;
        int aux = 0;
        do{
            while(fallo){
                try{
                	fallo = false;
                    System.out.print("Seleccione un personaje. Pulse un numero del 1 al 4. ");
                    for(int i = 0; i < 4; i++){
                        if(equipo[i] != null)
                        System.out.print((i+1) + ")" + equipo[i].getNombre() + " ");
                    }
                    respuesta = teclado.nextLine();
                    aux = Integer.parseInt(respuesta) - 1; 
                    if(aux < 0 || aux > 4)
                    	fallo = true;
                }catch(NumberFormatException e){
                    System.out.println("Error: Opción incorrecta. Inténtalo de nuevo");
                    fallo = true;
                }
            }
            
            if(equipo[aux] == null)
                System.out.println("El personaje que quieres seleccionar está muerto. Escoja otro");
        }while(equipo[aux] == null);
        System.out.println("Personje seleccionado: " + equipo[aux].getNombre());
        return aux;
    }

    /**
     * Sirve para comprobar si los 4 personajes de cada bando siguen con vida
     * @param lista matriz que contiene a los personajes de luz u oscuridad
     * @return un booleano, si es verdadero todavía tienes personajes con vida sino están todos muertos
     */
    public static boolean verificarPersonajesConvida(Personaje [] lista){
        int c = 0;

        for(int i = 0; i < 4; i++){
            if(lista[i] != null && lista[i].getVida() > 0){
                c++;
            }
        }
        return (c > 0);
    }
    /**
     * Este método rellena las matrices luz y oscuridad de la clase Main, además sirve para resetear los personajes cuando se vuelve a iniciar la partida
     * @param luz matriz del bando de la luz
     * @param oscuridad matriz del bando de la oscuridad
     */
    public static void rellenarArray(Personaje [] luz, Personaje [] oscuridad){
        Guerrero Aragorn = new Guerrero(20, 20, 100, "Aragorn");
        Guerrero Legolas = new Guerrero(15, 25, 100, "Legolas");
        Guerrero Gimli = new Guerrero(10, 20, 100, "Gimli");
        Guerrero Lurtz = new Guerrero(25, 15, 100, "Lurtz");
        Guerrero Orco = new Guerrero(5, 5, 100, "Orco");
        Mago Saruman = new Mago(25, 10, 100, "Saruman");
        Mago Balrog = new Mago(35, 10, 100, "Balrog");
        Mago Gandalf = new Mago(25, 10, 100, "Gandalf");

        luz[0] = Gandalf;
        luz[1] = Aragorn;
        luz[2] = Legolas;
        luz[3] = Gimli;

        oscuridad[0] = Saruman;
        oscuridad[1] = Balrog;
        oscuridad[2]= Lurtz;
        oscuridad[3] = Orco;
    }
    /**
     * Método para visualizar los personajes
     * @param lista array que contenga a los personajes
     */
    private static void visualizarEquipo(Personaje [] lista){
        for(int i = 0; i < 4; i++){
            if(lista[i] != null){
                lista[i].informacionPersonaje();
            }
        }
    }
       
}
