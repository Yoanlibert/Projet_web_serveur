package Rest;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Amara Safia on 08/04/14.
 */

@XmlRootElement
public class ResumeList {

    public List<Resume> resumes =new LinkedList<Resume>();

    @XmlElement
    public List<Resume> getList(){
        return resumes;
    }
}
