package com.myorg.sam.controller;

import com.myorg.sam.entity.MyEntity;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;
import java.util.Set;

@Api(value = "Course information", description = "Api related to course information")
@Controller
public class MyController {

    @ApiOperation(value = "view all courses")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public ResponseEntity<MyEntity> get() {
        MyEntity m = new MyEntity();
        m.setAge(10);
        m.setName("test");
        m.setId(2);
        return ResponseEntity.ok(m);
    }

}
