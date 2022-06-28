package com.example.demo.controllerBud;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.modelBud.Modelbud;
import com.example.demo.repoBud.RepoBud;
import org.springframework.web.bind.annotation.GetMapping;



@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ControllerBud {

    @Autowired
    private RepoBud repo;

    @PostMapping("/cus")
	public Modelbud createModel(@RequestBody Modelbud modelBud) {
		return repo.save(modelBud);
	}
    @GetMapping("/cus")
	public List<Modelbud> getModel(){
		return repo.findAll();
	}
    
    
}
