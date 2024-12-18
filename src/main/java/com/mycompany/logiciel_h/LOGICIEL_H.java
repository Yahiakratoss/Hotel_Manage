/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.logiciel_h;
import com.mycompany.logiciel_h.project.ConnectionProvider;
import java.sql.Connection;
/**
 *
 * @author Yahia
 */
public class LOGICIEL_H {

    public static void main(String[] args) {
       
         try (Connection con = ConnectionProvider.getCon()) {
            if (con != null) {
                System.out.println("Connexion réussie à MySQL !");
            } else {
                System.out.println("Échec de la connexion à MySQL !");
            }
        } catch (Exception e) {
            System.err.println("Erreur : " + e.getMessage());
        }
    }
}
