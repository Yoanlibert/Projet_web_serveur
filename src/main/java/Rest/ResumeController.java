package Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Amara Safia on 08/04/14.
 */

@Controller
@RequestMapping("/Resume")
public class ResumeController {

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody Resume getResumeInXML(@PathVariable String id){

        Resume resumes = new Resume("Amara", "Safia", "Mes objectif");
        return resumes;
    }

        ResumeList getResumes() {
            ResumeList list = new ResumeList();
            return list;
        }

}
