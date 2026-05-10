/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

public class VLAN {

    private int id;
    private String nom;
    private ResultatVLSM reseau;
    private String description;

    public VLAN(int id, String nom, ResultatVLSM reseau, String desc) {
        setId(id);
        setNom(nom);
        this.reseau = reseau;
        setDescription(desc);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = (id < 1 || id > 4094) ? 1 : id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = (nom == null || nom.isEmpty()) ? "VLAN" : nom;
    }

    public void setDescription(String d) {
        this.description = (d == null) ? "" : d;
    }

    public void afficher() {
        System.out.println("VLAN " + id + " - " + nom);
        System.out.println(description);

        if (reseau != null) {
            reseau.afficher();
        }
    }
}