/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.hackathon2.controllers;

import com.bootcamp.hackathon2.repositories.TestTableCrudRepository;
import com.bootcamp.hackathon2.entities.TestTable;
import com.bootcamp.hackathon2.repositories.GeneralRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author pitpr
 */
@Controller
public class GeneralController {
    
    @Autowired
    GeneralRepository generalRepository;
    
    @Autowired
    TestTableCrudRepository testTableCrudRepository;
    
    @RequestMapping(value="/")
    public String indexController(){
        
        return "index";
    }
    
    @RequestMapping(value="/home")
    public String homeController(){
        TestTable testTable=new TestTable();
        testTable.setName("tekis=");
        generalRepository.insertToDatabase(testTable);
        return "home";
    }
    
      @RequestMapping(value="/home2")
    public String homeController2(){
        TestTable testTable=new TestTable();
        testTable.setName("terlekis=");
        testTableCrudRepository.save(testTable);
        testTable.setId(3);
        testTableCrudRepository.delete(testTable);
        return "home";
    }
    
}
