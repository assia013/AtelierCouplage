package org.example.ateliercouplage.presentation;

import org.example.ateliercouplage.dao.Etudiant;
import org.example.ateliercouplage.dao.EtudiantDAODictionary;
import org.example.ateliercouplage.metier.EtudiantManager;

public class Presentation {
    public static void main(String [] args){
        EtudiantDAODictionary etudiantDAO = new EtudiantDAODictionary();
        EtudiantManager etudiantManager = new EtudiantManager(etudiantDAO);

        Etudiant e1 = new Etudiant(1,"AIT","Assia","assia@gmail.com");
        Etudiant e2 = new Etudiant(2,"BEN","Ali","ali@gmail.com");
        Etudiant e3 = new Etudiant(3,"Tela","Anass","anass@gmail.com");
        Etudiant e4 = new Etudiant( 4,"Mero","Aymen","aymen@gmail.com");

        etudiantManager.addEtudiant(e1);
        etudiantManager.addEtudiant(e2);
        etudiantManager.addEtudiant(e3);
        etudiantManager.addEtudiant(e4);

        System.out.println("Avant mise à jour : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

        Etudiant etudiantModifie = new Etudiant(2, "AMINE", "Ali", "aliamine@gmail.com");
        etudiantManager.updateEtudiant(etudiantModifie);

        System.out.println("Après mise à jour : ");
        for (Etudiant etudiant : etudiantManager.getAllEtudiants()) {
            System.out.println(etudiant);
        }

    }
}
