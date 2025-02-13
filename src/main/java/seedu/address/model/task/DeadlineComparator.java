package seedu.address.model.task;

import java.util.Comparator;

/**
 * Compares two tasks on the basis of the task with an earlier deadline ordered in frnnt of the other task.
 */
public class DeadlineComparator implements Comparator<Task> {

    @Override
    public int compare(Task a, Task b) {
        if (a.getDeadline().deadline.isBefore(b.getDeadline().deadline)) {
            return -1;
        } else if (a.getDeadline().deadline.isAfter(b.getDeadline().deadline)) {
            return 1;
        }
        return 0;
    }

}
