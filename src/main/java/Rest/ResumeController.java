package Rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Amara Safia on 08/04/14.
 */

@Controller
@RequestMapping("/Resume")
public class ResumeController {

    ResumeList list;

    ResumeList getResumes() {
        ResumeList listResume = new ResumeList();
        return listResume;
    }

    /**
     * La liste des resumes
     */

    public void addResume(){
        Adresse adresseList = new Adresse();
        adresseList.addAdresses("37 rue du Maréchal Juin, 76130 Mont Saint Aignan", "Rouen, France");

        ExperciencePro mesexpList = new ExperciencePro();
        mesexpList.addExperiencePro("Vente de matériel informatique chez SysInfo", "4 mois");
        mesexpList.addExperiencePro("Développement des applications chez EVE", "3 mois");
        mesexpList.addExperiencePro("Web master chez une boite de communication", "3 mois");

        Scolarites scolaritesList = new Scolarites();
        scolaritesList.addScolarites("Collège Camille Saint-Saens", "3 ans");
        scolaritesList.addScolarites("Lycée Pierre Corneille", "3 ans");
        scolaritesList.addScolarites("UFR des sciences et techniques, Rouen", "4 ans");

        Langues languesList = new Langues();
        languesList.addLangues("Berbère", "Langue maternelle");
        languesList.addLangues("Français", "Avancé");
        languesList.addLangues("Arabe", "Avancé");
        languesList.addLangues("Anglais", "Avancé");

        CompetenceInfo competenceInfoList = new CompetenceInfo();
        competenceInfoList.addCompetencesInfo("Languages de programmation : Java, PHP, Flash", "Avancé");
        competenceInfoList.addCompetencesInfo("Conception : UML", "Avancé");
        competenceInfoList.addCompetencesInfo("Base de données : Oracle", "Avancé");

        Resume resumes1 = new Resume("AMARA", "Safia", "10-10-1990", "07.53.62.66.35", adresseList,
                "Jeune étudiante avec Bac+4 en phase de démmarage souhaitant evoluer et gagner de l'expérience.",
                mesexpList, scolaritesList, "", languesList, competenceInfoList);
        Resume resumes2 = new Resume("LIBERT", "Yoan", "07-07-1989", "06.61.57.76.59", adresseList,
                "Etudiant en Informatique souhaitant evoluer dans le domaine du développement.",
                mesexpList, scolaritesList, "Interprète pour les langues : Kabyle, Anglais", languesList, competenceInfoList);
        Resume resumes3 = new Resume("MOUGEN", "Ashtaka", "17-01-1990", "07.53.77.77.62", adresseList,
                "Tester le marché de travail afin d'avoir de l'expérience.",
                mesexpList, scolaritesList, "Vente et achat", languesList, competenceInfoList);

        list.resumes.add(resumes1);
        list.resumes.add(resumes2);
        list.resumes.add(resumes3);

    }

    /**
     * Get avec un identifiant
     * @param id
     * @return
     */
  /*  @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXMLById(@PathVariable String id){
        //return list.resumes.get(Integer.parseInt(id));

        Adresse adresseList = new Adresse();
        adresseList.addAdresses("37 rue du Maréchal Juin, 76130 Mont Saint Aignan", "Rouen, France");

        ExperciencePro mesexpList = new ExperciencePro();
        mesexpList.addExperiencePro("Vente de matériel informatique chez SysInfo", "4 mois");
        mesexpList.addExperiencePro("Développement des applications chez EVE", "3 mois");
        mesexpList.addExperiencePro("Web master chez une boite de communication", "3 mois");

        Scolarites scolaritesList = new Scolarites();
        scolaritesList.addScolarites("Collège Camille Saint-Saens", "3 ans");
        scolaritesList.addScolarites("Lycée Pierre Corneille", "3 ans");
        scolaritesList.addScolarites("UFR des sciences et techniques, Rouen", "4 ans");

        Langues languesList = new Langues();
        languesList.addLangues("Berbère", "Langue maternelle");
        languesList.addLangues("Français", "Avancé");
        languesList.addLangues("Arabe", "Avancé");
        languesList.addLangues("Anglais", "Avancé");

        CompetenceInfo competenceInfoList = new CompetenceInfo();
        competenceInfoList.addCompetencesInfo("Languages de programmation : Java, PHP, Flash", "Avancé");
        competenceInfoList.addCompetencesInfo("Conception : UML", "Avancé");
        competenceInfoList.addCompetencesInfo("Base de données : Oracle", "Avancé");

        Resume resumes1 = new Resume("AMARA", "Safia", "10-10-1990", "07.53.62.66.35", adresseList,
                "Jeune étudiante avec Bac+4 en phase de démmarage souhaitant evoluer et gagner de l'expérience.",
                mesexpList, scolaritesList, "", languesList, competenceInfoList);

        return resumes1;
    }*/

    /**
     * Get, toute la liste de resumes
     * @return
     */
    @RequestMapping(value="{*}", method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getResumeInXML(){
        return list;
    }

    /**
     * Delete un resume avec un identifiant
     * @param id
     */
   /* @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    void deleteResumeInXMLById(@PathVariable String id){
        list.resumes.remove(Integer.parseInt(id));
    }*/

    /**
     * PUT, Ajout d'un resume
     * @param id
     * @return
     */
    /*@RequestMapping(value = "{id}", method = RequestMethod.PUT)
    public @ResponseBody
    Resume addResumesInXML(@PathVariable String id){
         list.resumes.add(Integer.parseInt(id));
    }*/

    /*@Autowired
    public void setResumeService(Resume resumeService) {
        this.resumeService = resumeService;
    }*/


}
