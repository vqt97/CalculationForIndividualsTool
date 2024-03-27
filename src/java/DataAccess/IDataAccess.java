/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import java.util.List;

/**
 *
 * @author thien
 */
public interface IDataAccess<T>{
    List<T> SelectAll();
    
    List<T> SelectByKey(Object[] ids);
    
    List<T> SelectByField(String[] fieldNames, Object[] values);
    
    int Insert(String[] fieldNames, Object[] values);
    
    int Delete(Object[] ids);
    
    int Update(String[] fieldNames, Object[] values, Object[] ids);
}
