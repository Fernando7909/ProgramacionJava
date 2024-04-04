package MP03_Marina.UF_4.Empresa;

public class main_Empresa {
    public static void main(String[] args){

        //Metodo Constructor o Funcion Contructora de objetos:
        Sucursal s1 = new Sucursal("Sucursal1", "Carrer Delicies", "6801231230", "ejemplo@mail.com");
        Sucursal s2 = new Sucursal("Sucursal2", "Carrer Lepanto");
        Sucursal s3 = new Sucursal("Sucursal3");
        Peticion p1 = new Peticion(123);
        TiposProducto tp1 = new TiposProducto("Producto1", 987, 15, 4, false);
        Transportista t1 = new Transportista("Manolo", 692656565, 45);
        Transportista t2 = new Transportista("Miguel", 678895841);
        Encargo e1 = new Encargo(12, 5, 18, 30);
        Cliente c1 = new Cliente("Fernando", "Gran Via", 987456321, "otro@mail.com");

        //Sucursal
        s1.setNombre("NewSucursal1");
        System.out.println(s1.getNombre());
        s1.setDireccion("sucursalAddress1");
        System.out.println(s1.getDireccion());
        s1.setTelefono("936565655");
        System.out.println(s1.getTelefono());
        s1.setEmail("ejemplo@mail.com");
        System.out.println(s1.getEmail());

        s2.setNombre("NewSucursal2");
        System.out.println(s2.getNombre());
        s2.setDireccion("sucursalAddress2");
        System.out.println(s2.getDireccion());

        s3.setNombre("NewSucursal3");
        System.out.println(s3.getNombre());

        //Peticion
        p1.setCantidad(1234);
        System.out.println(p1.getCantidad());

        //TiposProducto
        tp1.setNombre("productName");
        System.out.println(tp1.getNombre());
        tp1.setCodiIdentificador(10203);
        System.out.println(tp1.getCodiIdentificador());
        tp1.setPrecio(2356);
        System.out.println(tp1.getPrecio());
        tp1.setStock(258);
        System.out.println(tp1.getStock());
        tp1.setaLaVenta(false);
        System.out.println(tp1.getAlaVenta());

        //Transportista
        t1.setNombre("nameTransportist");
        System.out.println(t1.getNombre());
        t1.setTelefono(936565321);
        System.out.println(t1.getTelefono());
        t1.setNumLicencia(789);
        System.out.println(t1.getNumLicencia());

        t2.setNombre("NuevoNombreTransportista");
        System.out.println(t2.getNombre());
        t2.setTelefono(987456321);
        System.out.println(t2.getTelefono());

        //Encargo
        e1.setDia(10);
        System.out.println(e1.getDia());
        e1.setMes(2);
        System.out.println(e1.getMes());
        e1.setHora(10);
        System.out.println(e1.getHora());
        e1.setMinutos(5);
        System.out.println(e1.getMinutos());

        //Cliente
        c1.setNombre("John");
        System.out.println(c1.getNombre());
        c1.setDireccion("clientAddress");
        System.out.println(s1.getDireccion());
        c1.setTelefono(936568895);
        System.out.println(s1.getTelefono());
        c1.setEmail("ejemplo@mail.com");
        System.out.println(s1.getEmail());
    }
}
