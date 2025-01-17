/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1ayp22024;

/*
    Dato Importante, el laberinto es guardado en variables enteras, con los valores de 1 a 9
    representando objetos del enunciado, se guardan de la sgte manera:
    1 = Espacio Libre o Camino
    2 = Salida
    3 = Tesoro
    4 = Trampa
    5 = Muro
    6 = Portales
*/

public class Proyecto1 
{

    public int f11, f21, f31, f41, f51, f61, f71, f81, f91, f101;
    public int f12, f22, f32, f42, f52, f62, f72, f82, f92, f102;
    public int Pvida;
    public int salida;
    public int N, M;
    public int NElementos;
    
    
    public Proyecto1() 
    {
        
        f11 = 11111;
        f21 = 11111;
        f31 = 11111;
        f41 = 11111;
        f51 = 11111;
        f61 = 11111;
        f71 = 11111;
        f81 = 11111;
        f91 = 11111;
        f101 = 11111;
        
        f12 = 11111;
        f22 = 11111;
        f32 = 11111;
        f42 = 11111;
        f52 = 11111;
        f62 = 11111;
        f72 = 11111;
        f82 = 11111;
        f92 = 11111;
        f102 = 11111;
        
        Pvida = 0;
        N = 0; M = 0;
        salida = 299;
        NElementos = 0;
        
    }
    
    public void guardarElemento(int x, int y, int value)
    {
        
    }
    
    public int HacerMultiplicador(int x)
    {
        int multiplicator = 1;
        for(int i = x; i < 4; ++i)
        {
            multiplicator = multiplicator * 10;
        }
        return multiplicator;
    }
     
    public int ExtraerNumero(int value, int multiplicador)
    {
        if(multiplicador == 1)
        {
            return value%10;
        }
        if(multiplicador == 10)
        {
            return (value/10)%10;
        }  
        if(multiplicador == 100)
        {
            return (value/100)%10;
        }
        if(multiplicador == 1000)
        {
            return (value/1000)%10;
        }
        if(multiplicador == 10000)
        {
            return (value/10000)%10;
        }
        return 1;
    }
    
    int AccederElemento(int x, int y, int value, int mode)
    {
        int multiplicador = 0;
        if( y == 0 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                
                if(mode == 1)
                {
                    f12 = f12 + (value * multiplicador);
                    f12 = f12 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f12, multiplicador);
                }  
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f11 = f11 + (value * multiplicador);
                    f11 = f11 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f11, multiplicador);
                }
            }     
        }
        
        if( y == 1 )
        {
            if(x >= 5)
            {
                f22 = f22;
            }
            else
            {
                f21 = f21;
            }
        }
        if( y == 2 )
        {
            if(x >= 5)
            {
                f32 = f32;
            }
            else
            {
                f31 = f31;
            }
        }
        if( y == 3 )
        {
            if(x >= 5)
            {
                f42 = f42;
            }
            else
            {
                f41 = f41;
            }
        }
        if( y == 4 )
        {
            if(x >= 5)
            {
                f52 = f52;
            }
            else
            {
                f51 = f51;
            }
        }
        if( y == 5 )
        {
            if(x >= 5)
            {
                f62 = f62;
            }
            else
            {
                f61 = f61;
            }
        }
        if( y == 6 )
        {
            if(x >= 5)
            {
                f72 = f72;
            }
            else
            {
                f71 = f71;
            }
        }
        if( y == 7 )
        {
            if(x >= 5)
            {
                f82 = f82;
            }
            else
            {
                f81 = f81;
            }
        }
        if( y == 8 )
        {
            if(x >= 5)
            {
                f92 = f92;
            }
            else
            {
                f91 = f91;
            }
        }
        if( y == 9 )
        {
            if(x >= 5)
            {
                f102 = f102;
            }
            else
            {
                f101 = f101;
            }
        }
         
        return 0;
    }
    
    public void run()
    {
        
    }
    
}
