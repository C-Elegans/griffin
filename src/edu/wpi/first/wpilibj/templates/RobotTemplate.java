/*----------------------------------------------------------------------------*/
/* Copyright (c) FIRST 2008. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package edu.wpi.first.wpilibj.templates;


import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SimpleRobot;
import edu.wpi.first.wpilibj.Talon;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the SimpleRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
public class RobotTemplate extends SimpleRobot {
    /**
     * This function is called once each time the robot enters autonomous mode.
     */
    
    RobotDrive drive;
    
    
     Talon kLeftFront;
     Talon kLeftRear;
     Talon kRightFront;
     Talon kRightRear;
     Joystick left_stick;
     
    
    
     DriverStation ds;
     
     public RobotTemplate(){
    
     getWatchdog().setEnabled(false);
        
    
        ds = DriverStation.getInstance();
         
         kLeftFront = new Talon(1);
         kLeftRear = new Talon(2);
         kRightFront = new Talon(3);
         kRightRear = new Talon(4);
         
         drive = new RobotDrive(kLeftFront, kLeftRear, kRightFront, kRightRear);
       
         drive.setInvertedMotor(RobotDrive.MotorType.kFrontLeft, true);
         drive.setInvertedMotor(RobotDrive.MotorType.kRearLeft, true);
         
         
         left_stick = new Joystick(1);
         
     }    
         
         
    
    
    public void autonomous() {
        
    }

    /**
     * This function is called once each time the robot enters operator control.
     */
    public void operatorControl() {
            
        System.out.println("In operator control");
        
        while(true)
        {
            //System.out.println("Left Stick x: " + left_stick.getX());
            //System.out.println("Left Stick y: " + left_stick.getY());
            
            //left stick forward ( - )
           
            /*
            if(left_stick.getRawButton(5) == true)
            {
                kLeftFront.set(1);
            }
            if(left_stick.getRawButton(6) == true)
            {
                kRightFront.set(1);
            }
            if(left_stick.getRawButton(3) == true)
            {
                kLeftRear.set(1);
            }
            if(left_stick.getRawButton(4) == true)
            {
                kRightRear.set(1);
            }
            */
            
            drive.mecanumDrive_Cartesian(left_stick.getX(), left_stick.getY(), left_stick.getTwist(), 0);
            
        }
    }
    
    /**
     * This function is called once each time the robot enters test mode.
     */
    public void test() {
    
    }
}
