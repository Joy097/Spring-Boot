package com.restapi.firstapi.services;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.restapi.firstapi.repository.userRepository;
import jakarta.transaction.Transactional;
import com.restapi.firstapi.exception.UserNotFound;
import com.restapi.firstapi.model.User;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private userRepository userRepository;

    @Override
    public User createUser(User user) {
        return userRepository.save(user);
        
    }

    @Override
    public User updateUser(User user) {
        Optional<User> Userdb = this.userRepository.findById(user.getId());
        if(Userdb.isPresent()) {
            User userUpdate = Userdb.get();
            userUpdate.setId(user.getId());
            userUpdate.setFirstName(user.getFirstName());
            userUpdate.setLastName(user.getLastName());
            userUpdate.setAge(user.getAge());
            userUpdate.setEmail(user.getEmail());
            userRepository.save(userUpdate);
            return userUpdate;
        
        }

        else {
            throw new UserNotFound("Record not found for id: " + user.getId());
        }
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
        }

    @Override
    
    public User getUserById(long uid) {
        Optional<User> Userdb = this.userRepository.findById(uid);        
        if(Userdb.isPresent()) {
            return Userdb.get();
        }
        else{
            throw new UserNotFound("Record not found for id: " + uid);
        }
        
    }

    @Override
    public void deleteUser(long uidDel) {
        Optional<User> Userdb = this.userRepository.findById(uidDel);        
        if(Userdb.isPresent()) {
            this.userRepository.delete(Userdb.get());
        }
        else{
            throw new UserNotFound("Record not found for id: " + uidDel);
        }
    }
}
