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
    byte volumen=25;
    boolean encendido=false;
    boolean muted = false;
    byte a = volumen;

    public void mute(){
        if(muted || (muted && (subirVol() == volumen++ || bajarVol() == volumen--))) {
            muted = false;
            volumen = a;
        }else if (!muted){
            muted = true;
            volumen = 0;
        }
    }
    public byte subirVol(){
        if(volumen==100)
        {
            volumen=100;
            return volumen;
        }
        else
        {
            volumen++;
            return volumen;
        }
    }
    public byte bajarVol()
    {
        if(volumen==0)
        {
            volumen=0;
            return volumen;
        }
        else
        {
            volumen--;
            return volumen;
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
    public void cambiarCan(byte selectedChannel){


    }
               
    @Override
    void encender() 
    {    
        encendido=encendido!=true;//Resultado: true
    }
    
}
