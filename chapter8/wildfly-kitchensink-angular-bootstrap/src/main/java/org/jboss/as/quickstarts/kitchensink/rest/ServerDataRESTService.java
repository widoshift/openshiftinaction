/*
 * JBoss, Home of Professional Open Source
 * Copyright 2014, Red Hat, Inc. and/or its affiliates, and individual
 * contributors by the @authors tag. See the copyright.txt in the
 * distribution for a full listing of individual contributors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jboss.as.quickstarts.kitchensink.rest;

import org.json.simple.JSONObject;
import org.json.simple.JSONArray;

import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.Set;
import java.util.logging.Logger;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.HttpHeaders;
import javax.ws.rs.core.MultivaluedMap;
import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * JAX-RS Example
 * <p/>
 * This class produces a RESTful service to read/write the contents of the members table.
 */
@Path("/serverdata")
@RequestScoped
public class ServerDataRESTService {

    @Inject
    private Logger log;

    @GET
    @Path("/ip")
    @Produces(MediaType.APPLICATION_JSON)
    public String getServerIP() {

          try {
              InetAddress inet = InetAddress.getLocalHost();
              String ip = inet.getHostAddress();
              String hostname = inet.getHostName();
              JSONObject toReturn = new JSONObject();
              toReturn.put("ip", ip);
              toReturn.put("hostname", hostname);
              return toReturn.toString();
          } catch (Exception e) {
              JSONObject toReturn = new JSONObject();
              toReturn.put("ip", "Unknown");
              toReturn.put("hostname", "Unknown");
              return toReturn.toString();
          }
    }
}
