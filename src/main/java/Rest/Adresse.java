package Rest;

/**
 * Created by Amara Safia on 02/05/14.
 */
public class Adresse {
    private String rue;
    private int codePostal;
    private String pays;
    private String ville;

    public Adresse () {

    }

    public Adresse (String rue, int codePostal, String ville, String pays){
        this.rue=rue;
        this.codePostal=codePostal;
        this.ville=ville;
        this.pays=pays;
    }

    public String getRue() {
        return rue;
    }

    public int getCodePostal() {
        return codePostal;
    }

    public String getPays() {
        return pays;
    }

    public String getVille() {
        return ville;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setCodePostal(int codePostal) {
        this.codePostal = codePostal;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }
}
