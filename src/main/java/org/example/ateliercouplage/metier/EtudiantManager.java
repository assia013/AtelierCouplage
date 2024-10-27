package org.example.ateliercouplage.metier;

import org.example.ateliercouplage.dao.Etudiant;
import org.example.ateliercouplage.dao.EtudiantDAOInterface;

import java.util.List;

public class EtudiantManager {
    private EtudiantDAOInterface etudiantDAO;

    public EtudiantManager(EtudiantDAOInterface etudiantDAO) {
        this.etudiantDAO = etudiantDAO;
    }

    public Etudiant addEtudiant(Etudiant etudiant) {
        for (Etudiant e : etudiantDAO.getAllEtudiants()) {
            if (e.getEmail().equals(etudiant.getEmail())) {
                System.out.println("Erreur : L'email " + etudiant.getEmail() + " est déjà utilisé.");
                return null;
            }
        }
        return etudiantDAO.addEtudiant(etudiant);
    }

    public List<Etudiant> getAllEtudiants() {
        return etudiantDAO.getAllEtudiants();
    }

    public Etudiant updateEtudiant(Etudiant etudiant) {
        return etudiantDAO.updateEtudiant(etudiant);
    }
}
