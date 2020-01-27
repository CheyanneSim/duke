package duke.command;

import duke.DukeException;
import duke.storage.Storage;
import duke.task.TaskList;
import duke.ui.Ui;

public class DoneCommand extends Command {

    private int taskNo;

    public DoneCommand(int taskNo) {
        super(false);
        this.taskNo = taskNo;
    }

    @Override
    public void execute(TaskList tasks, Ui ui, Storage storage) throws DukeException {
        try {
            tasks.getTasks().get(taskNo).markAsDone();
        } catch (Exception e) {
            throw new DukeException("OOPS!!! Which task is done?");
        }
    }
}