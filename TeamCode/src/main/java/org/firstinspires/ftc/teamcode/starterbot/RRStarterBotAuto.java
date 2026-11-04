package org.firstinspires.ftc.teamcode.starterbot;

import com.acmerobotics.roadrunner.Action;
import com.acmerobotics.roadrunner.Pose2d;
import com.acmerobotics.roadrunner.Vector2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.TankDrive;
import org.opencv.core.Mat;

@Autonomous (name = "RR Starter Bot Auto")
public class RRStarterBotAuto extends LinearOpMode {

    @Override
    public void runOpMode() throws InterruptedException{

        Pose2d beginPose = new Pose2d(new Vector2d(58, -12), Math.toRadians(0));

        TankDrive drive = new TankDrive(hardwareMap, beginPose);

        waitForStart();

        Action path = drive.actionBuilder(beginPose)
                .splineTo(new Vector2d(30, -12), Math.toRadians(0))
                //.splineToSplineHeading(new Pose2d(54,-58, 0), Math.toRadians(0))
                .build();
    }
}
