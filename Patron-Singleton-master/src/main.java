public class main {

    
    public static void main(String[] args){
        //Conectar conn=new Conectar();
        
        //conn.conexion();

        SingletonEjemplo singleton1 = SingletonEjemplo.INSTANCE;
        singleton1.getConnection();
        SingletonEjemplo singleton2 = SingletonEjemplo.INSTANCE;
        singleton2.getConnection();

        System.out.println(singleton1.hashCode());
        System.out.println(singleton2.hashCode());

        
        //System.out.println(SingletonEjemplo.Singleton.INSTANCE.getConnection());
    }
}
