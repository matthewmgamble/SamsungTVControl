/*
 * The MIT License
 *
 * Copyright 2021 mgamble.
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

package ca.mgamble.samsungtvcontrol.classes;

import com.google.gson.annotations.SerializedName;

/**
 *
 * @author mgamble
 */
public class ButtonParams {
    @SerializedName("Cmd")
    private String cmd = "Click";
    @SerializedName("DataOfCommand")
    private Button dataOfCommand;
    @SerializedName("Option")
    private boolean option = false;
    @SerializedName("TypeOfRemote")
    private String typeOfRemote = "SendRemoteKey";

    public ButtonParams(Button button) {
        this.dataOfCommand = button;
    }
    /**
     * @return the cmd
     */
    public String getCmd() {
        return cmd;
    }

    /**
     * @param cmd the cmd to set
     */
    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    /**
     * @return the dataOfCommand
     */
    public Button getDataOfCommand() {
        return dataOfCommand;
    }

    /**
     * @param dataOfCommand the dataOfCommand to set
     */
    public void setDataOfCommand(Button dataOfCommand) {
        this.dataOfCommand = dataOfCommand;
    }

    /**
     * @return the option
     */
    public boolean isOption() {
        return option;
    }

    /**
     * @param option the option to set
     */
    public void setOption(boolean option) {
        this.option = option;
    }

    /**
     * @return the typeOfRemote
     */
    public String getTypeOfRemote() {
        return typeOfRemote;
    }

    /**
     * @param typeOfRemote the typeOfRemote to set
     */
    public void setTypeOfRemote(String typeOfRemote) {
        this.typeOfRemote = typeOfRemote;
    }
    
}
