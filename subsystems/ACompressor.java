/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;
import frc.robot.RobotMap;

/**
 * An example subsystem.  You can replace me with your own Subsystem.
 */
public class ACompressor extends Subsystem {
  // Put methods for controlling this subsystem
  // here. Call these from Commands.
  
  private final Compressor compressor = RobotMap.aCompressorCompressor;
  public ACompressor() {
    super("compressor");
  }

  public void start() {
    compressor.start();
  }

  public void checkPressure() {
    if(!compressor.getPressureSwitchValue()){
      if(compressor.enabled()) {
        compressor.stop();
        
      }
    }
  }
  @Override
  public void initDefaultCommand() {
    // Set the default command for a subsystem here.
    // setDefaultCommand(new MySpecialCommand());
  }
}
