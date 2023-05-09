package com.testone.testone.service;

import com.testone.testone.entities.User;
import com.testone.testone.entities.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

import java.awt.print.Pageable;
import java.io.IOException;
import java.util.List;

@Service
public class UserService {
@Autowired
private UserRepository userRepository;

public List<User> getUserList(Integer pageSize, Integer pageNumber) throws Exception {
try{
    System.out.println("getUserList Sucessfully fetched.");



                 return userRepository.findAll();
}catch(Exception e){
            e.printStackTrace();
            System.out.println("getUserList exception.");
            throw e;
        }
}
}
