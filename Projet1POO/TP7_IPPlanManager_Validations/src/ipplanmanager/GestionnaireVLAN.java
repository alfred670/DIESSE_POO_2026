/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

import java.util.ArrayList;

public class GestionnaireVLAN {

    private ArrayList<VLAN> vlans = new ArrayList<>();

    public void ajouterVLAN(VLAN vlan)
            throws ConflitVLANException {

        for (VLAN v : vlans) {
            if (v.getId() == vlan.getId()) {
                throw new ConflitVLANException(
                        "VLAN ID déjà utilisé : " + vlan.getId()
                );
            }
        }
        vlans.add(vlan);
    }

    public void afficherTousLesVLANs() {
        for (VLAN v : vlans) {
            v.afficher();
            System.out.println();
        }
    }
}