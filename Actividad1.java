import java.util.Scanner;
public class Actividad1 {
	
	public static void main(String[] args) {
	int MAX=14, MIN=7, temp;
	Scanner sc = new Scanner(System.in);
	int[] elementos = new int[MAX];
	//rellenar el arreglo
	for(int i=0; i<MAX;i++) {
	System.out.print("Digita el numero: \n");
	elementos[i]=sc.nextInt();
	}
	//Ordenar el arreglo ceros al final
	for(int i=0;i < MAX;i++){
        for (int j=0 ; j <MAX- 1; j++){
            if (elementos[j] == 0){
                temp = elementos[j];
                elementos[j] = elementos[j+1];
                elementos[j+1] = temp;
            }
        }
    }
	System.out.println("1. Visualizar los numeros");
    System.out.println("2. Salir");
    System.out.println("Escribe una de las opciones");
    int opcion = sc.nextInt();
    switch(opcion){
    case 1:
      for(int a=0;a<MAX;a++) {
       	System.out.print(""+elementos[a]);
       	System.out.print("\n");
       }
        break;
    case 2:
        break;
    default:
        System.out.println("Error intente denuevo");
     }
	}
}