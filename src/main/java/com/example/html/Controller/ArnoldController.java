package com.example.html.Controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ArnoldController {

  @GetMapping("/")
  public String index(){
    return "index";

    }

    @GetMapping("/about")
    public String about(){
    return "about";
    }

    @GetMapping("/box")
  public String box(){
    return "Boxes";
    }

}
