package com.example.rajkonkret.jsoupipchone;

import com.example.rajkonkret.jsoupipchone.model.Doctor;
import com.example.rajkonkret.jsoupipchone.model.User2;
import com.example.rajkonkret.jsoupipchone.model.Visit;
import com.example.rajkonkret.jsoupipchone.repository.DoctorRepository;
import com.example.rajkonkret.jsoupipchone.repository.UserRepository;
import com.example.rajkonkret.jsoupipchone.repository.VisitRepository;
import com.example.rajkonkret.jsoupipchone.service.DoctorService;
import com.example.rajkonkret.jsoupipchone.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.time.LocalDate;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private final DoctorService doctorService;

    @Autowired
    private UserService userService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    VisitRepository visitRepository;

    public MyRunner(
            DoctorRepository doctorRepository,
            DoctorService doctorService,
            UserRepository userRepository,
            VisitRepository visitRepository) {
        this.doctorRepository = doctorRepository;
        this.doctorService = doctorService;
        this.userRepository = userRepository;
        this.visitRepository = visitRepository;

    }

    @Override
    public void run(String... args) throws Exception {

//        Doctor doctor = new Doctor(
//                "fra", "kjres", Specialty.OGÓLNY);
//        System.out.println(doctor);
//        doctorRepository.save(doctor);
//        User2 user1 = new User2();
//        userRepository.save(user1);
////
//        Visit visit = new Visit(
//                LocalDate.now(),
//                StatusYourVisit.ORDERED,
//                TypeOfVisit.KONSULTACJA, user1, doctor);
//        System.out.println(visit);
       // visitRepository.save(visit);
//        Visit visit1 = new Visit(
//                LocalDate.now(),
//                StatusYourVisit.ORDERED,
//                TypeOfVisit.RECEPTA, user1, doctor);
//        System.out.println(visit1);
//        visitRepository.save(visit1);
//        Set<Visit> visitSet = new HashSet<>();
//        visitSet.add(visit);
//        visitSet.add(visit1);
//
//        User user = new User(
//                "Radek",
//                " janiak",
//                "123",
//                visitSet);
//        userRepository.save(user);
//        System.out.println(user);
//
//       // doctorRepository.findAll().forEach(System.out::println);
//        //  userService.findAllUsers().forEach(System.out::println);
//
//        userRepository.save(user);

//        List<Doctor> doctorRadek = doctorService.findByName("Radek");
//        System.out.println(doctorRadek);
//        doctorRadek.forEach(s -> s.setSpecialty(Specialty.OKULISTA));
//        System.out.println("C L R");
//        System.out.println(doctorRadek);
//        Doctor doctorRadek2 = doctorRepository.findByName("Radek");
//        System.out.println(doctorRadek2);
//        doctorRadek2.setSpecialty(Specialty.CHIRURG);
//        System.out.println(doctorRadek2);
    }
}
