package thymleaf.demo.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import thymleaf.demo.entity.Student;

@Controller
@RequestMapping("/layouts/")
public class LayoutController {


    @GetMapping("page1")
    public String getLayoutContent1() {
        return "my-content-1";
    }


    @GetMapping("page2")
    public String getLayoutContent2() {
        return "my-content-2";
    }


}
