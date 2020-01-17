package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class Lift {
    private DcMotor liftMotor;
    public Lift (DcMotor liftMotor){

        this.liftMotor = liftMotor;

        this.liftMotor.setDirection(DcMotorSimple.Direction.FORWARD);
    }


    public void setLiftMotor(double liftMotorSpeed) {
        liftMotor.setPower(liftMotorSpeed);



    }

    public void intialize(){
        setLiftMotor(0);
    }
}
