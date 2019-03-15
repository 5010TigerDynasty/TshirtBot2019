/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018 FIRST. All Rights Reserved.                             */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
//import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;
import frc.robot.commands.ArcadeDrive;

/**
 * Add your docs here.
 */
public class DriveTrainMain extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  SpeedController rightMotor = RobotMap.driveMotorRight;
	SpeedController leftMotor = RobotMap.driveMotorLeft;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
    setDefaultCommand(new ArcadeDrive());

  }
  //powers might need to be varied depending on driver or state of drive train
  public void drive(double leftPower, double rightPower){
    rightMotor.set(-rightPower);
    leftMotor.set(-leftPower / 1.17);
  }
  public void spin(double power){
    rightMotor.set(power );
    leftMotor.set(power / 1.4);
  }
  public void stop() {
    rightMotor.set(0);
    leftMotor.set(0);
  }
}
