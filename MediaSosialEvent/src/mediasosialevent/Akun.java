/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;

/**
 *
 * @author DMC
 */
public abstract class Akun {

    public String idAkun;
    public String userName;
    public String password;
    
    
    public Akun(String idAkun, String userName, String password) {
        this.idAkun = idAkun;
        this.userName = userName;
        this.password = password;
        ArrayList<Pesan> pesan;
    }

    public abstract String viewAkun(String search);

    public void setIdAkun(String idAkun) {
        this.idAkun = idAkun;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getIdAkun() {
        return idAkun;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }

}
