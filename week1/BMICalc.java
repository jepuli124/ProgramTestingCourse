package week1;

public class BMICalc {
    public BMICalc(){}

    public double calculateBMI(double height, double weight){
        if(height == 0){
            return -1;
        }
        if(weight == 0){
            return -1;
        }

        double result = Math.round((weight/(height * height))*10)/10;
        return result;
    }


    public String getBMICategoryString(double height, double weight){
        double BMI = calculateBMI(height, weight);

        if(BMI <= 18.4){
            return("Underweight");
        } else if (BMI <= 24.9){
            return("Normal weight");
        } else if (BMI <= 27.7){
            return("Overweight");
        } else if (BMI <= 49.9){
            return("Obese");
        } else {
            return("Error");
        }


    }
}

