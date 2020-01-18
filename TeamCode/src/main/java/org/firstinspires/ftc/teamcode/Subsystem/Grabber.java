package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.Servo;

public class Grabber {
    private Servo leftServo;
    private Servo rightServo;


    public Grabber(Servo leftServo, Servo rightServo){
        this.leftServo = leftServo;
        this.rightServo = rightServo;

    }
     public void setGrabberPosition(double leftPosition, double rightPosition){
         leftServo.setPosition(leftPosition);
         rightServo.setPosition(rightPosition);
     }

}

