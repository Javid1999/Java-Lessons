package Exam4.Service;

import Exam4.Domain.Customer;
import Exam4.Domain.User;
import Exam4.Repository.UserRepository;

public class CustomerService {
    private UserRepository userRepository;

    public CustomerService(  UserRepository userRepository) {
this.userRepository = userRepository;    }

    public Customer login(String email, String password){
User user = userRepository.findByEmail(email);
        if (user == null ){
            return null;
        }
        if (!user.getPassword().equals(password)){
            return null;
        }
        if (!(user instanceof  Customer)){
            return null;
        }
        return (Customer)user;
    }
}
