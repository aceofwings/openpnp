package org.openpnp.model;


import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;
import org.pmw.tinylog.Logger;

import java.net.URI;
import java.net.URISyntaxException;


public class Client   extends AbstractModelObject{
    private static Client instance;
    private static WebSocketClient cc;

    public static Client get() {
        if (instance == null) {
            throw new Error("Configuration instance not yet initialized.");
        }
        return instance;
    }
    
    public static void connect(String uri) throws URISyntaxException {
    	cc = new WebSocketClient(new URI(uri)) {
    		
    		@Override
              public void onMessage(String message) {
    			// Ignore for Now
              }

              @Override
              public void onOpen(ServerHandshake handshake) {

              }

              @Override
              public void onClose(int code, String reason, boolean remote) {

              }

              @Override
              public void onError(Exception ex) {
            	ex.printStackTrace();
              }
    	};
    	
    	cc.connect();
    }
    
    public static void disconnect() {
    	
    }

    
    public static void send() {
  
    }
    
}
