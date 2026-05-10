/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TP7 VALIDATIONS =====");

        ArrayList<BesoinReseau> besoins = new ArrayList<>();
        besoins.add(new BesoinReseau("ADMIN", 50));
        besoins.add(new BesoinReseau("TECH", 120));
        besoins.add(new BesoinReseau("WIFI", 80));
        besoins.add(new BesoinReseau("SERVEURS", 20));

        MoteurVLSM moteur = new MoteurVLSM();
        ArrayList<ResultatVLSM> resultats =
                moteur.genererPlan("192.168.1.0", besoins);

        System.out.println("\nPLAN GENERÉ:");
        for (ResultatVLSM r : resultats) {
            r.afficher();
        }

        ValidateurPlanAdressage v = new ValidateurPlanAdressage();

        try {
            v.verifierAdresses(resultats);
            v.verifierChevauchements(resultats);
            v.afficherValidationReussie();

        } catch (Exception e) {
            System.out.println("ERREUR : " + e.getMessage());
        }

        System.out.println("\nTEST VLAN:");

        GestionnaireVLAN g = new GestionnaireVLAN();

        try {
            VLAN v1 = new VLAN(10, "ADMIN", resultats.get(0), "Admin VLAN");
            VLAN v2 = new VLAN(20, "TECH", resultats.get(1), "Tech VLAN");
            VLAN v3 = new VLAN(10, "ERROR", resultats.get(2), "Conflit ID");

            g.ajouterVLAN(v1);
            g.ajouterVLAN(v2);
            g.ajouterVLAN(v3);

        } catch (ConflitVLANException e) {
            System.out.println("ERREUR VLAN : " + e.getMessage());
        }

        g.afficherTousLesVLANs();
    }
}