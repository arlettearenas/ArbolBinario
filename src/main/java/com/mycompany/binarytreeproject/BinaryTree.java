/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.binarytreeproject;

/**
 *
 * @author Estudiante
 */
public class BinaryTree {
    Node root = null;
    
    public void add (int valor){
        if (this.root == null)
            this.root = new Node(valor);
        
        else 
            add(this.root, valor);
        
        
    }
    public void add (Node nodo, int valor){
        if (valor > (Integer) nodo.getValue()){
            if (nodo.getRight()==null)
                nodo.setRight(new Node <>(valor));
             else 
                this.add(nodo.getRight(), valor);
        }else {
            if (nodo.getLeft()==null)
                nodo.setLeft((new Node<>(valor)));
             else 
                this.add(nodo.getLeft(), valor);
    
        }
    }
    
    public void preorder (Node n){
        if (n != null){
            printDato(n);
            preorder(n.getLeft());
            preorder(n.getRight());
        }
    }
     private void inorden(Node n) {
    if (n != null) {
        inorden(n.getLeft());
        printDato(n);
        inorden(n.getRight());
    }
}

private void postorden(Node n) {
    if (n != null) {
        postorden(n.getLeft());
        postorden(n.getRight());
        printDato(n);
    }
}

public void preorder() {
    this.preorder(this.root);
}

public void inorden() {
    this.inorden(this.root);
}

public void postorden() {
    this.postorden(this.root);
}

    public void printDato(Node n){
        int dato = (Integer) n.getValue();
        System.out.println(dato);
    }
    
}
