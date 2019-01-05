package hello;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class QuoteApi {
    @RequestMapping("/quote")
    public Quote finalget(){
        RestTemplate restTemplate = new RestTemplate();
        Quote q = restTemplate.getForObject("http://gturnquist-quoters.cfapps.io/api/random", Quote.class);
        return q;
    }
}
