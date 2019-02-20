/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
//import edu.wpi.first.wpilibj.command.Command;
import frc.robot.commands.BarrelStop;
import frc.robot.commands.LiftDown;
import frc.robot.commands.LiftUp;
import frc.robot.commands.RotateBarrelTime;
import frc.robot.commands.Shoot;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
  public Joystick joyDriver = new Joystick(0);
	
	private JoystickButton buttonA = new JoystickButton(joyDriver, 1);
	private JoystickButton buttonB = new JoystickButton(joyDriver, 2);
	private JoystickButton buttonX = new JoystickButton(joyDriver, 3);
	private JoystickButton buttonY = new JoystickButton(joyDriver, 4);
	private JoystickButton buttonRB = new JoystickButton(joyDriver, 5);


 public OI() {
    buttonX.whileHeld(new LiftDown());
		buttonY.whileHeld(new LiftUp());
		buttonRB.whenPressed(new Shoot());
		buttonA.whenPressed(new RotateBarrelTime());
		buttonB.whenPressed(new BarrelStop());
  }
}
