/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

public class CalculateurReseau {

    public static int calculerNombreHotes(int cidr) {
        int bits = 32 - cidr;
        if (bits <= 0) return 1;
        return (int) Math.pow(2, bits) - 2;
    }

    public static int calculerCidrPourHotes(int nb) {
        for (int cidr = 32; cidr >= 0; cidr--) {
            if (calculerNombreHotes(cidr) >= nb) {
                return cidr;
            }
        }
        return -1;
    }

    public static String obtenirMasqueDecimal(int cidr) {
        int masque = 0xffffffff << (32 - cidr);

        return ((masque >>> 24) & 255) + "." +
               ((masque >>> 16) & 255) + "." +
               ((masque >>> 8) & 255) + "." +
               (masque & 255);
    }

    public static int convertirIpEnEntier(String ip) {
        String[] p = ip.split("\\.");
        int res = 0;

        for (int i = 0; i < 4; i++) {
            res = res * 256 + Integer.parseInt(p[i]);
        }
        return res;
    }

    public static String convertirEntierEnIp(int val) {
        return ((val >>> 24) & 255) + "." +
               ((val >>> 16) & 255) + "." +
               ((val >>> 8) & 255) + "." +
               (val & 255);
    }

    public static int calculerTailleBloc(int cidr) {
        return (int) Math.pow(2, 32 - cidr);
    }

    // 🔴 TP7 AJOUTS

    public static boolean estAdresseIPValide(String ip) {
        if (ip == null) return false;

        String[] p = ip.split("\\.");
        if (p.length != 4) return false;

        for (String s : p) {
            try {
                int v = Integer.parseInt(s);
                if (v < 0 || v > 255) return false;
            } catch (Exception e) {
                return false;
            }
        }
        return true;
    }

    public static void verifierAdresseIP(String ip)
            throws AdresseIPInvalideException {
        if (!estAdresseIPValide(ip)) {
            throw new AdresseIPInvalideException("IP invalide : " + ip);
        }
    }

    public static int calculerAdresseFin(String ip, int cidr) {
        return convertirIpEnEntier(ip) + calculerTailleBloc(cidr) - 1;
    }

    public static boolean reseauxSeChevauchent(String a1, int c1,
                                                String a2, int c2) {

        int d1 = convertirIpEnEntier(a1);
        int f1 = calculerAdresseFin(a1, c1);

        int d2 = convertirIpEnEntier(a2);
        int f2 = calculerAdresseFin(a2, c2);

        return d1 <= f2 && d2 <= f1;
    }

    static String obtenirClasseReseau(String adresseReseau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static String estReseauPrive(String adresseReseau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}