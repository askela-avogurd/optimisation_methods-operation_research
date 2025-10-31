package main;

public class Main {
    public static void main(String[] argument) {
        // Чтение задачи из файла
        LinearProgrammingTask task = TaskReader.readFromFile("task.txt");

        // Автоматический выбор решателя
        SimplexSolver solver = SolverFactory.createSolver(task);

        // Решение задачи
        Solution solution = solver.solve(task);

        // Вывод результата
        SolutionWriter.writeToFile(solution, "result.txt");
    }
}
