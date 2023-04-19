package com.vishnu.springbootproject1.controller;

import com.vishnu.springbootproject1.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/*@Controller
@ResponseBody*/
@RestController
public class HelloController {

   @RequestMapping("/abc")
    public String hello() {
       return "Hello World";
   }

    //@RequestMapping("/user")//By default it is get
    //@RequestMapping(name="/user",method= RequestMethod.GET)
    @GetMapping("/user")
    public User user()
    {
        User u=new User();
        u.setId(1);
        u.setName("Shabbir");
        u.setEmail("shabbir@gmail.com");
        return u;
    }
    @GetMapping("/{id}/{id2}")
    public String pathVariable(@PathVariable String id,@PathVariable("id2") String name)
    {
        return "The path variable is:"+id+":"+name;
    }

}
