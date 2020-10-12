package org.openmrs.module.bahmnicustomutil.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import sun.misc.Contended;

@Controller
public class LocationController {


    @RequestMapping(value = "/module/bahmnicustomutil/greeting", method = RequestMethod.GET)
    @ResponseBody
    public String test() {
        return "Hello Everyone";
    }

    @RequestMapping(value = "/module/bahmnicustomutil/getLocationBylocationTagName", method = RequestMethod.GET)
    @ResponseBody
    public String getLocationBylocationTagName(
            @RequestParam(value = "locationTagName", required = false) String locationTagName) {
        return locationTagName;
    }
}
