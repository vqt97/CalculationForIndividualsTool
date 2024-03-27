/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entity;

import Attribute.DataObjectAttributeSetting;
import lombok.*;
/**
 *
 * @author thien
 */
@EqualsAndHashCode
@Data
public class User {
    @DataObjectAttributeSetting(IsKey = true, Nullable = false)
    private String username;
    @DataObjectAttributeSetting(IsKey = false, Nullable = false)
    private String password;
    private String fullName;
    private String address;
    private int phonenumber;
}
