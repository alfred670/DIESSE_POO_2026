/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("===== TP5 - VLSM =====");

        ArrayList<BesoinReseau> besoins = new ArrayList<>();

        besoins.add(new BesoinReseau("TECHNIQUE", 120));
        besoins.add(new BesoinReseau("WIFI", 80));
        besoins.add(new BesoinReseau("ADMIN", 50));
        besoins.add(new BesoinReseau("SERVEURS", 20));
        besoins.add(new BesoinReseau("DIRECTION", 10));

        System.out.println("\nBesoins :");
        for (BesoinReseau b : besoins) {
            b.afficher();
        }

        MoteurVLSM moteur = new MoteurVLSM();
        ArrayList<ResultatVLSM> resultats =
                moteur.genererPlan("192.168.1.0", besoins);

        System.out.println("\nPlan VLSM :");
        for (ResultatVLSM r : resultats) {
            r.afficher();
        }
    }
}