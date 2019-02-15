/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class RollerRightMotor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.

  private final SpeedController rollerRightMotor = RobotMap.rollerRightMotor;

  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }


  public void rollerRightMotorIn(){
    rollerRightMotor.set(0.7);
    // System.err.println("Motor In");
  }

  public void rollerRightMotorOut(){
    rollerRightMotor.set(-0.7);
    // System.err.println("Motor Out");
  }

  public void rollerRightMotorStop(){
    rollerRightMotor.set(0.0);
    System.err.println("Motor Stop");
  }

}
