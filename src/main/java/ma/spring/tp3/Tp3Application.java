package ma.spring.tp3;

import ma.spring.tp3.entities.Patient;
import ma.spring.tp3.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class Tp3Application implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;
    public static void main(String[] args) {

        SpringApplication.run(Tp3Application.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));
        patientRepository.save(new Patient(null,"Mohamed",new Date(),false,12));
        patientRepository.save(new Patient(null,"Hamza",new Date(),false,23));
        patientRepository.save(new Patient(null,"Omar",new Date(),true,32));


    }
}
