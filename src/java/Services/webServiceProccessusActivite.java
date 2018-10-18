/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import MesProcessus.Processus;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;

/**
 *
 * @author 1895088
 */
@WebService(serviceName = "webServiceProccessusActivite")
public class webServiceProccessusActivite {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "ProccessusActivite")
    @RequestWrapper(className = "Services.operation_1")
    @ResponseWrapper(className = "Services.operation_1Response")
    public String webServiceProccessusActivite(@WebParam(name = "userName") String userName, @WebParam(name = "annee") String annee) {
        Processus  pro = new Processus();     
        getInfoUser();      
        return pro.processusActivite(annee);
    }

    private void getInfoUser() {
        try {
            Calendar calendar = Calendar.getInstance();
            String Timestamp=calendar.getTime().toString();
            String inetadr = InetAddress.getLocalHost().getHostAddress();
            System.out.println(inetadr);
            System.out.println(Timestamp);
            System.out.println(System.getenv("USERNAME"));
            System.out.println(System.getenv("COMPUTERNAME"));
            System.out.println(System.getenv("SESSIONNAME"));
        } catch (UnknownHostException ex) {
            System.out.println(ex.fillInStackTrace());
        }
    }
}
