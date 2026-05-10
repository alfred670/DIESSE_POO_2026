/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

public class CalculateurReseau {

    public static int calculerNombreHotes(int cidr) {
        if (cidr < 0 || cidr > 32) {
            return 0;
        }
        int bitsHotes = 32 - cidr;
        return (int) Math.pow(2, bitsHotes) - 2;
    }

    public static String obtenirClasseReseau(String adresseIP) {
        String[] parts = adresseIP.split("\\.");
        int o1 = Integer.parseInt(parts[0]);

        if (o1 >= 1 && o1 <= 126) return "Classe A";
        if (o1 >= 128 && o1 <= 191) return "Classe B";
        if (o1 >= 192 && o1 <= 223) return "Classe C";

        return "Classe inconnue";
    }

    public static String obtenirMasqueDecimal(int cidr) {
        switch (cidr) {
            case 8: return "255.0.0.0";
            case 16: return "255.255.0.0";
            case 24: return "255.255.255.0";
            case 25: return "255.255.255.128";
            case 26: return "255.255.255.192";
            case 27: return "255.255.255.224";
            case 28: return "255.255.255.240";
            default: return "Masque non disponible";
        }
    }

    public static boolean estReseauPrive(String ip) {
        String[] p = ip.split("\\.");
        int a = Integer.parseInt(p[0]);
        int b = Integer.parseInt(p[1]);

        if (a == 10) return true;
        if (a == 192 && b == 168) return true;
        if (a == 172 && b >= 16 && b <= 31) return true;

        return false;
    }
}