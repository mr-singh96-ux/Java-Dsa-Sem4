public class CustomException {

    static void AgeEle(int age) throws CustomExe{
        if(age < 18){
            throw new CustomExe("Not Eligible");
        }
        System.out.println("Eligible");

    }
    public static void main(String[] args) {
        int age = 18;
        try{
            AgeEle(age);
        }
        catch(CustomExe e){
            System.out.println(e.getMessage());
        }
    }
    
}

class CustomExe extends Exception{
    CustomExe(String message){
        super(message);
    }
}