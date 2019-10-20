package com.zzb.serviceA;


import org.springframework.web.bind.annotation.RestController;

import com.zzb.api.ServiceAInterface;

@RestController
public class ServiceAController implements ServiceAInterface{


    @Override
    public String Welcome(Long id, String name) {
        if(name.equals("zzy")){
            return "{'欢迎:"+name+"'}";
        }else
        {
            return "？？？？？！！";}
    }
}
