package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.Index;

public class IndexCommand extends CommandBase {
  private Index index;

  public IndexCommand(Index x) {
    index = x;
    addRequirements(index);
  }

  @Override
  public void initialize() {
  }

  @Override
  public void execute() {
    index.spinInnerIndex();
  }

  @Override
  public void end(boolean interrupted) {
    index.stopInnerIndex();
  }

  @Override
  public boolean isFinished() {
    return (Constants.controller.getXButton());
  }
}
