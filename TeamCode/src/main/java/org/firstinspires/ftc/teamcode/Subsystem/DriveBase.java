package org.firstinspires.ftc.teamcode.subsystem;

import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;

public class DriveBase {
    private DcMotor leftDrive;
    private DcMotor rightDrive;

    public DriveBase(DcMotor leftDrive, DcMotor rightDrive) {
        this.leftDrive = leftDrive;
        this.rightDrive = rightDrive;

        this.leftDrive.setDirection(DcMotorSimple.Direction.REVERSE);
        this.rightDrive.setDirection(DcMotorSimple.Direction.FORWARD);
    }

    public void setLeftSpeed(double leftSpeed) {
        leftDrive.setPower(leftSpeed);
    }

    public void setRightSpeed(double rightSpeed) {
        rightDrive.setPower(rightSpeed);
    }

    public void initialize (){
        setLeftSpeed(0);
        setRightSpeed(0);
    }
}