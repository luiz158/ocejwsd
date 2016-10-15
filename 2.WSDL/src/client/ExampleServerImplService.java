
package client;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ExampleServerImplService", targetNamespace = "http://jaxws.pl/", wsdlLocation = "http://localhost:9876/ts?wsdl")
public class ExampleServerImplService
    extends Service
{

    private final static URL EXAMPLESERVERIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException EXAMPLESERVERIMPLSERVICE_EXCEPTION;
    private final static QName EXAMPLESERVERIMPLSERVICE_QNAME = new QName("http://jaxws.pl/", "ExampleServerImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:9876/ts?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        EXAMPLESERVERIMPLSERVICE_WSDL_LOCATION = url;
        EXAMPLESERVERIMPLSERVICE_EXCEPTION = e;
    }

    public ExampleServerImplService() {
        super(__getWsdlLocation(), EXAMPLESERVERIMPLSERVICE_QNAME);
    }

    public ExampleServerImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), EXAMPLESERVERIMPLSERVICE_QNAME, features);
    }

    public ExampleServerImplService(URL wsdlLocation) {
        super(wsdlLocation, EXAMPLESERVERIMPLSERVICE_QNAME);
    }

    public ExampleServerImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, EXAMPLESERVERIMPLSERVICE_QNAME, features);
    }

    public ExampleServerImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ExampleServerImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ExampleServer
     */
    @WebEndpoint(name = "ExampleServerImplPort")
    public ExampleServer getExampleServerImplPort() {
        return super.getPort(new QName("http://jaxws.pl/", "ExampleServerImplPort"), ExampleServer.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ExampleServer
     */
    @WebEndpoint(name = "ExampleServerImplPort")
    public ExampleServer getExampleServerImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://jaxws.pl/", "ExampleServerImplPort"), ExampleServer.class, features);
    }

    private static URL __getWsdlLocation() {
        if (EXAMPLESERVERIMPLSERVICE_EXCEPTION!= null) {
            throw EXAMPLESERVERIMPLSERVICE_EXCEPTION;
        }
        return EXAMPLESERVERIMPLSERVICE_WSDL_LOCATION;
    }

}
