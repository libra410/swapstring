package com.example.swapstring.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.nio.charset.StandardCharsets;
import java.util.Base64;
import com.example.swapstring.services.LinkedListService;

@RestController
public class SwapStringController {

    private LinkedListService service = new LinkedListService();
    
    @GetMapping(value = "/swapstring/{linklist}")
    public String swapString(@PathVariable("linklist") String linklist) {
        byte[] decodeData = Base64.getDecoder().decode(linklist);
        String strArray = new String(decodeData, StandardCharsets.UTF_8);
        String[] arrOfStr = strArray.split("->");
        for(int i=0;i < arrOfStr.length; i++){
            service.push(Integer.parseInt(arrOfStr[i]));
        }
        service.pairWiseSwap(); 
        return service.printList();
    }
}