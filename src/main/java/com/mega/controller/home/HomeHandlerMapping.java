package com.mega.controller.home;

import com.mega.controller.Controller;
import com.mega.controller.HandlerMapping;
import com.mega.controller.home.controller.TestController;


import java.util.HashMap;
import java.util.Map;

public class HomeHandlerMapping extends HandlerMapping {

    private Map<String, Controller> mappings = new HashMap<>();

    public HomeHandlerMapping() {
        mappings.put("/test.do", new TestController());
    }

    @Override
    public Controller getController(String path) {
        return mappings.get(path);
    }
}
