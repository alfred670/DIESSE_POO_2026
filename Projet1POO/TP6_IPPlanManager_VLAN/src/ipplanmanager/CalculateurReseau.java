/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ipplanmanager;

public class CalculateurReseau {

    public static int calculerNombreHotes(int cidr) {
        int bits = 32 - cidr;
        if (bits == 0) return 1;
        return (int) Math.pow(2, bits) - 2;
    }

    public static int calculerCidrPourHotes(int h) {
        for (int cidr = 32; cidr >= 0; cidr--) {
            if (calculerNombreHotes(cidr) >= h) {
                return cidr;
            }
        }
        return -1;
    }

    public static String obtenirMasqueDecimal(int cidr) {
        int mask = 0xffffffff << (32 - cidr);
        return ((mask >>> 24) & 255) + "." +
               ((mask >>> 16) & 255) + "." +
               ((mask >>> 8) & 255) + "." +
               (mask & 255);
    }

    public static int convertirIpEnEntier(String ip) {
        String[] p = ip.split("\\.");
        int r = 0;
        for (int i = 0; i < 4; i++) {
            r = r * 256 + Integer.parseInt(p[i]);
        }
        return r;
    }

    public static String convertirEntierEnIp(int v) {
        return ((v >>> 24) & 255) + "." +
               ((v >>> 16) & 255) + "." +
               ((v >>> 8) & 255) + "." +
               (v & 255);
    }

    public static int calculerTailleBloc(int cidr) {
        return (int) Math.pow(2, 32 - cidr);
    }

    static String estReseauPrive(String adresseReseau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static String obtenirClasseReseau(String adresseReseau) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}