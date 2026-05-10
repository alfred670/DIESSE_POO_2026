/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MoteurVLSM {

    public ArrayList<ResultatVLSM> genererPlan(
            String adresseDepart,
            ArrayList<BesoinReseau> besoins) {

        ArrayList<ResultatVLSM> resultats = new ArrayList<>();

        Collections.sort(besoins, (a, b) ->
                b.getNombreHotes() - a.getNombreHotes());

        int courant = CalculateurReseau.convertirIpEnEntier(adresseDepart);

        for (BesoinReseau b : besoins) {

            int cidr = CalculateurReseau.calculerCidrPourHotes(b.getNombreHotes());
            int cap = CalculateurReseau.calculerNombreHotes(cidr);
            String masque = CalculateurReseau.obtenirMasqueDecimal(cidr);

            String reseau = CalculateurReseau.convertirEntierEnIp(courant);

            ResultatVLSM r = new ResultatVLSM(
                    b.getNom(),
                    reseau,
                    cidr,
                    masque,
                    cap
            );

            resultats.add(r);

            courant += CalculateurReseau.calculerTailleBloc(cidr);
        }

        return resultats;
    }
}