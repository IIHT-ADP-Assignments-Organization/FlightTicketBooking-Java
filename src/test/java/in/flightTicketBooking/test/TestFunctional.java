package in.flightTicketBooking.test;

import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.flightTicketBooking.model.Flight;
import in.flightTicketBooking.model.User;
import in.flightTicketBooking.service.FlightService;
import in.flightTicketBooking.service.LoginService;
import in.flightTicketBooking.service.UserService;

public class TestFunctional {

	@Test
	public void testCreateUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserName("user23");
		user.setEmail("user@cdac.in");
		user.setUserPassword("1234567890");
		user.setConfirmedPassword("1234567890");
		user.setMobileNo("9876543210");
		user.setUserType("User");
		user.setCreattionDateTime("11-11-2019");
		user.setActive(true);

		int userId = user.getUserId();

		LoginService loginservice = (LoginService) context.getBean(LoginService.class);
		boolean userfromdb = loginservice.register(user);
		assertSame(userId, userfromdb);
		context.close();
	}

	@Test
	public void testGetUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);

		int userId = user.getUserId();

		UserService userservice = (UserService) context.getBean(UserService.class);
		User userfromdb = userservice.getUser(user.getUserId());
		assertSame(userId, userfromdb);
		context.close();
	}

	@Test
	public void testUpdateUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);
		user.setUserName("admin");
		user.setUserPassword("james");

		int userId = user.getUserId();

		UserService userservice = (UserService) context.getBean(UserService.class);
		boolean isUpdated = userservice.updateUser(user);
		assertSame(userId, isUpdated);
		context.close();
	}

	@Test
	public void testDeleteUser() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		User user = new User();
		user.setUserId(1);
		
		int userId = user.getUserId();

		UserService userservice = (UserService) context.getBean(UserService.class);
		boolean isDelete = userservice.deleteUser(user);
		assertSame(userId, isDelete);
		context.close();
	}

	@Test
	public void testCreateFlight() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Flight flight = new Flight();
		flight.setfId(1);
		flight.setFlightNo("AP23AJ6869");
		flight.setAirline("indigo");
		flight.setFrom("indigo");
		flight.setTo("indigo");
		flight.setStartDateTime("2020/05/05");
		flight.setEndDateTime("2020/05/05");
		flight.setScheduledDay("All Days");
		flight.setInstrumentUsed("Seat Tv");
		flight.setTotalBussinessSeats(12);
		flight.setTotalNonBussinessSeats(60);
		flight.setTickateCost(3000);
		flight.setNoOfRows("6");
		flight.setNoOfColumns("60");
		flight.setMeal("Non-Veg");

		int fId = flight.getfId();

		FlightService flightService = (FlightService) context.getBean(FlightService.class);
		int flightFromDB = flightService.saveFlight(flight);
		assertSame(fId, flightFromDB);
		context.close();
	}

	@Test
	public void testGetFlight() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Flight flight = new Flight();
		flight.setfId(1);

		int fId = flight.getfId();

		FlightService flightService = (FlightService) context.getBean(FlightService.class);
		Flight flightFromDB = flightService.getFlight(flight.getFrom(), flight.getTo());
		assertSame(fId, flightFromDB);
		context.close();
	}

	@Test
	public void testUpdateFlight() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Flight flight = new Flight();
		flight.setfId(1);

		int fId = flight.getfId();

		FlightService flightService = (FlightService) context.getBean(FlightService.class);
		boolean isUpdated = flightService.updateFlight(flight);
		assertSame(fId, isUpdated);
		context.close();
	}

	@Test
	public void testDeleteFlight() {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("application.xml");
		Flight flight = new Flight();
		flight.setfId(1);

		int fId = flight.getfId();

		FlightService flightService = (FlightService) context.getBean(FlightService.class);
		boolean isDelete = flightService.deleteFlight(flight);
		assertSame(fId, isDelete);
		context.close();
	}
}
