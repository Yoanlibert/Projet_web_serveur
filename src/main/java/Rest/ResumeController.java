package Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Date;

/**
 * Created by Amara Safia on 08/04/14.
 */

@Controller
@RequestMapping("/Resume")
public class ResumeController {

   // private Resume resumeService;

    ResumeList getResumes() {
        ResumeList list = new ResumeList();
        return list;
    }

   /* @RequestMapping(method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXML(Model model){

        model.addAttribute("resumes", resumeService.findAll());
        return resumeService;
    }*/

    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXMLById(@PathVariable String id){

        Resume resumes = new Resume("Amara", "Safia", "10-10-1990",
        "Jeune étudiante avec Bac+4 en phase de démmarage souhaitant evoluer et gagner de l'expérience",
        "Maîtrise des languages de programmation : Java, PHP/MySql; </br> Oracle; </br> UML");
        return resumes;
    }

    /*@RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public @ResponseBody Resume getResumesInXML(@PathVariable String id){

    }*/

    /*@Autowired
    public void setResumeService(Resume resumeService) {
        this.resumeService = resumeService;
    }*/



}
