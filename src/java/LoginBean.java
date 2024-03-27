/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import Entity.User;
import java.io.FileNotFoundException;
import java.io.FileReader;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import org.primefaces.context.RequestContext;
/**
 *
 * @author thien
 */
@ManagedBean(name = "login")
@RequestScoped
public class LoginBean {
    public String username;
    public String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    /**
     * Creates a new instance of LoginBean
     */
    public LoginBean() {
        
    }
    
    public void Login(){
        // JSON string from file to java Object
        RequestContext context = RequestContext.getCurrentInstance();
        context.execute("swal('Login success!', 'Congratulation! you are logged in', 'success')");
//        try {
//            User user_File = new JSONParser().parse(new FileReader("./Data/User/user.json"));
//            System.out.println(user_File);
//        
//            context.execute("swal('Login success!', 'Congratulation! you are logged in', 'success')");
//        } catch (FileNotFoundException e) {
//            context.execute("swal('Login failed!', '', 'fail')");
//            e.printStackTrace();
//        }
    }
}
