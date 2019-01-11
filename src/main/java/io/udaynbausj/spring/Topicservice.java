package io.spring.java.springjpa;

import org.apache.coyote.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class TopicService {
    private UserInfo userInfo = new UserInfo(20,"Uday","Anantapur","Mac","Python");

    public UserInfo BasicUserInfo(){
        return userInfo;
    }

    private List<Topic>topics = new ArrayList<Topic>(Arrays.asList(new Topic("C","Good",1),
            new Topic("Java","Stable",2),
            new Topic("Python","Strong",3)));
    public List<Topic> getTopics(){
        return topics;
    }

    public Topic getTopicWithId(long id){
        for(int i = 0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId()==id){
                return t;
            }
        }
        return new Topic("NULL","NULL",0);
    }

//    public Topic getTopicWithName(String name){
//        for(int i = 0;i<topics.size();i++){
//            Topic t = topics.get(i);
//            if(t.getName().equals(name)){
//                return t;
//            }
//        }
//        return new Topic("NULL","NULL",0);
//    }


    public void postTopic(Topic topic){
        topics.add(topic);
    }

    public ResponseEntity<?> putTopicWithId(Topic topic, long id){
        if(id>topics.size()){
            Map<String, String>map = new HashMap<>();
            map.put("PUT","Failed");
            return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
        }else{
            for(int i = 0;i<topics.size();i++){
                Topic t = topics.get(i);
                if(t.getId()==id){
                    topics.add(i,topic);
                    Map<String,String> response = new HashMap<>();
                    response.put("Update","Success");
                    return new ResponseEntity<>(response, HttpStatus.OK);
                }
            }
            Map<String,String>response = new HashMap<>();
            response.put("Update","Failed");
            return new ResponseEntity<>(response,HttpStatus.BAD_REQUEST);
        }
    }



    public ResponseEntity<?> deleteTopicWithId(long id){
        for(int i =0;i<topics.size();i++){
            Topic t = topics.get(i);
            if(t.getId()==id){
                topics.remove(t);
                Map<String,String>map = new HashMap<>();
                map.put("Delete","Success");
                return new ResponseEntity<>(map,HttpStatus.OK);
            }
        }
        Map<String,String>map = new HashMap<>();
        map.put("Delete","Failed");
        return new ResponseEntity<>(map,HttpStatus.BAD_REQUEST);
    }

}
