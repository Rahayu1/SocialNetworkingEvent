/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mediasosialevent;

import java.util.ArrayList;

/**
 *
 * @author andrenugroho
 */
public class Group extends Profile implements Kategori{

    ArrayList<PublicUser> member;
    public Group(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        super(namaDepan, namaBelakang, idAkun, userName, password);
        member = new ArrayList<>();
    }

    public void AddMember (PublicUser a){
        member.add(a);
    }
    

    @Override
    public String viewAkun(String search) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    public void allMemberGabung(){
        
    }

    @Override
    public String kategori() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
