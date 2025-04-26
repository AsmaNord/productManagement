/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondesproduits;

/**
 *
 * @author thinkpad
 */
public class Produit {
    String nom;
    String categorie;
    double prix;
    int quantite;
    
    
    // on modifie toString() qui existe deja en java 
    // il est necessaire d'utiliser sa propre version de toString car
    // on en a besoin dan Affichier(p) de la classe Management...
    // sinon java utilise sa propre version de toString qui va lui donne l'@ de p dans la memoire
    // donc il va rien n'affichier
    public String toString() {
        return "Produit: " + nom +", Catégorie: "+ categorie +", Prix: " + prix + " DA"+", Quantité: "+quantite;
    }
    
}
