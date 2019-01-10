package io.udaynbausj.spring;

public class userinfo {
    private String name;
    private String pcName;
    private int id;
    private String favoriteProgrammingLanguage;


    public userinfo(String name,String pcName,int id,String favoriteProgrammingLanguage){
        this.name = name;
        this.pcName = pcName;
        this.id = id;
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }


    public void setId(int id){
        this.id = id;
    }

    public int getId(){
        return id;
    }
    public void setPcName(String pcName){
        this.pcName = pcName;
    }

    public String getPcName(){
        return pcName;
    }

    public void setFavoriteProgrammingLanguage(String favoriteProgrammingLanguage){
        this.favoriteProgrammingLanguage = favoriteProgrammingLanguage;
    }

    public String getFavoriteProgrammingLanguage(){
        return favoriteProgrammingLanguage;
    }
}
