public class EinfacheMethode{

public static void main(String[] args){
ausgabeLinie();


}

private static void ausgabeLinie() {
    System.out.println("Start");
    ausgabeLinie();
    System.out.println("Verarbeitung");
    ausgabeLinie();
    System.out.println("Ende");
    
}
private static void ausgabeLinie(){
System.out.println("--------------");

}

}