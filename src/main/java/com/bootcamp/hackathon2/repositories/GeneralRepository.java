/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bootcamp.hackathon2.repositories;

import com.bootcamp.hackathon2.entities.TestTable;
import javax.persistence.EntityManager;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 *
 * @author pitpr
 */
@Repository
public class GeneralRepository {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public void insertToDatabase(TestTable testTable) {
        entityManager.persist(testTable);

    }

}
