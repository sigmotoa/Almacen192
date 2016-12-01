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
public abstract class MaquinaElectrica 
{
    String marca;
    double largo;//en cm
    double alto;//en cm
    double ancho;//en cm
    int consumo;//En Watts
    
    abstract void encender();
    
    
    
    
}
