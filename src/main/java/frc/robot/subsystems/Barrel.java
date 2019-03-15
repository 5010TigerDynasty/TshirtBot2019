/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * Add your docs here.
 */
public class Barrel extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
  public void spinLeft(){
    RobotMap.barrelMotor.set(.27);
  }
  public void spinRight(){
    RobotMap.barrelMotor.set(-.1);
  }
  public void stop() {
    RobotMap.barrelMotor.set(0);
  }

	public static boolean switchClosed() {
		return RobotMap.counter.get() == 0;
	}

	public boolean switchOpen() {
    return RobotMap.counter.get() > 0;
	}
}
