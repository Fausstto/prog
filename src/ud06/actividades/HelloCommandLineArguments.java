package ud06.actividades;

public class HelloCommandLineArguments {
    public static void main(String[] args) {
        System.out.println("Im saying hello to the people below.. ");
        if(args.length==0)
            return;

        for(int counter = 0; counter< args.length;counter++){
            System.out.println("argument index" + counter +": "+ args[counter]);
        }
    }
}
