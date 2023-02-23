package main;

import entity.Classe;
import entity.Etudiant;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Classe classe = new Classe("Gl");
        System.out.println("nom est classe est:" + classe.getNom());
        Etudiant etudiant = new Etudiant();
        etudiant.setId(1);
        etudiant.setNom("NDEYE");
        etudiant.setPrenom("NAFISA");
        etudiant.setMoyenne(18.5);
        etudiant.setClasse(classe);
        etudiant.setMatricule();
        System.out.println(etudiant.getNom()+ etudiant.getPrenom()+etudiant.getMoyenne()+etudiant.getMatricule());

        //etudiant.getClasse().getNom();
    }
}