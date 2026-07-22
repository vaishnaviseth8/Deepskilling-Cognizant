
package com.studentportal.controller;
import org.springframework.web.bind.annotation.*;
import com.studentportal.service.PortalService;
@RestController
@CrossOrigin(origins="http://localhost:3000")
@RequestMapping("/api")
public class PortalController{
 private final PortalService service;
 public PortalController(PortalService service){this.service=service;}
 @GetMapping("/home") public String home(){return service.home();}
 @GetMapping("/about") public String about(){return service.about();}
 @GetMapping("/contact") public String contact(){return service.contact();}
}
