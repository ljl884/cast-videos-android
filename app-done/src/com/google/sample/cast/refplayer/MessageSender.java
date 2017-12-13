package com.google.sample.cast.refplayer;

import com.google.android.gms.cast.framework.CastSession;

import org.json.JSONException;
import org.json.JSONObject;

/**
 * Copyright © 2017 Seven Network. All rights reserved.
 */

public class MessageSender {
    static private final String namespance = "urn:x-cast:bc.cast.seven";

    static public void sendInitMessage(CastSession session) {
        session.sendMessage(namespance, generateInitMessage());
    }

    static private String generateInitMessage() {
        JSONObject json = new JSONObject();
        JSONObject initObj = new JSONObject();
        try {
            initObj.put("account_id", "5303576322001");
            initObj.put("player_id", "SJjfcYYwW");
            initObj.put("background_color", "#000000");
            initObj.put("logo", "http://psdev.brightcove.com/SevenNetworks/project8/loading_logo.png");
            initObj.put("css_url", "http://psdev.brightcove.com/SevenNetworks/project8/project_8.css");
            json.put("init", initObj);
        } catch (JSONException e) {

        }
        return json.toString();
    }
}
