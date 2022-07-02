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
import com.codename1.l10n.SimpleDateFormat;
import com.codename1.ui.events.ActionListener;
import java.util.ArrayList;
import java.util.List;
import models.CondidatEmployee;

/**
 *
 * @author LENOVO
 */
public class CondidatEmlpoyeServices {
        //prefix
    private String CondidatEmpolyeePrefix = "/CondidatEmpolyee";
       //var
    static CondidatEmlpoyeServices instance = null;
        boolean resultOK = false;
    ConnectionRequest req;
    
    List<CondidatEmployee> condidatEmpolye = new ArrayList<CondidatEmployee>();
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
    public boolean addCondidatEmployee(CondidatEmployee condidat) {

        //build URL
        String addURL = Statitics.BASE_URL + CondidatEmpolyeePrefix  + "/add";

        //2
        req.setUrl(addURL);

        //3
        req.setPost(true);

        //4 : Transfert data
        req.addArgument("id_offer",String.valueOf(condidat.getOffer_id().getId()) );
        req.addArgument("id_user", String.valueOf(condidat.getUser_id().getId()));
        req.addArgument("cv_url", condidat.getCv_url());
        req.addArgument("status", condidat.getStatus().name());
        SimpleDateFormat
                format = new SimpleDateFormat("yyyy-MM-dd");
        String createdAt = format.format(condidat.getCreatedDate());
        String updatedAt = format.format(condidat.getCreatedDate());
        req.addArgument("CreatedDate", createdAt );
         req.addArgument("UpdatedDate", updatedAt);


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
