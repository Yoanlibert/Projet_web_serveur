package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amara Safia on 03/05/14.
 */

@XmlRootElement
public class ExperciencePro {

    private Map<String,String> MesExperiences = new HashMap<String, String>();

    @XmlElement
    public Map<String,String> getMesExperiences(){
        return MesExperiences;
    }

    public void addExperiencePro (String experience,String duree){
        MesExperiences.put(experience,duree);
    }

}
