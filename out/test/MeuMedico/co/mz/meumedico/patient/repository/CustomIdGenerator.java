package co.mz.meumedico.patient.repository;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Component
public class CustomIdGenerator {
    private static Logger log = LoggerFactory.getLogger(CustomIdGenerator.class);

    //@Autowired
    private static PatientRepository patientRepository;

    public CustomIdGenerator(PatientRepository patientRepository){
        CustomIdGenerator.patientRepository = patientRepository;
    }

    public static synchronized Long generate() {

        long count = patientRepository.count();
        long nextId = count+1;
        String currentDate = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"));
        log.info(currentDate + nextId);
        log.info("id atual: " + Long.parseLong(currentDate + nextId));
        return Long.parseLong( currentDate + nextId);

    }

    public static synchronized Long generate2() {
        String currentYear = LocalDate.now().format(DateTimeFormatter.ofPattern("yyyy"));
        long count = patientRepository.count();

        // Calcule o próximo valor para os quatro dígitos, começando com 1
        long nextId = count % 10000 + 1;

        // Construa o ID personalizado
        String customId = currentYear + String.format("%04d", nextId);

        log.info("ID personalizado: " + customId);
        return Long.parseLong(customId);
    }

}
