package Models;

public class ecoleModel {

    private String nom;
    private String nom_directeur;
    private String adresse;
    private Integer nb_eleves;

    public ecoleModel (String nom, String nom_directeur, String adresse, Integer nb_eleves){
        this.nom = nom;
        this.nom_directeur = nom_directeur;
        this.adresse = adresse;
        this.nb_eleves = nb_eleves;
    }

    public ecoleModel() {}

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getNom_directeur() {
        return nom_directeur;
    }

    public void setNom_directeur(String nom_directeur) {
        this.nom_directeur = nom_directeur;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public Integer getNb_eleves() {
        return nb_eleves;
    }

    public void setNb_eleves(Integer nb_eleves) {
        this.nb_eleves = nb_eleves;
    }
}
