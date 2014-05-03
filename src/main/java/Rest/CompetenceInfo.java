package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amara Safia on 03/05/14.
 */

@XmlRootElement
public class CompetenceInfo {

    public Map<String,String> MesCompetencesInfo = new HashMap<String, String>();

    @XmlElement
    public Map<String,String> getMesCompetencesInfo(){
        return MesCompetencesInfo;
    }

    public void addCompetencesInfo (String competence,String niveau){
        MesCompetencesInfo.put(competence,niveau);
    }

}
