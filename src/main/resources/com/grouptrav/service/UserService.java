package com.grouptrav.service;
import java.util.ArrayList;
import java.util.List;
 
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.grouptrav.model.User;

@Path("/users")
public class UserService {
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
 public List getUsers()
 {
  List listOfUsers = new ArrayList();
  listOfUsers=createUserList();
  return listOfUsers;
 }
 
 @GET
    @Path("{email: [A-Z0-9._%-]+@[A-Z0-9._%-]+\.[A-Z]{2,4}}")
    @Produces(MediaType.APPLICATION_JSON)
 public Country getCountryById(@PathParam("Email") String email)
 {
  List listOfUsers = new ArrayList();
  listOfUsers=createUserList();
 
  for (User usr: listOfUsers) {
   if(usr.getEmail()==email)
    return usr;
  }
  
  return null;
 }
 
//Utiliy method to create country list.
public List createUserList()
{
	User madhu=new User("mekala.madhu@gmail.com", "madhu");
	User krishna=new User("Krishna.avva@gmail.com", "krishna");	

	List listOfUsers = new ArrayList();
	listOfUsers.add(madhu);
	listOfUsers.add(krshna);
	return listOfUsers;
}

}
