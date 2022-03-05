package Models;

public class classeModel extends ecoleModel{

    private Integer num_classe;
    private Integer nb_bureau;
    private Integer nb_chaise;

    public classeModel(Integer num_classe, Integer nb_bureau, Integer nb_chaise) {
        this.num_classe = num_classe;
        this.nb_bureau = nb_bureau;
        this.nb_chaise = nb_chaise;
    }

    public classeModel(){}

    public Integer getNum_classe(){
        return num_classe;
    }
    public void setNum_classe(Integer num_classe){
        this.num_classe = num_classe;
    }

    public Integer getNb_bureau(){
        return nb_bureau;
    }

    public void setNb_bureau(Integer nb_bureau){
        this.nb_bureau = nb_bureau;
    }

    public Integer getNb_chaise(){
        return nb_chaise;
    }

    public void setNb_chaise(Integer nb_chaise){
        this.nb_chaise = nb_chaise;
    }

}