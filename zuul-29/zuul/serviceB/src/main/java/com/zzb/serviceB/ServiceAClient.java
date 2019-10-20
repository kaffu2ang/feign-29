package com.zzb.serviceB;

import com.zzb.api.ServiceAInterface;
import org.springframework.cloud.netflix.feign.FeignClient;

@FeignClient("ServiceA")
public interface ServiceAClient extends ServiceAInterface {

}
