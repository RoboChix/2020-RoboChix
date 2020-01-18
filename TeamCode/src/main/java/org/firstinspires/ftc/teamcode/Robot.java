//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)


package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple.Direction;
import com.qualcomm.robotcore.hardware.Servo;
import com.qualcomm.robotcore.hardware.CRServo;
import com.qualcomm.robotcore.util.ElapsedTime;
import com.qualcomm.robotcore.util.Range;

import org.firstinspires.ftc.teamcode.subsystem.DriveBase;
import org.firstinspires.ftc.teamcode.subsystem.Grabber;
import org.firstinspires.ftc.teamcode.subsystem.Lift;

import java.sql.Driver;

@TeleOp(
        name = "RoboChix 2020",
        group = "Linear Opmode"
)
//@Disabled
public class Robot extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();

    public void runOpMode() {
        this.telemetry.addData("Status", "Initialized");
        this.telemetry.update();

        DriveBase driveBase = new DriveBase(this.hardwareMap.get(DcMotor.class,"left_drive"),
                                  this.hardwareMap.get(DcMotor.class,"right_drive"));
             Lift lift  = new Lift(this.hardwareMap.get(DcMotor.class,"lift_motor"));



             Grabber grabber = new Grabber(this.hardwareMap.get(Servo.class, "left_intake"),
        this.hardwareMap.get(Servo.class,"right_intake"));
        driveBase.initialize();
        lift.intialize();

        this.waitForStart();
        this.runtime.reset();

        while(this.opModeIsActive()) {
            //telemetry.addData("Status", "initailize");
            //telemetry.update();

            double drive = this.gamepad1.left_stick_y;
            double turn = this.gamepad1.right_stick_x;

            double leftSpeed = Range.scale (drive - turn, -1.4143, 1.4143, -1, 1);
            double rightSpeed =Range.scale (drive + turn, -1.4143, 1.4143, -1, 1);

            telemetry.addData("Left", drive);
            telemetry.addData("Right", turn);
            telemetry.update();

            driveBase.setLeftSpeed(leftSpeed);
            driveBase.setRightSpeed(rightSpeed);
            if (this.gamepad2.y) {
                // set lift motor up
                lift.setLiftMotor(1);
            } else if (this.gamepad2.a) {
                // set lift motor down
                lift.setLiftMotor(-1);
            } else{
                // trun motor off
                lift.setLiftMotor(0);
            }
            if (this.gamepad2.x) {
                grabber.setGrabberPosition(0.1, 0.5);
            } else if (this.gamepad2.b) {
                grabber.setGrabberPosition(0.2,0.4);
            }
        }
    }
}
