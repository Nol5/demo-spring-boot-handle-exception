package com.no15;

import org.springframework.web.bind.annotation.*;

@RestController
public class MinusOneRestController {

    @RequestMapping(value = "/minusOne", method = RequestMethod.GET)
    public Integer MinusOne(
            @RequestParam(value = "xx") Integer xx){

        if(null == xx)
            throw new CustomException("Spider Man");

        return xx - 1;
    }

}
