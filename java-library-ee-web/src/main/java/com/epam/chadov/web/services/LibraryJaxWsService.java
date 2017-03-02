package com.epam.chadov.web.services;

import javax.jws.WebMethod;
import javax.jws.WebService;

/**
 * @author Andrey_Chadov on 3/2/2017.
 */

@WebService
public class LibraryJaxWsService {

    private final String message = "Hello, ";

    public LibraryJaxWsService() {
    }

    @WebMethod
    public String sayHello(String name) {
        return message + name + ".";
    }
}
