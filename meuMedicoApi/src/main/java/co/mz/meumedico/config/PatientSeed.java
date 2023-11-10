package co.mz.meumedico.config;

import co.mz.meumedico.patient.model.Patient;
import co.mz.meumedico.patient.repository.PatientRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
@Slf4j
public class PatientSeed implements CommandLineRunner {
    private final PatientRepository patientRepository;

    @Override
    public void run(String... args) throws Exception {

        if (patientRepository.count() > 0){
            return;
        }

        Patient patient = new Patient();
        patient.setFirstName("Luiz");

        Patient patient2 = new Patient();
        patient.setFirstName("Luiz");

        patientRepository.saveAll(List.of(patient2,patient));


        Thread.sleep(4000);

        List<Patient> patientList = patientRepository.findAll();
        log.info("patients: {}", patientList);
    }
}
