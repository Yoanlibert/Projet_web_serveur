package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;

/**
 * Created by Amara Safia on 08/04/14.
 */
@XmlRootElement(name = "Resume")
public class Resume {

    String name;
    String prenom;
    String objectif;
    LinkedList<String> experiencePro;
    LinkedList<String> scolarites;
    LinkedList<String> langues;

    public String getName (){
        return name;
    }


    public void setName (String name){
        this.name = name;
    }

    public String getPrenom (){
        return prenom;
    }


    public void setPrenom (String prenom){
        this.prenom = prenom;
    }

    public String getObjectif (){
        return objectif;
    }


    public void setObjectif (String objectif){
        this.objectif = objectif;
    }

    public Resume (String name, String prenom, String objectif){
        this.name=name;
        this.prenom=prenom;
        this.objectif=objectif;
    }
}
