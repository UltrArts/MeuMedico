package co.mz.meumedico.service;
import co.mz.meumedico.hospital.model.Hospital;

/*
@Tridon
 */
public class Service   {
    @RequestMapping()
    public void save(@RequestBody Hospital hospital){

    }
}

    @RequestMapping
    public Hospital findById(@PathVariable(value = "id") long id){
        return null;
    }

    @RequestMapping(value = "/doctor", method = RequestMethod.GET)
    public List<Hospital> doctorList(){
        return null;
    }


}