/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progra2bmatrices;

/**
 *
 * @author Luis
 */
public class Clsmatrices {

    private static String[][] ma = new String[8][8];

    private static void cargarMatriz() {
        for (int c = 0; c < ma.length; c++) {
            for (int f = 0; f < ma.length; f++) {
                ma[f][c] = "X";
            }

        }
    }

    public static void imprimeMatriz() {
        for (int c = 0; c < ma.length; c++) {
            for (int f = 0; f < ma.length; f++) {
                System.out.print(ma[f][c]);

            }

            System.out.println(" ");
        }
    }

    public static void imprimirDecorado() {
        
        for (int x = 0; x < ma.length; x++) {
            
            System.out.println("|");
            
            for (int y = 0; y < ma[x].length; y++) {
                System.out.print(ma[x][y]);
                
                if(y!=ma[x].length-1){
                    System.out.print("\t");
                }
            }
            
            System.out.println("|");
        }
    }
    
    public static void columnasPares(){
        for (int c = 0; c < ma.length; c++) {
            for (int f = 0; f < ma.length; f++) {
                if(f%2==0){
                    
                    ma[c][f]="P";
                    
                }
                
            }
            
        }
    }
    
    public static void columnasX(){
    
        for (int f = 0; f < ma.length; f++) {
            ma[f][f] = "\\";
            ma[f][7-f] = "/";
            //for (int c = 0; c < ma.length; c++) {
             //ma[f][ma.lenght-f] = "/";   
                
            //}
            
        }
    }
    
    public static void columnasL(){
        
        for (int f = 0; f < ma.length; f++) {
            ma[0][f] = "L";
            ma[f][7] = "L";
            //ma[f][ma.lenght-1 o 7] = "L";
            ma[ma.length-1][f] = "L";
            ma[f][0] = "L";
            
        }
    }

    public static void main(String[] args) {

        cargarMatriz();
        //imprimeMatriz();
        imprimirDecorado();
        System.out.println("Resultados: ");
        System.out.println(" ");
        //columnasPares();
        //columnasX();
        columnasL();
        imprimirDecorado();
        //imprimeMatriz();
        

    }

}
