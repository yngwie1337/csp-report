package com.yngwie.rest.reportService;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.Response;

@Path("/report")
public class ReportRestService {
    @POST
    public Response report(@Context HttpServletRequest headers, Report report) {
        CSPReport cspReport = report.getCspReport();
        System.out.println(String.format("%.100s %.100s %.100s %.100s %.100s %.100s", cspReport.getDocumentURI(),
                cspReport.getReferrer(), cspReport.getBlockedURI(), cspReport.getViolatedDirective(),
                cspReport.getOriginalPolicy(), cspReport.getDisposition()));
        return Response.status(201).entity(report).build();
    }
}