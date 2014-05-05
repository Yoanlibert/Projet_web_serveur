package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

/**
 * Created by Amara Safia on 08/04/14.
 */
@XmlRootElement(name = "Resume")
/*@XmlType(propOrder = {"name", "prenom", "dateNaissance","numTel", "mesAdresses",  "objectif",
                      "mesexp", "scolarites", "competence", "langues", "competenceInfo"})*/
public class Resume {

    private String name;
    private String prenom;
    private String dateNaissance;
    private String numTel;
    public Adresse mesAdresses;
    private String objectif;

   /* @XmlElementWrapper(name = "Residence")
      @XmlElement(name = "adresse")
    protected List<Adresse> adresses = new ArrayList<Adresse>();*/

    public ExperciencePro mesexp;
    public Scolarites scolarites;
    private String competence;
    public Langues langues;
    public CompetenceInfo competenceInfo;



    public Resume(){

    }
    @XmlElement
    public String getName() {
        return name;
    }
    @XmlElement
    public String getPrenom() {
        return prenom;
    }

    //@XmlJavaTypeAdapter(DateAdapter.class)
    @XmlElement
    public String getDateNaissance() {
        return dateNaissance;
    }
    @XmlElement
    public String getNumTel() {
        return numTel;
    }
    @XmlElement
    public String getObjectif() {
        return objectif;
    }

    /*public List<Adresse> getAdresses() {
        return adresses;
    }*/

    @XmlElement
    public String getCompetence() {
        return competence;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

   /* public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }*/

    public void setCompetence(String competence) {
        this.competence = competence;
    }

    public Resume(String name, String prenom, String dateNaissance, String numTel, Adresse adresse, String objectif, ExperciencePro mesexp, Scolarites scolarites,String competence, Langues langues, CompetenceInfo competenceInfo ){
        //super();
        this.name=name;
        this.prenom=prenom;
        this.dateNaissance=dateNaissance;
        this.numTel=numTel;
        this.mesAdresses=adresse;
        this.objectif=objectif;
        this.mesexp=mesexp;
        this.scolarites=scolarites;
        this.competence=competence;
        this.langues = langues;
        this.competenceInfo=competenceInfo;

    }

}
