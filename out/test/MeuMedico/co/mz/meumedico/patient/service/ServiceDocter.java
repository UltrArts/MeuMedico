package co.mz.meumedico.service;
import co.mz.meumedico.doctor.model.Doctor;
import co.mz.meumedico.doctor.repository.DoctorRepository;
/*
@Tridon
 */
public class Service   {
    @Autowired
    private static DoctorRepository doctorRepository;

    @RequestMapping()
    public void save(@RequestBody Doctor doctor){
        doctorRepository.save(doctor);
        }
    }

    @RequestMapping
    public Doctor findById(@PathVariable(value = "id") long id){
        return doctorRepository.findById(id).orElse(null);
    }

    @RequestMapping(value = "/doctor", method = RequestMethod.GET)
    public List<Doctor> doctorList(){
        return doctorRepository.findAll();
    }


}