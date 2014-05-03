package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by Amara Safia on 03/05/14.
 */

@XmlRootElement
public class Langues {

    public Map<String,String> MesLangues = new HashMap<String, String>();

    @XmlElement
    public Map<String,String> getMesLangues(){
        return MesLangues;
    }

    public void addLangues (String langue,String niveau){
        MesLangues.put(langue,niveau);
    }
}
