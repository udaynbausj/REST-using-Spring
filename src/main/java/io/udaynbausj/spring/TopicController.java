package io.spring.java.springjpa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private TopicService topicService;


    //following function makes a get request
    @RequestMapping(value = "/",method = RequestMethod.GET)
    public ResponseEntity<?> home(){
        return new ResponseEntity<UserInfo>(topicService.BasicUserInfo(), HttpStatus.OK);
    }

    //following function makes a get request to fetch all topics
    @RequestMapping(value="/topics",method=RequestMethod.GET)
    public List<Topic> getTopics(){
        return topicService.getTopics();
    }

    //following function makes a get request to a particular id
    @RequestMapping(value = "/topics/{id}",method = RequestMethod.GET)
    public Topic getTopicWithId(@PathVariable long id){
        return topicService.getTopicWithId(id);
    }
//
//    @RequestMapping(value="/topics/{name}",method = RequestMethod.GET)
//    public Topic getTopicWithName(@PathVariable String name){
//        return topicService.getTopicWithName(name);
//    }


    @RequestMapping(value = "/topics",method=RequestMethod.POST)
    public void postTopics(@RequestBody Topic topic){
        topicService.postTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.PUT)
    public ResponseEntity<?> putTopic(@RequestBody Topic topic,@PathVariable long id){
        return topicService.putTopicWithId(topic,id);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.DELETE)
    public ResponseEntity<?> deleteTopic(@PathVariable long id){
        return topicService.deleteTopicWithId(id);
    }
}
