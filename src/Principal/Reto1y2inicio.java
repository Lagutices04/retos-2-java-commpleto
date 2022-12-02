package Principal;

import Salud.Reto1y2persona;

public class Reto1y2inicio {

    public static void main(String[] args) {

        Reto1y2persona Registro = new Reto1y2persona();

        Registro.pedirDatos();
        Registro.mostrarPersona();
        String resp=Registro.calcularImc();
        if(resp.equals("pesobajo")){
            System.out.println("El paciente esta por debajo del peso ideal");
        }    

        if(resp.equals("pesoideal")){
            System.out.println("El paciente tiene un peso ideal"); 
        }       

        if(resp.equals("sobrepeso")){
            System.out.println("El paciente tiene sobrepeso");   
        }  

        Registro.mayorEdad();
        }
    }
        