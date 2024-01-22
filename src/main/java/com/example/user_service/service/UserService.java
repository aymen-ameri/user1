package com.example.user_service.service;

import com.example.user_service.VO.Department;
import com.example.user_service.VO.ResponseTemplateVO;
import com.example.user_service.entity.Userssz;
import com.example.user_service.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class UserService {
    @Autowired
    private UserRepo userRepo;
@Autowired
    private RestTemplate restTemplate;
    public Userssz saveuser(Userssz user)
    {
        return userRepo.save(user);
    }

    public ResponseTemplateVO getUserwitheDepartemtn(Long userid) {
        ResponseTemplateVO responseTemplateVO =new ResponseTemplateVO();
        Userssz user = userRepo.findByUserId(userid);
        Department department=
                restTemplate.getForObject
                        ("http://DEPARTEMENT-SERVICE/departement/"+ user.getDepartmentId(), Department.class);
        responseTemplateVO.setUser(user);
        responseTemplateVO.setDepartment(department);
        return responseTemplateVO;
    }
}
