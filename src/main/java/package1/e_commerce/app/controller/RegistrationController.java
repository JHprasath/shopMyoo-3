//package package1.e_commerce.app.controller;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.crypto.password.PasswordEncoder;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//import package1.e_commerce.app.model.MyAppUser;
//import package1.e_commerce.app.repository.MyAppUserRepository;
//@CrossOrigin(origins = "http://localhost:3000")
//@RestController
//public class RegistrationController {
//    @Autowired
//    private MyAppUserRepository myAppUserRepository;
//    @Autowired
//    private PasswordEncoder passwordEncoder;
//    @PostMapping(value = "/reg/signup", consumes = "application/json")
//    public MyAppUser CreateUser(@RequestBody MyAppUser user){
//        user.setPassword(passwordEncoder.encode(user.getPassword()));
//        return myAppUserRepository.save(user);
//    }
//}
