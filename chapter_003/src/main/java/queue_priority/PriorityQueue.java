package queue_priority;

import java.util.LinkedList;

public class PriorityQueue {

    private LinkedList<Task> tasks = new LinkedList<>();

    /**
     * Метод должен вставлять в нужную позицию элемент.
     * Позиция определять по полю приоритет.
     * Для вставик использовать add(int index, E value)
     * @param task задача
     */
    public void put(Task task) {
    int position = tasks.size();
        if(tasks.size() < 1) {
            tasks.add(0,task);
        } else {
            for(Task taskInQueue : tasks) {
            if(taskInQueue.getPriority() > task.getPriority()) {
                position = tasks.indexOf(taskInQueue);
            }
            }
            tasks.add(position, task);
        }

    }

    public Task take() {
        return this.tasks.poll();
    }
}
