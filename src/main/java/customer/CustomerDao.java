package customer;

<<<<<<< HEAD
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.core.Response;
 
@Path("/hello")
public class CustomerDao {
 
	@GET
	@Path("/{param}")
	public Response getMsg(@PathParam("param") String msg) {
 
		String output = "Jersey say : " + msg;
 
		return Response.status(200).entity(output).build();
 
	}
 
}
=======
public class CustomerDao {

}
>>>>>>> 7a0b5ca0adc0b989daed9fce47f23c90d4a1a768
