import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;
public class proyectoTest{
    @Test
    public void verificarPersonajesConvidaTest(){
        Personaje lista[] = new Personaje[4];
        assertEquals(false, Funcionalidad.verificarPersonajesConvida(lista));
    }
    
}
