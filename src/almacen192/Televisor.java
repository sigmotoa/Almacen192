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
    boolean muted = false;
    byte temp;
    
    public void mute(){
        if(muted)
            muted = true;
        else if (muted = true)
            muted = false;
        else if (muted = true && (volumen++ || volumen--))
            temp = volumen;
            muted = false;
            volumen = temp;
    }
    public void subirVol(){}
    public void bajarVol()
    {
        if(volumen==0)
        {
            volumen=0;
        }
        else
        {
            volumen--;
        }
    }
    public void subirCan()
    {
        if(canal==120)
        {
            canal=2;
        }
        else
        {
            canal++;
        }
    }
    public void bajarCan(){}
    public void cambiarCan(byte cana){}
               
    @Override
    void encender() 
    {    
        encendido=encendido!=true;//Analizar de tarea
    }
    
}
