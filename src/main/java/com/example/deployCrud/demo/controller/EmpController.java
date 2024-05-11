package com.example.deployCrud.demo.controller;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")
public class EmpController {
@GetMapping
public String open(){
    return "Hello Rafiul Abeer Khan. Congrats on your first deploy";
}
    //Get
    @GetMapping("/{id}")
    public String getEmployeeById(){
        return "Abeer";
    }

    //Post
    @PostMapping
    public String addEmployee( ){
        return "" ;
    }
    //GetAll
    @GetMapping("/getAll")
    public String getAllEmployees(){
        return "Get_All_Method_Returned";
    }
    //Put
//@PostMapping
//    public String allAccess(@RequestParam() String abc){
//        return abc;
//}
    //Delete
    @DeleteMapping("/{id}")
    public void deleteEmployeeById(@PathVariable("id")Long id){
        deleteEmployeeById(id);
    }

}
