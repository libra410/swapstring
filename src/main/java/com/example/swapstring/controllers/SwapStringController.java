package com.example.swapstring.controllers;

//import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.example.swapstring.services.LinkedListService;

@RestController
public class SwapStringController {

    private LinkedListService service = new LinkedListService();
    
    //@GetMapping(value = "/swapstring/{linklist}")
    @RequestMapping(value = "/swapstring/{linklist}", method = RequestMethod.GET)
    public String swapString(@PathVariable("linklist") String linklist) {
        return service.swapString(linklist);
    }
}