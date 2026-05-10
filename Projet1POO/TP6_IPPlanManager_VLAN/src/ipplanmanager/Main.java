/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TP6 - VLAN =====");

        ArrayList<BesoinReseau> besoins = new ArrayList<>();

        besoins.add(new BesoinReseau("TECHNIQUE", 120));
        besoins.add(new BesoinReseau("WIFI", 80));
        besoins.add(new BesoinReseau("ADMINISTRATION", 50));
        besoins.add(new BesoinReseau("SERVEURS", 20));

        MoteurVLSM moteur = new MoteurVLSM();
        ArrayList<ResultatVLSM> resultats =
                moteur.genererPlan("192.168.1.0", besoins);

        GestionnaireVLAN gestionnaire = new GestionnaireVLAN();

        int vlanId = 10;

        for (ResultatVLSM r : resultats) {
            VLAN vlan = new VLAN(
                    vlanId,
                    r.getNomBesoin(),
                    r,
                    "VLAN du service " + r.getNomBesoin()
            );

            gestionnaire.ajouterVLAN(vlan);
            vlanId += 10;
        }

        System.out.println("\n===== VLANS =====");
        gestionnaire.afficherTousLesVLANs();

        System.out.println("\n===== RECHERCHE VLAN 20 =====");
        VLAN v = gestionnaire.rechercherVLAN(20);

        if (v != null) {
            v.afficher();
        } else {
            System.out.println("VLAN introuvable");
        }
    }
}