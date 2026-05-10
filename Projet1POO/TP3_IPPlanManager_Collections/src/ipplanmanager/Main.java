/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

public class Main {

    public static void main(String[] args) {

        InfrastructureReseau infra =
                new InfrastructureReseau("Infrastructure YFY");

        ReseauIP r1 = new ReseauIP("192.168.1.0", 24, "Admin");
        ReseauIP r2 = new ReseauIP("192.168.2.0", 24, "Tech");
        ReseauIP r3 = new ReseauIP("192.168.3.0", 24, "WiFi");

        infra.ajouterSousReseau(new SousReseau("ADMIN", r1));
        infra.ajouterSousReseau(new SousReseau("TECH", r2));
        infra.ajouterSousReseau(new SousReseau("WIFI", r3));

        AdresseIP ip1 = new AdresseIP("192.168.1.1");
        AdresseIP ip2 = new AdresseIP("10.0.0.1");

        InterfaceReseau i1 = new InterfaceReseau("eth0", ip1);
        InterfaceReseau i2 = new InterfaceReseau("eth1", ip2);

        i1.activer();
        i2.activer();

        Equipement router = new Equipement("R1_EDGE", "Routeur");

        router.ajouterInterface(i1);
        router.ajouterInterface(i2);

        infra.ajouterEquipement(router);

        infra.afficher();

        System.out.println("\nRecherche :");
        infra.rechercherEquipement("R1_EDGE");
    }
}