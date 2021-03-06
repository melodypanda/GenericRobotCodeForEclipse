package org.usfirst.frc.team3807.robot.commands;

import org.usfirst.frc.team3807.robot.OI;

import edu.wpi.first.wpilibj.Joystick.ButtonType;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class DriveCamWithJoystick extends CommandBase {

	JoystickButton button1, button2;
	
    public DriveCamWithJoystick() {
        // Use requires() here to declare subsystem dependencies
        requires(camera);
        button1 = new JoystickButton(oi.getCoDriverJoystick2(), 1);
        button2 = new JoystickButton(oi.getCoDriverJoystick(), 1);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(button1.get()){
    		camera.driveCam1WithJoyStick(oi.getCoDriverJoystick2());
    	}
    	if(button2.get()){
    		camera.driveCam2WithJoystick(oi.getCoDriverJoystick());
    	}
    	
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
