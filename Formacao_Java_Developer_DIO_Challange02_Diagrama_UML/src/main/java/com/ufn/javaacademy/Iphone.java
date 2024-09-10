package com.ufn.javaacademy;

import com.ufn.javaacademy.Interfaces.MusicPlayer;
import com.ufn.javaacademy.Interfaces.Phone;
import com.ufn.javaacademy.Interfaces.WebBrowser;

public class Iphone implements MusicPlayer, Phone, WebBrowser {
    //Music Player
    @Override
    public void playMusic() {  System.out.println("Playing music...");  }

    @Override
    public void pauseMusic() {  System.out.println("Pausing music...");  }

    @Override
    public void stopMusic() {  System.out.println("Stopping music...");  }

    //Phone
    @Override
    public void makeCall(String number) {  System.out.println("Calling " + number + "...");  }

    @Override
    public void endCall() {  System.out.println("Ending call...");  }

    @Override
    public void receiveCall(String number) {  System.out.println("Receiving call from " + number + "...");  }

    //Browser
    @Override
    public void openPage(String url) {  System.out.println("Opening page " + url + "...");  }

    @Override
    public void refreshPage() {  System.out.println("Refreshing page...");  }

    @Override
    public void closePage() {  System.out.println("Closing page...");  }
}