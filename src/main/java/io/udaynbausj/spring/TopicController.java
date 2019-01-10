package io.udaynbausj.spring;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Iterator;
import java.util.List;

@RestController
public class TopicController {
    @Autowired
    private Topicservice topicservice;
    @RequestMapping("/topics")
    public List<Topic> getAll(){
        return topicservice.getAlltopics();
    }
    @RequestMapping("/topics/{id}")
    public Topic getTopic(@PathVariable String id){
        return topicservice.getTopic(id);
    }

    @RequestMapping(value = "/topics",method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        topicservice.addTopic(topic);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.PUT)
    public void updateTopic(@RequestBody Topic topic,@PathVariable String id){
        topicservice.updateTopic(topic,id);
    }

    @RequestMapping(value = "/topics/{id}",method = RequestMethod.DELETE)
    public void deleteTopic(@PathVariable String id){
        topicservice.deleteTopic(id);
    }
}
