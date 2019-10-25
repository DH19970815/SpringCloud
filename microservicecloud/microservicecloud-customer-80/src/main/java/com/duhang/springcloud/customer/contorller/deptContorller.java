package com.duhang.springcloud.customer.contorller;

import com.duhang.springcloud.customer.common.ConfigBean;
import com.duhang.springcloud.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class deptContorller {

    public static  final String REST_URL_PREFIX="http://localhost:8001";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/customer/det/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/addDept",dept,Boolean.class);
    }
}
