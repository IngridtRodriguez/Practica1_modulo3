package practica1_profgiank;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Practica1_ProfGiank {

    public static void main(String[] args) throws IOException {
        //DECLARACIÓN DE VARIABLES
        final double PI=3.141516;
        String nombre, apell;
        int num=0, edad,anio,nacim;
        float arCu, cuadr=0, C = 0,fahr, r = 0, km = 0,ms;
        double longt, arCir;
        
        //CREACIÓN DE OBJETOS
        Scanner en = new Scanner(System.in);
        BufferedReader leer = new BufferedReader (new InputStreamReader(System.in));
    
        //CUERPO DEL PROGRAMA

        //Impresión del nombre, apellido y calculo de edad (PROBLEMA 1 Y 4)
        System.out.print("Introduzca su nombre: ");
        nombre=en.nextLine();
        System.out.print("Introduzca su apellido: ");
        apell=en.nextLine();
        System.out.print("Año Actual: ");
        anio=en.nextInt();
        System.out.print("Año de nacimiento: ");
        nacim=en.nextInt();
        
        edad=anio-nacim;
        
        System.out.println("\nBuenos días "+nombre+" "+ apell+"\nSu edad en el año "+ anio+ " es "+edad);
        
        //Doble y triple de un numero entero (PROBLEMA 2)
            try{
                System.out.print("\nIntroduzca un número entero: ");
                num=0;
                num=en.nextInt();
            }catch (InputMismatchException e){
                System.out.println("Número introducido debe ser entero.");
            }
        
        System.out.println("El doble del número introducido es: "+(2*num)+"\nEl triple del número entero es: "+(3*num));
        
        //Area del cuadrado (PROBLEMA 3
        System.out.print("\nPara calcular el area de un cuadrado\nIntroduzca el lado del cuadrado: ");
            try{
                cuadr=en.nextFloat();
            }catch (InputMismatchException e){
                System.out.println("Debe ser un número");
            }
        
        
        arCu=(float) (Math.pow(cuadr, 2));
        System.out.println("Área de ese cuadrado: "+arCu);
        
        // Grados centígrados a grados Fahrenheit. Debe mostrar el resultado. Fórmula: F=32+(9*C/5).
        System.out.print("\nPara convertir de °C a F\nIntroduzca temperatura en centígrados: ");
            try{
                C=en.nextFloat();
            }catch (InputMismatchException e){
                System.out.println("Debe ser un número");
            }
                
        fahr=32+(9*C/5);
        
        System.out.println("La temperatura en Fahrenheit: "+fahr);
    
        //Calcula la longitud y el área de la circunferencia. (PROBLEMA 6)
        System.out.print("\nPara calcular longitud y Area de la circunferencia\nInserte el radio de la circunferencia: ");
       
            try{
                r = Float.parseFloat(leer.readLine());
            }catch (InputMismatchException e){
                System.out.println("Debe ser un número");
            }
        
        
        longt=2*PI*r;
        arCir=PI*(Math.pow(r,2));
       
        System.out.println("Longitud: "+longt +"            Area de circunferencia: "+arCir);
        
        //Velocidad en Km/h a m/s. (PROBLEMA 7)
        System.out.print("\nPara convertir velocidad de km/h a m/s\nIntroduzca una velocidad en km/h: ");
        
            try{
                km=Float.parseFloat(leer.readLine());
            }catch (InputMismatchException e){
                System.out.println("Debe ser un número");
            }
                
        ms=(km*1000)/3600;
        
        System.out.println(km+"km/h = "+ms+"m/s");      
        
    }
}
