package ap2.com.ap2.controllers;

import ap2.com.ap2.model.ClientModel;
import ap2.com.ap2.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/clients")
public class ClientController {
    private ClientService clientService;
    @Autowired
    public ClientController(ClientService userService){
        this.clientService = userService;
    }
    @GetMapping()
    public ArrayList<ClientModel> getAll(@RequestParam(name = "age", required = false) Integer age){
        return this.clientService.getAll(age);
    }
    @GetMapping("/{id}")
    public ClientModel getById(@PathVariable int id){
        return this.clientService.getById(id);
    }
    @PostMapping
    public String store(@RequestBody ClientModel clientData){
        return this.clientService.store(clientData);
    }
    @PutMapping("/{id}")
    public String update(@RequestBody ClientModel clientData,@PathVariable int id){
        return this.clientService.update(clientData,id);
    }
    @DeleteMapping("/{id}")
    public String delete(@PathVariable int id){
        return this.clientService.delete(id);
    }
}
