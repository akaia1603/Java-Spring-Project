package vn.hoidanit.laptopshop.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import vn.hoidanit.laptopshop.domain.User;
import vn.hoidanit.laptopshop.repository.UserRepository;

@Service
public class UserService {
    private final UserRepository userRepository;
    public String handleHello(){
        return "Hello from controller";
    }
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }
    public List<User> getAllUsers(){
        return this.userRepository.findAll();
    }
    public List<User> getAllUsersByEmail(String Email){
        return this.userRepository.findByEmail(Email);
    }
    public User handleSaveUser(User user){
        User eric = this.userRepository.save(user);
        return eric;
    }

    public User getUserById(Long id){
        return this.userRepository.findById(id).orElseThrow(() -> new RuntimeException("Không tìm thấy user"));
    }

    public void deleteAUser(long id){
        this.userRepository.deleteById(id);
    }
}
