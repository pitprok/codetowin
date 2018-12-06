/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.hackathon2.repositories;

import com.bootcamp.hackathon2.entities.TestTable;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author pitpr
 */
public interface TestTableCrudRepository extends CrudRepository <TestTable,String> {
    
}
