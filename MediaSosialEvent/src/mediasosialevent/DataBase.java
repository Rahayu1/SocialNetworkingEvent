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
public class DataBase {

    public ArrayList<PublicUser> Pusers;
    public ArrayList<Group> Gusers;
    public ArrayList<EventOrganizer> Eusers;
    public int nUser;

    public DataBase() {
        Pusers = new ArrayList<>();
        Gusers = new ArrayList<>();
        Eusers = new ArrayList<>();
    }

    public void Pregistrasi(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        PublicUser user = new PublicUser(namaDepan, namaBelakang, idAkun, userName, password) {

            @Override
            public String viewAkun(String idAkun) {
                String akun = "Akun anda sudah terbentuk \nNama : " + getNamaDepan() + " " + getNamaBelakang() + "\nUsername : " + getIdAkun() + "\nPassword : " + getPassword();
                return akun;
            }
        };
        Pusers.add(user);
    }
    
    public void Gregistrasi(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        Group user = new Group(namaDepan, namaBelakang, idAkun, userName, password) {

            @Override
            public String viewAkun(String idAkun) {
                String akun = "Akun anda sudah terbentuk \nNama : " + getNamaDepan() + " " + getNamaBelakang() + "\nUsername : " + getIdAkun() + "\nPassword : " + getPassword();
                return akun;
            }
        };
        Gusers.add(user);
    }
    
    public void Eregistrasi(String namaDepan, String namaBelakang, String idAkun, String userName, String password) {
        EventOrganizer user = new EventOrganizer(namaDepan, namaBelakang, idAkun, userName, password) {

            @Override
            public String viewAkun(String idAkun) {
                String akun = "Akun anda sudah terbentuk \nNama : " + getNamaDepan() + " " + getNamaBelakang() + "\nUsername : " + getIdAkun() + "\nPassword : " + getPassword();
                return akun;
            }
        };
        Eusers.add(user);
    }

    public PublicUser PsearchUserByID(String id) {
        String temp = id;
        PublicUser get = null;
        for (int i = 0; i < Pusers.size(); i++) {
            if (temp.equals(Pusers.get(i).getIdAkun())) {
                get = Pusers.get(i);
            }
        }
        return get;
    }

    public PublicUser PseachUserByName(String id) {
        String temp = id;
        PublicUser get = null;
        for (int i = 0; i < Pusers.size(); i++) {
            if (temp.equals(Pusers.get(i).getNamaDepan())) {
                get = Pusers.get(i);
            }
        }
        return get;
    }

    public Group GsearchUserByID(String id) {
        String temp = id;
        Group get = null;
        for (int i = 0; i < Gusers.size(); i++) {
            if (temp.equals(Gusers.get(i).getIdAkun())) {
                get = Gusers.get(i);
            }
        }
        return get;
    }

    public Group GseachUserByName(String id) {
        String temp = id;
        Group get = null;
        for (int i = 0; i < Gusers.size(); i++) {
            if (temp.equals(Gusers.get(i).getNamaDepan())) {
                get = Gusers.get(i);
            }
        }
        return get;
    }

    public EventOrganizer EsearchUserByID(String id) {
        String temp = id;
        EventOrganizer get = null;
        for (int i = 0; i < Eusers.size(); i++) {
            if (temp.equals(Eusers.get(i).getIdAkun())) {
                get = Eusers.get(i);
            }
        }
        return get;
    }

    public EventOrganizer EseachUserByName(String id) {
        String temp = id;
        EventOrganizer get = null;
        for (int i = 0; i < Eusers.size(); i++) {
            if (temp.equals(Eusers.get(i).getNamaDepan())) {
                get = Eusers.get(i);
            }
        }
        return get;
    }

}
