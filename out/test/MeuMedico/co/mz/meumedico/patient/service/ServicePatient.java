package co.mz.meumedico.patient.service;
import co.mz.meumedico.patient.model.Patient;
/*
@Tridon
 */
public class Service   {
    @Autowired
    private static PatientRepository patientRepository;

    @RequestMapping()
    public void save(@RequestBody Patient paciente){
        patientRepository.save(paciente);
        }
    }

    @RequestMapping
    public Patient findById(@PathVariable(value = "id") long id){
        return patientRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/patient", method = RequestMethod.GET)
    public List<Patient> pacientList(){
        return patientRepository.findAll();
    }


}