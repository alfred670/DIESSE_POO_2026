/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

public class VLAN {

    private int id;
    private String nom;
    private ResultatVLSM reseauAssocie;
    private String description;

    public VLAN(int id, String nom, ResultatVLSM reseauAssocie, String description) {
        this.id = id;
        this.nom = nom;
        this.reseauAssocie = reseauAssocie;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public ResultatVLSM getReseauAssocie() {
        return reseauAssocie;
    }

    public String getDescription() {
        return description;
    }

    public void afficher() {
        System.out.println("VLAN ID : " + id);
        System.out.println("Nom : " + nom);
        System.out.println("Description : " + description);

        if (reseauAssocie != null) {
            reseauAssocie.afficher();
        }

        System.out.println();
    }
}