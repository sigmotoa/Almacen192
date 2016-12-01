/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package almacen192;

/**
 *
 * @author SergioIván
 */
public class Televisor extends MaquinaElectrica
{
    byte canal=2;
    byte volumen=0;
    boolean encendido=false;
    
    public void mute(){}
    public void subirVol(){}
    public void bajarVol(){}
    public void subirCan(){}
    public void bajarCan(){}
    public void cambiarCan(byte cana){}
    
            
    @Override
    void encender() 
    {    
        encendido=encendido!=true;//Analizar de tarea
    }
    
}
