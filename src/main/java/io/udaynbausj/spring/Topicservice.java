package io.udaynbausj.spring;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Arrays;
import org.springframework.stereotype.Service;

@Service
public class Topicservice {
    private List<Topic>list = new ArrayList<Topic>(Arrays.asList(new Topic("1","java","good"),
            new Topic("2","python","Aaawesomee"),
            new Topic("3","C++","Best")));
    public List<Topic> getAlltopics(){
        return list;
    }

    public Topic getTopic(String id){
        Iterator itr = list.iterator();
        while(itr.hasNext()){
            Topic t = (Topic) itr.next();
            if(t.getId().equals(id)){
                return t;
            }
        }
        return new Topic("Not valid","Not in database","NULL");
    }

    public void addTopic(Topic topic){
        list.add(topic);
    }

    public void updateTopic(Topic topic,String id){
        for(int i = 0;i<list.size();i++){
            Topic t = list.get(i);
            if(t.getId().equals(id)){
                list.set(i,topic);
            }
        }
    }

    public void deleteTopic(String id){
        for(int i = 0;i<list.size();i++){
            Topic t = list.get(i);
            if(t.getId().equals(id)){
                list.remove(t);
            }
        }
    }
}
