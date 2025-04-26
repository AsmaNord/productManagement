/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestiondesproduits;

import java.util.Scanner;

/**
 *
 * @author thinkpad
 */
public class GestionDesProduits {

    public static void main(String[] args) {
        
        Scanner clavier = new Scanner(System.in);
        ManagementDesProduits management = new ManagementDesProduits();
        
        while (true){
            System.out.println("\n--- Menu Gestion des Produits ---");
            System.out.println("1. Ajouter un produit");
            System.out.println("2. Afficher les produits");
            System.out.println("3. Supprimer un produit");
            System.out.println("4. Rechercher un produit");
            System.out.println("5. Modifier un produit");
            System.out.println("6. Quitter");
            System.out.print("Choisissez une option: ");
            
            int choix = clavier.nextInt();
            
            switch (choix) {
                case 1: {
                    Produit p = new Produit();
                    System.out.println("Entrez 1-le nom, 2-la categorie, 3-le prix et 4-la quantité de votre produit");
                    p.nom = clavier.next();
                    p.categorie = clavier.next();
                    p.prix = clavier.nextDouble();
                    p.quantite = clavier.nextInt();
        
                    management.Ajouter(p);
                }
                break;
                
                case 2: management.Affichage();
                break;
                
                case 3: {
                    System.out.println("Entrez le nom de produit que vous voulez rechercher");
                    String nom = clavier.next();
                    management.Supprimer(nom);
                }
                break;
                
                case 4: {
                    System.out.println("Entrez le nom de produit que vous voulez rechercher");
                    String nom = clavier.next();
                    management.Rechercher(nom);
                }
                break;
                
                case 5: {
                    System.out.print("Entrez le nom de produit que vous voulez modifier: ");
                    String nom = clavier.next();
                    System.out.print("Entrez son nouveau prix: ");
                    double nprix = clavier.nextDouble();
                    System.out.print("Entrez sa nouvelle quatité: ");
                    int nquantite = clavier.nextInt();
                    
                    management.Modifier(nom, nprix, nquantite);
                }
                break;
                
                case 6: {
                    System.out.println("Fermeture du programme...");
                    System.exit(0);
                }
                
                default: System.out.println("Option invalide, veuillez réessayer.");
            }
        }
    }
}
