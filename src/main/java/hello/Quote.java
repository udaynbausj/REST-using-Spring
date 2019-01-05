package hello;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@JsonIgnoreProperties(ignoreUnknown = true)

public class Quote {
    private String type;
    private Value value;
    public String getType(){
        return this.type;
    }
    public void setType(String type){
        this.type = type;
    }
    public void setValue(Value val){
        value = val;
    }
    public Value getValue() {
        return this.value;
    }
    @Override
    public String toString(){
        return "Quote{" +
                "type : " + this.type+"\nValue : "+this.value+"\n}";
    }



}
