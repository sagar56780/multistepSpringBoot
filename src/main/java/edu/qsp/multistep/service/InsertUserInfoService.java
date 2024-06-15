package edu.qsp.multistep.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.qsp.multistep.model.UserInfo;
import edu.qsp.multistep.repository.UserInofRepository;

@Component
public class InsertUserInfoService {

    @Autowired
    UserInofRepository userinfRepository;
    public Boolean createUser(UserInfo userinfo)
    { 

        try {   
             userinfRepository.save(userinfo);
            
        } catch (IllegalArgumentException e) {
            return  false;
        }
        return  true;
        
     
         
    }

        
    
}
