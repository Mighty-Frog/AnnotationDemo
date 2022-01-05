import java.lang.reflect.Method;

/**
 * The type Test tool.
 */
public class TestTool {
    /**
     * The entry point of application.
     *
     * @param args the input arguments
     */
    public static void main(String[] args) {
        TestWhetherIsNoBug testjob = new TestWhetherIsNoBug();

        Class classObject = testjob.getClass();

        Method[] methods = classObject.getDeclaredMethods();

        StringBuilder log = new StringBuilder();

        int errorCount = 0;

        for (Method m : methods) {
            //only annotated @Jiecha method can be tested
            if (m.isAnnotationPresent(ArithmeticCheck.class)) {
                try {
                    m.setAccessible(true);
                    m.invoke(testjob, null);

                } catch (Exception e) {
                    // TODO Auto-generated catch block
                    // e.printStackTrace();
                    errorCount++;
                    log.append(m.getName());
                    log.append("");
                    log.append("has error");
                    log.append("\n\r  caused by ");
                    // get exceptions' name
                    log.append(e.getCause().getClass().getSimpleName());
                    log.append("\n\r");
                    // get exceptions' detailed info
                    log.append(e.getCause().getMessage());
                    log.append("\n\r");

                }
            }
        }

        log.append(classObject.getSimpleName());
        log.append(" has ");
        log.append(errorCount);
        log.append(" errors.");

        //generate test report
        System.out.println(log.toString());
    }
}
