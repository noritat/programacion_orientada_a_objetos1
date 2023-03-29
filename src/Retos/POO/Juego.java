package Retos.POO;

import java.util.Random;
import java.util.Scanner;
//llamar clase metodos para i plemetarlos
public class  Juego implements metodos{
private String opcionusuario;
private String opcionpc;

    public String getOpcionusuario() {
    return opcionusuario;
}

public void setOpcionusuario(String opcionusuario) {
    this.opcionusuario = opcionusuario;
}

public String getOpcionpc() {
    return opcionpc;
}

public void setOpcionpc(String opcionpc) {
    this.opcionpc = opcionpc;
}

    @Override
    public void iniciar() {
        Random numaleatorio = new Random();
        int numero = numaleatorio.nextInt(3 + 1);
        if (numero == 1) {
          this.setOpcionpc("p") ;
        } else if (numero == 2) {
            this.setOpcionpc("t") ;
        } else {
            this.setOpcionpc("pa");
        }
    

        
    }

    @Override
    public void jugar() {
        Scanner lectura=new Scanner(System.in);

        System.out.println("piedra papel o tijera?\n p:piedra \n t:tijera \n pa:papel ");
        this.setOpcionusuario(lectura.nextLine());;
      
    }

    @Override
    public void finalizar() {
        System.out.println(" La maquina escogio  "+ this.getOpcionpc());
        if (this.getOpcionusuario().equals("t")) {
            if (this.getOpcionpc().equals("t")) {

                System.out.println("Has empatado" );
            }

            else if (this.getOpcionpc().equals("p")) {
                System.out.println("Has ganado " );

            } else if (this.getOpcionpc().equals("pa")) {

           
                System.out.println("Has perdido " );
            }

        }

        else if (this.getOpcionusuario().equals("p")) {
            if (this.getOpcionpc().equals("t")) {

                System.out.println("Has ganado " );
            }

            else if (this.getOpcionpc().equals("p")) {
                System.out.println("Has empatado " );

            } else if (this.getOpcionpc().equals("pa")) {

                System.out.println("Has perdido " );
            }

        } 
        
        else if (this.getOpcionusuario().equals("pa")) {
            if (this.getOpcionpc().equals("t")) {

                System.out.println("Has gana " );
            }

            else if (this.getOpcionpc().equals("p")) {
                System.out.println("Has pierde " );

            } else if (this.getOpcionpc().equals("pa")) {

                System.out.println("Has empatado  " );
            }
            

        }

      
    }
    
       
    }

