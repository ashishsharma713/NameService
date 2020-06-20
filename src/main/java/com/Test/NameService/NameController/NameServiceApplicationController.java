package com.Test.NameService.NameController;

import com.Test.NameService.NameEntity.Name;
import com.Test.NameService.NameEntity.ResponseClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@RestController
@RequestMapping("/api")
public class NameServiceApplicationController {

    @Autowired
    private Name finalName;
    @Autowired
    private ResponseClass resp;

    private static final Logger LOGGER = LoggerFactory.getLogger(NameServiceApplicationController.class);
    @PostMapping(path = "name", consumes = "application/json", produces = "application/json")
    public ResponseEntity<?>getCombinedName(@RequestBody Name name)
    {

        finalName=new Name();
        resp=new ResponseClass();
        finalName.setName(name.getName());
        finalName.setSurname(name.getSurname());
        resp.setName(finalName.toString());
        LOGGER.debug("Name "+name.getName() + "surname"+name.getSurname());
        return new ResponseEntity<ResponseClass>(resp,HttpStatus.OK);

    }

}
