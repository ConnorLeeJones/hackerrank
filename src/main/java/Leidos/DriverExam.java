package Leidos;

public class DriverExam {
    public static void executeExercise(IExercise exercise) {
        try {
            exercise.start();
            try {
                exercise.execute();
            } catch (Exception f){
                exercise.markNegativePoints();
            }
        } catch (Exception e){

        } finally {
            exercise.end();
        }

        //throw new UnsupportedOperationException("Waiting to be implemented.");
    }

    public static void main(String[] args) {
        DriverExam.executeExercise(new Exercise());
    }
}

class Exercise implements IExercise {
    public void start() { System.out.println("Start"); }
    public void execute() { System.out.println("Execute"); }
    public void markNegativePoints() { System.out.println("MarkNegativePoints"); }
    public void end() { System.out.println("End"); }
}

interface IExercise {
    void start() throws Exception;
    void execute();
    void markNegativePoints();
    void end();
}
