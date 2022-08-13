package com.example.myusercontrollers.Controllers;

import com.example.myusercontrollers.model.Empolyees;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.*;


import javax.validation.Valid;
import java.util.ArrayList;

@RestController
public class EmpolyeeController {

ArrayList<Empolyees> empolyees =new ArrayList<>();
@GetMapping("/empolyee")
    public ArrayList<Empolyees>getEmpolyees(){
    return empolyees;
    }

    @PostMapping("/empolyee")
    public ResponseEntity addEmpolyees(@RequestBody @Valid Empolyees empolyees , Errors errors){
    if(errors.hasErrors()){
        String message=errors.getFieldError().getDefaultMessage();
        return ResponseEntity.status(400).body(new ApiResponse(message,400));
    }
    empolyeesList.add(empolyees);
    return "New empolyee added to the list ";
    }
    @PutMapping("/empolyee/{index}")
    public ResponseEntity updateEmpolyees(@RequestBody Empolyees empolyees ,@PathVariable int index) {

        return null;
    }
    private class Api {
        public Api(String message, int i) {
            Employees emp=employees.get(index);
            int empannuals=emp.getannualLeave();
            if(emp.isonLeave()){
                return ResponseEntity.status(400).body(new Api("you have already on leave",400));
            }
            if(emp.getAnnualLeave()==0){
                return ResponseEntity.status(400).body(new Api("You don't have leave days",400));
            }
            emp.setOnLeave(true);
            emp.setannualLeave(empannuals-1);

            return  ResponseEntity.status(200).body(new Api("your leave has been granted ",200));


        }
    }
}
