import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class AddressBook {

    public static void menu(){
        HashMap<String, String> mapaCon = new HashMap<String, String>();
        Scanner leer = new Scanner(System.in);
        String telefono, nombre;
        System.out.println("Agenda de contactos\n");
        int op;
        int opb;
        opb = 1;

        while (opb==1) {
            System.out.println("\nQué desea realizar:\n");
            System.out.println("Cargar los datos          1");
            System.out.println("Guardar los datos         2");
            System.out.println("Mostrar los contactos     3");
            System.out.println("Guardar un nuevo número   4");
            System.out.println("Borrar algun contacto     5");
            System.out.println("Salir                     6");
            Scanner reader = new Scanner(System.in);
            op = reader.nextInt();
            switch(op) {
                case 1:
                    load(mapaCon);
                    break;

                case 2:
                    save(mapaCon);
                    break;

                case 3:
                    list(mapaCon);
                    break;

                case 4:

                    System.out.println("Inserte el nuevo telefono: ");
                    telefono = leer.next();
                    System.out.println("Inserte el nombre del contacto: ");
                    nombre = leer.next();
                    create(mapaCon,telefono,nombre);
                    break;
                case 5:

                    System.out.println("Qué número telefónico desea eliminar? ");
                    telefono = leer.next();

                    delete(mapaCon, telefono);
                    break;

                case 6:
                    System.out.println("Salida exitosa\n");
                    opb = 0;
                    break;

                default:
                    System.out.println("Opción no válida\n");
                    break;


            }

        }
    }


    public static void list(HashMap<String, String> mapaCon)
    {
        Iterator<String> iterator = mapaCon.keySet().iterator();

        System.out.println("Contactos:\n");
        System.out.println("  Telefono\t|\tNombre   ");
        System.out.println("------------------------");
        while(iterator.hasNext())
        {
            String llave = iterator.next();

            System.out.println("  "+llave+"\t|\t"+mapaCon.get(llave));
        }

    }


    public static void create(HashMap<String, String> mapaCon, String tel, String nom)
    {

        if(mapaCon.containsKey(tel))
        {
            System.out.println("\nError!\nNúmero ya existente\n");
        }

        else
        {
            mapaCon.put(tel, nom);
            System.out.println("\nGuardado con éxito");
        }

    }


    public static void delete(HashMap<String, String> mapaCon, String tel)
    {
        if(mapaCon.containsKey(tel))
        {
            System.out.println("\nEliminación écitosa de: "+mapaCon.get(tel)+"\n");
            mapaCon.remove(tel);

        }
        else
            System.out.println("\nTeléfono no existente\n");


    }


    public static void load(HashMap<String, String> m)
    {
        String inputFilename = "C:\\Users\\Bebebsaurio\\Desktop\\Quinto semestre\\Computación en java";
        String a [];

        BufferedReader bufferedReader = null;

        try {
            bufferedReader = new BufferedReader(new FileReader(inputFilename));

            String line;
            while ((line = bufferedReader.readLine()) != null) {
                a = line.split(",");
                m.put(a[0],a[1]);
            }
        } catch(IOException e) {
            System.out.println("IOException catched while reading: " + e.getMessage());
        } finally {
            try {
                if (bufferedReader != null) {
                    bufferedReader.close();
                    System.out.println("\nContactos cargados");
                }
            } catch (IOException e) {
                System.out.println("IOException catched while closing: " + e.getMessage());
            }
        }

    }


    public static void save(HashMap<String, String> m)
    {
        Iterator<String> iterator = m.keySet().iterator();
        String inputFilename = "C:\\Users\\Bebebsaurio\\Desktop\\Quinto semestre\\Computación en java";

        BufferedWriter bufferedWriter = null;

        try {
            bufferedWriter = new BufferedWriter(new FileWriter(inputFilename));

            while(iterator.hasNext())
            {
                String llave = iterator.next();


                bufferedWriter.write(llave+","+m.get(llave)+"\n");
            }

        }
        catch(IOException e) {
            System.out.println("IOException catched while writing: " + e.getMessage());
        } finally {
            try {
                if (bufferedWriter != null) {
                    bufferedWriter.close();
                    System.out.println("\nCambios guardados");
                }
            } catch (IOException e) {
                System.out.println("IOException catched while closing: " + e.getMessage());
            }
        }
    }
}
