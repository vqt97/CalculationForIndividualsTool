/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Attribute.DataAccessAttributeSetting;
import Entity.User;

/**
 *
 * @author thien
 */
@DataAccessAttributeSetting(FilePath = "./Data/user.json")
public class UserDataAccess  extends DataAccess<User>{
    
}
