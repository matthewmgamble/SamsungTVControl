/*
 * The MIT License
 *
 * Copyright 2019 mgamble.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */

package ca.mgamble.samsungtvcontrol;

import ca.mgamble.samsungtvcontrol.classes.Button;
import ca.mgamble.samsungtvcontrol.classes.ButtonCommand;
import ca.mgamble.samsungtvcontrol.classes.ButtonParams;
import com.google.gson.Gson;
import java.net.URI;
import org.apache.log4j.Logger;
import org.java_websocket.client.WebSocketClient;
import org.java_websocket.handshake.ServerHandshake;

/**
 *
 * @author mgamble
 */
public class SamsungTVControl {
        private final String host;
    private final String token;
    private final Logger logger;
    private boolean closed = false;
    Gson gson = new Gson();
    private Version version = new Version();
    private static String appName = "MyApp";
    private WebSocketClient webSocketClient;
    private boolean isConnected = false;
    public String getAPIVersion() {
        return version.getBuildNumber();
    } 
    
    public SamsungTVControl(String host, String token) throws Exception {
        this.logger = Logger.getLogger(SamsungTVControl.class);
        this.host = host;
        this.token = token;
        webSocketClient = new WebSocketClient(new URI(host + "/api/v2/channels/samsung.remote.control?name=" + appName + "&token=" + token)) {
            @Override
            public void onOpen(ServerHandshake sh) {
                isConnected = true;
            }

            @Override
            public void onMessage(String string) {
                System.out.println(">>> Got message: " + string);
            } 

            @Override
            public void onClose(int i, String string, boolean bln) {
                System.out.println(">>> TV Closed connection");
                isConnected = false;
            }

            @Override
            public void onError(Exception excptn) {
                System.out.println(">>> ERR: " + excptn.getLocalizedMessage());
            }
        };
        
    }
    
    public void sendButton(Button button) {
        ButtonParams params = new ButtonParams(button);
        ButtonCommand command = new ButtonCommand(params);
        System.out.println("Sending command: " + gson.toJson(command));
        webSocketClient.send(gson.toJson(command));
    }
}
