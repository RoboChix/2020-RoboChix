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

@TeleOp(
        name = "Basic: Linear OpMode Robochix 2018",
        group = "Linear Opmode"
)
//@Disabled
public class Robot extends LinearOpMode {
    private ElapsedTime runtime = new ElapsedTime();

    public Robot() {

    }

    public void runOpMode() {
        this.telemetry.addData("Status", "Initialized");
        this.telemetry.update();

        this.waitForStart();
        this.runtime.reset();

        while(this.opModeIsActive()) {

        }
    }
}
