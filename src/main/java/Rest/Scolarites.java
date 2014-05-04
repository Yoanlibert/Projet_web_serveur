package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by Amara Safia on 03/05/14.
 */

@XmlRootElement
public class Scolarites {

    private Map<String,String> MesScolarites = new HashMap<String, String>();

    @XmlElement
    public Map<String,String> getMesScolarites(){
        return MesScolarites;
    }

    public void addScolarites (String ecole,String annee){
        MesScolarites.put(ecole,annee);
    }
}
