//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

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

        this.waitForStart();
        this.runtime.reset();

        while(this.opModeIsActive()) {
            telemetry.addData("Status", "Running");
            telemetry.update();

            double drive = this.gamepad1.left_stick_y;
            double turn = this.gamepad1.right_stick_x;

            double leftSpeed = Range.scale (drive + turn, -1.4143, 1.4143, -1, 1);
            double rightSpeed =Range.scale (drive - turn, -1.4143, 1.4143, -1, 1);

            driveBase.setLeftSpeed(leftSpeed);
            driveBase.setRightSpeed(rightSpeed);
        }
    }
}
