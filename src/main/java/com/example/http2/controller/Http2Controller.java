package com.example.http2.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/http2-server")
public class Http2Controller {

    @RequestMapping(method = RequestMethod.GET, value = "/{version}")
    @ResponseBody
    private String getVersion(@PathVariable(value = "version") String version) {
        return version;
    }
}
