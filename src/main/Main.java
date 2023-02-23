package main;

import dao.ClasseImpl;
import dao.IClasse;
import entity.Classe;
import entity.Etudiant;

public class Main {
    public static void main(String[] args) {
        Classe classe = new Classe("txghvk");
        classe.setId(3);
        classe.setEffectif(0);
        IClasse iClasse = new ClasseImpl();
        int ok = iClasse.delete(3);
        if (ok==1)
            System.out.println("Insertion reussie!");
        else
            System.out.println("Insertion échouée");
        /*System.out.println("nom est classe est:" + classe.getNom());
        Etudiant etudiant = new Etudiant();
        etudiant.setId(1);
        etudiant.setNom("NDEYE");
        etudiant.setPrenom("NAFISA");
        etudiant.setMoyenne(18.5);
        etudiant.setClasse(classe);
        etudiant.setMatricule(etudiant.generateMatricule());
        System.out.println(etudiant.getNom()+ etudiant.getPrenom()+etudiant.getMoyenne()+etudiant.getMatricule());


         */
        //etudiant.getClasse().getNom();
    }
}