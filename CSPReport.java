package com.yngwie.rest.reportService;

import javax.xml.bind.annotation.XmlElement;

public class CSPReport {
    private String documentURI;
    private String referrer;
    private String blockedURI;
    private String violatedDirective;
    private String originalPolicy;
    private String disposition;

    public void setDocumentURI(String documentURI) {
        this.documentURI = documentURI;
    }

    @XmlElement(name = "document-uri")
    public String getDocumentURI() {
        return this.documentURI;
    }

    public void setReferrer(String referrer) {
        this.referrer = referrer;
    }

    @XmlElement(name = "referrer")
    public String getReferrer() {
        return this.referrer;
    }

    public void setBlockedURI(String blockedURI) {
        this.blockedURI = blockedURI;
    }

    @XmlElement(name = "blocked-uri")
    public String getBlockedURI() {
        return this.blockedURI;
    }

    public void setViolatedDirective(String violatedDirective) {
        this.violatedDirective = violatedDirective;
    }

    @XmlElement(name = "violated-directive")
    public String getViolatedDirective() {
        return this.violatedDirective;
    }

    public void setOriginalPolicy(String originalPolicy) {
        this.originalPolicy = originalPolicy;
    }

    @XmlElement(name = "original-policy")
    public String getOriginalPolicy() {
        return this.originalPolicy;
    }

    public void setDisposition(String disposition) {
        this.disposition = disposition;
    }

    @XmlElement(name = "disposition")
    public String getDisposition() {
        return this.disposition;
    }
}
