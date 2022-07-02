/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package services;

import Utils.Statitics;
import com.codename1.io.ConnectionRequest;
import com.codename1.io.NetworkEvent;
import com.codename1.io.NetworkManager;
import com.codename1.ui.events.ActionListener;
import java.util.ArrayList;
import java.util.List;
import models.CondidatEmpolye;

/**
 *
 * @author LENOVO
 */
public class CondidatEmlpoyeServices {
        //prefix
    private String CondidatEmpolyeePrefix = "/CondidatEmpolyee";
       //var
    static CondidatEmlpoyeServices instance = null;
    
    ConnectionRequest req;
    
    List<CondidatEmpolye > condidatEmpolye = new ArrayList<CondidatEmpolye>();
        //constructor
    private CondidatEmlpoyeServices() {
        req = new ConnectionRequest();
    }
        //Get
    public static CondidatEmlpoyeServices getInstance() {
        if (instance == null) {
            instance = new CondidatEmlpoyeServices();
        }

        return instance;
    }
    
    //Ajout
    public boolean addPerson(CondidatEmpolye condidat) {

        //build URL
        String addURL = Statitics.BASE_URL + CondidatEmpolyeePrefix  + "/add";

        //2
        req.setUrl(addURL);

        //3
        req.setPost(true);

        //4 : Transfert data
        req.addArgument("id_offer", condidat.get);
        req.addArgument("id_user", condidat.getEmail());
        req.addArgument("cv_url", condidat.getPassword());
        req.addArgument("status", condidat.getDate());
        req.addArgument("genre",condidat.getGenre());
        req.addArgument("XP", String.valueOf(condidat.getXP()));
        req.addArgument("hobbies", p.getHobbies().toString());

        //5
        req.addResponseListener(new ActionListener<NetworkEvent>() {
            @Override
            public void actionPerformed(NetworkEvent evt) {
                resultOK = req.getResponseCode() == 200;
                req.removeResponseListener(this);
            }
        });

        NetworkManager.getInstance().addToQueueAndWait(req);

        return resultOK;
    }
}
