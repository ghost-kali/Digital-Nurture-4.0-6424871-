public class Logger {
    private static Logger logger;

    private Logger(){
        System.out.println("Logger Constructor called");
    }

    public static Logger getInstance(){
        if(logger == null){
            logger = new Logger();
        }
        return logger;
    }

    public void log(String msg){
        System.out.println("Log : " + msg);
    }
}
