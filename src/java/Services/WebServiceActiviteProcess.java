/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Services;

import MesProcessus.Processus;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author utilisateur
 */
@WebService(serviceName = "WebServiceActiviteProcess")
public class WebServiceActiviteProcess {
    /**
     * Web service operation
     */
    @WebMethod(operationName = "activiteProcessus")
    public String activiteProcessus(@WebParam(name = "year") String year, @WebParam(name = "annee") String annee, @WebParam(name = "name") String name, @WebParam(name = "timeStamp") String timeStamp, @WebParam(name = "hostAddress") String hostAddress, @WebParam(name = "hostName") String hostName) {
             Processus processus= new Processus();
        return processus.processusActivite(year);
    }
}
