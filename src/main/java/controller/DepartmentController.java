package controller;

import java.util.List;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import bean.Department;
import service.StorageService;


@Path("/departments")
public class DepartmentController {

	StorageService storageService = new StorageService;
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
	public List<Department> getDepartment()
	{
		
		List<Department> listOfDepartments=storageService.getAllDepartments();
		return listOfDepartments;
	}

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public Country getDepartmentById(@PathParam("id") int id)
	{
		return storageService.getDepartment(id);
	}
   
    @POST
    @Produces(MediaType.APPLICATION_JSON)
	public Department addDepartment(Department department)
	{
		return departmentService.addDepartment(department);
	}

    @PUT
    @Produces(MediaType.APPLICATION_JSON)
	public Department updateDepartment(Department department)
	{
		return storageService.updateDepartment(department);
		
	}
	
    @DELETE
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
	public void deleteDepartment(@PathParam("id") int id)
	{
		 storageService.deleteDepartment(id);
		
	}
	
}
