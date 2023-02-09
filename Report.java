package com.yngwie.rest.reportService;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Report {
    private CSPReport cspReport;

    public void setCspReport(CSPReport cspReport) {
        this.cspReport = cspReport;
    }

    @XmlElement(name = "csp-report")
    public CSPReport getCspReport() {
        return this.cspReport;
    }
}
