import java.util.LinkedList;
import java.util.Queue;

public class trabalho {
    private Queue<String> tasks;

    public trabalho() {
        tasks = new LinkedList<>();
    }

    public void addTask(String task) {
        tasks.offer(task);
    }

    public void completeTask() {
        if (!tasks.isEmpty()) {
            tasks.poll();
        } else {
            System.out.println("Não há tarefas para completar.");
        }
    }

    public String getNextTask() {
        if (!tasks.isEmpty()) {
            return tasks.peek();
        } else {
            return "Não há tarefas pendentes.";
        }
    }

    public static void main(String[] args) {
        trabalho taskManager = new trabalho();
        
        // Adicionando algumas tarefas de exemplo
        taskManager.addTask("Implementar login no sistema");
        taskManager.addTask("Corrigir bugs no módulo de compras");
        taskManager.addTask("Criar documentação do projeto");

        // Visualizando a próxima tarefa
        System.out.println("Próxima tarefa: " + taskManager.getNextTask());

        // Completando uma tarefa
        taskManager.completeTask();

        // Visualizando a próxima tarefa após a conclusão
        System.out.println("Próxima tarefa: " + taskManager.getNextTask());
    }
}
