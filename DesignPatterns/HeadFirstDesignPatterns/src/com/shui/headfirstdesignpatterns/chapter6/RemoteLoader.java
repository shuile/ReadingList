package com.shui.headfirstdesignpatterns.chapter6;

/**
 * @author shui.
 * @date 2021/7/16.
 * @time 14:52.
 */
public class RemoteLoader {
    public static void main(String[] args) {
//        RemoteControl remoteControl = new RemoteControl();
//
//        Light livingRoomLight = new Light("Living Room");
//        Light kitchenLight = new Light("Kitchen");
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//        GarageDoor garageDoor = new GarageDoor("");
//        Stereo stereo = new Stereo("Living Room");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//        LightOnCommand kitchenLightOn = new LightOnCommand(kitchenLight);
//        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);
//
//        CeilingFanOnCommand ceilingFanOn = new CeilingFanOnCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        GarageDoorUpCommand garageDoorUp = new GarageDoorUpCommand(garageDoor);
//        GarageDoorDownCommand garageDoorDown = new GarageDoorDownCommand(garageDoor);
//
//        StereoOnWithCDCommand stereoOnWithCD = new StereoOnWithCDCommand(stereo);
//        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
//        remoteControl.setCommand(2, ceilingFanOn, ceilingFanOff);
//        remoteControl.setCommand(3, stereoOnWithCD, stereoOff);
//
//        System.out.println(remoteControl);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(1);
//        remoteControl.offButtonWasPushed(1);
//        remoteControl.onButtonWasPushed(2);
//        remoteControl.offButtonWasPushed(2);
//        remoteControl.onButtonWasPushed(3);
//        remoteControl.offButtonWasPushed(3);

//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//
//        Light livingRoomLight = new Light("Living Room");
//
//        LightOnCommand livingRoomLightOn = new LightOnCommand(livingRoomLight);
//        LightOffCommand livingRoomLightOff = new LightOffCommand(livingRoomLight);
//
//        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//        remoteControl.offButtonWasPushed(0);
//        remoteControl.onButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

//        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();
//
//        CeilingFan ceilingFan = new CeilingFan("Living Room");
//
//        CeilingFanMediumCommand ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
//        CeilingFanHighCommand ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
//        CeilingFanOffCommand ceilingFanOff = new CeilingFanOffCommand(ceilingFan);
//
//        remoteControl.setCommand(0, ceilingFanMedium, ceilingFanOff);
//        remoteControl.setCommand(1, ceilingFanHigh, ceilingFanOff);
//
//        remoteControl.onButtonWasPushed(0);
//        remoteControl.offButtonWasPushed(0);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();
//
//        remoteControl.onButtonWasPushed(1);
//        System.out.println(remoteControl);
//        remoteControl.undoButtonWasPushed();

        RemoteControlWithUndo remoteControl = new RemoteControlWithUndo();

        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);

        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
