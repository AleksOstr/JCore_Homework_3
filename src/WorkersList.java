import java.util.ArrayList;
import java.util.Iterator;

public class WorkersList implements Iterable<Employee> {
    private ArrayList<Employee> workers;

    public WorkersList() {
        this.workers = new ArrayList<>();
    }

    public void addWorker(Employee employee) {
        workers.add(employee);
    }

    @Override
    public Iterator<Employee> iterator() {
        return workers.listIterator();
    }
}
