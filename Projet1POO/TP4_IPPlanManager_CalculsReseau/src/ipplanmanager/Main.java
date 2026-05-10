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
        ReseauIP r2 = new ReseauIP("172.16.0.0", 16, "Tech");
        ReseauIP r3 = new ReseauIP("10.0.0.0", 8, "WiFi");

        infra.ajouterSousReseau(new SousReseau("ADMIN", r1));
        infra.ajouterSousReseau(new SousReseau("TECH", r2));
        infra.ajouterSousReseau(new SousReseau("WIFI", r3));

        infra.afficher();
    }
}