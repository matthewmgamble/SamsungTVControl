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

package ca.mgamble.samsungtvcontrol.classes;

import java.io.Serializable;

/**
 *
 * @author mgamble
 */
public enum Button implements Serializable {
    KEY_MENU("KEY_MENU"),
    KEY_UP("KEY_UP"),
    KEY_DOWN("KEY_DOWN"),
    KEY_LEFT("KEY_LEFT"),
    KEY_RIGHT("KEY_RIGHT"),
    KEY_3("KEY_3"),
    KEY_VOLUP("KEY_VOLUP"),
    KEY_4("KEY_4"),
    KEY_5("KEY_5"),
    KEY_6("KEY_6"),
    KEY_VOLDOWN("KEY_VOLDOWN"),
    KEY_7("KEY_7"),
    KEY_8("KEY_8"),
    KEY_9("KEY_9"),
    KEY_MUTE("KEY_MUTE"),
    KEY_CHDOWN("KEY_CHDOWN"),
    KEY_0("KEY_0"),
    KEY_CHUP("KEY_CHUP"),
    KEY_PRECH("KEY_PRECH"),
    KEY_GREEN("KEY_GREEN"),
    KEY_YELLOW("KEY_YELLOW"),
    KEY_CYAN("KEY_CYAN"),
    KEY_ADDDEL("KEY_ADDDEL"),
    KEY_SOURCE("KEY_SOURCE"),
    KEY_INFO("KEY_INFO"),
    KEY_PIP_ONOFF("KEY_PIP_ONOFF"),
    KEY_PIP_SWAP("KEY_PIP_SWAP"),
    KEY_PLUS100("KEY_PLUS100"),
    KEY_CAPTION("KEY_CAPTION"),
    KEY_PMODE("KEY_PMODE"),
    KEY_TTX_MIX("KEY_TTX_MIX"),
    KEY_TV("KEY_TV"),
    KEY_PICTURE_SIZE("KEY_PICTURE_SIZE"),
    KEY_AD("KEY_AD"),
    KEY_PIP_SIZE("KEY_PIP_SIZE"),
    KEY_MAGIC_CHANNEL("KEY_MAGIC_CHANNEL"),
    KEY_PIP_SCAN("KEY_PIP_SCAN"),
    KEY_PIP_CHUP("KEY_PIP_CHUP"),
    KEY_PIP_CHDOWN("KEY_PIP_CHDOWN"),
    KEY_DEVICE_CONNECT("KEY_DEVICE_CONNECT"),
    KEY_HELP("KEY_HELP"),
    KEY_ANTENA("KEY_ANTENA"),
    KEY_CONVERGENCE("KEY_CONVERGENCE"),
    KEY_11("KEY_11"),
    KEY_12("KEY_12"),
    KEY_AUTO_PROGRAM("KEY_AUTO_PROGRAM"),
    KEY_FACTORY("KEY_FACTORY"),
    KEY_3SPEED("KEY_3SPEED"),
    KEY_RSURF("KEY_RSURF"),
    KEY_ASPECT("KEY_ASPECT"),
    KEY_TOPMENU("KEY_TOPMENU"),
    KEY_GAME("KEY_GAME"),
    KEY_QUICK_REPLAY("KEY_QUICK_REPLAY"),
    KEY_STILL_PICTURE("KEY_STILL_PICTURE"),
    KEY_DTV("KEY_DTV"),
    KEY_FAVCH("KEY_FAVCH"),
    KEY_REWIND("KEY_REWIND"),
    KEY_STOP("KEY_STOP"),
    KEY_PLAY("KEY_PLAY"),
    KEY_FF("KEY_FF"),
    KEY_REC("KEY_REC"),
    KEY_PAUSE("KEY_PAUSE"),
    KEY_TOOLS("KEY_TOOLS"),
    KEY_INSTANT_REPLAY("KEY_INSTANT_REPLAY"),
    KEY_LINK("KEY_LINK"),
    KEY_FF_("KEY_FF_"),
    KEY_GUIDE("KEY_GUIDE"),
    KEY_REWIND_("KEY_REWIND_"),
    KEY_ANGLE("KEY_ANGLE"),
    KEY_RESERVED1("KEY_RESERVED1"),
    KEY_ZOOM1("KEY_ZOOM1"),
    KEY_PROGRAM("KEY_PROGRAM"),
    KEY_BOOKMARK("KEY_BOOKMARK"),
    KEY_DISC_MENU("KEY_DISC_MENU"),
    KEY_PRINT("KEY_PRINT"),
    KEY_RETURN("KEY_RETURN"),
    KEY_SUB_TITLE("KEY_SUB_TITLE"),
    KEY_CLEAR("KEY_CLEAR"),
    KEY_VCHIP("KEY_VCHIP"),
    KEY_REPEAT("KEY_REPEAT"),
    KEY_DOOR("KEY_DOOR"),
    KEY_OPEN("KEY_OPEN"),
    KEY_WHEEL_LEFT("KEY_WHEEL_LEFT"),
    KEY_POWER("KEY_POWER"),
    KEY_SLEEP("KEY_SLEEP"),
    KEY_2("KEY_2"),
    KEY_DMA("KEY_DMA"),
    KEY_TURBO("KEY_TURBO"),
    KEY_1("KEY_1"),
    KEY_FM_RADIO("KEY_FM_RADIO"),
    KEY_DVR_MENU("KEY_DVR_MENU"),
    KEY_MTS("KEY_MTS"),
    KEY_PCMODE("KEY_PCMODE"),
    KEY_TTX_SUBFACE("KEY_TTX_SUBFACE"),
    KEY_CH_LIST("KEY_CH_LIST"),
    KEY_RED("KEY_RED"),
    KEY_DNIe("KEY_DNIe"),
    KEY_SRS("KEY_SRS"),
    KEY_CONVERT_AUDIO_MAINSUB("KEY_CONVERT_AUDIO_MAINSUB"),
    KEY_MDC("KEY_MDC"),
    KEY_SEFFECT("KEY_SEFFECT"),
    KEY_DVR("KEY_DVR"),
    KEY_DTV_SIGNAL("KEY_DTV_SIGNAL"),
    KEY_LIVE("KEY_LIVE"),
    KEY_PERPECT_FOCUS("KEY_PERPECT_FOCUS"),
    KEY_HOME("KEY_HOME"),
    KEY_ESAVING("KEY_ESAVING"),
    KEY_WHEEL_RIGHT("KEY_WHEEL_RIGHT"),
    KEY_CONTENTS("KEY_CONTENTS"),
    KEY_VCR_MODE("KEY_VCR_MODE"),
    KEY_CATV_MODE("KEY_CATV_MODE"),
    KEY_DSS_MODE("KEY_DSS_MODE"),
    KEY_TV_MODE("KEY_TV_MODE"),
    KEY_DVD_MODE("KEY_DVD_MODE"),
    KEY_STB_MODE("KEY_STB_MODE"),
    KEY_CALLER_ID("KEY_CALLER_ID"),
    KEY_SCALE("KEY_SCALE"),
    KEY_ZOOM_MOVE("KEY_ZOOM_MOVE"),
    KEY_CLOCK_DISPLAY("KEY_CLOCK_DISPLAY"),
    KEY_AV1("KEY_AV1"),
    KEY_SVIDEO1("KEY_SVIDEO1"),
    KEY_COMPONENT1("KEY_COMPONENT1"),
    KEY_SETUP_CLOCK_TIMER("KEY_SETUP_CLOCK_TIMER"),
    KEY_COMPONENT2("KEY_COMPONENT2"),
    KEY_MAGIC_BRIGHT("KEY_MAGIC_BRIGHT"),
    KEY_DVI("KEY_DVI"),
    KEY_HDMI("KEY_HDMI"),
    KEY_W_LINK("KEY_W_LINK"),
    KEY_DTV_LINK("KEY_DTV_LINK"),
    KEY_APP_LIST("KEY_APP_LIST"),
    KEY_BACK_MHP("KEY_BACK_MHP"),
    KEY_ALT_MHP("KEY_ALT_MHP"),
    KEY_DNSe("KEY_DNSe"),
    KEY_RSS("KEY_RSS"),
    KEY_ENTERTAINMENT("KEY_ENTERTAINMENT"),
    KEY_ID_INPUT("KEY_ID_INPUT"),
    KEY_ID_SETUP("KEY_ID_SETUP"),
    KEY_ANYNET("KEY_ANYNET"),
    KEY_POWEROFF("KEY_POWEROFF"),
    KEY_POWERON("KEY_POWERON"),
    KEY_ANYVIEW("KEY_ANYVIEW"),
    KEY_MS("KEY_MS"),
    KEY_MORE("KEY_MORE"),
    KEY_PANNEL_POWER("KEY_PANNEL_POWER"),
    KEY_PANNEL_CHUP("KEY_PANNEL_CHUP"),
    KEY_PANNEL_CHDOWN("KEY_PANNEL_CHDOWN"),
    KEY_PANNEL_VOLUP("KEY_PANNEL_VOLUP"),
    KEY_PANNEL_VOLDOW("KEY_PANNEL_VOLDOW"),
    KEY_PANNEL_ENTER("KEY_PANNEL_ENTER"),
    KEY_PANNEL_MENU("KEY_PANNEL_MENU"),
    KEY_PANNEL_SOURCE("KEY_PANNEL_SOURCE"),
    KEY_AV2("KEY_AV2"),
    KEY_AV3("KEY_AV3"),
    KEY_SVIDEO2("KEY_SVIDEO2"),
    KEY_SVIDEO3("KEY_SVIDEO3"),
    KEY_ZOOM2("KEY_ZOOM2"),
    KEY_PANORAMA("KEY_PANORAMA"),
    KEY_4_3("KEY_4_3"),
    KEY_16_9("KEY_16_9"),
    KEY_DYNAMIC("KEY_DYNAMIC"),
    KEY_STANDARD("KEY_STANDARD"),
    KEY_MOVIE1("KEY_MOVIE1"),
    KEY_CUSTOM("KEY_CUSTOM"),
    KEY_AUTO_ARC_RESET("KEY_AUTO_ARC_RESET"),
    KEY_AUTO_ARC_LNA_ON("KEY_AUTO_ARC_LNA_ON"),
    KEY_AUTO_ARC_LNA_OFF("KEY_AUTO_ARC_LNA_OFF"),
    KEY_AUTO_ARC_ANYNET_MODE_OK("KEY_AUTO_ARC_ANYNET_MODE_OK"),
    KEY_AUTO_ARC_ANYNET_AUTO_START("KEY_AUTO_ARC_ANYNET_AUTO_START"),
    KEY_AUTO_FORMAT("KEY_AUTO_FORMAT"),
    KEY_DNET("KEY_DNET"),
    KEY_HDMI1("KEY_HDMI1"),
    KEY_AUTO_ARC_CAPTION_ON("KEY_AUTO_ARC_CAPTION_ON"),
    KEY_AUTO_ARC_CAPTION_OFF("KEY_AUTO_ARC_CAPTION_OFF"),
    KEY_AUTO_ARC_PIP_DOUBLE("KEY_AUTO_ARC_PIP_DOUBLE"),
    KEY_AUTO_ARC_PIP_LARGE("KEY_AUTO_ARC_PIP_LARGE"),
    KEY_AUTO_ARC_PIP_SMALL("KEY_AUTO_ARC_PIP_SMALL"),
    KEY_AUTO_ARC_PIP_WIDE("KEY_AUTO_ARC_PIP_WIDE"),
    KEY_AUTO_ARC_PIP_LEFT_TOP("KEY_AUTO_ARC_PIP_LEFT_TOP"),
    KEY_AUTO_ARC_PIP_RIGHT_TOP("KEY_AUTO_ARC_PIP_RIGHT_TOP"),
    KEY_AUTO_ARC_PIP_LEFT_BOTTOM("KEY_AUTO_ARC_PIP_LEFT_BOTTOM"),
    KEY_AUTO_ARC_PIP_RIGHT_BOTTOM("KEY_AUTO_ARC_PIP_RIGHT_BOTTOM"),
    KEY_AUTO_ARC_PIP_CH_CHANGE("KEY_AUTO_ARC_PIP_CH_CHANGE"),
    KEY_AUTO_ARC_AUTOCOLOR_SUCCESS("KEY_AUTO_ARC_AUTOCOLOR_SUCCESS"),
    KEY_AUTO_ARC_AUTOCOLOR_FAIL("KEY_AUTO_ARC_AUTOCOLOR_FAIL"),
    KEY_AUTO_ARC_C_FORCE_AGING("KEY_AUTO_ARC_C_FORCE_AGING"),
    KEY_AUTO_ARC_USBJACK_INSPECT("KEY_AUTO_ARC_USBJACK_INSPECT"),
    KEY_AUTO_ARC_JACK_IDENT("KEY_AUTO_ARC_JACK_IDENT"),
    KEY_NINE_SEPERATE("KEY_NINE_SEPERATE"),
    KEY_ZOOM_IN("KEY_ZOOM_IN"),
    KEY_ZOOM_OUT("KEY_ZOOM_OUT"),
    KEY_MIC("KEY_MIC"),
    KEY_HDMI2("KEY_HDMI2"),
    KEY_HDMI3("KEY_HDMI3"),
    KEY_AUTO_ARC_CAPTION_KOR("KEY_AUTO_ARC_CAPTION_KOR"),
    KEY_AUTO_ARC_CAPTION_ENG("KEY_AUTO_ARC_CAPTION_ENG"),
    KEY_AUTO_ARC_PIP_SOURCE_CHANGE("KEY_AUTO_ARC_PIP_SOURCE_CHANGE"),
    KEY_HDMI4("KEY_HDMI4"),
    KEY_AUTO_ARC_ANTENNA_AIR("KEY_AUTO_ARC_ANTENNA_AIR"),
    KEY_AUTO_ARC_ANTENNA_CABLE("KEY_AUTO_ARC_ANTENNA_CABLE"),
    KEY_AUTO_ARC_ANTENNA_SATELLITE("KEY_AUTO_ARC_ANTENNA_SATELLITE"),
    KEY_EXT1("KEY_EXT1"),
    KEY_EXT2("KEY_EXT2"),
    KEY_EXT3("KEY_EXT3"),
    KEY_EXT4("KEY_EXT4"),
    KEY_EXT5("KEY_EXT5"),
    KEY_EXT6("KEY_EXT6"),
    KEY_EXT7("KEY_EXT7"),
    KEY_EXT8("KEY_EXT8"),
    KEY_EXT9("KEY_EXT9"),
    KEY_EXT10("KEY_EXT10"),
    KEY_EXT11("KEY_EXT11"),
    KEY_EXT12("KEY_EXT12"),
    KEY_EXT13("KEY_EXT13"),
    KEY_EXT14("KEY_EXT14"),
    KEY_EXT15("KEY_EXT15"),
    KEY_EXT16("KEY_EXT16"),
    KEY_EXT17("KEY_EXT17"),
    KEY_EXT18("KEY_EXT18"),
    KEY_EXT19("KEY_EXT19"),
    KEY_EXT20("KEY_EXT20"),
    KEY_EXT21("KEY_EXT21"),
    KEY_EXT22("KEY_EXT22"),
    KEY_EXT23("KEY_EXT23"),
    KEY_EXT24("KEY_EXT24"),
    KEY_EXT25("KEY_EXT25"),
    KEY_EXT26("KEY_EXT26"),
    KEY_EXT27("KEY_EXT27"),
    KEY_EXT28("KEY_EXT28"),
    KEY_EXT29("KEY_EXT29"),
    KEY_EXT30("KEY_EXT30"),
    KEY_EXT31("KEY_EXT31"),
    KEY_EXT32("KEY_EXT32"),
    KEY_EXT33("KEY_EXT33"),
    KEY_EXT34("KEY_EXT34"),
    KEY_EXT35("KEY_EXT35"),
    KEY_EXT36("KEY_EXT36"),
    KEY_EXT37("KEY_EXT37"),
    KEY_EXT38("KEY_EXT38"),
    KEY_EXT39("KEY_EXT39"),
    KEY_EXT40("KEY_EXT40"),
    KEY_EXT41("KEY_EXT41");

    private String text;

    Button(String text) {
        this.text = text;
    }

    public String getText() {
        return this.text;
    }

    public static Button fromString(String text) {
        if (text != null) {
            for (Button b : Button.values()) {
                if (text.equalsIgnoreCase(b.getText())) {
                    return b;
                }
            }
        }
        return null;
    }

    /**
     * @param text the text to set
     */
    public void setText(String text) {
        this.text = text;
    }

}