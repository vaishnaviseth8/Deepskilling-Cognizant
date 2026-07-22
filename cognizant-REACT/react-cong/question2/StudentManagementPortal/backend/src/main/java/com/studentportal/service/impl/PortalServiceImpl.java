
package com.studentportal.service.impl;
import org.springframework.stereotype.Service;
import com.studentportal.service.PortalService;
@Service
public class PortalServiceImpl implements PortalService{
 public String home(){return "Welcome to the Home page of Student Management Portal";}
 public String about(){return "Welcome to the About page of the Student Management Portal";}
 public String contact(){return "Welcome to the Contact page of the Student Management Portal";}
}
