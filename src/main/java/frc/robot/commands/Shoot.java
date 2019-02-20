/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.robot.RobotMap;

public class Shoot extends Command {
  
  long currentTime;
  long startTime;
  double targetTime;

  public Shoot() {
    // Use requires() here to declare subsystem dependencies
    requires(RobotMap.shooter);
  }

  // Called just before this Command runs the first time
  @Override
  protected void initialize() {
    startTime = System.currentTimeMillis();
    //RobotMap.shooter.shoot();
    targetTime = SmartDashboard.getNumber("shoot time", 100);
    
  }

  // Called repeatedly when this Command is scheduled to run
  @Override
  protected void execute() {
    RobotMap.shooter.shoot();
  }

  // Make this return true when this Command no longer needs to run execute()
  @Override
  protected boolean isFinished() {
    currentTime = System.currentTimeMillis();
    if(currentTime - startTime > targetTime){
      return true;
    }
    
      return false;
  }

  // Called once after isFinished returns true
  @Override
  protected void end() {
    RobotMap.shooter.unshoot();
  }

  // Called when another command which requires one or more of the same
  // subsystems is scheduled to run
  @Override
  protected void interrupted() {
  }
}
