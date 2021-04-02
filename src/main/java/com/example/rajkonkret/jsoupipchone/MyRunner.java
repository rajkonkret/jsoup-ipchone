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
import java.util.Optional;

@Component
public class MyRunner implements CommandLineRunner {
    @Autowired
    private DoctorRepository doctorRepository;

    @Autowired
    private UserService userService;

    @Autowired
    UserRepository userRepository;

    @Autowired
    VisitRepository visitRepository;


    @Override
    public void run(String... args) throws Exception {

//        User2 user = new User2();
//        user.setName("Radek");
//
//        Visit visit = new Visit();
//        visit.setDateOfVisit(LocalDate.now());
//        visit.setTypeOfVisit(TypeOfVisit.KONSULTACJA);
//        visit.setStatus(StatusYourVisit.ORDERED);
//        user.addVisit(visit);
//
//        userRepository.save(user);
//
//        User2 user2 = new User2();
//        user2.setName("Radito");
//
//        Visit visit1 = new Visit();
//        visit1.setDateOfVisit(LocalDate.now());
//        visit1.setTypeOfVisit(TypeOfVisit.KONSULTACJA);
//        visit1.setStatus(StatusYourVisit.FINISHED);
//        user2.addVisit(visit1);
//        userRepository.save(user2);
//
//
//        Visit visit2 = new Visit();
//        visit2.setDateOfVisit(LocalDate.now());
//        visit2.setTypeOfVisit(TypeOfVisit.ZABIEG);
//        visit2.setStatus(StatusYourVisit.FINISHED);
//        Visit visit3 = new Visit();
//        visit3.setDateOfVisit(LocalDate.now());
//        visit3.setTypeOfVisit(TypeOfVisit.RECEPTA);
//        visit3.setStatus(StatusYourVisit.FINISHED);
//        Optional<User2> user3 = userRepository.findById(1L);
//        System.out.printf(user3.get().toString());
//        user3.get().addVisit(visit2);
//        user3.get().addVisit(visit3);
//        userRepository.save(user3.get());
//        Doctor doctor = new Doctor(
//                "fra", "kjres", Specialty.OGÓLNY);
//        System.out.println(doctor);
//        doctorRepository.save( );
//        User2 user1 = new User2();        userRepository.save(user);

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
        System.out.println("test");
    }
}
