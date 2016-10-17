package es.upm.miw.apiArchitectureSport;

import es.upm.miw.apiArchitectureSport.api.UserResource;
import es.upm.miw.apiArchitectureSport.api.SportResource;
import es.upm.miw.apiArchitectureSport.exceptions.ExistingSportException;
import es.upm.miw.apiArchitectureSport.exceptions.ExistingUserException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidRequestException;
import es.upm.miw.apiArchitectureSport.exceptions.InvalidFieldException;
import es.upm.miw.web.http.HttpRequest;
import es.upm.miw.web.http.HttpResponse;
import es.upm.miw.web.http.HttpStatus;

public class Dispatcher {

	private UserResource userResource = new UserResource();
	private SportResource sportResource = new SportResource();

	private void responseError(HttpResponse response, Exception e) {
		response.setBody("{\"error\":\"" + e + "\"}");
		response.setStatus(HttpStatus.BAD_REQUEST);
	}

	public void doGet(HttpRequest request, HttpResponse response) {
		// **/users
		if ("users".equals(request.getPath())) {
			response.setBody(userResource.userList().toString());
			// **/users/search?sport=*
		} else if ("users".equals(request.paths()[0]) && "search".equals(request.paths()[2])) {
			try {

			} catch (Exception e) {
				responseError(response, e);
			}
		} else {
			responseError(response, new InvalidRequestException(request.getPath()));
		}
	}

	public void doPost(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		// POST **/users body="nick:email"
		case "users":
			// Injectar parámetros...
			String nick = request.getBody().split(":")[0];
			String email = request.getBody().split(":")[1];
			try {
				userResource.createUser(nick, email);
				response.setStatus(HttpStatus.CREATED);
			} catch (ExistingUserException | InvalidFieldException e) {
				this.responseError(response, e);
			}	
			break;
		// POST sports body="name"
		case "sports":
			try {
				sportResource.createSport(request.getBody());
				response.setStatus(HttpStatus.CREATED);
			} catch (InvalidFieldException | ExistingSportException e) {
				responseError(response, e);
			}
			break;
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doPut(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		// PUT /users/{nick}/sport
		case "users/uno/sport":
			if ("users".equals(request.paths()[0]) && "sport".equals(request.paths()[2])) {
				String sportName = request.getBody();
				response.setBody(userResource.updateSportList(request.paths()[1], sportName));
				response.setStatus(HttpStatus.CREATED);
				
				
			}else {
				System.out.println("AQUI");
				responseError(response, new InvalidRequestException(request.getPath()));
			}
			break;
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

	public void doDelete(HttpRequest request, HttpResponse response) {
		switch (request.getPath()) {
		default:
			responseError(response, new InvalidRequestException(request.getPath()));
			break;
		}
	}

}
