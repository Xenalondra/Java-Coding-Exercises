/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.shop;

import io.helidon.common.http.Http;
import io.helidon.webserver.Handler;
import io.helidon.webserver.ServerRequest;
import io.helidon.webserver.ServerResponse;

/**
 *
 * @author Alondra Bio
 */
public class ItemList implements Handler {

    private Clothing[] items;

    ItemList(Clothing[] items) {
        this.items = items;
    }

    @Override
    public void accept(ServerRequest req, ServerResponse res) {
       res.status(Http.Status.OK_200);
       
       res.headers().put("Content-Type", "text/plain; charset=UTF-8");
       
        StringBuilder build = new StringBuilder();
        for (Clothing item : items) {
            build.append(item).append("\n");
        }
       
       res.send(build.toString());
    }    
}
