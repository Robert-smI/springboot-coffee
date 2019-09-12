package pl.bykowski.springbootcaffe;

import org.springframework.context.MessageSource;
import org.springframework.web.bind.annotation.*;

import java.util.Locale;

@RestController
public class HelloApi {

    private MessageSource messageSource;

//    @GetMapping("/sayhello")
//    public String get(@RequestHeader String local, @RequestParam String name, @RequestParam String surname ){
//        return messageSource.getMessage("welcome",
//                new Object[] {name, surname}, Locale.forLanguageTag(local));
//    }

    @GetMapping("/hello/{lang}")
    public String get(@PathVariable("lang") String lang) {
        if(lang.equals("PL"))
        {
            return "Cześć";
        }
        if(lang.equals("EN"))
        {
            return "Hello";
        }
        return "Niepojemaju";
    }


}
