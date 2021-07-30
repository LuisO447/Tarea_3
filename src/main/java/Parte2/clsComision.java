/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Parte2;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author Luis
 */
public class clsComision {

    private static String[][] comisiones = new String[3][6];

    private static final int nombre = 0;
    private static final int ENERO = 1;
    private static final int FEBRERO = 2;
    private static final int MARZO = 3;
    private static final int TOTAL = 4;
    private static final int PROMEDIO = 5;

    public static void cargarInformacion(int fila) {
        Scanner t = new Scanner(System.in);

        System.out.println("Ingrese nombre " + (fila + 1));
        comisiones[fila][nombre] = t.nextLine();

        System.out.println("Ingrese Enero");
        comisiones[fila][ENERO] = t.nextLine();

        System.out.println("Ingrese Febrero");
        comisiones[fila][FEBRERO] = t.nextLine();

        System.out.println("Ingrese Marzo");
        comisiones[fila][MARZO] = t.nextLine();

        //int suma = 0;
        /*int suma = 0; 
        suma= suma+Integer.parseInt(comisiones[fila][TOTAL]);
         */
        //for (int contador = 0; contador < comisiones[fila].length; contador++) {
        //suma = suma + Integer.parseInt(String.valueOf(comisiones[fila][TOTAL]));
        //comisiones[TOTAL][1] = suma+comisiones[fila][TOTAL];
        //}
    }

    public static void imprimirDecorado() {

        for (int x = 0; x < comisiones.length; x++) {

            System.out.println("|");

            for (int y = 0; y < comisiones[x].length; y++) {
                System.out.print(comisiones[x][y]);
                //System.out.print("");

                if (y != comisiones[x].length - 1) {
                    System.out.print("\t");

                }
            }

            System.out.println("|");
        }
    }

    public static void ingresoDatos() {
        
        int sumfila = 0;
        int sumcolumna = 0;
        
        for (int i = 0; i < comisiones.length; i++) { //i<3

            cargarInformacion(i);

        }

        //int sumaVentas = 0;
        for (int sumar = 1; sumar < comisiones.length; sumar++) {
            for (int sumar2 = 1; sumar2 < comisiones.length; sumar2++) {
                
                //sumfila = sumfila+comisiones[ENERO][TOTAL];
                comisiones[sumar][TOTAL] += Integer.parseInt(String.valueOf(ENERO)) + Integer.parseInt(String.valueOf(FEBRERO)) + Integer.parseInt(String.valueOf(MARZO));
                
                
            }
            //for (int sumar2 = 0; sumar2 < comisiones[TOTAL].length; sumar2++) {
            //comisiones[sumar][TOTAL] += Integer.parseInt(String.valueOf(ENERO)) + Integer.parseInt(String.valueOf(FEBRERO)) + Integer.parseInt(String.valueOf(MARZO));
            //}
            //sumaVentas = sumaVentas + Integer.parseInt(String.valueOf(comisiones[5][1]));
            //comisiones[sumar][4] += Integer.parseInt(String.valueOf(ENERO))+ Integer.parseInt(String.valueOf(FEBRERO))+ Integer.parseInt(String.valueOf(MARZO));
            
        }

    }

    /*public static void sumaTotalVentas(){
        for (int sumar = 0; sumar < comisiones[TOTAL].length; sumar++) {
            //comisiones[fila2][TOTAL] += comisiones[sumar];
            
            //comisiones[][] += Integer.parseInt(String.valueOf(ENERO))+ Integer.parseInt(String.valueOf(FEBRERO))+ Integer.parseInt(String.valueOf(MARZO));
                
        }
        //comisiones[fila2][TOTAL] = comisiones[fila2][ENERO]+comisiones[fila2][FEBRERO]+comisiones[fila2][MARZO];
        //System.out.println("Este es el resultado: "+comisiones[fila2][TOTAL]);
    }*/
    //esta de suma total no la estoy usando.
    public static void buscarMasyMenos() {
        
    }
    
    public static void quienVendeMas(){
        
    }
    
    public static void buscaCantidad(){
        
    }

    public static void elMenu() {

        Scanner ingresoOpcion = new Scanner(System.in);
        int opcionMenu = 0;
        boolean elegirOpcion = false;

        do {

            System.out.println("Bienvenido a la app");
            System.out.println("Que es lo que quieres hacer??");
            System.out.println("Elige una opcion porfavor");
            System.out.println("1. Ingreso de informacion.\n2. Consultar quien vendio mas y quien menos durante el mes.");
            System.out.println("3. Consultar quien vendio mas en los 3 meses.\n4. Buscar por cantidad.\n5. Mostrar todos los datos");
            System.out.println("6. Salir de la app.");

            opcionMenu = ingresoOpcion.nextInt();

            switch (opcionMenu) {

                case 1:

                    ingresoDatos();

                    break;
                case 2:

                    System.out.println("De momento esa opcion no esta disponible\nlo siento, intenta con otra opcion");

                    break;
                case 3:

                    System.out.println("De momento esa opcion no esta disponible\nlo siento, intenta con otra opcion");

                    break;
                case 4:

                    System.out.println("De momento esa opcion no esta disponible\nlo siento, intenta con otra opcion");

                    break;
                case 5:

                    imprimirDecorado();

                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Esa opcion no esta disponible, vuelve a intentar");

            }

            //sumaTotalVentas();
        } while (elegirOpcion = true);

    }

    public static void main(String[] args) {

        elMenu();

        /*int a=10,b=10,c=90;
        double prom=a+b+c/3;
        Object [][] l = new Object[3][6]{"S",a,b,c,prom}{"R",a,b,c,prom};
        for(int i =0;i<l.length;i++)
        {
            System.out.println(l[i]);
        }*/
    }
}
