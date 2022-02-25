package frc.robot.commands;

import frc.robot.subsystems.Index;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;

public class IndexCommand extends CommandBase{
    private Index indexer;

      /**
    * Creates a new ExampleCommand.
    *
    * @param subsystem The subsystem used by this command.
    */
    public IndexCommand(Index y) {
    indexer = y;
    // Use addRequirements() here to declare subsystem dependencies.
    addRequirements(indexer);
    }

    // Called when the command is initially scheduled.
    @Override
    public void initialize() {}

    // Called every time the scheduler runs while the command is scheduled.
    @Override
    public void execute() {
        indexer.startInnerIndexer();
    }

    // Called once the command ends or is interrupted.
    @Override
    public void end(boolean interrupted) {
        c.stop();
    }

    // Returns true when the command should end.
    @Override
    public boolean isFinished() {
      return Constants.controller.getAButton();
    }
}
