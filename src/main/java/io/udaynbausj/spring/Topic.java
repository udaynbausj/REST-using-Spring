package io.udaynbausj.spring;

public class Topic {
    private String id;
    private String name;
    private String description;

    public Topic(){}

    public Topic(String id,String name,String description){
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getId(){
        return id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setDescription(String description){
        this.description = description;
    }

    public String getDescription(){
        return description;
    }

}
