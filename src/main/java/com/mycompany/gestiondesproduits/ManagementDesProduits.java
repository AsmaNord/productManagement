/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestiondesproduits;

import java.util.ArrayList;

/**
 *
 * @author thinkpad
 */
public class ManagementDesProduits {
    ArrayList<Produit> tableau = new ArrayList<Produit>();
    
    int Trouver(String nom){ //fonction qui retourne l'indice d'un produit a partir de son nom PS: travail sur les tableau non vide
        int i=0;
        // la comparaison des Sring se fait avec la fonction equals(nom)
        // et non pas "!=", car "!=" est un operateur mathematique
        // il va comparer les @ memoires des string donc la condition sera toujours vrai les @ sont tjr diff
        while((i < tableau.size()) && (!tableau.get(i).nom.equals(nom))){
            i += 1;
        }
        return i;
    }
    
    void Ajouter(Produit p){
        tableau.add(p);
        System.out.println("Element ajouter avec succès!");
    }
    
    void Affichage(){
        if (tableau.size()== 0){
            System.out.println("Aucun Produit n'est introduit : tableau vide");
        }
        else {
            for (int i = 0; i < tableau.size(); i ++){
                Produit p = tableau.get(i); // p = l'element du tableau a l'indice i
                System.out.println(p);
            }
        }
    }
    
    void Supprimer(String nom){
        if (tableau.isEmpty()) System.out.println("Tableau vide");
        else {
            if (Trouver(nom) >= tableau.size()) System.out.println("Le produit "+ nom +" n'existe pas");
            else {
                tableau.remove(Trouver(nom)); //Trouver(nom) est l'indice ou se trouve le produit
                System.out.println("Element supprimer avec succès!");
            }
        }
    }
    
    void Rechercher(String nom){
        if (tableau.isEmpty()) System.out.println("Tableau vide");
        else {
            // la comparaison des Sring se fait avec la fonction equals(nom)
            // et non pas "!=", car "!=" est un operateur mathematique
            // il va comparer les @ memoires des string donc la condition sera toujours vrai les @ sont tjr diff
            if (Trouver(nom) >= tableau.size()) System.out.println("Le produit "+ nom +" n'existe pas");
            else {
                Produit p = new Produit();
                p = tableau.get(Trouver(nom));
                
                System.out.println("Produit: " + p.nom +", Catégorie: "+ p.categorie +", Prix: " + p.prix + " DA"+", Quantité: "+p.quantite);
        }
    }
}

    void Modifier(String nom, double nprix, int nquantite){ // nprix = nouvaux prix
        if (Trouver(nom) >= tableau.size()) System.out.println("Le produit "+ nom + " n'existe pas");
        else {
            tableau.get(Trouver(nom)).prix = nprix;
            tableau.get(Trouver(nom)).quantite = nquantite;
            System.out.println("Le produit "+ nom +" est mis à jour");
        }
    }
    
}
