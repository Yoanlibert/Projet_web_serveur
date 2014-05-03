package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amara Safia on 02/05/14.
 */
@XmlRootElement
public class Adresse {

    public Map<String,String> MesAdresses = new HashMap<String, String>();

    @XmlElement
    public Map<String,String> getMesAdresses(){
        return MesAdresses;
    }

    public void addAdresses (String rue,String pays){
        MesAdresses.put(rue,pays);
    }


   /* private String rue;
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
    @XmlElement
    public String getRue() {
        return rue;
    }
    @XmlElement
    public int getCodePostal() {
        return codePostal;
    }
    @XmlElement
    public String getPays() {
        return pays;
    }
    @XmlElement
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
    }*/
}
