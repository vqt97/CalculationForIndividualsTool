/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DataAccess;

import Attribute.DataAccessAttributeSetting;
import java.util.List;

/**
 *
 * @author thien
 */
public class DataAccess<T> implements IDataAccess<T> {

    @Override
    public List<T> SelectAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> SelectByKey(Object[] ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<T> SelectByField(String[] fieldNames, Object[] values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Insert(String[] fieldNames, Object[] values) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Delete(Object[] ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int Update(String[] fieldNames, Object[] values, Object[] ids) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public DataAccessAttributeSetting GetSettings() {
        DataAccessAttributeSetting settings = this.getClass().getDeclaredAnnotation(DataAccessAttributeSetting.class);
        return settings;
    }
}
