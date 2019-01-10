package io.udaynbausj.spring;

import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
@Service
public class UserService{
    private List<userinfo>l = Arrays.asList(new userinfo("Uday","Mac",20,"Python"));
    public List<userinfo> getUserInfo(){
        return l;
    }
}