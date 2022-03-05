package Models;

public class eleveModel extends personneModel {

    private String nom_classe;
    private Integer annee_diplome;

    public eleveModel(String nom_classe,Integer annee_diplome) {
        super();
        this.nom_classe = nom_classe;
        this.annee_diplome = annee_diplome;
    }

    public eleveModel(){}

    public String getNom_classe() {
        return nom_classe;
    }

    public void setNom_classe(String nom_classe){
        this.nom_classe = nom_classe;
    }

    public Integer getAnnee_diplome(){
        return annee_diplome;
    }

    public void setAnnee_diplome(Integer annee_diplome){
        this.annee_diplome = annee_diplome;
    }
}
