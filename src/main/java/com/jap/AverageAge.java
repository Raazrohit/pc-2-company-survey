package com.jap;

public class AverageAge {

    public String averageAgeCalculator(String[] ageRawData)
    {
        double avg = 0;
        float sum = 0;
        int i = 0;
        try{
            //Write the logic
            while (i<ageRawData.length){
                sum += Integer.parseInt(ageRawData[i]);
                i++;
            }
            avg = sum/ageRawData.length;
            //Handle specific exception
        }catch (Exception exception)
        {
            return exception.toString();
        }
        return String.valueOf(avg);
    }



}
