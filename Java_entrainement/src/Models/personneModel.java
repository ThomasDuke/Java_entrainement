package Models;

public class personneModel extends classeModel {


    private String nom;
    private String prenom;

    public personneModel(String nom, String prenom) {
        super();
        this.nom = nom;
        this.prenom = prenom;
    }
    public personneModel(){}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
}
