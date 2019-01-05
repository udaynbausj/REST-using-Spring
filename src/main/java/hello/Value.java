package hello;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Value {
    private String quote;
    private long id;

    public void setQuote(String quote){
        this.quote = quote;
    }

    public String getQuote(){
        return quote;
    }

    public void setId(long id){
        this.id = id;
    }

    public Long getId(){
        return id;
    }

    @Override
    public String toString(){
        return "Value { \n"+"id : "+id+"\n"+"Quote : "+quote;
    }

}
