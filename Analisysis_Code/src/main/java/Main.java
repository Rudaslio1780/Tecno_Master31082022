public class Main {


    public static void main(String[] args) {
        Empresa emp1=new Empresa("104542788","Coca cola s.a","Cr 20 30 44","3205412");
        System.out.println("La empresa creada es:"+emp1.getNombre());
        Empleado empleado=new Empleado(3451144,"Jose Rudas","rudaslio17@gmail.com","ADMINISTRADOR",emp1) ;
        empleado.CambiarNombreEmpresa("Bavaria");
        System.out.println("El nuevo nombre de la empresa es:"+empleado.getEmpresa());
        System.out.println(emp1.getNombre());
        empleado.setRole("operativo8798");
        System.out.println("nuevo role:"+empleado.getRole());
    }
}
