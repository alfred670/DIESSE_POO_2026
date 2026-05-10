/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

import java.util.ArrayList;

public class InfrastructureReseau {

    private String nom;
    private ArrayList<Equipement> equipements;
    private ArrayList<SousReseau> sousReseaux;

    public InfrastructureReseau(String nom) {
        this.nom = nom;
        equipements = new ArrayList<>();
        sousReseaux = new ArrayList<>();
    }

    public void ajouterEquipement(Equipement e) {
        equipements.add(e);
    }

    public void ajouterSousReseau(SousReseau s) {
        sousReseaux.add(s);
    }

    public void afficherEquipements() {
        for (Equipement e : equipements) {
            e.afficher();
            System.out.println();
        }
    }

    public void afficherSousReseaux() {
        for (SousReseau s : sousReseaux) {
            s.afficher();
            System.out.println();
        }
    }

    public void rechercherEquipement(String nom) {
        for (Equipement e : equipements) {
            if (e.getNom().equalsIgnoreCase(nom)) {
                e.afficher();
                return;
            }
        }
        System.out.println("Équipement introuvable");
    }

    public void afficher() {
        System.out.println("Infrastructure : " + nom);

        System.out.println("\n===== SOUS-RÉSEAUX =====");
        afficherSousReseaux();

        System.out.println("\n===== ÉQUIPEMENTS =====");
        afficherEquipements();
    }
}