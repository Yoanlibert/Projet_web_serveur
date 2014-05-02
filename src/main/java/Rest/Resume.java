package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Amara Safia on 08/04/14.
 */
@XmlRootElement(name = "Resume")
/*@XmlType(propOrder = {"name", "prenom", "dateNaissance", "objectif",
                      "experiencePro", "scolarites", "langues"})*/
public class Resume {

    private String name;
    private String prenom;
   // private int age;
    private Date dateNaissance;
    private String objectif;
    @XmlElementWrapper(name = "Residence")
      @XmlElement(name = "adresse")
    protected List<Adresse> adresses = new ArrayList<Adresse>();

    LinkedList<String> experiencePro;
    LinkedList<String> scolarites;
    LinkedList<String> langues;


    public Resume (){

    }

    public String getName() {
        return name;
    }

    public String getPrenom() {
        return prenom;
    }

    //@XmlJavaTypeAdapter(DateAdapter.class)
    public Date getDateNaissance() {
        return dateNaissance;
    }

    public String getObjectif() {
        return objectif;
    }

    /*public List<Adresse> getAdresses() {
        return adresses;
    }*/

    public LinkedList<String> getExperiencePro() {
        return experiencePro;
    }

    public LinkedList<String> getScolarites() {
        return scolarites;
    }

    public LinkedList<String> getLangues() {
        return langues;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public void setDateNaissance(Date dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setObjectif(String objectif) {
        this.objectif = objectif;
    }

   /* public void setAdresses(List<Adresse> adresses) {
        this.adresses = adresses;
    }*/

    public void setExperiencePro(LinkedList<String> experiencePro) {
        this.experiencePro = experiencePro;
    }

    public void setScolarites(LinkedList<String> scolarites) {
        this.scolarites = scolarites;
    }

    public void setLangues(LinkedList<String> langues) {
        this.langues = langues;
    }

    public Resume (String name, String prenom,/* Date dateNaissance, */String objectif){
       // super();
        this.name=name;
        this.prenom=prenom;
       // this.dateNaissance=dateNaissance;
        this.objectif=objectif;
    }

   /* public Resume findAll(){
        Resume resumeAll = new Resume();
        return resumeAll;
    }*/
}
