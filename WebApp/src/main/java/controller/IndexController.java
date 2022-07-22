package controller;

import model.PersonModel;
import persistence.service.PersonService;
import persistence.service.PersonServiceImpl;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

//localhost/api/index/hello
@Path("/index")
public class IndexController {

    @Path("/hello")
    @GET
    public void sayHello() {
        System.out.println("Hello world!!!");
    }


//    @Path("/hello/{name}/{surname}")
//    @GET
//    public String sayHello(@PathParam("name") String ad,@PathParam("surname")String soyad){
//        return "Hello  " + ad + " " +soyad;
//    }



//    @Path("/hello")
//    @GET
//    public String sayHello(@QueryParam("name") String ad,@QueryParam("surname") String soyad) {
//        return "Hello  " + ad + " " + soyad;
//    }


/*
    @Path("/hello")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonModel sayHello(){
        PersonModel person = new PersonModel();
        person.setId(100);
        person.setName("Nazim");
        person.setSurname("Chobanli");
        return person;
    }


 */

    /*
    @Path("/hello")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    public PersonModel sayHello(@QueryParam("id") Integer id){
        return new PersonModel(id,"Eyyub","Qadirov");
    }

     */

    private PersonService personService = new PersonServiceImpl();

    @Path("/get")
    @GET
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public List<PersonModel> getAllPersons(){
        return personService.getAllPersons();
    }


    @Path("/add")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void add(PersonModel model){
        personService.addPerson(model);
    }

    @Path("/update")
    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public void update(PersonModel model){
        personService.updatePerson(model);
    }

    @Path("/id/{id}")
    @DELETE
    public void delete (@PathParam("id") Integer id){
        personService.deletePerson(id);
    }
}
