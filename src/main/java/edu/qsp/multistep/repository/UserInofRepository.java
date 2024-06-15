package edu.qsp.multistep.repository;
import org.springframework.data.jpa.repository.JpaRepository;

import edu.qsp.multistep.model.UserInfo;

public interface  UserInofRepository extends JpaRepository<UserInfo, String> {
    UserInfo findByName(String name);
    UserInfo findByEmail(String email);
    UserInfo findByPhone(String Number);
    
}
