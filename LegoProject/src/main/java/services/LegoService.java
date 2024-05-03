package services;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.ws.rs.Consumes;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.google.gson.JsonObject;

import data.*;


@Path("/legoservice")
public class LegoService {
	EntityManagerFactory emf=Persistence.createEntityManagerFactory("lego");	
	
	
	@Path("/setrun")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Runlego setValues(Runlego ls) {
		System.out.println(ls);
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(ls);
	    em.getTransaction().commit();		
		return ls;
	}
	
	@Path("/getrun")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public int getValues() {
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    TypedQuery<Integer> q=em.createQuery("select s.run from Runlego s order by s.Id desc", Integer.class).setMaxResults(1);
		List<Integer> list=q.getResultList();
		em.getTransaction().commit();		
		return list.get(0);
	}
	
	@Path("/getrun2")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public int getValues2() {
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    TypedQuery<Integer> q=em.createQuery("select s.run from Runlego s order by s.Id desc", Integer.class).setMaxResults(1);
		List<Integer> list=q.getResultList();
		em.getTransaction().commit();		
		return list.get(0);
	}
	
	@Path("/gettime")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String getLatestRun() {
		
		
	    EntityManager em = emf.createEntityManager();
	    TypedQuery<Runlego> query = em.createQuery(
	        "SELECT s FROM Runlego s ORDER BY s.time DESC", 
	        Runlego.class
	    );
	    query.setMaxResults(1);
	    Runlego latestRunlego = query.getSingleResult();
	    em.close();
	    
	    // Prepare JSON response with both run value and time
	    JsonObject responseJson = new JsonObject();
	    responseJson.addProperty("run", latestRunlego.getRun());
	    responseJson.addProperty("time", latestRunlego.getTime().toString());
	    
	    return responseJson.toString();
	}	



	
	@Path("/setobstaclevalues")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Obstacale setObstacleValues(Obstacale ls) {
		System.out.println(ls);
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(ls);
	    em.getTransaction().commit();		
		return ls;
	}
	
	@Path("/setfollow")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public FollowPath setFollowValues(FollowPath ls) {
		System.out.println(ls);
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(ls);
	    em.getTransaction().commit();		
		return ls;
	}
	
	
	@Path("/setcurrentspeed")
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CurrentSpeed setCurrentSpeed(CurrentSpeed ls) {
		System.out.println(ls);
	    EntityManager em=emf.createEntityManager();
	    em.getTransaction().begin();
	    em.merge(ls);
	    em.getTransaction().commit();		
		return ls;
	}
	
	 @GET
	    @Path("/latest")
	    @Produces(MediaType.APPLICATION_JSON)
	    public CurrentSpeed getLatestSpeeds() {
	        EntityManager em = emf.createEntityManager();
	        TypedQuery <CurrentSpeed> query = em.createQuery("SELECT c FROM CurrentSpeed c ORDER BY c.Id DESC", CurrentSpeed.class);
	        query.setMaxResults(1);
	        CurrentSpeed latestSpeed = query.getSingleResult();
	        em.close();
	        return latestSpeed;
	 }
	 
	 @GET
	    @Path("/getobstacle")
	    @Produces(MediaType.TEXT_PLAIN)
	    public String getObstacale() {
	        EntityManager em = emf.createEntityManager();
	        TypedQuery <Obstacale> query = em.createQuery("SELECT c FROM Obstacale c ORDER BY c.Id DESC", Obstacale.class);
	        query.setMaxResults(1);
	        Obstacale obs = query.getSingleResult();
	        em.close();
	        return obs.toString();
	 }
	 

		@Path("/getobs")
		@GET
		@Produces(MediaType.APPLICATION_JSON)
		public String getObsCount() {
			
			
		    EntityManager em = emf.createEntityManager();
		    TypedQuery<Obstacale> query = em.createQuery(
		        "SELECT c FROM Obstacale c ORDER BY c.Id DESC", 
		        Obstacale.class
		    );
		    query.setMaxResults(1);
		    Obstacale latestRunlego = query.getSingleResult();
		    em.close();
		    
		    // Prepare JSON response with both run value and time
		    JsonObject responseJson = new JsonObject();
		    responseJson.addProperty("obtacalCount", latestRunlego.getObtacalCount());
		    
		    
		    return responseJson.toString();
		}
	@Path("/getfollow/{inid}")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getfollowValues(@PathParam("inid") int id) {
		 EntityManager em=emf.createEntityManager();
		    em.getTransaction().begin();
		    
		   // Query q = em.createQuery("SELECT s FROM FollowPath s WHERE s.Id IN (SELECT MAX(s1.Id) FROM FollowPath s1 GROUP BY s1.targetIntensityRange) ORDER BY s.Id DESC");
		    Query q = em.createQuery("SELECT s FROM FollowPath s WHERE s.targetIntensityRange= :id ORDER BY s.Id DESC ").setMaxResults(1);
		    q.setParameter("id", id);

		    List<FollowPath> list=q.getResultList();
			em.getTransaction().commit();		
			return list.toString();
	}
	@Path("/getfollow/")
	@GET
	@Produces(MediaType.TEXT_PLAIN)
	public String getfollowValues() {
		 EntityManager em=emf.createEntityManager();
		    em.getTransaction().begin();
		    
		   Query q = em.createQuery("SELECT s FROM FollowPath s WHERE s.Id IN (SELECT MAX(s1.Id) FROM FollowPath s1 GROUP BY s1.targetIntensityRange) ORDER BY s.targetIntensityRange ");
		   // Query q = em.createQuery("SELECT s FROM FollowPath s WHERE s.targetIntensityRange= :id ORDER BY s.Id DESC ").setMaxResults(1);
		   // q.setParameter("id", id);

		    List<FollowPath> list=q.getResultList();
			em.getTransaction().commit();		
			return list.toString();
	}
	
	@GET
    @Path("/getmotorspeeds/{leftSpeed}/{rightSpeed}")
    @Produces(MediaType.APPLICATION_JSON)
    public FollowPath getMotorSpeeds(@PathParam("leftSpeed") int leftSpeed, @PathParam("rightSpeed") int rightSpeed) {
        return new FollowPath(leftSpeed, rightSpeed);
    }
	

}
