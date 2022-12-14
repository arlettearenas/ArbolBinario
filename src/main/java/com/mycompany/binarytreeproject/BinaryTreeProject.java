/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.binarytreeproject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Estudiante
 */
public class BinaryTreeProject {

    public static void main(String[] args) throws IOException {
        //Programa que crea un árbol binario y lo reconoce en preorden, inorden y postorden
        BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
        String entrada;
        int dato;
        char respuesta;
        
        
       
        System.out.println("----------------------------------------------");
        System.out.println("Programa que crea un árbol binario");
        
        //Creación del árbol
        BinaryTree arbol = new BinaryTree();
        
        //Agregación datos del árbol
        do{
            System.out.println("Escribe dato para ingresar al árbol");
            entrada = bufer.readLine();
            dato = Integer.parseInt(entrada);
            arbol.add(dato);
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("Escribe n para parar, cualquier otra tecla para ingresar otro d");
            entrada = bufer.readLine();
            respuesta = entrada.charAt(0);
            
        
        }while (respuesta != 'n');
        
        //Imprimir el contenido en preorder
        System.out.println("Recorrido del árbol en preorder");
        arbol.preorder(arbol.root);
        
        System.out.println("Recorrido del árbol en postorden");
        arbol.postorden();
        
        System.out.println("Recorrido del árbol en inorden");
        arbol.inorden();
        
        
    }
}
