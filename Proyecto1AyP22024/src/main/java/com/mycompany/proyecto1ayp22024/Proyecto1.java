/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.proyecto1ayp22024;

import java.util.Scanner;

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
    public int Jvida;
    public int salida;
    public int N, M;
    public int Jx, Jy;
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
        
        Jvida = 0;
        N = 0; M = 0;
        salida = 299;
        NElementos = 0;
        
        Jx = 0;
        Jy = 0;
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
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                
                if(mode == 1)
                {
                    f22 = f22 + (value * multiplicador);
                    f22 = f22 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f22, multiplicador);
                } 
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f21 = f21 + (value * multiplicador);
                    f21 = f21 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f21, multiplicador);
                }
            }
        }
        if( y == 2 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                
                if(mode == 1)
                {
                    f32 = f32 + (value * multiplicador);
                    f32 = f32 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f32, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f31 = f31 + (value * multiplicador);
                    f31 = f31 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f31, multiplicador);
                }
            }
        }
        if( y == 3 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                
                if(mode == 1)
                {
                    f42 = f42 + (value * multiplicador);
                    f42 = f42 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f42, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f41 = f41 + (value * multiplicador);
                    f41 = f41 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f41, multiplicador);
                }
            }
        }
        if( y == 4 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                
                if(mode == 1)
                {
                    f52 = f52 + (value * multiplicador);
                    f52 = f52 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f52, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f51 = f51 + (value * multiplicador);
                    f51 = f51 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f51, multiplicador);
                }
            }
        }
        if( y == 5 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f62 = f62 + (value * multiplicador);
                    f62 = f62 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f62, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f61 = f61 + (value * multiplicador);
                    f61 = f61 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f61, multiplicador);
                }
            }
        }
        if( y == 6 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f72 = f72 + (value * multiplicador);
                    f72 = f72 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f72, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f71 = f71 + (value * multiplicador);
                    f71 = f71 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f71, multiplicador);
                }
            }
        }
        if( y == 7 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f82 = f82 + (value * multiplicador);
                    f82 = f82 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f82, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f81 = f81 + (value * multiplicador);
                    f81 = f81 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f81, multiplicador);
                }
            }
        }
        if( y == 8 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f92 = f92 + (value * multiplicador);
                    f92 = f92 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f92, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f91 = f91 + (value * multiplicador);
                    f91 = f91 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f91, multiplicador);
                }
            }
        }
        if( y == 9 )
        {
            if(x >= 5)
            {
                x = x - 5;
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f102 = f102 + (value * multiplicador);
                    f102 = f102 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f102, multiplicador);
                }
            }
            else
            {
                multiplicador = HacerMultiplicador(x);
                if(mode == 1)
                {
                    f101 = f101 + (value * multiplicador);
                    f101 = f101 - multiplicador;
                    return 0;
                }
                else
                {
                    return ExtraerNumero(f101, multiplicador);
                }
            }
        }
         
        return 0;
    }
    
    void Movimiento(char movimiento)
    {
        if(movimiento == 'W')
        {
            if( !(Jy + 1 == N) )
            Jy++;
            
        }
        
        if(movimiento == 'S')
        {
            if( !(Jy - 1 == 0) )
            Jy--;           
        }
        
        if(movimiento == 'D')
        {
            if( !(Jx + 1 == M) )
            Jx++;           
        }
        
        if(movimiento == 'A')
        {
            if( !(Jx - 1 == 0) )
            Jx--;           
        }
          
    }
    
    public void run(){
        
        Scanner sc = new Scanner(System.in);
        char c = 'a';
        Jvida = sc.nextInt();
        N = sc.nextInt(); M = sc.nextInt();
        NElementos = sc.nextInt();
        
        for(int i = 0; i < NElementos; i++)
        {
            c = sc.next().charAt(0);
            
            if(c == 'E')
            {
                c = c;
            }
            if(c == 'S')
            {
                c = c;
            }
            if(c == 'T')
            {
                c = c;
            }
            if(c == 'X')
            {
                c = c;
            }
            if(c == '.')
            {
                c = c;
            }
            if(c == '#')
            {
                c = c;
            }
            if(c == 'P')
            {
                c = c;
            }
            
            
        }
        
        
    }
    
}
