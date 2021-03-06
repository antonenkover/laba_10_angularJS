package controller;

import javax.ws.rs.core.Response;
import javax.ws.rs.core.Response.Status;
import javax.ws.rs.ext.ExceptionMapper;
import javax.ws.rs.ext.Provider;

import bean.ExceptionMessage;
import exception.DepartmentNotFoundException;

@Provider
public class DepartmentNotFoundExceptionMapper implements ExceptionMapper<DepartmentNotFoundException> {

    @Override
    public Response toResponse(CountryNotFoundException cnfe) {

        ExceptionMessage exceptionMessage = new ExceptionMessage(cnfe.getExceptionMessage(), "404");
        return Response.status(Status.NOT_FOUND).entity(exceptionMessage).build();
    }


}
