/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import javax.inject.Named;
import javax.enterprise.context.ApplicationScoped;
import util.MyUtil;

/**
 *
 * @author erick
 */
@Named(value = "appBean")
@ApplicationScoped
public class AppBean {

    /**
     * Creates a new instance of AppBean
     */
    public AppBean() {
    }
    
    public String getBaseUrl() {
        return MyUtil.baseurl();
    }
    
}
