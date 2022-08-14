package Taller;

import java.util.Scanner;

class main {
    final static int num = 100;
    static Scanner entrada = new Scanner(System.in);
    static Order orders[] = new Order[num];
    static Invoice invoices[] = new Invoice[num];
    
    public static void main(String[] args) {
        
        //meñu
        menu();
    }
    
    public static void menu(){
        int opcion=0;
        
         do{
                System.out.println("\t.:Meñu:.");
                System.out.println("1. Enviar un paquete");
                System.out.println("2. Salir");
                System.out.print("Digite una opcion: ");
                opcion = entrada.nextInt();
                
                switch (opcion) {
                    case 1:System.out.println("");
                        sendPackage();
                        break;
                    default:
                        System.out.println("Opcion incorrecta\n");
                }
            
            }while(opcion!=2);
    }
    
    public static void sendPackage(){
        StandardPackage pack = null;
        Location dir_a, dir_b;
        Person user_a , user_b;
        Invoice invo;
        String a,b,c,d,e,f,g,h,i,j;
        int k;
        float TotalPagar;
        
        System.out.println("Ingresar los datos del remitente: ");
        entrada.nextLine();
        System.out.println("Identificacion: "); a = entrada.nextLine();
        System.out.println("Nacionalidad: "); b = entrada.nextLine(); 
        System.out.println("Nombre: "); c = entrada.nextLine(); 
        System.out.println("Apellido: "); d = entrada.nextLine();
        System.out.println("Email: "); e = entrada.nextLine();
        
        System.out.println("Ingresar la direccion del remitente: ");
        System.out.println("Pais: "); f = entrada.nextLine();
        System.out.println("Departamento: "); g = entrada.nextLine(); 
        System.out.println("Ciudad: "); h = entrada.nextLine(); 
        System.out.println("Calle: "); i = entrada.nextLine();
        System.out.println("Carrera: "); j = entrada.nextLine();
        System.out.println("Codigo postal: "); k = entrada.nextInt();
        
        dir_a = new Location(f,g,h,i,j,k);
        user_a = new Person(a, b, "CC", c, e, d, dir_a, PersonType.LEGAL);
        
        System.out.println("Ingresar los datos del Destinatario: ");
        entrada.nextLine();
        System.out.println("Identificacion: "); a = entrada.nextLine();
        System.out.println("Nacionalidad: "); b = entrada.nextLine(); 
        System.out.println("Nombre: "); c = entrada.nextLine(); 
        System.out.println("Apellido: "); d = entrada.nextLine();
        System.out.println("Email: "); e = entrada.nextLine();
        
        System.out.println("Ingresar la direccion del Destinatario: ");
        System.out.println("Pais: "); f = entrada.nextLine();
        System.out.println("Departamento: "); g = entrada.nextLine(); 
        System.out.println("Ciudad: "); h = entrada.nextLine(); 
        System.out.println("Calle: "); i = entrada.nextLine();
        System.out.println("Carrera: "); j = entrada.nextLine();
        System.out.println("Codigo postal: "); k = entrada.nextInt();
        
        dir_b = new Location(f,g,h,i,j,k);
        user_b = new Person(a, b, "CC", c, e, d, dir_b, PersonType.LEGAL);
        
        pack = new StandardPackage(5500,"E0001", "Chancletas", 003145, 1500, 10000, (float) 2.5, (Customer) user_a);
        TotalPagar = pack.calculate(pack.getGramsPrice(), pack.getWeight(),pack.getQuota());
        
        Package OPack =  (Package) pack;
        orders[0] = new Order("Or0001", OPack, true, TotalPagar,(Customer) user_b, (Customer) user_a, OrderStatus.PENDING, dir_b);
        
        invoices[0] = new Invoice("Inv0001", 0, TotalPagar, 0, orden[], InvoiceStatus.SENT, (Customer) user_a, PaymentMethodsTypes.CASH);
        
    }
}
