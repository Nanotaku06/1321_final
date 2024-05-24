package CSE1321LFINALJUANFERREIRA;



public class QuestionC {
    public static String isNameBrand(SpatulaOrder userSpatula){
        if(userSpatula.isIs_name_brand())return " name-brand";
       return "";
    }

    public static void main(String[] args){

        System.out.println("[Home of the Spatula] ");
        System.out.println("Order for Franchise #430.1123438");

        SpatulaOrder userSpatula1 = new SpatulaOrder();

        System.out.println("You ordered "+ userSpatula1.getNumber_of_spatulas()+ isNameBrand(userSpatula1) +" spatula(s) for $"+ userSpatula1.calculatePrice());

        SpatulaOrder userSpatula2 = new SpatulaOrder(35, false);
        System.out.println("You ordered "+ userSpatula2.getNumber_of_spatulas()+ isNameBrand(userSpatula2) +" spatula(s) for $"+ userSpatula2.calculatePrice());
        userSpatula2.setNumber_of_spatulas(-4);  //Not printing the returned String as it is not part of sample output. Still useful for possible further use.
        System.out.println("You ordered "+ userSpatula2.getNumber_of_spatulas()+ isNameBrand(userSpatula2) +" spatula(s) for $"+ userSpatula2.calculatePrice());
    }
}

class SpatulaOrder{
    private int number_of_spatulas;
    private boolean is_name_brand;

    public SpatulaOrder(){
        number_of_spatulas = 1;
        is_name_brand = true;
    }
    public SpatulaOrder(int spatulaNum, boolean branded){
        is_name_brand = branded;
        if(spatulaNum>0)number_of_spatulas = spatulaNum;
        else number_of_spatulas = 1;
    }

    public int getNumber_of_spatulas(){
        return number_of_spatulas;
    }
    public boolean isIs_name_brand(){
        return  is_name_brand;
    }

    public String setNumber_of_spatulas(int newNum){
        if(newNum>0){
            number_of_spatulas = newNum;
            return "Number of spatulas updated!";  //assigning verification strings to the functions
        }
        return "this number of spatulas is invalid. Please enter a different number"; //same thing. Improving user readability
    }

    public String setIs_name_brand(boolean newBrand){
        is_name_brand = newBrand;
        return "New brand set.";
    }

    public float calculatePrice(){
        float price = 0f;
        float additionalPrice = 0;
        if(is_name_brand) additionalPrice = 0.53f;
        if(number_of_spatulas>0){
            price = (6.47f+additionalPrice)*number_of_spatulas;
        }

        return price;
    }
}
