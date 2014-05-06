package Rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * Created by Amara Safia on 08/04/14.
 */

@Controller
@RequestMapping("/Resume")
public class ResumeController {

    public ResumeList list;
    public Adresse adresseList1, adresseList2, adresseList3;
    public ExperciencePro mesexpList1, mesexpList2, mesexpList3;
    public Scolarites scolaritesList1, scolaritesList2, scolaritesList3;
    public Langues languesList1, languesList2, languesList3;
    public CompetenceInfo competenceInfoList1, competenceInfoList2, competenceInfoList3;
   /*
    @Autowired
    ResumeList getResumes() {
        ResumeList listResume = new ResumeList();
        return listResume;
    }
*/
    /**
     * La liste des resumes
     */
   @Autowired
   public void addResume(){
        adresseList1 = new Adresse();
        adresseList1.addAdresses("37 rue du Maréchal Juin, 76130 Mont Saint Aignan", "Rouen, France");
        adresseList2 = new Adresse();
        adresseList2.addAdresses("Cité Gagarine, appartement D122, 94000", "Ivry sur Seine, France");
        adresseList3 = new Adresse();
        adresseList3.addAdresses("Résidence du Bois, Bt Monet, Ch377, MSA", "Rouen, France");

        mesexpList1 = new ExperciencePro();
        mesexpList1.addExperiencePro("Vente de matériel informatique chez SysInfo", "4 mois");
        mesexpList1.addExperiencePro("Développement des applications chez EVE", "3 mois");
        mesexpList1.addExperiencePro("Web master chez une boite de communication", "3 mois");
        mesexpList2 = new ExperciencePro();
        mesexpList2.addExperiencePro("Programmeur/Analyste chez Orange", "7 mois");
        mesexpList2.addExperiencePro("Conseiller client ", "3 mois");
        mesexpList3 = new ExperciencePro();
        mesexpList3.addExperiencePro("Responsable réseau", "6 mois");
        mesexpList3.addExperiencePro("Programmeur chez une boite de développement", "4 mois");
        mesexpList3.addExperiencePro("Serveur dans un réstaurant parésien", "3 mois");

        scolaritesList1 = new Scolarites();
        scolaritesList1.addScolarites("Collège Camille Saint-Saens", "3 ans");
        scolaritesList1.addScolarites("Lycée Pierre Corneille", "3 ans");
        scolaritesList1.addScolarites("UFR des sciences et techniques, Rouen", "4 ans");
        scolaritesList2 = new Scolarites();
        scolaritesList2.addScolarites("Collège George", "3 ans");
        scolaritesList2.addScolarites("Lycée Flaubert", "3 ans");
        scolaritesList2.addScolarites("Université de SORBONNE, Paris", "4 ans");
        scolaritesList3 = new Scolarites();
        scolaritesList3.addScolarites("Collège Saint-Saens", "3 ans");
        scolaritesList3.addScolarites("Lycée Miséricorde", "3 ans");
        scolaritesList3.addScolarites("Université de Rouen, UFR Informatique", "4 ans");

        languesList1 = new Langues();
        languesList1.addLangues("Berbère", "Langue maternelle");
        languesList1.addLangues("Français", "Avancé");
        languesList1.addLangues("Arabe", "Avancé");
        languesList1.addLangues("Anglais", "Avancé");
        languesList2 = new Langues();
        languesList2.addLangues("Kabyle", "Langue maternelle");
        languesList2.addLangues("Français", "Excelent");
        languesList2.addLangues("Anglais", "Courant");
        languesList3 = new Langues();
        languesList3.addLangues("Tamazigth", "Langue maternelle");
        languesList3.addLangues("Français", "Avancé");
        languesList3.addLangues("Anglais", "Avancé");
        languesList3.addLangues("Japonais", "Moyen");

        competenceInfoList1 = new CompetenceInfo();
        competenceInfoList1.addCompetencesInfo("Languages de programmation : Java, PHP, Flash", "Avancé");
        competenceInfoList1.addCompetencesInfo("Conception : UML", "Avancé");
        competenceInfoList1.addCompetencesInfo("Base de données : Oracle", "Avancé");
        competenceInfoList2 = new CompetenceInfo();
        competenceInfoList2.addCompetencesInfo("Languages de programmation : C++, PHP/MySQL", "Avancé");
        competenceInfoList2.addCompetencesInfo("Conception : UML, Merise", "Avancé");
        competenceInfoList2.addCompetencesInfo("Base de données : Oracle, SQL", "Avancé");
        competenceInfoList3 = new CompetenceInfo();
        competenceInfoList3.addCompetencesInfo("Languages de programmation : Java, PHP, Flash", "Avancé");
        competenceInfoList3.addCompetencesInfo("Conception et méthodes : UML, UP, XP, 2TUP", "Avancé");
        competenceInfoList3.addCompetencesInfo("Base de données : MySQL, Oracle", "Avancé");

        Resume resumes1 = new Resume("1", "AMARA", "Safia", "10-10-1990", "07.53.62.66.35", adresseList1,
                "Jeune étudiante avec Bac+4 en phase de démmarage souhaitant evoluer et gagner de l'expérience.",
                mesexpList1, scolaritesList1, "", languesList1, competenceInfoList1);
        Resume resumes2 = new Resume("2", "LIBERT", "Yoan", "07-07-1989", "06.61.57.76.59", adresseList2,
                "Etudiant en Informatique souhaitant evoluer dans le domaine du développement.",
                mesexpList2, scolaritesList2, "Interprète pour les langues : Kabyle, Anglais", languesList2, competenceInfoList2);
        Resume resumes3 = new Resume("3", "MOUGEN", "Ashtaka", "17-01-1990", "07.53.77.77.62", adresseList3,
                "Tester le marché de travail afin d'avoir de l'expérience.",
                mesexpList3, scolaritesList3, "Vente et achat", languesList3, competenceInfoList3);
       Resume resumes4 = new Resume("4", "HATAKI", "Kakashi", "10-07-1990", "06.61.10.70.62", adresseList3,
               "Tester le marché de travail afin d'avoir de l'expérience.",
               mesexpList3, scolaritesList3, "Vente et achat", languesList3, competenceInfoList3);

        list = new ResumeList();
        list.resumes.add(resumes1);
        list.resumes.add(resumes2);
        list.resumes.add(resumes3);
        list.resumes.add(resumes4);

    }

    /**
     * Get avec un identifiant
     * @param id
     * @return
     */
    @RequestMapping(value="{id}", method = RequestMethod.GET)
    public @ResponseBody
    Resume getResumeInXMLById(@PathVariable String id){
       //System.out.println (list.resumes.get(1).getName());
        for(int i=0; i<list.resumes.size();i++){
           if( list.resumes.get(i).getId().equals(id)){
            return list.resumes.get(i);
           }
        }
        return null;

    }

    /**
     * Get, toute la liste de resumes
     * @return
     */
    @RequestMapping(value=" " ,method = RequestMethod.GET)
    public @ResponseBody
    ResumeList getResumeInXML(){
        return list;
    }

    /**
     * Delete un resume avec un identifiant
     * @param id
     */
    @RequestMapping(value="{id}", method = RequestMethod.DELETE)
    public @ResponseBody
    Resume deleteResumeInXMLById(@PathVariable String id){
    /*void deleteResumeInXMLById(@PathVariable String id){
        //list.resumes.remove(Integer.parseInt(id));

        int i = id.indexOf('/');
        list.resumes.remove(Integer.parseInt(id.substring(i+1, id.length()))-1);
        list.resumes.get(Integer.parseInt(id.substring(i+1, id.length())));*/
        for(int i=0; i<list.resumes.size();i++){
            if( list.resumes.get(i).getPrenom().equals(id)){
                list.resumes.remove(i);
                return list.resumes.get(Integer.parseInt(id.substring(i, id.length()))-1);
            }

        }
        return null;
    }

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

    /*@RequestMapping(method={RequestMethod.GET}, value="{nom}/")
    public Resume putAll(@PathVariable String id){
        int i =0;
        return list.resumes.get(i);

    }*/


    /*@Autowired
    public void setResumeService(Resume resumeService) {
        this.resumeService = resumeService;
    }*/


}
