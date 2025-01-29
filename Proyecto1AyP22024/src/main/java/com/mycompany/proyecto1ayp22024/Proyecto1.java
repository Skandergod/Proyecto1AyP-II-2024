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
    public int JvidaMax;
    public int Jvida;
    public int salida;
    public int N, M;
    public int Jx, Jy, Sx, Sy;
    public int NElementos;
    public int NMovimientos;
    public int Ts1, Ts2, Ts3, Ts4, Ts5, Ts6, Ts7, Ts8, Ts9, Ts10;
    public int Tm1, Tm2, Tm3, Tm4, Tm5, Tm6, Tm7, Tm8, Tm9, Tm10;
    public int Tp1, Tp2, Tp3, Tp4, Tp5, Tp6, Tp7, Tp8, Tp9, Tp10;
    public int TsTotal, TmTotal, TpTotal, TsFound, TmFound;
    
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
        NMovimientos = 0;
        
        Jx = 0;
        Jy = 0;
        
        Ts1 = 0; Ts2 = 0; Ts3 = 0; Ts4 = 0; Ts5 = 0; 
        Ts6 = 0; Ts7 = 0; Ts8 = 0; Ts9 = 0; Ts10 = 0;
        
        Tm1 = 0; Tm2 = 0; Tm3 = 0; Tm4 = 0; Tm5 = 0; 
        Tm6 = 0; Tm7 = 0; Tm8 = 0; Tm9 = 0; Tm10 = 0;
        
        Tp1 = 0; Tp2 = 0; Tp3 = 0; Tp4 = 0; Tp5 = 0; 
        Tp6 = 0; Tp7 = 0; Tp8 = 0; Tp9 = 0; Tp10 = 0;
        
        TsTotal = 0; TmTotal = 0; TpTotal = 0; TsFound = 0; TmFound = 0;
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
        if(movimiento == 'w')
        {
            if( !(Jy + 1 > N) )
            {
                if( !(AccederElemento(Jx, Jy+1, 0, 0) == 5) )
                {
                Jy++;
                }
                else
                {
                    System.out.println("Movimiento Bloqueado");
                }
            }
            else
            {
                System.out.println("Movimiento Bloqueado");
            }
        }
        
        if(movimiento == 's')
        {
            if( !(Jy - 1 < 0) )
            {
                if( !(AccederElemento(Jx, Jy-1, 0, 0) == 5) )
                {
                    Jy--;
                }
                else
                {
                    System.out.println("Movimiento Bloqueado");
                }
            }
            else
            {
                System.out.println("Movimiento Bloqueado");
            }
        }
        
        
        if(movimiento == 'd')
        {
            if( !(Jx + 1 > M) )
            {
                if( !(AccederElemento(Jx+1, Jy, 0, 0) == 5) )
                {
                    Jx++;
                }
                else
                {
                    System.out.println("Movimiento Bloqueado");
                }
            }
            else
            {
                System.out.println("Movimiento Bloqueado");
            }
        }
        
        if(movimiento == 'a')
        {
            if( !(Jx - 1 < 0) )
            {
                if( !(AccederElemento(Jx-1, Jy, 0, 0) == 5) )
                {
                    Jx--;
                }
                else
                {
                    System.out.println("Movimiento Bloqueado");
                }
            }
            else
            {
                System.out.println("Movimiento Bloqueado");
            }
            
        }
          
    }
    
    void agregarTesoro(int x, int y)
    {
        if(TsTotal == 0)
        {
            Ts1 = Ts1 + 100; Ts1 = Ts1 + x*10; Ts1 = Ts1 + y;
        }
        if(TsTotal == 1)
        {
            Ts2 = Ts2 + 100; Ts2 = Ts2 + x*10; Ts2 = Ts2 + y;
        }
        if(TsTotal == 2)
        {
            Ts3 = Ts3 + 100; Ts3 = Ts3 + x*10; Ts3 = Ts3 + y;
        }
        if(TsTotal == 3)
        {
            Ts4 = Ts4 + 100; Ts4 = Ts4 + x*10; Ts4 = Ts4 + y;
        }
        if(TsTotal == 4)
        {
            Ts5 = Ts5 + 100; Ts5 = Ts5 + x*10; Ts5 = Ts5 + y;
        }
        if(TsTotal == 5)
        {
            Ts6 = Ts6 + 100; Ts6 = Ts6 + x*10; Ts6 = Ts6 + y;
        }
        if(TsTotal == 6)
        {
            Ts7 = Ts7 + 100; Ts7 = Ts7 + x*10; Ts7 = Ts7 + y;
        }
        if(TsTotal == 7)
        {
            Ts8 = Ts8 + 100; Ts8 = Ts8 + x*10; Ts8 = Ts8 + y;
        }
        if(TsTotal == 8)
        {
            Ts9 = Ts9 + 100; Ts9 = Ts9 + x*10; Ts9 = Ts9 + y;
        }
        if(TsTotal == 9)
        {
            Ts10 = Ts10 + 100; Ts10 = Ts10 + x*10; Ts10 = Ts10 + y;
        }
            
        TsTotal++;
        AccederElemento(x, y, 3, 1);
    }
    
    void agregarTrampa(int x, int y)
    {
        if(TmTotal == 0)
        {
            Tm1 = Tm1 + 100; Tm1 = Tm1 + x*10; Tm1 = Tm1 + y;
        }   
        if(TmTotal == 1)
        {
            Tm2 = Tm2 + 100; Tm2 = Tm2 + x*10; Tm2 = Tm2 + y;
        }   
        if(TmTotal == 2)
        {
            Tm3 = Tm3 + 100; Tm3 = Tm3 + x*10; Tm3 = Tm3 + y;
        }   
        if(TmTotal == 3)
        {
            Tm4 = Tm4 + 100; Tm4 = Tm4 + x*10; Tm4 = Tm4 + y;
        }   
        if(TmTotal == 4)
        {
            Tm5 = Tm5 + 100; Tm5 = Tm5 + x*10; Tm5 = Tm5 + y;
        }   
        if(TmTotal == 5)
        {
            Tm6 = Tm6 + 100; Tm6 = Tm6 + x*10; Tm6 = Tm6 + y;
        }
        if(TmTotal == 6)
        {
            Tm7 = Tm7 + 100; Tm7 = Tm7 + x*10; Tm7 = Tm7 + y;
        }
        if(TmTotal == 7)
        {
            Tm8 = Tm8 + 100; Tm8 = Tm8 + x*10; Tm8 = Tm8 + y;
        }
        if(TmTotal == 8)
        {
            Tm9 = Tm9 + 100; Tm9 = Tm9 + x*10; Tm9 = Tm9 + y;
        }
        if(TmTotal == 9)
        {
            Tm10 = Tm10 + 100; Tm10 = Tm10 + x*10; Tm10 = Tm10 + y;
        }
        TmTotal++;
        AccederElemento(x, y, 4, 1);
    }
    
    void agregarPortal(int x1, int y1, int x2, int y2)
    {
        if(TpTotal == 0)
        {
            Tp1 = Tp1 + 10000; Tp1 = Tp1 + x1 * 1000; Tp1 = Tp1 + y1 * 100; Tp1 = Tp1 + x2*10; Tp1 = Tp1 + y2;
        }
        if(TpTotal == 1)
        {
            Tp2 = Tp2 + 10000; Tp2 = Tp2 + x1 * 1000; Tp2 = Tp2 + y1 * 100; Tp2 = Tp2 + x2*10; Tp2 = Tp2 + y2;
        }
        if(TpTotal == 2)
        {
            Tp3 = Tp3 + 10000; Tp3 = Tp3 + x1 * 1000; Tp3 = Tp3 + y1 * 100; Tp3 = Tp3 + x2*10; Tp3 = Tp3 + y2;
        }
        if(TpTotal == 3)
        {
            Tp4 = Tp4 + 10000; Tp4 = Tp4 + x1 * 1000; Tp4 = Tp4 + y1 * 100; Tp4 = Tp4 + x2*10; Tp4 = Tp4 + y2;
        }
        if(TpTotal == 4)
        {
            Tp5 = Tp5 + 10000; Tp5 = Tp5 + x1 * 1000; Tp5 = Tp5 + y1 * 100; Tp5 = Tp5 + x2*10; Tp5 = Tp5 + y2;
        }
        if(TpTotal == 5)
        {
            Tp6 = Tp6 + 10000; Tp6 = Tp6 + x1 * 1000; Tp6 = Tp6 + y1 * 100; Tp6 = Tp6 + x2*10; Tp6 = Tp6 + y2;
        }
        if(TpTotal == 6)
        {
            Tp7 = Tp7 + 10000; Tp7 = Tp7 + x1 * 1000; Tp7 = Tp7 + y1 * 100; Tp7 = Tp7 + x2*10; Tp7 = Tp7 + y2;
        }
        if(TpTotal == 7)
        {
            Tp8 = Tp8 + 10000; Tp8 = Tp8 + x1 * 1000; Tp8 = Tp8 + y1 * 100; Tp8 = Tp8 + x2*10; Tp8 = Tp8 + y2;
        }
        if(TpTotal == 8)
        {
            Tp9 = Tp9 + 10000; Tp9 = Tp9 + x1 * 1000; Tp9 = Tp9 + y1 * 100; Tp9 = Tp9 + x2*10; Tp9 = Tp9 + y2;
        }
        if(TpTotal == 9)
        {
            Tp10 = Tp10 + 10000; Tp10 = Tp10 + x1 * 1000; Tp10 = Tp10 + y1 * 100; Tp10 = Tp10 + x2*10; Tp10 = Tp10 + y2;
        }
            
        TpTotal++;
        AccederElemento(x1, y1, 6, 1);
        AccederElemento(x2, y2, 6, 1);
    }
    
    void TomarTesoro()
    {
        if(Ts1 > 0)
        {
            if( (Ts1 % 10 == Jy) && ((Ts1/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts1 = 0;
                
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                    
                TsFound++;
                TsTotal--;
            }
        }
        if(Ts2 > 0)
        {
            if( (Ts2 % 10 == Jy) && ((Ts2/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts2 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }   
        if(Ts3 > 0)
        {
            if( (Ts3 % 10 == Jy) && ((Ts3/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts3 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }      
        if(Ts4 > 0)
        {
            if( (Ts4 % 10 == Jy) && ((Ts4/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts4 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }     
        if(Ts5 > 0)
        {
            if( (Ts5 % 10 == Jy) && ((Ts5/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts5 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }      
        if(Ts6 > 0)
        {
            if( (Ts6 % 10 == Jy) && ((Ts6/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts6 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }      
        if(Ts7 > 0)
        {
            if( (Ts7 % 10 == Jy) && ((Ts7/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts7 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }     
        if(Ts8 > 0)
        {
            if( (Ts8 % 10 == Jy) && ((Ts8/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts8 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }   
        if(Ts9 > 0)
        {
            if( (Ts9 % 10 == Jy) && ((Ts9/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts9 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }    
        if(Ts10 > 0)
        {
            if( (Ts10 % 10 == Jy) && ((Ts10/10) % 10  == Jx) )
            {
                Jvida = Jvida + 20;
                Ts10 = 0;
                if(Jvida > JvidaMax)
                    Jvida = JvidaMax;
                
                TsFound++;
                TsTotal--;
            }
        }
        
        
    }
    
    void PisarPortal()
    {
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        if(Tp1 > 0)
        {
            y2 = Tp1%10;
            x2 = (Tp1/10)%10;
            
            y1 = (Tp1/100)%10;
            x1 = (Tp1/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp2 > 0)
        {
            y2 = Tp2%10;
            x2 = (Tp2/10)%10;
            
            y1 = (Tp2/100)%10;
            x1 = (Tp2/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp3 > 0)
        {
            y2 = Tp3%10;
            x2 = (Tp3/10)%10;
            
            y1 = (Tp3/100)%10;
            x1 = (Tp3/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp4 > 0)
        {
            y2 = Tp4%10;
            x2 = (Tp4/10)%10;
            
            y1 = (Tp4/100)%10;
            x1 = (Tp4/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp5 > 0)
        {
            y2 = Tp5%10;
            x2 = (Tp5/10)%10;
            
            y1 = (Tp5/100)%10;
            x1 = (Tp5/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp6 > 0)
        {
            y2 = Tp6%10;
            x2 = (Tp6/10)%10;
            
            y1 = (Tp6/100)%10;
            x1 = (Tp6/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp7 > 0)
        {
            y2 = Tp7%10;
            x2 = (Tp7/10)%10;
            
            y1 = (Tp7/100)%10;
            x1 = (Tp7/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp8 > 0)
        {
            y2 = Tp8%10;
            x2 = (Tp8/10)%10;
            
            y1 = (Tp8/100)%10;
            x1 = (Tp8/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp9 > 0)
        {
            y2 = Tp9%10;
            x2 = (Tp9/10)%10;
            
            y1 = (Tp9/100)%10;
            x1 = (Tp9/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
        if(Tp10 > 0)
        {
            y2 = Tp10%10;
            x2 = (Tp10/10)%10;
            
            y1 = (Tp10/100)%10;
            x1 = (Tp10/1000)%10;
            
            if(Jx == x1 && Jy == y1)
            {
                Jx = x2; Jy = y2;
                return;
            }
            if(Jx == x2 && Jy == y2)
            {
                Jx = x1; Jy = y1;
                return;
            }
        }
    }
    
    void PisarTrampa()
    {
        if(Tm1 > 0)
        {
            if( (Tm1 % 10 == Jy) && ((Tm1/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }
        if(Tm2 > 0)
        {
            if( (Tm2 % 10 == Jy) && ((Tm2/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }   
        if(Tm3 > 0)
        {
            if( (Tm3 % 10 == Jy) && ((Tm3/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }      
        if(Tm4 > 0)
        {
            if( (Tm4 % 10 == Jy) && ((Tm4/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }     
        if(Tm5 > 0)
        {
            if( (Tm5 % 10 == Jy) && ((Tm5/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }      
        if(Tm6 > 0)
        {
            if( (Tm6 % 10 == Jy) && ((Tm6/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }      
        if(Tm7 > 0)
        {
            if( (Tm7 % 10 == Jy) && ((Tm7/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }     
        if(Tm8 > 0)
        {
            if( (Tm8 % 10 == Jy) && ((Tm8/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }   
        if(Tm9 > 0)
        {
            if( (Tm9 % 10 == Jy) && ((Tm9/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }    
        if(Tm10 > 0)
        {
            if( (Tm10 % 10 == Jy) && ((Tm10/10) % 10  == Jx) )
            {
                Jvida = Jvida - 10;
            }
        }
        
        TmFound++;
    }
    
    void checarPosicion()
    {
        int Element = AccederElemento(Jx,Jy,0,0);
        
        if(Element == 3) //Consegui un Tesoro
        {
            TomarTesoro();
        }
        
        if(Element == 4) //Consegui un Trampa
        {
            PisarTrampa();
        }
        
        if(Element == 6) //Consegui un Portal
        {
            PisarPortal();
        }
        
    }
    
    void printMap()
    {
        System.out.print(f101);System.out.println(f102);
        System.out.print(f91);System.out.println(f92);
        System.out.print(f81);System.out.println(f82);
        System.out.print(f71);System.out.println(f72);
        System.out.print(f61);System.out.println(f62);
        System.out.print(f51);System.out.println(f52);
        System.out.print(f41);System.out.println(f42);
        System.out.print(f31);System.out.println(f32);
        System.out.print(f21);System.out.println(f22);
        System.out.print(f11);System.out.println(f12);
        System.out.print(Jx);System.out.print(" ");System.out.println(Jy);
    }
    
    public void run(){
        
        Scanner sc = new Scanner(System.in);
        int x1 = 0, y1 = 0, x2 = 0, y2 = 0;
        char c = 'a';
        Jvida = sc.nextInt();
        JvidaMax = Jvida;
        M = sc.nextInt(); N = sc.nextInt();
        NElementos = sc.nextInt();
        
        for(int i = 0; i < NElementos; i++)
        {
            c = sc.next().charAt(0);
            if(c == 'E')
            {
                Jx = sc.nextInt(); Jy = sc.nextInt();
            }
            if(c == 'S')
            {
                x1 = sc.nextInt(); y1 = sc.nextInt();
                AccederElemento(x1, y1, 2, 1);
                Sx = x1; Sy = y1;
            }
            if(c == 'T')
            {
                x1 = sc.nextInt(); y1 = sc.nextInt();
                agregarTesoro(x1, y1);
            }
            if(c == 'X')
            {
                x1 = sc.nextInt(); y1 = sc.nextInt();
                agregarTrampa(x1, y1);
            }
            if(c == '#')
            {
                x1 = sc.nextInt(); y1 = sc.nextInt();
                AccederElemento(x1, y1, 5, 1);
            }
            if(c == 'P')
            {
                x1 = sc.nextInt(); y1 = sc.nextInt();
                x2 = sc.nextInt(); y2 = sc.nextInt();
                agregarPortal(x1, y1, x2, y2);
                i++;
            }
        }
        
        NMovimientos = sc.nextInt();

        for(int i = 0; i < NMovimientos; i++)
        {
            c = sc.next().charAt(0);
            if(Jvida > 0)
            {
                Movimiento(c);
                checarPosicion();
            }
            printMap();
            
        }
        
        System.out.print("TESOROS: ");System.out.println(TsFound);
        System.out.print("TRAMPAS: ");System.out.println(TmFound);
        System.out.print("VIDA: ");System.out.println(Jvida);
        
        if( Jx == Sx && Jy == Sy)
        {
            if(TsTotal == 0)
            {
                System.out.println("SORPRENDENTE");
            }
            else
            {
                System.out.println("LOGRADO");
            }
        }
        else
        {
            if(Jvida == 0)
            {
                System.out.println("MUERTO");
            }
            else
            {
                System.out.println("ATRAPADO");
            }
        }
        
    }
    
}
