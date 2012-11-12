
package com.microsoft.schemas.sharepoint.soap;

/**
 * Please modify this class to meet your needs
 * This class is not complete
 */

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 * This class was generated by Apache CXF 2.7.0
 * 2012-11-10T16:48:45.401+01:00
 * Generated source version: 2.7.0
 * 
 */
public final class PeopleSoap_PeopleSoap12_Client {

    private static final QName SERVICE_NAME = new QName("http://schemas.microsoft.com/sharepoint/soap/", "People");

    private PeopleSoap_PeopleSoap12_Client() {
    }

    public static void main(String args[]) throws java.lang.Exception {
        URL wsdlURL = People.WSDL_LOCATION;
        if (args.length > 0 && args[0] != null && !"".equals(args[0])) { 
            File wsdlFile = new File(args[0]);
            try {
                if (wsdlFile.exists()) {
                    wsdlURL = wsdlFile.toURI().toURL();
                } else {
                    wsdlURL = new URL(args[0]);
                }
            } catch (MalformedURLException e) {
                e.printStackTrace();
            }
        }
      
        People ss = new People(wsdlURL, SERVICE_NAME);
        PeopleSoap port = ss.getPeopleSoap12();  
        
        {
        System.out.println("Invoking isClaimsMode...");
        boolean _isClaimsMode__return = port.isClaimsMode();
        System.out.println("isClaimsMode.result=" + _isClaimsMode__return);


        }
        {
        System.out.println("Invoking searchPrincipals...");
        java.lang.String _searchPrincipals_searchText = "";
        int _searchPrincipals_maxResults = 0;
        java.util.List<java.lang.String> _searchPrincipals_principalType = null;
        com.microsoft.schemas.sharepoint.soap.ArrayOfPrincipalInfo _searchPrincipals__return = port.searchPrincipals(_searchPrincipals_searchText, _searchPrincipals_maxResults, _searchPrincipals_principalType);
        System.out.println("searchPrincipals.result=" + _searchPrincipals__return);


        }
        {
        System.out.println("Invoking resolvePrincipals...");
        com.microsoft.schemas.sharepoint.soap.ArrayOfString _resolvePrincipals_principalKeys = null;
        java.util.List<java.lang.String> _resolvePrincipals_principalType = null;
        boolean _resolvePrincipals_addToUserInfoList = false;
        com.microsoft.schemas.sharepoint.soap.ArrayOfPrincipalInfo _resolvePrincipals__return = port.resolvePrincipals(_resolvePrincipals_principalKeys, _resolvePrincipals_principalType, _resolvePrincipals_addToUserInfoList);
        System.out.println("resolvePrincipals.result=" + _resolvePrincipals__return);


        }

        System.exit(0);
    }

}
