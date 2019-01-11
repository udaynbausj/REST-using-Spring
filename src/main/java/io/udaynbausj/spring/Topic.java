package io.spring.java.springjpa;

public class Topic {
    private String name;
    private String description;
    private long id;
    public Topic(){}

    public Topic(String name,String description,long id){
        this.name = name;
        this.description = description;
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }
    public void setDescription(String description){
        this.description = description;
    }
    public void setId(long id){
        this.id = id;
    }
    public String getName(){
        return name;
    }
    public String getDescription(){
        return description;
    }
    public long getId(){
        return id;
    }
}
